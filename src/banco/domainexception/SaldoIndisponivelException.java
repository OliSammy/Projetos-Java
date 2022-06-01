package banco.domainexception;

public class SaldoIndisponivelException extends Exception {
    public SaldoIndisponivelException() {
        super("Saldo indisponivel para saque, verifique seu saldo.");
    }
}
