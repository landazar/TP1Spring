package com.inti.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data @AllArgsConstructor @NoArgsConstructor
public class Concert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	private String nom;
	private LocalDate date;


	
	@OneToMany(mappedBy = "concert")
	private List<Oeuvre> listeO;
	

	@OneToOne
	@JoinColumn(name = "lieu_id")
	private Lieu lieu;

	
	public Concert(String nom, LocalDate date) {
		super();
		this.nom = nom;
		this.date = date;



	}

}