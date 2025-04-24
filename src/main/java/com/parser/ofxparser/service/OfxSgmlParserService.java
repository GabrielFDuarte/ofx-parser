package com.parser.ofxparser.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.parser.ofxparser.model.xml.OfxSgml;
import com.parser.ofxparser.util.SgmlToXmlConverter;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Service
public class OfxSgmlParserService {

    public OfxSgml parse(InputStream inputStream) throws Exception {
        String sgml = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        String xml = SgmlToXmlConverter.convert(sgml);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return xmlMapper.readValue(xml, OfxSgml.class);
    }
}
