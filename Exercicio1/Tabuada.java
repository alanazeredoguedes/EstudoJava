/* 
Nome: Alan Azeredo Guedes
Matricula: Botar Matricula aqui?, não rola ...
*/
package EstudoJava.Exercicio1;

import java.util.Scanner;

  class Tabuada {

    public static void main(String args[]){

        System.out.println("##########################");
        System.out.println("###  Programa Tabuada  ###");
        System.out.println("##########################");

        Scanner ler = new Scanner(System.in);

        int i = 1;
        while(i == 1){
            
            System.out.printf("\n##########################\n");
            System.out.printf("Numero para a Tabuada: ");
            int valor = ler.nextInt();
            System.out.printf("##########################\n");

            tabuada(valor);

            System.out.printf("##########################\n");
            System.out.print("Digite 1 para continuar: ");
            i = ler.nextInt();
            System.out.printf("##########################\n");

        }
        
        ler.close();
    }

    private static void tabuada(int valor){
        System.out.printf("\n##########################\n");
        System.out.printf("Resultado da Tabuada de %d \n", valor);
        System.out.printf("##########################\n"); 

        int i = 0;
        while (i <= 10){
            int resultado = i * valor;
            System.out.printf("%d x %d = %d \n",i,valor, resultado);
            i += 1;
        }
    }



}