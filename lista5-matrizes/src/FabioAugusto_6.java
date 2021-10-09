import javax.swing.*;

public class FabioAugusto_6 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double[][] latas = new double[6][20];
        double media = 0, desvio = 0;
        String dados = "";
        try {
            for (int i = 0; i < latas.length; i++) {
                for (int j = 0; j < latas[i].length; j++) {
                    latas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Linha " + (i + 1) + " - Informe a quantidade de Ml da lata " + (j + 1) + ": "));
                    media += latas[i][j];
                }
                media = media / latas[i].length;
                for (int j = 0; j < latas[i].length; j++) {
                    desvio += (latas[i][j] - media) * (latas[i][j] - media);
                }
                desvio = Math.sqrt(desvio / (latas[i].length - 1));
                if ((media + desvio) < 385 || (media + desvio) > 395) {
                    dados += "Linha " + (i + 1) + " - O processo deve ser revisado!!!\n";
                } else {
                    dados += "Linha " + (i + 1) + " - O processo não precisa ser revisado!!!\n";
                }
            }
            JOptionPane.showMessageDialog(null, dados);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
