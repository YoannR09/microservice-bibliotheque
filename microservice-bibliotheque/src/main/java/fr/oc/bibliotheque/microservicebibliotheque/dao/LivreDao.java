package fr.oc.bibliotheque.microservicebibliotheque.dao;

import fr.oc.bibliotheque.microservicebibliotheque.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivreDao extends JpaRepository<Livre,Integer> {

    Livre getLivreById(Integer pId);

    List<Livre> getLivresByCategorieId(Integer categorieId);
    
    List<Livre> getLivreByTitre(String titre);
    
    List<Livre> getLivresByAuteur(String auteur);
    
    List<Livre> getLivreByIsbn(String isbn);
    
    List<Livre> getLivresByTitreAndAuteur(String titre,String auteur);
    
    List<Livre> getLivresByTitreAndAuteurAndIsbn(String titre, String auteur, String isbn);
    
    List<Livre> get
}
