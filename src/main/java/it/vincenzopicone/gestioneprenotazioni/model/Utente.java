package it.vincenzopicone.gestioneprenotazioni.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Utente {
	private Long id;
	private String username;
	private String nominativo;
	private String email;
	

}
