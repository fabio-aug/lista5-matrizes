import javax.swing.*;

public class FabioAugusto_4 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int numSemanas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de semanas: "));
            double mediaSemanas = 0, menorDia = 0;
            int numDias = 0, dia = 0;
            StringBuilder printSemanas = new StringBuilder();
            int[][] planilha = new int[numSemanas][7];
            for (int i = 0; i < planilha.length; i++) {
                for (int j = 0; j < planilha[i].length; j++) {
                    planilha[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Semana " + (i + 1) + " - Informe a produção do dia " + (j + 1) + ": "));
                    mediaSemanas += planilha[i][j];
                    if (j == 0) {
                        menorDia = planilha[i][j];
                        dia = 1;
                    } else {
                        if (planilha[i][j] < menorDia) {
                            menorDia = planilha[i][j];
                            dia = (j + 1);
                        }
                    }
                }
                printSemanas.append("Semana ").append(i + 1).append(" .......... DIA ").append(dia).append("\n");
                dia = 0;
                menorDia = 0;
            }
            mediaSemanas = mediaSemanas / numSemanas;
            for (int[] linha : planilha) {
                for (int coluna : linha) {
                    if (coluna > mediaSemanas) {
                        numDias++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null,
                    "RELATÓRIO DE PRODUÇÃO RELATIVO À " + numSemanas + " SEMANAS" +
                            "\n----------------------------------------------------------------------------------" +
                            "\nProdução média = " + mediaSemanas +
                            "\nNúmero de dias com produção acima da média = " + numDias +
                            "\n\nINDICAÇÃO DOS DIAS DE MÍNIMA PRODUÇÃO: \n" + printSemanas +
                            "----------------------------------------------------------------------------------");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
