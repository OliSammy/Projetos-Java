package banco.services;

import banco.entities.*;
import banco.domainexception.*;

public interface MetodosContas {
    public void depositar(double valor) throws NumeroNegativoException;

    public void sacar(double valor) throws NumeroNegativoException, SaldoIndisponivelException;

    public void transferir(Conta destino, double valor) throws NumeroNegativoException,SaldoIndisponivelException,ContaInexistenteException;
}