
package ldp9For;

import javax.swing.JOptionPane;

public class Exercício1 {
    
    public static void main(String[] args) {
        
        String dado;
        int num;
        int neg = 0;
        
         for (int i = 1; i <= 10; i++) {
             
             dado = JOptionPane.showInputDialog("Digite um número:");
             num = Integer.parseInt(dado);
             
             if(num<0){
                 neg = neg + 1;
             }
         }
         JOptionPane.showMessageDialog(null,"Foram digitados" +neg+   "números negativos.");
    }
}
