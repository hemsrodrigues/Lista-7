
package ldp9For;

import javax.swing.JOptionPane;

public class Exercício3 {
    
    public static void main(String[] args) {
        
        String dado;
        int num;
        int media = 0;
        int soma = 0;
        
        for (int i = 1; i <= 5; i++) {
            
            dado = JOptionPane.showInputDialog("Digite um número:");
            num = Integer.parseInt(dado);
            
            soma = soma+num;
            media = soma/5;
        }
        JOptionPane.showMessageDialog(null,"A média dos 5 números é:" +media);
    }
}
