
package ldp8For;

import javax.swing.JOptionPane;

public class Exercício5 {
    
    public static void main(String[] args) {
         String d;
         int n = 0;
         int soma = 0;
         
         
         
         for (int i=1; i <=10; i++){
         
             d = JOptionPane.showInputDialog("Digite um número:");
             n = Integer.parseInt(d);
         
             soma = soma+n;
         }
         
         JOptionPane.showMessageDialog(null,"A soma é:" +soma);
     }
}
