abstract class ContaBancaria {
    protected double saldo;
    protected String numeroConta;

    public ContaBancaria(double saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
}

class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo, String numeroConta) {
        super(saldo, numeroConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldo, String numeroConta) {
        super(saldo, numeroConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

class TesteContas {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000, "123456");
        ContaPoupanca contaPoupanca = new ContaPoupanca(5000, "654321");

        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        contaPoupanca.depositar(1000);
        contaPoupanca.sacar(4000);

        System.out.println("Saldo conta corrente: " + contaCorrente.saldo);
        System.out.println("Saldo conta poupança: " + contaPoupanca.saldo);
    }
}
