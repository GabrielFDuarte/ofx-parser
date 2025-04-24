package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class OfxSgml {

    @JacksonXmlProperty(localName = "SIGNONMSGSRSV1")
    private SignonMsgsRsV1 SIGNONMSGSRSV1;

    @JacksonXmlProperty(localName = "CREDITCARDMSGSRSV1")
    private CreditCardMsgsRsV1 CREDITCARDMSGSRSV1;
}
