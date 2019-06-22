package fr.oc.bibliotheque.microservicebibliotheque.dao;

import fr.oc.bibliotheque.microservicebibliotheque.model.LivreUnique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreUniqueDao extends JpaRepository<LivreUnique,Integer> {

    LivreUnique getById(Integer pId);
}
