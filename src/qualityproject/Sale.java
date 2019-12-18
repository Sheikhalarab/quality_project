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
public class Sale {

    public Double GetSale(int Cost) {

        Double discount = Cost * 0.20;
        Double sale =Cost-discount;
        return sale;
    }

}
