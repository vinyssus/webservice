package com.projet.microserviceBank;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.projet.microserviceBank.Repository.CompteRepository;

@SpringBootApplication
public class MicroserviceBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBankApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CompteRepository cr) {
		return start -> {
//			cr.save(new Compte(null,Math.random()*9000,new Date(),TypeDeCompte.EPARGNE));
//			cr.save(new Compte(null,Math.random()*9000,new Date(),TypeDeCompte.COURANT));
//			cr.save(new Compte(null,Math.random()*9000,new Date(),TypeDeCompte.EPARGNE));
//			cr.findAll().forEach(cp->{
//				System.out.println(cp.toString());
//			});
		};
	}
}
