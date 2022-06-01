package banco.domainexception;

public class ContaInexistenteException extends Exception {
    public ContaInexistenteException() {
        super("Conta de destino inexistente.");
    }
}
