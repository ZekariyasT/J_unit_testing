/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNIT;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ConversionTest {
    
    public ConversionTest() {
    }

    /**
     * Test of centimetertometer method, of class Conversion.
     */
    @Test
    public void testCentimetertometer() {
        Conversion C=new Conversion();
        assertEquals(3,C.centimetertometer(300),0.0);
    }

    /**
     * Test of metertocentimeter method, of class Conversion.
     */
    @Test
    public void testMetertocentimeter() {
         Conversion C=new Conversion();
         assertEquals(300,C.metertocentimeter(3),0.0);
    }

    /**
     * Test of metertokilometer method, of class Conversion.
     */
    @Test
    public void testMetertokilometer() {
         Conversion C=new Conversion();
         assertEquals(3,C.metertokilometer(3000),0.0);
    }

    /**
     * Test of kilometertometer method, of class Conversion.
     */
    @Test
    public void testKilometertometer() {
         Conversion C=new Conversion();
         assertEquals(3000,C.kilometertometer(3),0.0);
    }
    /**
     * Test of foottoinch method, of class Conversion.
     */
 @Test
    public void testFoottoinch() {
         Conversion C=new Conversion();
         assertEquals(36,C.foottoinch(3),0.0);
    }
    /**
     * Test of inchtofoot method, of class Conversion.
     */
 @Test
    public void testInchtofoot() {
         Conversion C=new Conversion();
         assertEquals(3,C.inchtofoot(36),0.0);
    }

    /**
     * Test of main method, of class Conversion.
     */
    @Test
    public void testMain() {
    }
    
}
