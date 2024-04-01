public class TesteHeranca {
    public static void main(String[] args) {

//        AlunoGraduacao aluno = new AlunoGraduacao();

//        aluno.ra = 766716461;
//        aluno.nome = "José";
//        aluno.idade = 19;
//        System.out.printf("nome: %s, idade: %d, RA: %d", aluno.nome, aluno.idade, aluno.ra); 

        ProfessorHorista profHor = new ProfessorHorista();
        profHor.nome = "Rodrigo";
        ProfessorPesquisador profPesq = new ProfessorPesquisador();
        profPesq.nome = "Lucas";

        profHor.lecionar();
        profPesq.lecionar();
        
    }
}
