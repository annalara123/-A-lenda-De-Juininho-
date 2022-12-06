package Model;

import Interface.INecromante;

public class Necromante implements INecromante {
    String nome;
    int vida;
    int vidaAtual;
    int intelec;
    String poder1;

    public Necromante(String nome, int vida, int vidaAtual, int intelec, String poder1) {
        this.nome = nome;
        this.vida = vida;
        this.vidaAtual = vidaAtual;
        this.intelec = intelec;
        this.poder1 = poder1;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getIntelec() {
        return intelec;
    }

    public void setIntelec(int intelec) {
        this.intelec = intelec;
    }

    public String getPoder1() {
        return poder1;
    }

    public void setPoder1(String poder1) {
        this.poder1 = poder1;
    }


    @Override
    public String toString(){
        return  "Ficha do Inimigo: \n" +
                "\nNome: " + this.nome +
                "\nVida: " + this.vidaAtual + "/" + this.vida+
                "\nIntelecto: " + this.intelec;
    }


    @Override
    public void poder1() {
        System.out.println("O necromante utilizou o " +this.poder1+ "!" );
    }


}
