package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BankAcctFrom {

    @JacksonXmlProperty(localName = "BANKID")
    private String BANKID;

    @JacksonXmlProperty(localName = "ACCTID")
    private String ACCTID;

    @JacksonXmlProperty(localName = "ACCTTYPE")
    private String ACCTTYPE;
}
