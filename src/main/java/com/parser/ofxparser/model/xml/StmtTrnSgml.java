package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class StmtTrnSgml {

    @JacksonXmlProperty(localName = "TRNTYPE")
    private String TRNTYPE;

    @JacksonXmlProperty(localName = "DTPOSTED")
    private String DTPOSTED;

    @JacksonXmlProperty(localName = "TRNAMT")
    private String TRNAMT;

    @JacksonXmlProperty(localName = "FITID")
    private String FITID;

    @JacksonXmlProperty(localName = "MEMO")
    private String MEMO;
}
