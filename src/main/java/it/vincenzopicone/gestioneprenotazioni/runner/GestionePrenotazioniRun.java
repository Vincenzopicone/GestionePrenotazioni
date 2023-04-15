package it.vincenzopicone.gestioneprenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.vincenzopicone.gestioneprenotazioni.service.EdificioService;
import it.vincenzopicone.gestioneprenotazioni.service.PostazioneService;
import it.vincenzopicone.gestioneprenotazioni.service.PrenotazioneService;
import it.vincenzopicone.gestioneprenotazioni.service.UtenteService;

@Component
public class GestionePrenotazioniRun implements CommandLineRunner {
	
	@Autowired EdificioService Ed_Serv;
	//@Autowired PostazioneService Pos_Serv;
	//@Autowired PrenotazioneService Pren_Serv;
	//@Autowired UtenteService Ut_Serv;
	

	@Override
	public void run(String... args) throws Exception {
		
		//// creo utenti
		
		
		//Ut_Serv.creaFakeUtente();
		Ed_Serv.creaFakeEdificio();
		

		
	
	
		
	}

}
