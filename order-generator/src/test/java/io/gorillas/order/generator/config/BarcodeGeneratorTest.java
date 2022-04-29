package io.gorillas.order.generator.config;

import junit.framework.Assert;
import org.junit.Test;

public class BarcodeGeneratorTest {
    
    
    @Test
    public void generateBarcode6Test() {
        var result = BarcodeGenerator.generateBarcode6();
        
        Assert.assertTrue(100000 <= result);
        Assert.assertTrue(999999 >= result);
     }
}
