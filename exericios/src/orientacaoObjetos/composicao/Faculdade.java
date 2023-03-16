package orientacaoObjetos.composicao;

public class Faculdade {
    public static void main(String[] args) {
         Aluno aluno1 = new Aluno("Patrick");
         Aluno aluno2 = new Aluno("Bruna");
         Aluno aluno3 = new Aluno("Mario");

         aluno1.addCurso(new Curso("Portugues"));
         aluno1.addCurso(new Curso("Matematica"));
         aluno1.addCurso(new Curso("ingles"));

         aluno1.cursosCadastrados();

         aluno2.addCurso(new Curso("Natacao"));
         aluno2.addCurso(new Curso("Ui design"));

         aluno2.cursosCadastrados();

         aluno3.cursosCadastrados();

         /*Instanciando cursos*/

        Curso curso1 = new Curso("Culinaria");

        curso1.alunosCadastrados();
        curso1.addAluno(aluno1);
        curso1.alunosCadastrados();
        aluno1.cursosCadastrados();
        curso1.addAluno(aluno2);
        curso1.alunosCadastrados();
        aluno2.cursosCadastrados();
        aluno1.addCurso(new Curso("ed fisica"));

    }
}
