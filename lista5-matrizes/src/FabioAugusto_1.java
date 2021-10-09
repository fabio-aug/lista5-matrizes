import javax.swing.*;

public class FabioAugusto_1 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        int maiorValor = 0;
        StringBuilder print = new StringBuilder("Matriz original:\n");
        try {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro: "));
                    if (i == 0 && j == 0) {
                        maiorValor = matriz[i][j];
                    } else {
                        if (matriz[i][j] > maiorValor) {
                            maiorValor = matriz[i][j];
                        }
                    }
                    print.append(matriz[i][j]).append(" ");
                }
                print.append("\n");
            }
            print.append("Matriz multiplicada:\n");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = matriz[i][j] * maiorValor;
                    print.append(matriz[i][j]).append(" ");
                }
                print.append("\n");
            }
            System.out.println(print);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }

    }
}
