package com.CRMwork.back.security.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name="lavoriContoterzo")
public class LavoroContoterzo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Cliente cliente;
	@Enumerated(EnumType.STRING)
	private ETipoLavoro tipoLavoro;
	@Column(nullable = false)
	private String data;
	@Column(nullable = false)
	private String oraInzio;
	@Column(nullable = false)
	private String oraFine;
	@Column(nullable = false)
	private String dimensioniTerreno;
	@Column(nullable = false)
	private double costo;
	
}
