/**Dada uma sequência de números V, tal que V vai de 1 até V, contabilize a quantidade de 
números primos existentes nesta sequência*/
public class Main {
    public static void main(String[] args) {
        int divisores; 
        int V = 50; // Atribuição de valores a variáveis													1
        int contabilizador = 0; // Atribuição de valores a variáveis										1
        //int totalOperacoes = 0; // Atribuição de valores a variáveis										
		// antes do for:
		// contador = 1 --> Atribuição de valores a variáveis												1
		// contador <= V --> Comparação de dois números														1
		
        for (int contador = 1; contador <= V; contador++) { // número de execução do laço: n vezes			4 + n
		// depois do for:
		// contador++ -->  Operações aritméticas															4 + n*(1)
		// contador <= V --> Comparação de dois números														4 + n*(2)

            divisores = 0; // Atribuição de valores a variáveis												4 + n*(3)
            
                // antes do for:
				// aux = 1 -->  Atribuição de valores a variáveis											4 + n*(4)
				// aux <= V --> Comparação de dois números													4 + n*(5)
				for (int aux = 1; aux <= V; aux++) { // número de execução do laço: n*n vezes				n*n
				// depois do for:
				// aux++ -->  Operações aritméticas															4 + n*(5 + 1n)
				// aux <= V --> Comparação de dois números													4 + n*(5 + 2n)
                    if (contador%aux == 0) { // Comparação de dois números									4 + n*(5 + 3n)
                        divisores+=1; //  Atribuição de valores a variáveis & Operações aritméticas		    4 + n*(5 + n * (3 + logN))
                    }
                    //totalOperacoes+=1; // Atribuição de valores a variáveis & Operações aritméticas			
                }       
                if (divisores == 2) { // Comparação de dois números											4 + n*(5 + n * (3 + logN ) + 1)								
                    int primos = contador;  // Atribuição de valores a variáveis						
                    contabilizador += 1; // Atribuição de valores a variáveis & Operações aritméticas		4 + n*(5 + 3logn + n * (3 + logN) + 1)
																											4 + n* (6 + 3logN + n*(3 + logN)
                    //System.out.println(primos); // caso necessite ver os primos
                }
            //System.out.println("==============================");
            System.out.println(contador + ";" + totalOperacoes);
            //System.out.println("==============================");
            }
        System.out.println("TOTAL DE PRIMOS: " + contabilizador);
        }
    }