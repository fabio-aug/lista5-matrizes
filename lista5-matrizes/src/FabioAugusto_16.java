import javax.swing.*;
import java.util.ArrayList;

public class FabioAugusto_16 {

    /* Fábio Augusto Araújo Santos */

    static class Planta {
        int codigo;
        String nome;
        int estoqueIdeal;
        int estoqueAtual;
    }

    static void cadastrarPlanta(ArrayList<Planta> plantas) {
        if (plantas.size() < 50) {
            Planta novaPlanta = new Planta();
            novaPlanta.codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da planta: "));
            novaPlanta.nome = JOptionPane.showInputDialog("Informe o nome da planta: ");
            novaPlanta.estoqueIdeal = Integer.parseInt(JOptionPane.showInputDialog("Informe o estoque ideal da planta: "));
            novaPlanta.estoqueAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o estoque da planta: "));
            plantas.add(novaPlanta);
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível cadastrar mais de 50 plantas!!");
        }
    }

    static void retirarPlanta(ArrayList<Planta> plantas) {
        boolean naoEncontrado = false;
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da planta: "));
        int retirada = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de plantas para a retirada: "));
        while (retirada < 0) {
            retirada = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor positivo: "));
        }
        for (Planta planta : plantas) {
            if (planta.codigo == codigo) {
                naoEncontrado = false;
                if ((planta.estoqueAtual - retirada) < 0) {
                    JOptionPane.showMessageDialog(null, "Não há estoque o suficiente para a retirada!!!");
                } else {
                    planta.estoqueAtual = (planta.estoqueAtual - retirada);
                    JOptionPane.showMessageDialog(null, "Retirado com sucesso " + retirada + " plantas!!!");
                }
            } else {
                naoEncontrado = true;
            }
        }
        if (naoEncontrado) {
            JOptionPane.showMessageDialog(null, "Planta com o código " + codigo + " não encontrada!!!");
        }
    }

    static void inserirPlanta(ArrayList<Planta> plantas) {
        boolean naoEncontrado = false;
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da planta: "));
        int inserir = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de plantas para inserir: "));
        while (inserir < 0) {
            inserir = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor positivo: "));
        }
        for (Planta planta : plantas) {
            if (planta.codigo == codigo) {
                naoEncontrado = false;
                planta.estoqueAtual += inserir;
                JOptionPane.showMessageDialog(null, "Inserido com sucesso " + inserir + " plantas!!!");
                break;
            } else {
                naoEncontrado = true;
            }
        }
        if (naoEncontrado) {
            JOptionPane.showMessageDialog(null, "Planta com o código " + codigo + " não encontrada!!!");
        }
    }

    static void relatorioPlanta(ArrayList<Planta> plantas) {
        String print = "";
        for (Planta planta : plantas) {
            int plantasComprar;
            if (planta.estoqueAtual < planta.estoqueIdeal) {
                plantasComprar = planta.estoqueIdeal - planta.estoqueAtual;
                print += "Nome: " + planta.nome +
                        "\n    Estoque Atual: " + planta.estoqueAtual +
                        "\n    Quantidades a serem compradas: " + plantasComprar + "\n";
            } else {
                print += "Nome: " + planta.nome +
                        "\n    Estoque Atual: " + planta.estoqueAtual + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, print);
    }

    public static void main(String[] args) {
        String[] options = new String[]{"1", "2", "3", "4", "5"};
        ArrayList<Planta> plantas = new ArrayList<>();
        int optionsResposta = 0;
        try {
            while (optionsResposta != 4) {
                optionsResposta = JOptionPane.showOptionDialog(null,
                        "========================================" +
                                "\nFLORICULTURA MARIASFLOR" +
                                "\n========================================" +
                                "\n1. CADASTRAR NOVA PLANTA" +
                                "\n2. RETIRAR PLANTA" +
                                "\n3. INSERIR PLANTA" +
                                "\n4. IMPRIMIR RELATÓRIO" +
                                "\n5. SAIR" +
                                "\n========================================",
                        "FLORICULTURA MARIASFLOR",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options, options[0]);
                if (optionsResposta == 0) {
                    cadastrarPlanta(plantas);
                } else if (optionsResposta == 1) {
                    retirarPlanta(plantas);
                } else if (optionsResposta == 2) {
                    inserirPlanta(plantas);
                } else if (optionsResposta == 3) {
                    relatorioPlanta(plantas);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
