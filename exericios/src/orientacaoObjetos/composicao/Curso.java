package orientacaoObjetos.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;
    final List<Aluno> alunos = new ArrayList<>();
    public Curso(String nome) {
        this.nome = nome;
    }

    void addAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    void alunosCadastrados(){
        System.out.println("------------------------------------------");
        System.out.println("Para o curso: "+this.nome+"...");
        System.out.println("No momento esta cadastrado para os seguintes alunos: ");
        System.out.println("------------------------------------------");
        System.out.println();

        if (alunos.isEmpty()){
            System.out.println("No momento não esta com nenhum aluno cadastrado");
        }else {
            for(Aluno aluno: alunos){
                System.out.println(aluno.nome);
            }
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
