import javax.swing.*;

public class FabioAugusto_17 {

    /* Fábio Augusto Araújo Santos */

    static String mostrarMatriz(String[][] matriz) {
        String print = "";
        int count;
        for (String[] strings : matriz) {
            for (String string : strings) {
                print += string + "     ";
            }
            print += "\n";
        }
        print += "\n";
        for (int i = 1; i < matriz.length; i++) {
            count = 0;
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j].equals(" 1 ")) {
                    count++;
                }
            }
            print += "N" + i + " possui " + count + " amigos\n";
        }
        return print;
    }

    public static void main(String[] args) {
        String[] optionsAmizade = new String[]{"Sim", "Não"};
        String[][] amizades = new String[6][6];
        for (int i = 0; i < amizades.length; i++) {
            for (int j = 0; j < amizades[i].length; j++) {
                if (i == 0 && j == 0) {
                    amizades[i][j] = "id";
                } else if (i == 0) {
                    amizades[i][j] = "n" + j;
                } else if (j == 0) {
                    amizades[i][j] = "n" + i;
                } else {
                    amizades[i][j] = " 0 ";
                }
            }
        }
        boolean breakFor = false;
        for (int i = 1; i < amizades.length; i++) {
            for (int j = 1; j < amizades[i].length; j++) {
                if (amizades[i][j].equals(" 0 ") && i != j) {
                    int amizadeResposta = JOptionPane.showOptionDialog(null,
                            "N" + i + " é amigo de " + " N" + j + "?",
                            "Amizades",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, optionsAmizade, null);
                    if (amizadeResposta == 0) {
                        amizades[i][j] = " 1 ";
                        amizades[j][i] = " 1 ";
                    } else if (amizadeResposta == -1) {
                        breakFor = true;
                        break;
                    }
                }
            }
            if (breakFor) {
                break;
            }
        }
        JOptionPane.showMessageDialog(null, mostrarMatriz(amizades));
    }
}
