import javax.swing.*;

public class FabioAugusto_3 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int[][] matrizA = new int[3][4];
        int valor = 0;
        String print = "";
        try {
            int linhas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de linhas"));
            int colunas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de colunas"));
            int[][] matrizB = new int[linhas][colunas];
            int[][] matrizC = new int[matrizA.length][colunas];
            if (matrizA[0].length == linhas) {
                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA[i].length; j++) {
                        matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matriz A:\n" +
                                "Linha" + (i + 1) + " - Informe um valor para a coluna " + (j + 1) + ": "));
                    }
                }

                for (int i = 0; i < matrizB.length; i++) {
                    for (int j = 0; j < matrizB[i].length; j++) {
                        matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matriz B:\n" +
                                "Linha" + (i + 1) + " - Informe um valor para a coluna " + (j + 1) + ": "));
                    }
                }

                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizB[i].length; j++) {
                        for (int k = 0; k < matrizA[j].length; k++) {
                            valor += matrizA[i][k] * matrizB[k][j];
                        }
                        matrizC[i][j] = valor;
                        valor = 0;
                    }
                }

                for (int i = 0; i < matrizC.length; i++) {
                    if (i == 0) {
                        print += "[ ";
                    }
                    for (int j = 0; j < matrizC[i].length; j++) {
                        if (i == (matrizC.length - 1) && j == (matrizC[i].length - 1)) {
                            print += matrizC[i][j] + "";
                        } else {
                            print += matrizC[i][j] + ", ";
                        }
                    }
                    if (i == (matrizC.length - 1)) {
                        print += " ]";
                    } else {
                        print += "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, print);
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível multiplicar as matrizes!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
