package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CreditCardMsgsRsV1 {

    @JacksonXmlProperty(localName = "CCSTMTTRNRS")
    private CcStmtTrnRs CCSTMTTRNRS;
}
