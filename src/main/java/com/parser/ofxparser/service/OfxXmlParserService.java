package com.parser.ofxparser.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.parser.ofxparser.model.xml.OfxXml;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class OfxXmlParserService {

    public OfxXml parse(InputStream inputStream) throws Exception {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(inputStream, OfxXml.class);
    }
}
