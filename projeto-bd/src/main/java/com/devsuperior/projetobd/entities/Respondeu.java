package com.devsuperior.projetobd.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.projetobd.entities.pk.RespondeuPK;

@Entity
@Table(name = "tb_respondeu")
public class Respondeu implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RespondeuPK id = new RespondeuPK();
	
	private Comentario comentario;
	
	public Respondeu() {
	}
	
	public Respondeu(Comentario comentario) {
		super();
		id.setComentario(comentario);
		this.comentario = comentario;
	}

	public Comentario getComentario() {
		return id.getComentario();
	}
	
	public void setComentario(Comentario comentario) {
		id.setComentario(comentario);
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
		Respondeu other = (Respondeu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
