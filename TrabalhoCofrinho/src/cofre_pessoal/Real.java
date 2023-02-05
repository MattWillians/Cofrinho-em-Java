package cofre_pessoal;

public class Real extends Moeda {

    //puxa o VALOR da classe mãe para classe filha
    public Real(double valor) {
        super(valor);

    }

    //CONVERTE A MOEDA SOB BASE A SUA TAXA, como essa moeda não é necessaria conversão, apenas retorna o seu valor
    @Override
    public double converter() {
        return valor;
    }

    //Puxa a informação de cada moeda
    @Override
    void info() {
        System.out.println("Real: "+ valor);
    }

    //Transforma em STRING OS VALORES
    @Override
    public String toString() {
        return "Real: " + valor;
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
