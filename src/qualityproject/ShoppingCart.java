/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qualityproject;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ShoppingCart {
     public ArrayList<String> Cart=new ArrayList<String>();

    public ArrayList<String> getCart() {
        return Cart;
    }

    public void setCart(String Cart) {
        this.Cart.add(Cart);
    }
    public String[] getACart() {
        String[] Cart1 = (String[]) this.Cart.toArray(new String[this.Cart.size()]);
        return Cart1;
    }
    
}
