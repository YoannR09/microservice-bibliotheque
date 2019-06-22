package fr.oc.bibliotheque.microservicebibliotheque.web.controler;


import fr.oc.bibliotheque.microservicebibliotheque.dao.CategorieDao;
import fr.oc.bibliotheque.microservicebibliotheque.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategorieControler {

    @Autowired
    CategorieDao categorieDao;

    @GetMapping(value = "/Categorie/{id}")
    public Categorie getCategorie(@PathVariable int id){
        return categorieDao.getCategorieById(id);
    }

    @GetMapping(value = "/Categorie/")
    public List<Categorie> getListCategorie(){
        return categorieDao.getCategories();
    }
}
