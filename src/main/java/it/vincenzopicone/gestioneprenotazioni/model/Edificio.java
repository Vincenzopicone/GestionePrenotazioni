package it.vincenzopicone.gestioneprenotazioni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Edificio {
	private Long id;
	private String nome_edificio;
	private String indirizzo;
	private String citta;

}
