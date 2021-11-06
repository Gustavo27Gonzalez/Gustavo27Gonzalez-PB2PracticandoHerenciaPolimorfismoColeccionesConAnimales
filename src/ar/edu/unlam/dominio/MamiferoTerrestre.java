package ar.edu.unlam.dominio;

import ar.edu.unlam.dominio.enums.Dominio;
import ar.edu.unlam.dominio.enums.Filo;
import ar.edu.unlam.dominio.enums.Reino;
import ar.edu.unlam.dominio.enums.Sexo;
import ar.edu.unlam.dominio.interfaces.Vertebrado;

public class MamiferoTerrestre extends SerVivo implements Vertebrado {
	
	public MamiferoTerrestre(Dominio dominio, Reino reino, Filo filo, String clase, String orden, String familia,
			String subfamilia, String genero, String especie, Sexo sexo) {
		super(dominio, reino, filo, clase, orden, familia, subfamilia, genero, especie, sexo);
	}

	@Override
	public void esVertebrado() {
		System.out.println("Posee esqueleto interno");
	}

	
	
	
}
