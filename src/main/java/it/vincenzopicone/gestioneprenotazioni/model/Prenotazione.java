package it.vincenzopicone.gestioneprenotazioni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Prenotazione {
	private Long id;
	private Utente utente;
	private Postazione postazione;

}
