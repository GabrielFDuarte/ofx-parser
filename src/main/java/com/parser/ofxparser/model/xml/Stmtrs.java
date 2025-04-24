package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Stmtrs {

    @JacksonXmlProperty(localName = "CURDEF")
    private String CURDEF;

    @JacksonXmlProperty(localName = "BANKACCTFROM")
    private BankAcctFrom BANKACCTFROM;

    @JacksonXmlProperty(localName = "BANKTRANLIST")
    private BankTranList BANKTRANLIST;

    @JacksonXmlProperty(localName = "LEDGERBAL")
    private LedgerBal LEDGERBAL;
}
