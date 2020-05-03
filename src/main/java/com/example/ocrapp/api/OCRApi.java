package com.example.ocrapp.api;

import com.example.ocrapp.OcrService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OCRApi {


    private OcrService ocrService;

    public OCRApi(OcrService ocrService) {
        this.ocrService = ocrService;
    }

    @PostMapping("/api/ocr")
    public String doOcr(@RequestBody Graphic graphic){
      String ocr =  ocrService.doOCR(graphic.getUrl());
      return ocr;
    }
}
