package it.vincenzopicone.gestioneprenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import it.vincenzopicone.gestioneprenotazioni.model.Prenotazione;

import it.vincenzopicone.gestioneprenotazioni.repository.PrenotazioneDAORepo;

public class PrenotazioneService {
	
@Autowired PrenotazioneDAORepo repo;
	
	@Autowired @Qualifier("NuovaPrenotazione") private ObjectProvider<Prenotazione> nuovaPrenotazioneProvider;

	
	
	public void creaPrenotazione() {
		Prenotazione P = nuovaPrenotazioneProvider.getObject();
		inserisciPrenotazione(P);
	}
	
	public void inserisciPrenotazione(Prenotazione p) {
		repo.save(p);
	}
	public void rimuoviPrenotazione(Prenotazione p) {
		repo.delete(p);

	}
	
	public void aggiornaPrenotazione(Prenotazione p) {
		repo.save(p);
		
	}
	public Prenotazione findPrenotazioneById(Long id) {
		return repo.findById(id).get();
	}
	public List<Prenotazione> findAllPrenotazione() {
		return (List<Prenotazione>) repo.findAll();
		
	}

}
