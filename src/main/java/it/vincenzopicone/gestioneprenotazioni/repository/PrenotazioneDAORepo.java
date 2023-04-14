package it.vincenzopicone.gestioneprenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.vincenzopicone.gestioneprenotazioni.model.Prenotazione;



@Repository
public interface PrenotazioneDAORepo extends CrudRepository<Prenotazione, Long> {

}
