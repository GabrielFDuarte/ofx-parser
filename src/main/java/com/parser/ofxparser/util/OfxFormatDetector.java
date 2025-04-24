package com.parser.ofxparser.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OfxFormatDetector {

    public enum OfxType {
        SGML, XML, UNKNOWN
    }

    public static OfxType detect(InputStream inputStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            int linesRead = 0;
            while ((line = reader.readLine()) != null && linesRead < 20) {
                line = line.trim().toUpperCase();
                if (line.startsWith("<?XML")) {
                    //OFX v2 (XML)
                    return OfxType.XML;
                } else if (line.startsWith("OFXHEADER")) {
                    //OFX v1 (SGML)
                    return OfxType.SGML;
                }
                linesRead++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return OfxType.UNKNOWN;
    }
}
