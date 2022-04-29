package io.gorillas.order.generator.config;

import java.util.concurrent.ThreadLocalRandom;

public class BarcodeGenerator {
    
    public static int generateBarcode6() {
        return ThreadLocalRandom.current().nextInt(100000, 999999);
    }
}
