package com.parser.ofxparser.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SgmlToXmlConverter {

    public static String convert(String sgmlContent) {
        StringBuilder xmlBuilder = new StringBuilder();
        String[] lines = sgmlContent.split("\\r?\\n");

        Pattern inlineTagPattern = Pattern.compile("^\\s*<([^>/\\s]+)>([^<]+?)\\s*$");

        for (String line : lines) {
            String trimmed = line.trim();

            if (!trimmed.startsWith("<")) {
                continue;
            }

            Matcher matcher = inlineTagPattern.matcher(line);
            if (matcher.find()) {
                String tag = matcher.group(1);
                String value = matcher.group(2).trim();

                String indent = line.substring(0, line.indexOf('<'));
                xmlBuilder.append(indent)
                        .append("<").append(tag).append(">")
                        .append(escapeXml(value))
                        .append("</").append(tag).append(">\n");
            } else {
                xmlBuilder.append(line).append("\n");
            }
        }

        return xmlBuilder.toString();
    }

    private static String escapeXml(String value) {
        return value.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;");
    }
}
