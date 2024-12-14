package model;

public class Triatleta extends Nadador.Pessoa implements Nadador, Corredor, Ciclista {
    public Triatleta(String nome) {
        super(nome);
    }

    @Override
    public void nada() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void corre() {
        System.out.println(getNome() + " depois de nadar irá correr.");
    }

    @Override
    public void pedala() {
        System.out.println(getNome() + " depois de correr irá pedalar.");
    }
}

