package com.projet.microserviceBank.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.projet.microserviceBank.Repository.CompteRepository;
import com.projet.microserviceBank.entity.Compte;


@RequestMapping("/banque")
public class SpringDataRest {

	
	@Autowired
	private CompteRepository cr;
	
	@GetMapping(path = "/comptes",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Compte> compteList(){
		return cr.findAll();
	}
	
	@GetMapping(path = "/compte", produces = MediaType.APPLICATION_JSON_VALUE)
	public Compte getOne(@PathVariable(value = "id")Long id) {
		return cr.findById(id).get();
		
	}
	
	@PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
	public Compte addCompte(Compte compte) {
		return cr.save(compte);
		
	}
	
	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
	public Compte update(Compte compte, @PathVariable("id")Long id) {
		compte.setId(id);
		return cr.save(compte);
		
	}
	
	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable("id")Long id) {
		
		cr.deleteById(id);
		
	}
}