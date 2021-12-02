package com.devsuperior.projetobd.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.projetobd.entities.pk.ResponderQuestaoPK;

@Entity
@Table(name = "tb_responder_questao")
public class ResponderQuestao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ResponderQuestaoPK id = new ResponderQuestaoPK();
	
	public ResponderQuestao() {
	}
	
	public ResponderQuestao(Usuario usuario, RespostaQuestao respostaQuestao) {
		super();
		id.setUsuario(usuario);
		id.setRespostaQuestao(respostaQuestao);
	}
	
	public Usuario getUsuario() {
		return id.getUsuario();
	}
	
	public void setUsuario(Usuario usuario) {
		id.setUsuario(usuario);
	}
	
	public RespostaQuestao getQuestao() {
		return id.getRespostaQuestao();
	}
	
	public void setRespostaQuestao(RespostaQuestao respostaQuestao) {
		id.setRespostaQuestao(respostaQuestao);
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
		ResponderQuestao other = (ResponderQuestao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
