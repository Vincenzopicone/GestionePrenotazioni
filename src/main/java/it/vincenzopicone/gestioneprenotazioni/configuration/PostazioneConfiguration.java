package it.vincenzopicone.gestioneprenotazioni.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.vincenzopicone.gestioneprenotazioni.model.Edificio;
import it.vincenzopicone.gestioneprenotazioni.model.Postazione;
import it.vincenzopicone.gestioneprenotazioni.model.Prenotazione;
import it.vincenzopicone.gestioneprenotazioni.model.TipoPostazione;

@Configuration
public class PostazioneConfiguration {
	
	@Bean("NuovaPostazione")
	@Scope("prototype")
	public Postazione nuovaPostazione(String descr, TipoPostazione tipo, 
			int numMax, List<Edificio> edif, List<Prenotazione> preno) {
		return new Postazione(descr, tipo, numMax, edif, preno);
	}

}
