
package ldp8For;

import javax.swing.JOptionPane;

public class Exercício8 {
    
    public static void main(String[] args) {
        String dado;
        int num = 0;
        int maior = 0;
        int menor = 0;

        for (int i = 2; i <= 5; i++) {

            dado = JOptionPane.showInputDialog("Digite um número:");
            num = Integer.parseInt(dado);
            menor=maior;
            
            if (num>maior){
                maior=num;
            }
            
            if (num<menor){
                menor=num;
            }
        }
            JOptionPane.showMessageDialog(null,"O maior número é:" +maior);
            JOptionPane.showMessageDialog(null,"O menor número é:" +menor);
    }
}    
