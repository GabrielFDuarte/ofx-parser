package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BankMsgsRsV1 {

    @JacksonXmlProperty(localName = "STMTTRNRS")
    private StmtTrnrs STMTTRNRS;
}
