package EstudoJava.Exercicio3;

import java.util.Scanner;


public class TesterAluno {
    
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();

        Scanner scan = new Scanner(System.in);

        System.out.printf("Entre com a Matricula: ");
        aluno.setMatricula( scan.nextLine() );

        System.out.printf("Entre com o Nome: ");
        aluno.setNome( scan.nextLine() );

        System.out.printf("Entre com o Curso: ");
        aluno.setCurso( scan.nextLine() );

        aluno.listar();

        scan.close();
    }



}
