package it.polito.tdp.libretto.model;

import java.awt.List;
import java.util.*;

public class Model {
//gestisce dei dati di tipo esame
	
	private ArrayList<Esame> esami;
	
	public Model(){
		this.esami= new ArrayList<Esame>();
	}
	/**
	 * aggiunge un nuovo esame all'elenco degli esami
	 * ritorna true se l'esame non esisteva nella lista
	 * altrimenti false xk non deve essere aggiunto di nuovo se esiste già
	 * @param e
	 */
	public boolean addEsame(Esame e){
		if(!esami.contains(e)){
			esami.add(e);
			return true;
		}else{
			return false; 
		}
	}
	/**
	 * ricerca se esiste l'esame con il codice inserito
	 * ritorna l'esame se lo trova oppure null
	 */
	public Esame trovaEsame(String codice){
		//this.esami.indexOf(codice);	
//non va bene perchè devo passargli come parametro l'esame che ha quel codice, ma posso crearlo!!!
		
		int pos = esami.indexOf(new Esame(codice, null, null));
		if(pos==-1){
			//oggetto non trovato
			return null;
		}else{
			return esami.get(pos); 
			//NB LA RICERCA SULLE ARRAYLIST è PIù VELOCEEE
		}
	}
	
	
}
