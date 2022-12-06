package Model;

import Interface.IHeroi;


public class Heroi implements IHeroi {
    String nome;
    String tipo;
    int vida;
    int vidaAtual;
    int forca;
    int intelec;

    String ferramenta1;

    String ferramenta2;

    public Heroi(String nome, String tipo, int vida, int vidaAtual, int forca, int intelec,
                 String ferramenta1, String ferramenta2) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.vidaAtual = vidaAtual;
        this.forca = forca;
        this.intelec = intelec;
        this.ferramenta1 = ferramenta1;
        this.ferramenta2 = ferramenta2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getIntelec() {
        return intelec;
    }

    public void setIntelec(int intelec) {
        this.intelec = intelec;
    }

    public String getFerramenta1() {
        return ferramenta1;
    }

    public void setFerramenta1(String ferramenta1) {
        this.ferramenta1 = ferramenta1;
    }

    public String getFerramenta2() {
        return ferramenta2;
    }

    public void setFerramenta2(String ferramenta2) {
        this.ferramenta2 = ferramenta2;
    }

    @Override
    public String toString() {
        return "Ficha do personagem:\n" +
                "\nNome: " + this.nome +
                "\nClasse: " + this.tipo +
                "\nVida: " + this.vida + "/" + this.vidaAtual +
                "\nForca: " + this.forca +
                "\nIntelecto: " +this.intelec +
                "\nFerramenta 1: " +this.ferramenta1 +
                "\nFerramenta 2: " +this.ferramenta2;
    }

    @Override
    public void abrirInventario() {
        System.out.println("Inventario: " + "\n");
    }

    @Override
    public Object ferramenta1() {
        return "Voce utilizou o(a) "+ this.ferramenta1 + "!";
    }

    @Override
    public Object ferramenta2() {

        return "Voce utilizou o(a) " + this.ferramenta2+"!";
    }

    @Override
    public Object defender() {
        return "Voce se defendeu!";
    }

    @Override
    public Object esquivar() {
        return"Voce se esquivou!";
    }
}
