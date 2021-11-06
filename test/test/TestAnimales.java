package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import org.junit.Test;

import ar.edu.unlam.dominio.SerVivo;
import ar.edu.unlam.dominio.enums.Dominio;
import ar.edu.unlam.dominio.enums.Filo;
import ar.edu.unlam.dominio.enums.Reino;
import ar.edu.unlam.dominio.enums.Sexo;
import ar.edu.unlam.dominio.Insecto;
import ar.edu.unlam.dominio.MamiferoAcuatico;
import ar.edu.unlam.dominio.MamiferoTerrestre;
import ar.edu.unlam.dominio.AveNadadora;
import ar.edu.unlam.dominio.AveVoladora;

public class TestAnimales {

	@Test
	public void queSePuedenCrearAnimales() {
		// dominio, reino, filo, clase, orden, familia, subfamilia, genero, especie, sexo
		SerVivo guacamayo = new AveVoladora(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Vertebrata", "Aves", "Psittaciformes", "Psittacoidae", "Arini", "Ara", Sexo.MASCULINO); 
		SerVivo pingüino = new AveNadadora(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Vertebrata", "Aves", "Sphenisciformes", "Sphenicidae", "Aptenodythes", "Aptenodytes patagonicus", Sexo.FEMENINO);
		SerVivo mosca = new Insecto(Dominio.EUKARYA ,Reino.ANIMALIA, Filo.ARTHROPODA, "Insecta", "Diptera", "Muscidae", "Muscinae", "Musca", "Musca Domestica", Sexo.MASCULINO);
		SerVivo lobo = new MamiferoTerrestre(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Mammalia", "Carnivora", "Canidae", "Caninae", "Canis", "Canis lupus", Sexo.FEMENINO);
		
		assertNotNull(guacamayo);
		assertNotNull(pingüino);
		assertNotNull(mosca);
		assertNotNull(lobo);
	}
	
	@Test
	public void queDiferencieSiSonAnimalesIgualesoNo() {
		SerVivo guacamayo = new AveVoladora(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Vertebrata", "Aves", "Psittaciformes", "Psittacoidae", "Arini", "Ara", Sexo.MASCULINO); 
		SerVivo guacamayo2 = new AveVoladora(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Vertebrata", "Aves", "Psittaciformes", "Psittacoidae", "Arini", "Ara", Sexo.MASCULINO); 
		SerVivo guacamayo3 = new AveVoladora(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Vertebrata", "Aves", "Psittaciformes", "Psittacoidae", "Arini", "Ara", Sexo.FEMENINO);
		SerVivo pingüino = new AveNadadora(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Vertebrata", "Aves", "Sphenisciformes", "Sphenicidae", "Aptenodythes", "Aptenodytes patagonicus", Sexo.FEMENINO);
		SerVivo mosca = new Insecto(Dominio.EUKARYA ,Reino.ANIMALIA, Filo.ARTHROPODA, "Insecta", "Diptera", "Muscidae", "Muscinae", "Musca", "Musca Domestica", Sexo.MASCULINO);
		SerVivo lobo = new MamiferoTerrestre(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Mammalia", "Carnivora", "Canidae", "Caninae", "Canis", "Canis lupus", Sexo.FEMENINO);
		SerVivo lobo2 = new MamiferoTerrestre(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Mammalia", "Carnivora", "Canidae", "Caninae", "Canis", "Canis lupus", Sexo.FEMENINO);
		SerVivo lobo3 = new MamiferoTerrestre(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Mammalia", "Carnivora", "Canidae", "Caninae", "Canis", "Canis lupus", Sexo.MASCULINO);
		
		assertNotEquals(guacamayo, pingüino);
		assertNotEquals(mosca, lobo);
		assertNotEquals(lobo, guacamayo);
		assertNotEquals(guacamayo, guacamayo3);
		assertNotEquals(lobo2, lobo3);
		assertEquals(guacamayo, guacamayo2);
		assertEquals(lobo, lobo2);
	}
	
	@Test
	public void gurdandoAnimalesEnDistintasColecciones() {
		SerVivo guacamayo = new AveVoladora(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Vertebrata", "Aves", "Psittaciformes", "Psittacoidae", "Arini", "Ara", Sexo.MASCULINO); 
		SerVivo guacamayo2 = new AveVoladora(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Vertebrata", "Aves", "Psittaciformes", "Psittacoidae", "Arini", "Ara", Sexo.MASCULINO); 
		SerVivo guacamayo3 = new AveVoladora(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Vertebrata", "Aves", "Psittaciformes", "Psittacoidae", "Arini", "Ara", Sexo.FEMENINO);
		SerVivo pingüino = new AveNadadora(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Vertebrata", "Aves", "Sphenisciformes", "Sphenicidae", "Aptenodythes", "Aptenodytes patagonicus", Sexo.FEMENINO);
		SerVivo mosca = new Insecto(Dominio.EUKARYA ,Reino.ANIMALIA, Filo.ARTHROPODA, "Insecta", "Diptera", "Muscidae", "Muscinae", "Musca", "Musca Domestica", Sexo.MASCULINO);
		SerVivo lobo = new MamiferoTerrestre(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Mammalia", "Carnivora", "Canidae", "Caninae", "Canis", "Canis lupus", Sexo.FEMENINO);
		SerVivo lobo2 = new MamiferoTerrestre(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Mammalia", "Carnivora", "Canidae", "Caninae", "Canis", "Canis lupus", Sexo.FEMENINO);
		SerVivo lobo3 = new MamiferoTerrestre(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Mammalia", "Carnivora", "Canidae", "Caninae", "Canis", "Canis lupus", Sexo.MASCULINO);
		SerVivo gato = new MamiferoTerrestre(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Mammalia", "Carnivora", "Felidae", "Felinae", "Felis", "Felis silvertis", Sexo.MASCULINO);
		SerVivo ballenaAzul = new MamiferoAcuatico(Dominio.EUKARYA, Reino.ANIMALIA, Filo.CHORDATA, "Mammalia", "Artiodactyla", "Balaenopteridae", "Balaenopterinae" ,"Balaenoptera", "Balaenoptera musculus", Sexo.FEMENINO);
		
		ArrayList<SerVivo> arrayListDeSeresVivos = new ArrayList<SerVivo>();
		LinkedList<SerVivo> linkedListDeSeresVivos = new LinkedList<SerVivo>();
		HashSet<SerVivo> hashSetDeSeresVivos = new HashSet<SerVivo>();
		TreeSet<SerVivo> treeSetDeSeresVivos = new TreeSet<SerVivo>();
		
		arrayListDeSeresVivos.add(guacamayo);
		arrayListDeSeresVivos.add(guacamayo2);
		arrayListDeSeresVivos.add(guacamayo3);
		arrayListDeSeresVivos.add(pingüino);
		arrayListDeSeresVivos.add(mosca);
		arrayListDeSeresVivos.add(lobo);
		arrayListDeSeresVivos.add(lobo2);
		arrayListDeSeresVivos.add(lobo3);
		arrayListDeSeresVivos.add(gato);
		arrayListDeSeresVivos.add(ballenaAzul);
		
		assertEquals(10, arrayListDeSeresVivos.size());
		
		linkedListDeSeresVivos.add(guacamayo);
		linkedListDeSeresVivos.add(guacamayo2);
		linkedListDeSeresVivos.add(guacamayo3);
		linkedListDeSeresVivos.add(pingüino);
		linkedListDeSeresVivos.add(mosca);
		linkedListDeSeresVivos.add(lobo);
		linkedListDeSeresVivos.add(lobo2);
		linkedListDeSeresVivos.add(lobo3);
		linkedListDeSeresVivos.add(gato);
		linkedListDeSeresVivos.add(ballenaAzul);
		
		assertEquals(10, linkedListDeSeresVivos.size());
		
		hashSetDeSeresVivos.add(guacamayo);
		hashSetDeSeresVivos.add(guacamayo2);
		hashSetDeSeresVivos.add(guacamayo3);
		hashSetDeSeresVivos.add(pingüino);
		hashSetDeSeresVivos.add(mosca);
		hashSetDeSeresVivos.add(lobo);
		hashSetDeSeresVivos.add(lobo2);
		hashSetDeSeresVivos.add(lobo3);
		hashSetDeSeresVivos.add(gato);
		hashSetDeSeresVivos.add(ballenaAzul);
		
		assertEquals(8, hashSetDeSeresVivos.size());
		
		treeSetDeSeresVivos.add(guacamayo);
		treeSetDeSeresVivos.add(guacamayo2);
		treeSetDeSeresVivos.add(guacamayo3);
		treeSetDeSeresVivos.add(pingüino);
		treeSetDeSeresVivos.add(mosca);
		treeSetDeSeresVivos.add(lobo);
		treeSetDeSeresVivos.add(lobo2);
		treeSetDeSeresVivos.add(lobo3);
		treeSetDeSeresVivos.add(ballenaAzul);
		treeSetDeSeresVivos.add(gato);
		
		assertEquals(8, treeSetDeSeresVivos.size());
	}

}
