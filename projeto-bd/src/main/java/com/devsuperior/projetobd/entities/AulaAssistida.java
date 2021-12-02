package com.devsuperior.projetobd.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.projetobd.entities.pk.AulaAssistidaPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_aula_assistida")
public class AulaAssistida {
	
	@EmbeddedId
	private AulaAssistidaPK id = new AulaAssistidaPK();
	
	public AulaAssistida() {
	}
	
	public AulaAssistida(Aula aula_assistida, Usuario usuario_que_assistiu) {
		super();
		id.setAula(aula_assistida);
		id.setUsuario(usuario_que_assistiu);
	}
	
	public Aula getAula() {
		return id.getAula();
	}
	
	public void setAula(Aula aula_assistida) {
		id.setAula(aula_assistida);
	}
	
	@JsonIgnore
	public Usuario getUsuario() {
		return id.getUsuario();
	}
	
	public void setUsuario(Usuario usuario_que_assistiu) {
		id.setUsuario(usuario_que_assistiu);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AulaAssistida other = (AulaAssistida) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
