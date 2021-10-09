import javax.swing.*;

public class FabioAugusto_10 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor N para o tamanho da matriz: "));
            double[][] matrizDeCusto = new double[tamanho][tamanho];
            double custoTotal = 0;
            for (int i = 0; i < matrizDeCusto.length; i++) {
                for (int j = 0; j < matrizDeCusto[i].length; j++) {
                    matrizDeCusto[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Linha " + (i + 1) + " - Informe o custo da cidade " + (j + 1) + ": "));
                }
            }
            int quantidadeCidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de cidades a serem percorridas: "));
            int[] cidade = new int[quantidadeCidade];
            for (int i = 0; i < cidade.length; i++) {
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe a cidade número " + (i + 1) + ": "));
                while (valor < 0 || valor > tamanho) {
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Informe cidades maiores que 0 ou menores que " + tamanho));
                }
                cidade[i] = valor;
            }
            for (int i = 0; i < cidade.length; i++) {
                if (i != (cidade.length - 1)) {
                    custoTotal += matrizDeCusto[cidade[i]][cidade[i + 1]];
                }
            }
            JOptionPane.showMessageDialog(null, "O custo de transporte dessa rota é " + custoTotal + " unidades!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
