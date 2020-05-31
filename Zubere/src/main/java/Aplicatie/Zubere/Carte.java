package Aplicatie.Zubere;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Carte {
	public Long id_carte;
	private String titlu;
	private String autor;
	public Long nr_pagini;
	private float pret;
	public Carte() {		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId_carte() {
		return id_carte;
	}

	public void setId_carte(Long id_carte) {
		this.id_carte = id_carte;
	}
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Long getNr_pagini() {
		return nr_pagini;
	}

	public void setNr_pagini(Long nr_pagini) {
		this.nr_pagini = nr_pagini;
	}

	public float getPret() {
		return pret;
	}
	public void setPret(float pret) {
		this.pret = pret;
	}
	

}
