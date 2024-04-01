public class TesteHeranca {
    public static void main(String[] args) {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.nome = "José";
        aluno.idade = 19;
        System.out.printf("nome: %s, idade: %d", aluno.nome, aluno.idade);
        
    }
}
