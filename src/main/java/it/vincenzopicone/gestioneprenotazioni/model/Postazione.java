package it.vincenzopicone.gestioneprenotazioni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Postazione {
	private Long id;
	private String descrizione;
	private TipoPostazione tipo_postazione;
	private int num_max_partecipanti;
	private Edificio edificio;

}
