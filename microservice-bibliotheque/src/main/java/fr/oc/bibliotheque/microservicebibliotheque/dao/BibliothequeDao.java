package fr.oc.bibliotheque.microservicebibliotheque.dao;

import fr.oc.bibliotheque.microservicebibliotheque.model.Bibliotheque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliothequeDao extends JpaRepository<Bibliotheque,Integer> {

    Bibliotheque  findById(int id);

    Bibliotheque  findByNomLike(String nom);
}
