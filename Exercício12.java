
package ldp9For;

import javax.swing.JOptionPane;

public class Exercício4 {
    
     public static void main(String[] args) {
         
         String dado;
         int nulo = 0;
         int branco = 0;
         int voto;
         int cand1 = 0;
         int cand2 = 0;
         int cand3 = 0; 
         int cand4 = 0;
         
         for (int i = 1; i <= 20; i++) {
             
            
            voto = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:"
                    + " \n 1, 2, 3 ou 4 - Candidatos"
                    + " \n 5 - Nulo"
                    + " \n 6 - Branco"));
             
             switch (voto) {
                case 1:
                    cand1++;
                    break;
                case 2:
                    cand2++;
                    break;
                case 3:
                    cand3++;
                    break; 
                case 4:
                   cand4++;
                    break;    
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    break;
                default:
                    branco++;
                    break;
             }
             
             
             
         }
         JOptionPane.showMessageDialog(null,"Votos do candidato 1:" +cand1
             + "\n Votos do candidato 2:" +cand2
             + "\n Votos do candidato 3:" +cand3
             + "\n Votos do candidato 4:" +cand4
             + "\n Votos nulos:" +nulo
             + "\n Votos brancos:" +branco);
     }
}
