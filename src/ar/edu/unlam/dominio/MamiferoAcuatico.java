package ar.edu.unlam.dominio;

import ar.edu.unlam.dominio.enums.Dominio;
import ar.edu.unlam.dominio.enums.Filo;
import ar.edu.unlam.dominio.enums.Reino;
import ar.edu.unlam.dominio.enums.Sexo;
import ar.edu.unlam.dominio.interfaces.Nadador;

public class MamiferoAcuatico extends SerVivo implements Nadador{
	
	public MamiferoAcuatico(Dominio dominio, Reino reino, Filo filo, String clase, String orden, String familia,
			String subfamilia, String genero, String especie, Sexo sexo) {
		super(dominio, reino, filo, clase, orden, familia, subfamilia, genero, especie, sexo);
	}

	@Override
	public void puedeNadar() {
		System.out.println("Puede nadar");
	}

	

}
