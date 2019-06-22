package fr.oc.bibliotheque.microservicebibliotheque.web.controler;

import fr.oc.bibliotheque.microservicebibliotheque.dao.IllustrationDao;
import fr.oc.bibliotheque.microservicebibliotheque.model.Illustration;
import fr.oc.bibliotheque.microservicebibliotheque.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IllustrationControler {

    @Autowired
    IllustrationDao illustrationDao;

    @GetMapping(value = "/Illustration/{id}")
    public Illustration getIllustration(@PathVariable int id){

        return illustrationDao.getById(id);
    }
}
