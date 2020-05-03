package com.example.ocrapp;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

@Service
public class TesseractExample {

    public String doOCR(String url) {

        try{
            //"https://66.media.tumblr.com/ce37b14a35425d9ee622f806ba15e5b8/cd7c3ffb65577d61-dd/s500x750/acde421c753034e0207c8c2646ac315c13ed09d7.jpg"
        URL imageFile  = new URL(url);
        BufferedImage bufferedImage = ImageIO.read(imageFile);

        ITesseract instance = new Tesseract();
        instance.setDatapath("src\\main\\resources");
        instance.setLanguage("pol");

           return  instance.doOCR(bufferedImage);

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        return "";
    }
}
