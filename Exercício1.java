
package ldp8For;

import javax.swing.JOptionPane;

public class Exercício1 {
    
    public static void main(String[] args) {
        
        String d;
          int soma = 0;        
          int n =0 ;
          
          
           d = JOptionPane.showInputDialog("Digite um número:");
           n = Integer.parseInt(d);
           
           for (int i = 0; i <= n; i++){
           soma = soma+i;
               
           
           }
          JOptionPane.showMessageDialog(null,"A soma é:" +soma);
    }
}
