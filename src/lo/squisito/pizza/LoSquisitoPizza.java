/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo.squisito.pizza;

/**
 *
 * @author Parth
 */
public class LoSquisitoPizza {
String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; //26+10=36
    String k="";
    
   
        
    
    public String random_aplhanumeric_generator(String d) {
        for (int i=0; i<=7; i++) { 
            double z= Math.random()*36;
            int a=(int) z;
            char c=s.charAt(a);
            k=k+c;
        }
         return d;
    }
    String x="";
        String orderno=random_aplhanumeric_generator(x);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
