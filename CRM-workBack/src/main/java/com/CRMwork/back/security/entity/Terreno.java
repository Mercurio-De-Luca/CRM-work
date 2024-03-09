package com.CRMwork.back.security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="terreni")
public class Terreno {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private double dimensione;
	@Column(nullable = false)
	private String indirizzo;
	@Column(nullable = false)
	private String tipoTerreno; // agricolo, edificabile, etc.
	@Column(nullable = false)
	private double prezzoAcquisto;
	@Column(nullable = false)
    private double prezzoVendita;
	@Column(nullable = false)
    private boolean inVendita;
	@Column(nullable = false)
    private String tipoDiCulturaPiantata;
	
	
}
