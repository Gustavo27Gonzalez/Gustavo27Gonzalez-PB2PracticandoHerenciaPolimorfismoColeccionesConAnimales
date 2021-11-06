package ar.edu.unlam.dominio;

import ar.edu.unlam.dominio.enums.Dominio;
import ar.edu.unlam.dominio.enums.Filo;
import ar.edu.unlam.dominio.enums.Reino;
import ar.edu.unlam.dominio.enums.Sexo;

public class SerVivo implements Comparable<SerVivo>{
	
	private Dominio dominio;
	private Reino reino;
	private Filo filo;
	private String clase;
	private String orden;
	private String familia;
	private String subfamilia;
	private String genero;
	private String especie;
	private Sexo sexo;
	
	public SerVivo(Dominio dominio, Reino reino, Filo filo, String clase, String orden, String familia,
			String subfamilia, String genero, String especie, Sexo sexo) {
		this.dominio = dominio;
		this.reino = reino;
		this.filo = filo;
		this.clase = clase;
		this.orden = orden;
		this.familia = familia;
		this.subfamilia = subfamilia;
		this.genero = genero;
		this.especie = especie;
		this.sexo = sexo;
	}
	
	public Dominio getDominio() {
		return dominio;
	}

	public void setDominio(Dominio dominio) {
		this.dominio = dominio;
	}

	public Reino getReino() {
		return reino;
	}

	public void setReino(Reino reino) {
		this.reino = reino;
	}

	public Filo getFilo() {
		return filo;
	}

	public void setFilo(Filo filo) {
		this.filo = filo;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getSubfamilia() {
		return subfamilia;
	}

	public void setSubfamilia(String subfamilia) {
		this.subfamilia = subfamilia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "SerVivo: Dominio = " + dominio + ". Reino = " + reino + ". Filo = " + filo + ". Clase = " + clase + ". Orden = "
				+ orden + ". Familia = " + familia + ". Subfamilia = " + subfamilia + ". Género = " + genero + ". Especie = "
				+ especie + ". Sexo = " + sexo + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clase == null) ? 0 : clase.hashCode());
		result = prime * result + ((dominio == null) ? 0 : dominio.hashCode());
		result = prime * result + ((especie == null) ? 0 : especie.hashCode());
		result = prime * result + ((familia == null) ? 0 : familia.hashCode());
		result = prime * result + ((filo == null) ? 0 : filo.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((orden == null) ? 0 : orden.hashCode());
		result = prime * result + ((reino == null) ? 0 : reino.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((subfamilia == null) ? 0 : subfamilia.hashCode());
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
		SerVivo other = (SerVivo) obj;
		if (clase == null) {
			if (other.clase != null)
				return false;
		} else if (!clase.equals(other.clase))
			return false;
		if (dominio != other.dominio)
			return false;
		if (especie == null) {
			if (other.especie != null)
				return false;
		} else if (!especie.equals(other.especie))
			return false;
		if (familia == null) {
			if (other.familia != null)
				return false;
		} else if (!familia.equals(other.familia))
			return false;
		if (filo != other.filo)
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (orden == null) {
			if (other.orden != null)
				return false;
		} else if (!orden.equals(other.orden))
			return false;
		if (reino != other.reino)
			return false;
		if (sexo != other.sexo)
			return false;
		if (subfamilia == null) {
			if (other.subfamilia != null)
				return false;
		} else if (!subfamilia.equals(other.subfamilia))
			return false;
		return true;
	}

	@Override
	public int compareTo(SerVivo o) {
		return (this.getEspecie().compareTo(o.getEspecie()) + this.getSexo().compareTo(o.getSexo()));
	}

	
	
	
}
