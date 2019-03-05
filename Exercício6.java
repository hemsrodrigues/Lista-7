
package ldp8For;

import javax.swing.JOptionPane;

public class Exercício6 {
    
    public static void main(String[] args) {
         
      
         String d;
         int n = 0;
         int media = 0;
         int soma = 0;
         
         
         
         
         for (int i=1; i <=10; i++){
         
             d = JOptionPane.showInputDialog("Digite um número:");
             n = Integer.parseInt(d);
             soma = soma+n;
             media = soma/10;
             
         }
         
         JOptionPane.showMessageDialog(null,"A média é:" +media);
     }
}
