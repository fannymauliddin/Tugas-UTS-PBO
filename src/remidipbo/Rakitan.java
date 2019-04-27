/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidipbo;

/**
 *
 * @author SISTEM
 */
public class Rakitan {
    public static void main(String[]args){
        Intel intel1 = new Intel(2);
        AMD amd1 = new AMD (3);
        komputer komputer1 = new komputer(intel1);
        
            komputer1.cetakInfo();
            komputer1.memasang(intel1);
            komputer1.mencabut(amd1);
            komputer1.cetakInfo();
    }
}
