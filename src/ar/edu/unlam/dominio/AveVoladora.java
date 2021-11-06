package ar.edu.unlam.dominio;

import ar.edu.unlam.dominio.enums.Dominio;
import ar.edu.unlam.dominio.enums.Filo;
import ar.edu.unlam.dominio.enums.Reino;
import ar.edu.unlam.dominio.enums.Sexo;
import ar.edu.unlam.dominio.interfaces.Vertebrado;
import ar.edu.unlam.dominio.interfaces.Volador;

public class AveVoladora extends SerVivo implements Vertebrado, Volador {
	
	public AveVoladora(Dominio dominio, Reino reino, Filo filo, String clase, String orden, String familia,
			String subfamilia, String genero, String especie, Sexo sexo) {
		super(dominio, reino, filo, clase, orden, familia, subfamilia, genero, especie, sexo);
	}

	@Override
	public void esVertebrado() {
		System.out.println("Posee esqueleto interno");
	}

	@Override
	public void puedeVolar() {
		System.out.println("Puede volar");
	}

	

}
