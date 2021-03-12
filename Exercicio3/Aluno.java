package EstudoJava.Exercicio3;

class Aluno{

    private String matricula;

    private String nome;

    private String curso;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        this.nome = nome.toLowerCase();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {

        if( curso.equalsIgnoreCase("si") ){
            curso = "Sistema de Informação";
        }else if( curso.equalsIgnoreCase("adm") ){
            curso = "Administração";
        }

        this.curso = curso;
    }

    public void listar(){
       
        System.out.printf("O aluno %s está cursando %s e possui a matricula %s \n", this.getNome(), this.getCurso(), this.getMatricula());
    
    }
}