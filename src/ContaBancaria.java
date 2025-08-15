public class ContaBancaria {
    public String nomeTitular;
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("Saque realizado\nSaldo: " + saldo);
        } else {
            System.out.println("Sem saldo");
        }
    }

    public void getSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
