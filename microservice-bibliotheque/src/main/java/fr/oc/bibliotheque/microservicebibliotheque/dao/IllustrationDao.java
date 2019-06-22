package fr.oc.bibliotheque.microservicebibliotheque.dao;

import fr.oc.bibliotheque.microservicebibliotheque.model.Illustration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IllustrationDao extends JpaRepository<Illustration,Integer> {

    Illustration getById(Integer pId);
}
