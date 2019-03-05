
package ldp8For;

import javax.swing.JOptionPane;

public class Exercício7 {
    
    public static void main(String[] args) {
        String dado;
        int num = 0;
        int maior = 0;

        for (int i = 2; i <= 5; i++) {

            dado = JOptionPane.showInputDialog("Digite um número:");
            num = Integer.parseInt(dado);
            
            if (num>maior){
                maior=num;
            }
        }
            JOptionPane.showMessageDialog(null,"O maior número é:" +maior);
    }
}
