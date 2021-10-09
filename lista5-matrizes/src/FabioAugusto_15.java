import javax.swing.*;

public class FabioAugusto_15 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        String[] continuar = new String[]{"Sim", "Não"};
        String[] atendente = new String[]{"1", "2", "3", "4", "5"};
        String[] info = new String[]{"Unhas dos pés", "Unhas das mãos", "Podologia"};
        String print = "";

        double[][] mariaSaliente = new double[5][3];
        int continuarResposta = 0;

        while (continuarResposta == 0) {
            int atendenteResposta = JOptionPane.showOptionDialog(null, "Qual foi a atendente que o atendeu?", "Maria Saliente",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, atendente, atendente[0]);
            int infoResposta = JOptionPane.showOptionDialog(null, "Qual foi o serviço feito?", "Maria Saliente",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, info, info[0]);

            double valor = 0;
            if (infoResposta == 0) {
                valor = 5.00;
            } else if (infoResposta == 1) {
                valor = 7.50;
            } else if (infoResposta == 2) {
                valor = 15.00;
            }

            mariaSaliente[atendenteResposta][infoResposta] += valor;

            continuarResposta = JOptionPane.showOptionDialog(null, "Deseja registrar mais uma informação?", "Maria Saliente",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, continuar, continuar[0]);
        }

        for (int i = 0; i < mariaSaliente.length; i++) {
            print += "Atendente " + (i + 1) + ":\n";
            for (int j = 0; j < mariaSaliente[i].length; j++) {
                if (j == 0) {
                    print += "  Unhas dos pés: R$ " + mariaSaliente[i][j] + "\n";
                } else if (j == 1) {
                    print += "  Unhas das mãos: R$ " + mariaSaliente[i][j] + "\n";
                } else if (j == 2) {
                    print += "  Podologia: R$ " + mariaSaliente[i][j] + "\n";
                }
            }
            print += "\n";
        }
        JOptionPane.showMessageDialog(null, print);
    }
}
