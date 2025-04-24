package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class LedgerBal {

    @JacksonXmlProperty(localName = "BALAMT")
    private String BALAMT;

    @JacksonXmlProperty(localName = "DTASOF")
    private String DTASOF;
}
