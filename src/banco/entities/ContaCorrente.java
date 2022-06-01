package banco.entities;

import banco.domainexception.NumeroNegativo;
import banco.domainexception.NumeroNegativoException;
import banco.domainexception.SaldoIndisponivelException;
import banco.services.MetodosContas;

public class ContaCorrente extends Conta implements MetodosContas {
    private double limite = 500.0;

    public ContaCorrente(String titular, int idConta, double saldo) {
        super(titular, idConta, saldo);
    }

    public ContaCorrente(String titular, int idConta, double saldo, double limite) {
        super(titular, idConta, saldo);
        this.limite = limite;
    }

    public void depositar(double valor) throws NumeroNegativoException {
        if (valor < 0) {
            throw new NumeroNegativoException();
        }
        saldo += valor;
    }

    public void sacar(double valor) throws NumeroNegativoException, SaldoIndisponivelException {
        if (valor < 0) {
            throw new NumeroNegativoException();
        }
        if (valor > saldo + limite) {
            throw new SaldoIndisponivelException();
        }
        saldo -= valor;
        if (saldo < 0) {
            limite += saldo;
        }
    }
}
