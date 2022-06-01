package banco.domainexception;

public class NumeroNegativoException extends Exception {
    @Override
    public String toString() {
        return "Não pode ser depositado valores negativos.";
    }
}
