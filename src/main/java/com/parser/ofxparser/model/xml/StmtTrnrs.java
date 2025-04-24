package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class StmtTrnrs {

    @JacksonXmlProperty(localName = "TRNUID")
    private String TRNUID;

    @JacksonXmlProperty(localName = "STATUS")
    private Status STATUS;

    @JacksonXmlProperty(localName = "STMTRS")
    private Stmtrs STMTRS;
}
