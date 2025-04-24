package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class SignonMsgsRsV1 {

    @JacksonXmlProperty(localName = "SONRS")
    private Sonrs sonrs;
}
