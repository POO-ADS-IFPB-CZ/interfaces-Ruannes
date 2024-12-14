package view;

import model.Triatleta;
import model.questao2.ContaPoupanca;

public class Main {
    public static void main(String[] args){

        Triatleta triatleta = new Triatleta("Ruan");

        System.out.println("\n=====1° questão=====\n");

        System.out.println("Triatleta: " + triatleta.getNome());
        triatleta.nada();
        triatleta.corre();
        triatleta.pedala();

        System.out.println("\n====2° questão====\n");

        ContaPoupanca contaPoupanca = new ContaPoupanca(263, "Ruan", 150);

        // Mostrando informações da conta
        System.out.println("Número da conta: " + contaPoupanca.getNumero());
        System.out.println("Titular: " + contaPoupanca.getNome());
        System.out.println("Saldo inicial: " + contaPoupanca.getSaldo());

        // Fazendo reajuste do saldo com uma taxa de 2%
        contaPoupanca.reajustar(2.0);
        System.out.println("Saldo após reajuste: " + contaPoupanca.getSaldo());

        // Fazendo um depósito e exibindo novamente
        contaPoupanca.depositar(50);
        System.out.println("Saldo após depósito: " + contaPoupanca.getSaldo());

    }
}
