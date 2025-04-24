package com.parser.ofxparser.model.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public class BankTranList {

    @JacksonXmlProperty(localName = "DTSTART")
    private String DTSTART;

    @JacksonXmlProperty(localName = "DTEND")
    private String DTEND;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "STMTTRN")
    private List<StmtTrn> STMTTRN;
}
