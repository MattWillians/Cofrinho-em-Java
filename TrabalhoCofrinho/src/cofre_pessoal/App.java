//Pacote de onde todas as funções do app estão
package cofre_pessoal;
//Importa o Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Sistema desenvolvido por: Matheus Willians de Paula Pereira.");

        //Cria o SCANNER que vai receber todo tipo de informação digitada pelo USUARIO
        Scanner teclado = new Scanner(System.in);

        //Cria o cofrinho em nossa função 'APP'
        Cofrinho cofrinho = new Cofrinho();

        //Laço feito para o fluxo de decisão!
        while (true) {

            //Variaveis para coletar as moedas digitadas pelo USUARIO
            Double moedaDolar;
            Double moedaEuro;
            Double moedaReal;
            
            //Variavel que representa todas as decisões tomadas
            int opcaoEscolhida;

            //Cria as moedas fazendo uma variavel chamada MOEDA
            Moeda moeda;

            //Print do menu de opções de maneira agradavel
            System.out.println("----- COFRINHO  PESSOAL -----");
            System.out.println("    1 - ADICIONAR MOEDAS!");
            System.out.println("    2 - REMOVER MOEDAS!");
            System.out.println("    3 - LISTAR MOEDAS!");
            System.out.println("    4 - CALCULAR TOTAL DOS VALORES!");
            System.out.println("    5 - ENCERRAR PROGRAMA");
            System.out.println("-------- RU: 3964448 --------");

            // Try_Catch usado para tratar de erros globais
            try {
                
                //Pergunta ao usuario qual função iniciar
                opcaoEscolhida = teclado.nextInt();
            
                //ADICIONAR MOEDAS
                if(opcaoEscolhida == 1){
                    
                    //ESCOLHE QUAL TIPO DE MOEDA ADICIONAR
                    System.out.println("Deseja adicionar: \n 1 - REAIS | 2 - DOLARES | 3 - EUROS");
                    opcaoEscolhida = teclado.nextInt();
    
                    if (opcaoEscolhida == 1){
    
                        System.out.println("Digite o valor do REAL a ser adicionado: ");
                        moedaReal = teclado.nextDouble();
                        //Cria a moeda desejada e adiciona ela ao cofrinho, retornando a função principal
                        moeda = new Real(moedaReal);
                        cofrinho.adicionar(moeda);
                        continue;
    
                    } else if (opcaoEscolhida == 2){
    
                        System.out.println("Digite o valor do DOLAR a ser adicionado: ");
                        moedaDolar = teclado.nextDouble();
                        //Cria a moeda desejada e adiciona ela ao cofrinho, retornando a função principal
                        moeda = new Dolar(moedaDolar);
                        cofrinho.adicionar(moeda);
                        continue;
                        
                    } else if(opcaoEscolhida == 3){
    
                        System.out.println("Digite o valor do EURO a ser adicionado: ");
                        moedaEuro = teclado.nextDouble();
                        //Cria a moeda desejada e adiciona ela ao cofrinho, retornando a função principal
                        moeda = new Euro(moedaEuro);
                        cofrinho.adicionar(moeda);
                        continue;
                    }
                
                
                //REMOVER MOEDAS
                } else if (opcaoEscolhida == 2){
                    
                    System.out.println("Qual o tipo de moeda a ser removida?\n 1 - REAIS | 2 - DOLARES | 3 - EUROS");
                    opcaoEscolhida = teclado.nextInt();
    
                    if (opcaoEscolhida == 1){
    
                        System.out.println("Digite o valor da moeda -> REAL <-");
                        moedaReal = teclado.nextDouble();
                        //A função acessa o cofrinho, e remove a mooeda escolhida!
                        cofrinho.remover(moedaReal);
                        continue;
    
                    } else if (opcaoEscolhida == 2){
    
                        System.out.println("Digite o valor da moeda -> DOLAR <-");
                        moedaDolar = teclado.nextDouble();
                        //A função acessa o cofrinho, e remove a mooeda escolhida!
                        cofrinho.remover(moedaDolar);
                        continue;
    
                    } else if (opcaoEscolhida == 3){
    
                        System.out.println("Digite o valor da moeda -> EURO <-");
                        moedaEuro = teclado.nextDouble();
                        //A função acessa o cofrinho, e remove a mooeda escolhida!
                        cofrinho.remover(moedaEuro);
                        continue;
    
                    }
                    
                //LISTAGEM DE MOEDAS!
                } else if (opcaoEscolhida == 3){
    
                    System.out.println("Listando suas moedas...");
                    
                    //Acessa a função, e faz o print das moedas conforme pedido.
                    cofrinho.listagemMoedas();
                    System.out.println("---+---+---");
                    continue;
                
                //CALCULAR VALOR EM REAL!
                } else if (opcaoEscolhida == 4){   

                    //Acessa a função de converter as moedas 
                    System.out.println("Calculando valores...");
                    System.out.println("---+----+---");
                    System.out.printf("%.2f \n", cofrinho.totalConvertido());
                    System.out.println("---+----+---");
                
                //ENCERRA O PROGRAMA
                } else if (opcaoEscolhida == 5){
                    System.out.println("Encerrando programa...");
                    teclado.close();
                    break;
                }
            //CAPTURA ERROS - QUALQUER TIPO DE ERROS
            } catch (Exception e) {
                System.out.println("Algo deu errado");
            }    
        } 
    } 
}
