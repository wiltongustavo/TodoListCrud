package cap.com.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TodoListModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String posicao;
	
	@NotBlank
	private String ide;
	
	@NotBlank
	private String tecnologia;
	
	@NotBlank
	private String versao;
	
	
	

	
	
	
	


	public TodoListModel() {
		super();
	}



	public TodoListModel(Long id, @NotBlank String posicao, @NotBlank String ide, @NotBlank String tecnologia,
			@NotBlank String versao) {
		super();
		this.id = id;
		this.posicao = posicao;
		this.ide = ide;
		this.tecnologia = tecnologia;
		this.versao = versao;
	}



	public String getPosicao() {
		return posicao;
	}



	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}



	public String getIde() {
		return ide;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setIde(String ide) {
		this.ide = ide;
	}
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	
	
}
