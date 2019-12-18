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
public class Billing {
    public ArrayList<Integer> Cost = new ArrayList<>();

    public int GetCost() {
        int result=CalculateCost(Cost);
        return result;
    }

    public void setCost(Integer Cost) {
        this.Cost.add(Cost);
    }

    public int CalculateCost(ArrayList Cost) {
        int count=0;
        for (int i = 0; i < Cost.size(); ++i)  {
                		      
          count+=(int)Cost.get(i); 		
   
        }
        return count;
    }
    
}
