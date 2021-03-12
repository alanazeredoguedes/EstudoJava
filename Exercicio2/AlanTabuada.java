/* 
Nome: Alan Azeredo Guedes
Matricula: Botar Matricula aqui?, não rola ...
*/

package EstudoJava.Exercicio2;

import java.util.Scanner;

  class AlanTabuada {

    public static void main(String args[]){

        System.out.println("##########################");
        System.out.println("###  Programa Tabuada  ###");
        System.out.println("##########################");

        Scanner ler = new Scanner(System.in);

        int i = 1;
        while(i == 1){
            
            System.out.printf("\n##########################\n");
            System.out.printf("Olá Alan, entre com um numero: ");
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
        System.out.printf("Tabuada de Somar de %d \n", valor);
        System.out.printf("##########################\n"); 

        int i = 0;
        while (i <= 10){
            int resultado = i + valor;
            System.out.printf("%d + %d = %d \n",valor,i, resultado);
            i += 1;
        }
    }



}