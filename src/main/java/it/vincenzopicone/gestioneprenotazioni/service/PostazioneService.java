package it.vincenzopicone.gestioneprenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import it.vincenzopicone.gestioneprenotazioni.model.Postazione;
import it.vincenzopicone.gestioneprenotazioni.repository.PostazioneDAORepo;

public class PostazioneService {

	@Autowired PostazioneDAORepo repo;
	
	@Autowired @Qualifier("NuovaPostazione") private ObjectProvider<Postazione> nuovaPostazionesProvider;

	
	
	public void creaPostazione() {
		Postazione P = nuovaPostazionesProvider.getObject();
		inserisciPostazione(P);
	}
	
	public void inserisciPostazione(Postazione p) {
		repo.save(p);
	}
	public void rimuoviPostazione(Postazione p) {
		repo.delete(p);

	}
	
	public void aggiornaPostazione(Postazione p) {
		repo.save(p);
		
	}
	public Postazione findPostazioneById(Long id) {
		return repo.findById(id).get();
	}
	public List<Postazione> findAllPostazione() {
		return (List<Postazione>) repo.findAll();
		
	}
}
