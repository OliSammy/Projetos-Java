package banco.entities;

public class Conta {
    protected String titular;
    protected int idConta;
    protected double saldo;

    public Conta() {
    }

    public Conta(String titular, int idConta, double saldo) {
        this.titular = titular;
        this.idConta = idConta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", idConta: " + idConta + ", saldo: R$" + saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}