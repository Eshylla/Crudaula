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
public class Aluno implements Identificavel {

	@Id
	@GeneratedValue(generator = "aluno_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "aluno_seq")
	private Long id;
	private String nome;
		
	
	public Long getId() {
		return id;
	}

	public void setId(Long idPessoa) {
		this.id = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public Aluno(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Aluno() {
		super();
	}

}