import javax.swing.*;

public class FabioAugusto_8 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da matriz: "));
            int[][] matriz = new int[tamanho][tamanho];
            int permutacao = 0, count;
            for (int i = 0; i < matriz.length; i++) {
                count = 0;
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Linha " + (i + 1) + " - Informe um valor para a coluna " + (j + 1) + ": "));
                    if (matriz[i][j] != 0) {
                        count++;
                    }
                }
                permutacao += count;
            }
            if (permutacao == tamanho) {
                JOptionPane.showMessageDialog(null, "Essa matriz é uma matriz permutação!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Essa matriz não é uma matriz permutação!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
