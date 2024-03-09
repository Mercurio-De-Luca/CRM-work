package com.CRMwork.back.security.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name="clienti")
public class Cliente {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String citta;
	private String dataDiNascita;
	@Column(nullable = false)
	private String email;
	private String partitaIva;
	@Column(nullable = false)
	private String numeroCellulare;
	@Column(nullable = false)
	private String indirizzo;
	@OneToMany(mappedBy = "cliente")
	private List<LavoroContoterzo> lavori = new ArrayList<LavoroContoterzo>();
}
