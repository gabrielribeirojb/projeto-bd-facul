package com.devsuperior.projetobd.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.devsuperior.projetobd.entities.RespostaQuestao;
import com.devsuperior.projetobd.entities.Usuario;

@Embeddable
public class ResponderQuestaoPK implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "resposta_questao_id")
	private RespostaQuestao respostaQuestao;
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public RespostaQuestao getRespostaQuestao() {
		return respostaQuestao;
	}
	
	public void setRespostaQuestao(RespostaQuestao respostaQuestao) {
		this.respostaQuestao = respostaQuestao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((respostaQuestao == null) ? 0 : respostaQuestao.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		ResponderQuestaoPK other = (ResponderQuestaoPK) obj;
		if (respostaQuestao == null) {
			if (other.respostaQuestao != null)
				return false;
		} else if (!respostaQuestao.equals(other.respostaQuestao))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
	
	
}
