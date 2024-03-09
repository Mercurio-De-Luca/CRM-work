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
@Table(name="lavoriPropri")
public class LavoroPropriaAzienda {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
}
