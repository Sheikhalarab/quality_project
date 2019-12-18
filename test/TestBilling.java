/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import qualityproject.Billing;
import qualityproject.Main;

/**
 *
 * @author hp
 */
public class TestBilling {
    
    @Test
    public void TestBilling()
    {
        ArrayList<Integer> Cost = new ArrayList<>();
        Cost.add(30);
        Cost.add(50);
        Cost.add(20);
        Main q=new Main();
        Billing b=new Billing();
        
        
        int actual = b.CalculateCost(Cost);
        int expected = 100;
        assertEquals(expected, actual);
        
    }
    
}
