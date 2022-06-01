package banco.services;
import banco.entities.*;

public class TaxaRendimentoBrasil implements TaxaRendimento{
    public double rendimento(Conta x){
        return x.getSaldo()*0.01;
    }
}
