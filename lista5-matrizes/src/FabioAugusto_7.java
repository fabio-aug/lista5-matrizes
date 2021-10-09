import javax.swing.*;
import java.util.Random;

public class FabioAugusto_7 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            double[][] matriz = new double[4][7];
            double min = 0, max = 0;
            int linha = 0, coluna = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    Random random = new Random();
                    matriz[i][j] = Math.ceil(random.nextDouble() * 100);
                    if (i == 0 && j == 0) {
                        min = matriz[i][j];
                    } else if (min < matriz[i][j]) {
                        min = matriz[i][j];
                        linha = i;
                    }
                }
            }
            for (int i = 0; i < matriz[linha].length; i++) {
                if (i == 0) {
                    max = matriz[linha][i];
                } else if (matriz[linha][i] > max) {
                    max = matriz[linha][i];
                    coluna = i;
                }
            }
            JOptionPane.showMessageDialog(null, "MINMAX: " + max +
                    "\nLINHA: " + (linha + 1) +
                    "\nCOLUNA: " + (coluna + 1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }

    }
}
