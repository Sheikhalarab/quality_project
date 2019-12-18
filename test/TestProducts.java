/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import qualityproject.Main;
import qualityproject.products;

/**
 *
 * @author hp
 */
public class TestProducts {
    @Test
    public void TestProducts() {
        products p = new products();
        Main q = new Main();
        String actual = p.getproducts();
        String expected = "1- big tasty 60\n"
                + "2- double big tasty 70\n"
                + "3- grand chicken 65\n"
                + "4- mac royal 60\n"
                + "5- quarter pounder 60\n"
                + "6- big mac 50\n"
                + "7- big mac chicken 60";
        assertEquals(expected, actual);
    }

}
