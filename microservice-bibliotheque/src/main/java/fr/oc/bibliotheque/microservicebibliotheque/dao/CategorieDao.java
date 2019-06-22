package fr.oc.bibliotheque.microservicebibliotheque.dao;

import fr.oc.bibliotheque.microservicebibliotheque.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieDao extends JpaRepository<Categorie,Integer> {

    Categorie getCategorieById(Integer pId);

    List<Categorie> getCategories();
}
