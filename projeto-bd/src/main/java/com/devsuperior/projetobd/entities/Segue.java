package com.devsuperior.projetobd.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.projetobd.entities.pk.SeguePK;

@Entity
@Table(name = "tb_segue")
public class Segue implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SeguePK id = new SeguePK();
	
	private Usuario usuario;
	
	public Segue() {
	}
	
	public Segue(Usuario usuario) {
		super();
		id.setUsuario(usuario);
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return id.getUsuario();
	}

	public void setUsuario(Usuario usuario) {
		id.setUsuario(usuario);
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
		Segue other = (Segue) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
