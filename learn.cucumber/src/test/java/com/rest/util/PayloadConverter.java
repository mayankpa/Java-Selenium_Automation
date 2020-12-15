package com.rest.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayloadConverter {

    public static String generateString(String filename) throws IOException {
        String filePath= System.getProperty("user.dir")+"\\resources\\"+filename;
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
