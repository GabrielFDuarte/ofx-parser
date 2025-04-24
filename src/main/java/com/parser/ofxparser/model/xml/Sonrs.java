package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Sonrs {

    @JacksonXmlProperty(localName = "STATUS")
    private Status STATUS;

    @JacksonXmlProperty(localName = "DTSERVER")
    private String DTSERVER;

    @JacksonXmlProperty(localName = "LANGUAGE")
    private String LANGUAGE;
}
