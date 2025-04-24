package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CcStmtRs {

    @JacksonXmlProperty(localName = "CURDEF")
    private String CURDEF;

    @JacksonXmlProperty(localName = "CCACCTFROM")
    private CcAcctFrom CCACCTFROM;

    @JacksonXmlProperty(localName = "BANKTRANLIST")
    private BankTranListSgml BANKTRANLIST;

    @JacksonXmlProperty(localName = "LEDGERBAL")
    private LedgerBal LEDGERBAL;
}
