
package ldp9For;

import javax.swing.JOptionPane;

public class Exercício5 {
    
    public static void main(String[] args) {
        
        String dado;
        int num;
        int a1;
        int r1;
        int soma = 0;
        
        dado = JOptionPane.showInputDialog("Digite um número:");
            num = Integer.parseInt(dado);
            
            dado = JOptionPane.showInputDialog("Digite um número:");
            a1 = Integer.parseInt(dado);
            
            dado = JOptionPane.showInputDialog("Digite um número:");
            r1 = Integer.parseInt(dado);
            
        for (int i = num; i <= r1*a1; i+=r1) {
                     
            System.out.println(i+" ");
                         
             soma = soma + i;
        }
        JOptionPane.showMessageDialog(null,"A soma dos termos é:" +soma);
    }
}
