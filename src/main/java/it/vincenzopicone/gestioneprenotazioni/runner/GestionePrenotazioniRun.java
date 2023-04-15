package it.vincenzopicone.gestioneprenotazioni.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.vincenzopicone.gestioneprenotazioni.model.Edificio;
import it.vincenzopicone.gestioneprenotazioni.model.Postazione;
import it.vincenzopicone.gestioneprenotazioni.model.Prenotazione;
import it.vincenzopicone.gestioneprenotazioni.model.TipoPostazione;
import it.vincenzopicone.gestioneprenotazioni.model.Utente;
import it.vincenzopicone.gestioneprenotazioni.service.EdificioService;
import it.vincenzopicone.gestioneprenotazioni.service.PostazioneService;
import it.vincenzopicone.gestioneprenotazioni.service.PrenotazioneService;
import it.vincenzopicone.gestioneprenotazioni.service.UtenteService;

@Component
public class GestionePrenotazioniRun implements CommandLineRunner {
	
	@Autowired EdificioService Ed_Serv;
	@Autowired PostazioneService Pos_Serv;
	@Autowired PrenotazioneService Pren_Serv;
	@Autowired UtenteService Ut_Serv;
	

	@Override
	public void run(String... args) throws Exception {
		
		//// creo utenti
		//Ut_Serv.creaParamsUtente("vinsPic", "Vincenzo Picone", "vincenzo.picone@example.com");
		//Ut_Serv.creaFakeUtente();
		
		/// creo edifici 
		//Ed_Serv.creaFakeEdificio();
		
		
		/// creo postazioni
		/// cerco gli edifici disponibili
//		Edificio E1 = Ed_Serv.findEdificioById(1l);
//		Edificio E2 = Ed_Serv.findEdificioById(2l);
//		Edificio E3 = Ed_Serv.findEdificioById(3l);
//		Edificio E4 = Ed_Serv.findEdificioById(4l);
//		Edificio E5 = Ed_Serv.findEdificioById(5l);
//		Pos_Serv.paramsPostazione("Riunione 12", TipoPostazione.OPENSPACE, 49, E1);
//		Pos_Serv.paramsPostazione("Riunione 1", TipoPostazione.PRIVATO, 12, E2);
//		Pos_Serv.paramsPostazione("Riunione 17", TipoPostazione.SALA_RIUNIONI, 52, E3);
//		Pos_Serv.paramsPostazione("Riunione 65", TipoPostazione.SALA_RIUNIONI, 56, E4);
//		Pos_Serv.paramsPostazione("Riunione 87", TipoPostazione.OPENSPACE, 24, E5);
//		Pos_Serv.paramsPostazione("Riunione 19", TipoPostazione.PRIVATO, 5, E1);
		
		
		//cerco le postazioni esistenti
		Postazione P1 = Pos_Serv.findPostazioneById(1l);
		System.out.println(P1);
		Postazione P2 = Pos_Serv.findPostazioneById(2l);
		Postazione P3 = Pos_Serv.findPostazioneById(3l);
		Postazione P4 = Pos_Serv.findPostazioneById(4l);
		Postazione P5 = Pos_Serv.findPostazioneById(5l);
		Postazione P6 = Pos_Serv.findPostazioneById(6l);
		
		// cerco gli utenti esistenti
		
		Utente U1 = Ut_Serv.findUtenteById(1l);
		System.out.println(U1);
		Utente U2 = Ut_Serv.findUtenteById(2l);
		Utente U3 = Ut_Serv.findUtenteById(3l);
		Utente U4 = Ut_Serv.findUtenteById(4l);
		Utente U5 = Ut_Serv.findUtenteById(5l);
		Utente U6 = Ut_Serv.findUtenteById(6l);
		Utente U7 = Ut_Serv.findUtenteById(7l);
		Utente U8 = Ut_Serv.findUtenteById(8l);
		
		/// creo le prenotazioni
		
		//Pren_Serv.creaPrenotazione(U2, P3, LocalDate.of(2023, 5, 5));
		
		
		
		

		
	
	
		
	}

}
