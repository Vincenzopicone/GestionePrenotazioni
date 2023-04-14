package it.vincenzopicone.gestioneprenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.vincenzopicone.gestioneprenotazioni.model.Postazione;
import it.vincenzopicone.gestioneprenotazioni.model.Prenotazione;
import it.vincenzopicone.gestioneprenotazioni.model.Utente;

@Configuration
public class PrenotazioneConfiguration {
	
	@Bean("NuovaPrenotazione")
	@Scope("prototype")
	public Prenotazione nuovaPrenotazione(Utente utente, Postazione postazione) {
		return new Prenotazione(utente, postazione);
	}

}
