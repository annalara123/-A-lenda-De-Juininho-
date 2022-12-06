package Main;

import Model.Heroi;
import Model.Necromante;
import dao.bolsaDAO;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        int progresso = 0;

        Heroi heroi = new Heroi("Juininho", "Guerreiro", 30, 30, 25, 14,
                "Espada", "Escudo");
        Necromante necromante = new Necromante("Melchior", 30, 2, 30, "Raio necrotico");

        bolsaDAO bolsaDAO = new bolsaDAO();

        bolsaDAO.addItem("1", "Pocao de cura");
        bolsaDAO.addItem("2", "Pocao de Forca");

        String titulo = """
                    _      _                _             _            _       _       _       _          \s
                   / \\    | | ___ _ __   __| | __ _    __| | ___      | |_   _(_)_ __ (_)_ __ | |__   ___ \s
                  / _ \\   | |/ _ \\ '_ \\ / _` |/ _` |  / _` |/ _ \\  _  | | | | | | '_ \\| | '_ \\| '_ \\ / _ \\\s
                 / ___ \\  | |  __/ | | | (_| | (_| | | (_| |  __/ | |_| | |_| | | | | | | | | | | | | (_) |
                /_/   \\_\\ |_|\\___|_| |_|\\__,_|\\__,_|  \\__,_|\\___|  \\___/ \\__,_|_|_| |_|_|_| |_|_| |_|\\___/\s
                           \s""".indent(1);

        String menu1 = "1- INICIAR" +
                "\n2- SAIR";

        String menu2 = "ESCOLHA UMA OPCAO\n\n1- MOSTRAR FICHA\n2- ABRIR INVENTARIO\n3- SAIR EM AVENTURA\n4- Voltar a tela principal";

        String missao = "Sua missao e encontrar o Necromante " + necromante.getNome() + "!\n" +
                necromante;

        String menu3 = "Essas são suas ações, " + necromante.getNome() + " ja esta fraco, então um golpe deve bastar!" +
                "\nPorem, voce tambem pode tomar outras ações, e então ele fará um ataque." +
                "\nO que deseja fazer:" +
                "\n1-Atacar com " + heroi.getFerramenta1() +
                "\n2-Atacar com " + heroi.getFerramenta2() +
                "\n3-Abrir inventario: ";


        int opcao;
        int opcao1;
        int opcao2;


            while (progresso == 0) {
                try {
                    System.out.println(titulo);
                    opcao = Integer.parseInt(JOptionPane.showInputDialog(menu1));


                    switch (opcao) {
                        case 1 -> {
                            progresso = progresso + 1;
                            while ((progresso != 5) && (progresso > 0) && (progresso < 6)) {
                                try {
                                    opcao1 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
                                    progresso = progresso + 1;


                                    switch (opcao1) {
                                        case 1 -> JOptionPane.showMessageDialog(null, heroi);
                                        case 2 -> JOptionPane.showMessageDialog(null, bolsaDAO.bolsa);
                                        case 3 -> {
                                            JOptionPane.showMessageDialog(null, missao);
                                            progresso = 6;
                                            while (progresso == 6) {
                                                try {
                                                    System.out.println("\n");
                                                    opcao2 = Integer.parseInt(JOptionPane.showInputDialog(menu3));

                                                    switch (opcao2) {
                                                        case 1 -> {
                                                            JOptionPane.showMessageDialog(null, heroi.ferramenta1());
                                                            JOptionPane.showMessageDialog(null, "Voce derrotou " + necromante.getNome() + " e salvou o dia!" +
                                                                    "\n Obrigado por jogar!!");
                                                            progresso = 100;
                                                        }
                                                        case 2 -> {
                                                            JOptionPane.showMessageDialog(null, heroi.ferramenta2());
                                                            JOptionPane.showMessageDialog(null, "Voce derrotou " + necromante.getNome() + " e salvou o dia!" +
                                                                    "\n Obrigado por jogar!!");
                                                            progresso = 100;
                                                        }
                                                        case 3 -> {
                                                            JOptionPane.showMessageDialog(null, bolsaDAO.bolsa);
                                                            String item = JOptionPane.showInputDialog("O que deseja utilizar?(digite o numero equivalente ao item)");
                                                            JOptionPane.showMessageDialog(null, bolsaDAO.buscarItem(item));
                                                            String res = necromante.getNome() + " ira usar o ataque " + necromante.getPoder1()
                                                                    + ", o que deseja fazer?" +
                                                                    "\n1-Defender" +
                                                                    "\n2-Desviar";
                                                            int opcao4 = Integer.parseInt(JOptionPane.showInputDialog(res));
                                                            switch (opcao4) {
                                                                case 1 -> JOptionPane.showMessageDialog(null, heroi.defender());
                                                                case 2 -> JOptionPane.showMessageDialog(null, heroi.esquivar());
                                                                default ->
                                                                        JOptionPane.showMessageDialog(null, "Insira um valor valido!");
                                                            }
                                                        }
                                                    }
                                                } catch (NumberFormatException e) {
                                                    JOptionPane.showMessageDialog(null, "Insira um valor valido");
                                                }
                                            }
                                        }
                                        case 4 -> progresso = 0;
                                        default -> JOptionPane.showMessageDialog(null, "Insira um valor valido");
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Insira um valor valido");
                                }
                            }
                        }
                        case 2 -> {
                            JOptionPane.showMessageDialog(null, "Obrigado por jogar:");
                            progresso+= 1;
                        }
                        default -> {
                            JOptionPane.showMessageDialog(null, "Insira um valor valido");
                            progresso +=1;
                        }
                    }
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Insira um valor valido");

                }
            }
        }
    }



