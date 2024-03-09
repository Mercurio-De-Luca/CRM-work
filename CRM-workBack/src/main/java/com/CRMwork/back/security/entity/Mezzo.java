package com.CRMwork.back.security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name="mezziAzienda")
public class Mezzo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	private EMezzo tipoMezzo;
	@Column(nullable = false)
	private String targa;
	@Column(nullable = false)
	private String modello;
	@Column(nullable = false)
	private String marca;
	@Column(nullable = false)
	private double prezzoAcquisto;
	@Column(nullable = false)
	private int anno;
	
}
