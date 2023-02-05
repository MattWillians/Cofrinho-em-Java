package cofre_pessoal;

public class Dolar extends Moeda {
    
    //PUXA DA CLASSE MÃE O VALOR!
    public Dolar(double valor) {
        super(valor);
    }

    //TAXA DE CONVERSÃO Ficticia 
    public double taxaConversaoDolar = 5.36;

    //RETORNA O VALOR DE TODAS AS MOEDAS CONVERTIDAS
    @Override
    public double converter() {
        return valor * taxaConversaoDolar;
    }

    //Informação da moeda
    @Override
    void info() {
        System.out.println("Dolar: "+ valor);
        
    }

    //transforma em string os valores
    @Override
    public String toString() {
        return "Dolar: " + valor;
    }

    //Gera um codigo de hash para cada moeda
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(valor);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    //Função 'equals' para comparar valores
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dolar other = (Dolar) obj;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        return true;
    }
}
