package test.miguel.dev.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Estudante implements Serializable{
	// TODO Implementar a entidade Estudante conforme solicitado
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank(message = "Nome é Obrigatório")
	private String nome;

	@NotBlank(message = "Email é Obrigatório")
	private String email;
	
	@NotBlank(message = "Telefone é Obrigatório")
	private String telefone;
	
	@NotBlank(message = "Curso é Obrigatório")
	private String curso;
	
	@NotBlank(message = "Materia é Obrigatório")
	private String matricula;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String material) {
		this.matricula = material;
	}
	
	
	
}
