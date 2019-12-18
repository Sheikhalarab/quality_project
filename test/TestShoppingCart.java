/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import qualityproject.ShoppingCart;

/**
 *
 * @author hp
 */
public class TestShoppingCart {
    @Test
    public void TestShoppingCart() {
        ShoppingCart s=new ShoppingCart();
        String [] expected={"Yassin","Karem","Yousef"};
        String[] actual;
        
        s.setCart("Yassin");
        s.setCart("Karem");
        s.setCart("Yousef");

        actual=s.getACart();
        assertArrayEquals(expected, actual);
        
        
        
        
        
     
    }
    
}
