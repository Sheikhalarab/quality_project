/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import qualityproject.Sale;

/**
 *
 * @author hp
 */
public class TestSale {
    @Test
    public void TestSale()
    {
        Sale s=new Sale();
        
        Double expected = 152.0;
        Double actual = s.GetSale(190);
        assertEquals(expected, actual);
    }
    
}
