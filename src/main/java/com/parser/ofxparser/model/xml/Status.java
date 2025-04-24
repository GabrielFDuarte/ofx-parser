package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Status {

    @JacksonXmlProperty(localName = "CODE")
    private String CODE;

    @JacksonXmlProperty(localName = "SEVERITY")
    private String SEVERITY;
}
