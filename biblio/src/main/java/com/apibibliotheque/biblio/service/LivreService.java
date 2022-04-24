package com.apibibliotheque.biblio.service;

import com.apibibliotheque.biblio.entities.Livre;
import com.apibibliotheque.biblio.repos.LivreRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.OrderBy;
import java.util.List;

@Service
public class LivreService {

    @Autowired
    private LivreRepos livreRepos;

    @OrderBy
    public List<Livre> getAllLivres(){
      return livreRepos.findAll();
    };

    public Livre getLivreById(Long id){
        return livreRepos.findById(id).get();
    };

    public void saveLivre(Livre l){
        livreRepos.save(l);
    }

    public void updateLivre(Livre OldLivre, Livre NewLivre){
        OldLivre.setTitre(NewLivre.getTitre());
        OldLivre.setMaisonEdition(NewLivre.getMaisonEdition());
        OldLivre.setAuteur(NewLivre.getAuteur());
        OldLivre.setDisponible(NewLivre.getDisponible());
        OldLivre.setDateDerniereConsultation(NewLivre.getDateDerniereConsultation());
        OldLivre.setDateSortie(NewLivre.getDateSortie());
        OldLivre.setISBN(NewLivre.getISBN());
        OldLivre.setNombrePage(NewLivre.getNombrePage());
        livreRepos.save(OldLivre);
    }

    public void removeLivreById(Long id){
        livreRepos.deleteById(id);
    }
}
