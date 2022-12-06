package Main;

import Model.Heroi;
import Model.Necromante;
import dao.bolsaDAO;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        int progresso = 0;

        Heroi heroi = new Heroi("Juininho", "Guerreiro", 30, 30, 25, 14,
                "Espada", "Escudo");
        Necromante necromante = new Necromante("Melchior", 30, 2, 30, "Raio necrotico");

        bolsaDAO bolsaDAO = new bolsaDAO();

        bolsaDAO.addItem("1", "Pocao de cura");
        bolsaDAO.addItem("2", "Pocao de Forca");

        String titulo = "     _      _                _             _            _       _       _       _           \n" +
                "    / \\    | | ___ _ __   __| | __ _    __| | ___      | |_   _(_)_ __ (_)_ __ | |__   ___  \n" +
                "   / _ \\   | |/ _ \\ '_ \\ / _` |/ _` |  / _` |/ _ \\  _  | | | | | | '_ \\| | '_ \\| '_ \\ / _ \\ \n" +
                "  / ___ \\  | |  __/ | | | (_| | (_| | | (_| |  __/ | |_| | |_| | | | | | | | | | | | | (_) |\n" +
                " /_/   \\_\\ |_|\\___|_| |_|\\__,_|\\__,_|  \\__,_|\\___|  \\___/ \\__,_|_|_| |_|_|_| |_|_| |_|\\___/ \n" +
                "             ";


        String menu1 = "1- INICIAR" +
                "\n2- SAIR";

        String menu2 = "ESCOLHA UMA OPCAO\n" +
                "\n1- MOSTRAR FICHA" +
                "\n2- ABRIR INVENTARIO" +
                "\n3- SAIR EM AVENTURA" +
                "\n4- Voltar a tela principal";

        String missao = "Sua missao e encontrar o Necromante " + necromante.getNome() + "!\n" +
                necromante;

        String menu3 = "Essas são suas ações, " + necromante.getNome() + " ja esta fraco, então um golpe deve bastar!" +
                "\nPorem, voce tambem pode tomar outras ações, e então ele fará um ataque." +
                "\nO que deseja fazer:" +
                "\n1-Atacar com " + heroi.getFerramenta1() +
                "\n2-Atacar com " + heroi.getFerramenta2() +
                "\n3-Abrir inventario: ";


            while (progresso == 0) {
                try {
                    System.out.println(titulo);
                    System.out.println(menu1);

                    Scanner hid = new Scanner(System.in);
                    int opcao = hid.nextInt();

                    switch (opcao) {
                        case 1:
                            progresso = progresso + 1;
                            while ((progresso != 5) && (progresso > 0) && (progresso < 6)) {
                                try {
                                    System.out.println(menu2);
                                    progresso = progresso + 1;
                                    hid = new Scanner(System.in);
                                    opcao = hid.nextInt();
                                    progresso = progresso;
                                    switch (opcao) {
                                        case 1:
                                            System.out.println(heroi);
                                            progresso = progresso;
                                            break;

                                        case 2:
                                            System.out.println(bolsaDAO.bolsa);
                                            progresso = progresso;
                                            break;
                                        case 3:
                                            System.out.println(missao);
                                            progresso = 6;
                                            while (progresso == 6) {
                                                try{
                                                    System.out.println("\n");
                                                    System.out.println(menu3);
                                                    hid = new Scanner(System.in);
                                                    opcao = hid.nextInt();
                                                    switch (opcao) {
                                                        case 1:
                                                            heroi.ferramenta1();
                                                            System.out.println("Voce derrotou " + necromante.getNome() + " e salvou o dia!" +
                                                                    "\n Obrigado por jogar!!");
                                                            progresso = 100;
                                                            break;
                                                        case 2:
                                                            heroi.ferramenta2();
                                                            System.out.println("Voce derrotou " + necromante.getNome() + " e salvou o dia!" +
                                                                    "\n Obrigado por jogar!!");
                                                            progresso = 100;
                                                            break;
                                                        case 3:
                                                            System.out.println(bolsaDAO.bolsa);
                                                            System.out.println("O que deseja utilizar?(digite o numero equivalente ao item)");
                                                            Scanner hid2 = new Scanner(System.in);
                                                            String item = hid2.nextLine();

                                                            bolsaDAO.buscarItem(item);

                                                            System.out.println(necromante.getNome() + " ira usar o ataque " + necromante.getPoder1()
                                                                    + ", o que deseja fazer?" +
                                                                    "\n1-Defender" +
                                                                    "\n2-Desviar");


                                                            hid = new Scanner(System.in);
                                                            opcao = hid.nextInt();

                                                            switch (opcao) {
                                                                case 1:
                                                                    heroi.defender();
                                                                    progresso = 6;
                                                                    break;
                                                                case 2:
                                                                    heroi.esquivar();
                                                                    progresso = 6;
                                                                    break;
                                                                default:
                                                                    System.out.println("Insira um valor valido!");
                                                                    break;
                                                            }
                                                    }
                                                }catch (NoSuchElementException e) {
                                                    System.out.println("Insira um valor valido");
                                                    continue;
                                                }
                                            }
                                            break;
                                        case 4:
                                            progresso = 0;
                                            break;
                                        default:
                                            System.out.println("Insira um valor valido");
                                    }
                                }catch (NoSuchElementException e){
                                    System.out.println("Insira um valor valido");
                                    continue;
                                }
                            }
                            break;

                        case 2:
                            System.out.println("Obrigado por jogar:");
                            progresso = +1;
                            break;
                        default:
                            System.out.println("Insira um valor valido");
                            progresso = +1;
                            break;
                    }
                }catch (NoSuchElementException e){
                    System.out.println("Insira um valor valido");
                    continue;
                }
            }
        }
    }



