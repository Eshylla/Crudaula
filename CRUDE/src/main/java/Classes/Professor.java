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
public class Professor implements Identificavel {

	@Id
	@GeneratedValue(generator = "professor_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "professor_seq")
	private Long id;
	private String nome;
	private String username;
	private String password;
	
	
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public Professor(Long id, String nome, String username, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.password = password;
		
	}

	public Professor() {
		super();
	}

}