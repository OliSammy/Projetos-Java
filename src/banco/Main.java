package banco;
import banco.entities.*;
import banco.domainexception.*;

public class Main{
    public static void main(String[] args) {
        ContaCorrente x = new ContaCorrente("Matheus",01,1000);
        try {
            x.sacar(-1600);
            System.out.println("Deu certo");
        } catch (SaldoIndisponivelException e) {
            System.out.println("Error: " + e.getMessage());
        }catch(NumeroNegativoException e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }
}