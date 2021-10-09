import javax.swing.*;

public class FabioAugusto_13 {

    /* Fábio Augusto Araújo Santos */

    static class PessoaInfo {
        String nome;
        String apelido;
    }

    public static void main(String[] args) {
        PessoaInfo dados = new PessoaInfo();
        String igual;
        try {
            dados.nome = JOptionPane.showInputDialog("Informe o nome completo da pessoa: ");
            dados.apelido = JOptionPane.showInputDialog("Informe o apelido da pessoa: ");
            if (dados.nome.equals(dados.apelido)) {
                igual = "O nome e o apelido são iguais!!!";
            } else {
                igual = "O nome e o apelido são diferentes!!!";
            }
            JOptionPane.showMessageDialog(null, "Nome completo: " + dados.nome +
                    " - Apelido: " + dados.apelido +
                    "\n\nQuantidade de caracteres (nome completo): " + dados.nome.length() +
                    "\n\nConcat: " + (dados.nome.concat(dados.apelido)) +
                    "\n\n" + igual);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }

    }
}
