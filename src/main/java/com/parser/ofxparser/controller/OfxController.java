package com.parser.ofxparser.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.parser.ofxparser.model.xml.OfxSgml;
import com.parser.ofxparser.model.xml.OfxXml;
import com.parser.ofxparser.service.OfxSgmlParserService;
import com.parser.ofxparser.service.OfxXmlParserService;
import com.parser.ofxparser.util.OfxFormatDetector;
import com.parser.ofxparser.util.OfxFormatDetector.OfxType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api/ofx")
public class OfxController {

    @Autowired
    private OfxXmlParserService ofxXmlParserService;

    @Autowired
    private OfxSgmlParserService ofxSgmlParserService;

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("/convert")
    public ResponseEntity<?> convertOfxToJson(@RequestParam("file") MultipartFile file) {
        try {
            OfxType type = OfxFormatDetector.detect(file.getInputStream());

            switch (type) {
                case XML -> {
                    System.out.println("OFX v2 (XML) detected");
                    OfxXml parsed = ofxXmlParserService.parse(file.getInputStream());

                    Map<String, Object> map = objectMapper.convertValue(parsed, new TypeReference<>() {});
                    return ResponseEntity.ok(map);
                }
                case SGML -> {
                    System.out.println("OFX v1 (SGML) detected");
                    OfxSgml parsed = ofxSgmlParserService.parse(file.getInputStream());

                    Map<String, Object> map = objectMapper.convertValue(parsed, new TypeReference<>() {});
                    return ResponseEntity.ok(map);
                }
                default -> System.out.println("Unknown OFX format");
            }

            return ResponseEntity.ok("Type detected: " + type.name() + " for file: " + file.getOriginalFilename());
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Error processing file");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
