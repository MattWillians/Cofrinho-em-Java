package cofre_pessoal;

public abstract class Moeda {
    
    //CLASSSE MÃE TODOS OS CONTEUDOS AQUI SÃO UM 'TEMPLATE'
    double valor;

    //cria a obrigatoriedade de construtores
    public Moeda(double valor) {
        this.valor = valor;
    }

    //Funções abstratas de conversão e informação
    abstract double converter();
    abstract void info();

    //Gera um codigo de hash para cada moeda
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moeda other = (Moeda) obj;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        return true;
    }

}
