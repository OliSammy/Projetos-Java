package banco.domainexception;

public class NumeroNegativoException extends Exception {
    public NumeroNegativoException() {
        super("Não pode ser depositado valores negativos.");
    }
}
