package model.questao2;

   public class ContaPoupanca extends Conta implements InvestimentoAplicavel{

    public ContaPoupanca(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }


    public void reajustar(double taxa) {
        double saldoAtual = this.getSaldo();
        double novoSaldo = saldoAtual + (saldoAtual * (taxa / 100));
        this.setSaldo(novoSaldo);
       }
   }

