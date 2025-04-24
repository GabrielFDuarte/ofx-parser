package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CcStmtTrnRs {

    @JacksonXmlProperty(localName = "TRNUID")
    private String TRNUID;

    @JacksonXmlProperty(localName = "STATUS")
    private Status STATUS;

    @JacksonXmlProperty(localName = "CCSTMTRS")
    private CcStmtRs CCSTMTRS;
}
