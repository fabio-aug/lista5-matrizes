import javax.swing.*;

public class FabioAugusto_14 {

    /* Fábio Augusto Araújo Santos */

    static String mostrarOnibus(int[][] comboio) {
        String print = "           C1     C2     C3    C4\n";
        for (int i = 0; i < comboio.length; i++) {
            print += (i + 1) < 10 ? ("L" + (i + 1) + "          ") : ("L" + (i + 1) + "        ");
            for (int j = 0; j < comboio[i].length; j++) {
                if (j == 1) {
                    print += comboio[i][j] + "   -   ";
                } else {
                    print += comboio[i][j] + "     ";
                }
            }
            print += "\n";
        }
        return print;
    }

    static void venderPassagem(int[][] comboio) {
        String[] optionsLinha = new String[]{"L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8", "L9", "L10", "L11", "L12"};
        int linhaResposta = JOptionPane.showOptionDialog(null,
                "Selecione uma linha:",
                "MARIAS UNIDAS",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, optionsLinha, optionsLinha[0]);
        String[] optionsColuna = new String[]{"C1", "C2", "C3", "C4"};
        int colunaResposta = JOptionPane.showOptionDialog(null,
                "Selecione uma coluna:",
                "MARIAS UNIDAS",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, optionsColuna, optionsColuna[0]);
        if (comboio[linhaResposta][colunaResposta] == 0) {
            comboio[linhaResposta][colunaResposta] = 1;
            JOptionPane.showMessageDialog(null, "Venda efetivada");
        } else {
            JOptionPane.showMessageDialog(null, "Poltrona ocupada");
        }
    }

    public static void main(String[] args) {
        String[] options = new String[]{"a", "b", "c"};
        int[][] comboio = new int[12][4];
        int continuarResposta = 0;
        while (continuarResposta != 2) {
            continuarResposta = JOptionPane.showOptionDialog(null,
                    "========================================" +
                            "\nMARIAS UNIDAS" +
                            "\n========================================" +
                            "\na. Vender passagem" +
                            "\nb. Mostrar mapa de ocupação do ônibus" +
                            "\nc. Encerrar" +
                            "\n========================================",
                    "MARIAS UNIDAS",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[0]);
            if (continuarResposta == 0) {
                venderPassagem(comboio);
            } else if (continuarResposta == 1) {
                JOptionPane.showMessageDialog(null, mostrarOnibus(comboio));
            }
        }
    }
}
