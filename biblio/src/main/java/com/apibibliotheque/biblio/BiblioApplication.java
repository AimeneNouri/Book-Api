package com.apibibliotheque.biblio;

import com.apibibliotheque.biblio.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BiblioApplication implements CommandLineRunner {

	@Autowired
	private LivreService livreService;

	public static void main(String[] args) {
		SpringApplication.run(BiblioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
