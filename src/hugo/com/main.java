package hugo.com;

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        Cliente Hugo = new Cliente();
        Hugo.setNome("Hugo");
        Cliente Maria = new Cliente();
        Maria.setNome("Maria");

        Conta cc = new ContaCorrente(Hugo);
        cc.depositar(150);

        Conta cp = new ContaPoupanca(Hugo);
        Conta cc2 = new ContaCorrente(Maria);

        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cc2.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
