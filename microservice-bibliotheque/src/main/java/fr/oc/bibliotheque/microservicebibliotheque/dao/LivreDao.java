package fr.oc.bibliotheque.microservicebibliotheque.dao;

import fr.oc.bibliotheque.microservicebibliotheque.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivreDao extends JpaRepository<Livre,Integer> {

    Livre getLivreById(Integer pId);

    List<Livre> getLivresByCategorieId(Integer categorieId);
}
