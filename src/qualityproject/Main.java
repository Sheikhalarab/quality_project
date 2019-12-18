/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qualityproject;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShoppingCart sh = new ShoppingCart();
        Billing b = new Billing();
        products p = new products();
        Sale s=new Sale();

        while (true) {
            //JOptionPane.showMessageDialog(null,p.getproducts());

            int order = Integer.parseInt(JOptionPane.showInputDialog("THE MAIN MENU \n" + p.getproducts() + "\nENTER THE CODE "));
            if (order == 1) {
                sh.setCart("big tasty 60");
            }
            if (order == 2) {
                sh.setCart("double big tasty 70");
            }
            if (order == 3) {
                sh.setCart("grand chicken 65");
            }
            if (order == 4) {
                sh.setCart("mac royal 60");
            }
            if (order == 5) {
                sh.setCart("quarter pounder 60");
            }
            if (order == 6) {
                sh.setCart("big mac 50");
            }
            if (order == 7) {
                sh.setCart("big mac chicken 60");
            }
            if (order == 1) {
                b.setCost(60);
            }
            if (order == 2) {
                b.setCost(70);
            }
            if (order == 3) {
                b.setCost(65);
            }
            if (order == 4) {
                b.setCost(60);
            }
            if (order == 5) {
                b.setCost(60);
            }
            if (order == 6) {
                b.setCost(50);
            }
            if (order == 7) {
                b.setCost(60);
            }
            int sure = Integer.parseInt(JOptionPane.showInputDialog("Anything else...\nYes : 1 \n No : 2"));
            if (sure == 1) {

            } else if (sure == 2) {
                int result = b.GetCost();
               
                JOptionPane.showMessageDialog(null, "YOUR Recipt...\n" + sh.getCart() + "\n Bill  =  " + result+"\n Discount = 20% "+"\n Bill after sale = "+s.GetSale(result));
                JOptionPane.showMessageDialog(null, "THANK YOUUU.....");
                break;
            }

        }
    }
    
}
