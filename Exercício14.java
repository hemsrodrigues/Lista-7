
package ldp9For;

import javax.swing.JOptionPane;

public class Exercício6 {
    
    public static void main(String[] args) {
        
        String dado;
        int num;
        int cont;
        
        for (int i = 1; i <= 5; i++) {
            
            dado = JOptionPane.showInputDialog("Digite um número:");
            num = Integer.parseInt(dado);
            
            cont = num * 1;
            
        }
    }
}
