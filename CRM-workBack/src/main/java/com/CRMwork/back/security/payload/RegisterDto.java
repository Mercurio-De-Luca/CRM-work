package com.CRMwork.back.security.payload;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
	 
    private String nome;
    private String cognome;
    private String username;
    private String citta;
    private String indirizzo;
    private String nomeAzienda;
    private String email;
    private String password;
    private String partitaIva;
    private Set<String> roles;
}
