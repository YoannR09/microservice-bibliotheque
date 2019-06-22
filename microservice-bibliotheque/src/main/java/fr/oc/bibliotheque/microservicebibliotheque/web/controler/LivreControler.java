package fr.oc.bibliotheque.microservicebibliotheque.web.controler;


import fr.oc.bibliotheque.microservicebibliotheque.dao.LivreDao;
import fr.oc.bibliotheque.microservicebibliotheque.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivreControler {

    @Autowired
    LivreDao livreDao;

    @GetMapping(value = "/Livre/{id}")
    public Livre getLivre(@PathVariable Integer id){

        return livreDao.getLivreById(id);
    }

    @GetMapping(value = "/Bibliotheque/Categorie/id")
    private List getListLivreCategorie(@PathVariable int categorieId){
        return livreDao.getLivresByCategorieId(categorieId);
    }
}
