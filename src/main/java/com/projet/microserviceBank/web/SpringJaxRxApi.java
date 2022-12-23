package com.projet.microserviceBank.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projet.microserviceBank.Repository.CompteRepository;
import com.projet.microserviceBank.entity.Compte;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Component
@Path("/banque")
public class SpringJaxRxApi {

	
	@Autowired
	private CompteRepository cr;
	
	@Path("/comptes")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Compte> compteList(){
		return cr.findAll();
	}
	
	@Path("/compte/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Compte getOne(@PathParam(value = "id")Long id) {
		return cr.findById(id).get();
		
	}
	
	@Path("/save")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Compte addCompte(Compte compte) {
		return cr.save(compte);
		
	}
	
	@Path("/update/{id}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Compte update(Compte compte, @PathParam("id")Long id) {
		compte.setId(id);
		return cr.save(compte);
		
	}
	
	@Path("/delete/{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void delete(@PathParam("id")Long id) {
		
		cr.deleteById(id);
		
	}
}
