import javax.swing.*;

public class FabioAugusto_12 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double[][] estoques = new double[5][3];
        int quantidadeTotal = 0, maiorEstoqueProduto2 = 0, menorEstoque = 0;
        int posiProduto2 = 0, posiMenorEstoque = 0, posiMaiorCusto = 0;
        double maiorCustoEstocagem = 0;
        String print = "";

        try {
            for (int i = 0; i < estoques.length; i++) {
                if (i != (estoques.length - 1)) {
                    for (int j = 0; j < estoques[i].length; j++) {
                        estoques[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Armazém " + (i + 1) + " - Informe a quantidade de estoque do produto " + (j + 1) + ": "));
                    }
                } else {
                    for (int j = 0; j < estoques[i].length; j++) {
                        estoques[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe custo de estocagem de uma unidade do produto " + (j + 1) + ": "));
                    }
                }
            }

            for (int i = 0; i < estoques.length; i++) {
                double custoTotal = 0;
                if (i != (estoques.length - 1)) {
                    for (int j = 0; j < estoques[i].length; j++) {
                        quantidadeTotal += estoques[i][j];
                        if (i == 0 && j == 2) {
                            maiorEstoqueProduto2 = (int) estoques[i][j];
                            posiProduto2 = (i + 1);
                        } else if (j == 2) {
                            if (estoques[i][j] > maiorEstoqueProduto2) {
                                maiorEstoqueProduto2 = (int) estoques[i][j];
                                posiProduto2 = (i + 1);
                            }
                        }
                        custoTotal += estoques[i][j] * estoques[estoques.length - 1][j];
                    }
                    if (i == 0) {
                        menorEstoque = quantidadeTotal;
                        maiorCustoEstocagem = custoTotal;
                    } else {
                        if (quantidadeTotal < menorEstoque) {
                            posiMenorEstoque = (i + 1);
                        }
                        if (custoTotal > maiorCustoEstocagem) {
                            maiorCustoEstocagem = custoTotal;
                            posiMaiorCusto = (i + 1);
                        }
                    }
                    print += "Galpão " + (i + 1) + " - Quantidade total de produtos: " + quantidadeTotal + "\n";
                    quantidadeTotal = 0;
                }
            }
            JOptionPane.showMessageDialog(null, print +
                    "\nO armazém " + posiProduto2 + " possuí o maior estoque do produto 2 !!!" +
                    "\nO armazém " + posiMenorEstoque + " possuí o menor estoque de produtos !!!" +
                    "\nO armazém " + posiMaiorCusto + " possuí o maior custo de estocagem !!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
