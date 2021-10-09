import javax.swing.*;
import java.util.Random;

public class FabioAugusto_9 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double[][] matriz = new double[8][8];
        int simetria = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Random random = new Random();
                matriz[i][j] = Math.ceil(random.nextDouble() * 100);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetria++;
                }
            }
        }
        if (simetria == 0) {
            JOptionPane.showMessageDialog(null, "A matriz é simétrica!!!");
        } else {
            JOptionPane.showMessageDialog(null, "A matriz não é simétrica!!!");
        }
    }
}
