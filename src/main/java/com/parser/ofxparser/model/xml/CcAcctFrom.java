package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CcAcctFrom {

    @JacksonXmlProperty(localName = "ACCTID")
    private String ACCTID;
}
