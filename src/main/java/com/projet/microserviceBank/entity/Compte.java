package com.projet.microserviceBank.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@XmlRootElement
@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Compte {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double solde;
	
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private TypeDeCompte type;
}
