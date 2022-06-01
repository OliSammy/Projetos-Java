package banco.entities;

import banco.domainexception.*;
import banco.services.*;

public class ContaPoupanca extends Conta implements MetodosContas {
    private TaxaRendimento rendimento;

    public ContaPoupanca(String titular, int idConta, double saldo, TaxaRendimento taxa){
        super(titular, idConta, saldo);
        rendimento = taxa;
    }

    public void gerarRendimento(){
        saldo += rendimento.rendimento(this);
    }

    @Override
    public void depositar(double valor) throws NumeroNegativoException {
        if (valor < 0) {
            throw new NumeroNegativoException();
        }
        saldo += valor;
        
    }

    @Override
    public void sacar(double valor) throws NumeroNegativoException, SaldoIndisponivelException {
        if(valor>saldo){
            throw new SaldoIndisponivelException();
        }
        saldo-=valor;        
    }

    @Override
    public void transferir(Conta destino, double valor)
            throws NumeroNegativoException, SaldoIndisponivelException, ContaInexistenteException {
        if(destino == null){
            throw new ContaInexistenteException();
        }
        this.sacar(valor);
        destino.saldo+=valor;
    }
    
}
