package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class OfxXml {

    @JacksonXmlProperty(localName = "SIGNONMSGSRSV1")
    private SignonMsgsRsV1 SIGNONMSGSRSV1;

    @JacksonXmlProperty(localName = "BANKMSGSRSV1")
    private BankMsgsRsV1 BANKMSGSRSV1;
}
