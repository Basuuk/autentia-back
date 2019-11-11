package com.nlc.autentia.entity;

import java.io.Serializable;

public class Course implements Serializable {

	private static final long serialVersionUID = 5762440737654041169L;

	private Integer id;

	private String titulo;

	private String nivel;

	private Integer horas;

	private Boolean estado;

	private Integer id_profesor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Integer getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(Integer id_profesor) {
		this.id_profesor = id_profesor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((horas == null) ? 0 : horas.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((id_profesor == null) ? 0 : id_profesor.hashCode());
		result = prime * result + ((nivel == null) ? 0 : nivel.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Course other = (Course) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (horas == null) {
			if (other.horas != null)
				return false;
		} else if (!horas.equals(other.horas))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (id_profesor == null) {
			if (other.id_profesor != null)
				return false;
		} else if (!id_profesor.equals(other.id_profesor))
			return false;
		if (nivel == null) {
			if (other.nivel != null)
				return false;
		} else if (!nivel.equals(other.nivel))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", titulo=" + titulo + ", nivel=" + nivel + ", horas=" + horas + ", estado=" + estado + ", id_profesor=" + id_profesor + "]";
	}

}
