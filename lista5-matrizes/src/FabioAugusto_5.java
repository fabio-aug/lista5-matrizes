import javax.swing.*;

public class FabioAugusto_5 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double[][] notasAlunos = new double[3][5];
        String[] nomeAlunos = new String[10];
        String dadosAlunos = "";
        double media;
        try {
            for (int i = 0; i < notasAlunos.length; i++) {
                media = 0;
                nomeAlunos[i] = JOptionPane.showInputDialog("Informe o nome do aluno " + (i + 1) + ": ");
                for (int j = 0; j < notasAlunos[i].length; j++) {
                    notasAlunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno " + nomeAlunos[i] + " na prova " + (j + 1) + ": "));
                    media += notasAlunos[i][j];
                }
                media = media / notasAlunos[i].length;
                if (media >= 7) {
                    dadosAlunos += "Aluno: " + nomeAlunos[i] + "\nMédia das notas: " + media + "\nSituação: Aprovado\n\n";
                } else if (media < 4) {
                    dadosAlunos += "Aluno: " + nomeAlunos[i] + "\nMédia das notas: " + media + "\nSituação: Reprovado\n\n";
                } else {
                    dadosAlunos += "Aluno: " + nomeAlunos[i] + "\nMédia das notas: " + media + "\nSituação: Exame Especial\n\n";
                }
            }
            JOptionPane.showMessageDialog(null, dadosAlunos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
