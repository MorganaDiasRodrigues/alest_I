/**Dada uma sequência de números V, tal que V vai de 1 até V, contabilize a quantidade de 
números primos existentes nesta sequência*/
public class Main {
    public static void main(String[] args) {
        int divisores; 
        int V = 5; 
        int contabilizador = 0;
        int totalOperacoes = 0;

        for (int contador = 1; contador <= V; contador++) {
            divisores = 0;
                for (int aux = 1; aux <= V; aux++) {
                    if (contador%aux == 0) {
                        divisores+=1;
                    }
                    totalOperacoes+=1;
                }       
                if (divisores == 2) {
                    contabilizador += 1;
                }
            System.out.println("==============================");
            System.out.println(contador + ";" + totalOperacoes);
            System.out.println("==============================");
            }
        System.out.println("TOTAL DE PRIMOS: " + contabilizador);
        }
    }