package orientacaoObjetos.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    boolean  validaCadastrado(){
        if (cursos.size() >= 4){
            System.out.println("----------------------------");
            System.out.println("Não é possivel te cadastrar no curso");
            System.out.println("Você esta cadastrado em cursos demais");
            System.out.println("----------------------------");
            return false;
        }else {
            return true;
        }
    }

    void addCurso(Curso curso){
        if (validaCadastrado()){
            this.cursos.add(curso);
            curso.alunos.add(this);
        }

    }

    void cursosCadastrados(){
        System.out.println("------------------------------------------");
        System.out.println("Para o aluno(a): "+this.nome+"...");
        System.out.println("No momento esta cadastrado para os seguintes cursos: ");
        System.out.println("------------------------------------------");
        System.out.println();
        if (cursos.isEmpty()){
            System.out.println("Nenhum curso cadastrado para o aluno "+this.nome);
        }else{
            for(Curso c:cursos){
                System.out.println("Nome: "+c.nome);

            }
        }
        System.out.println();

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}
