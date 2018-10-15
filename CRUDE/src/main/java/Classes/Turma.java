package Classes;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Turma implements Identificavel {

	@Id
	@GeneratedValue(generator = "turma_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "turma_seq")
	private Long id;
	private Aluno alunos;
	private Disciplina disciplinas ;
	private Professor professores ;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aluno getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno alunos) {
		this.alunos = alunos;
	}

	public Disciplina getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Professor getProfessores() {
		return professores;
	}

	public void setProfessores(Professor professores) {
		this.professores = professores;
	}


	public Turma(Long id, Aluno alunos, Disciplina disciplinas, Professor professores) {
		super();
		this.id = id;
		this.alunos = alunos;
		this.disciplinas = disciplinas;
		this.professores = professores;
	}

	public Turma() {
		super();
	}

}