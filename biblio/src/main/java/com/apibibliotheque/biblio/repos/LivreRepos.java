package com.apibibliotheque.biblio.repos;

import com.apibibliotheque.biblio.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LivreRepos extends JpaRepository<Livre, Long> {
}
