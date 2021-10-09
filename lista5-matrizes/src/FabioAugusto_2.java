import javax.swing.*;

public class FabioAugusto_2 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double[][] matrizSoma = new double[3][5];
        double[] soma = new double[3];
        double count = 0;
        int index = 0;
        try {
            for (int i = 0; i < matrizSoma.length; i++) {
                for (int j = 0; j < matrizSoma[i].length; j++) {
                    matrizSoma[i][j] = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Informe um valor real para posição " + (j + 1) + " da linha " + (i + 1) + ": "
                            )
                    );
                    count += matrizSoma[i][j];
                    if (j == (matrizSoma[i].length - 1)) {
                        soma[i] = count;
                    }
                }
                count = 0;
            }
            for (int i = 0; i < soma.length; i++) {
                if (i == 0) {
                    count = soma[i];
                }
                if (soma[i] > count) {
                    count = soma[i];
                    index = i;
                }
            }
            JOptionPane.showMessageDialog(null, "A linha com o maior valor da soma é a " + (index + 1));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
