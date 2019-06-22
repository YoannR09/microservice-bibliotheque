package fr.oc.bibliotheque.microservicebibliotheque.web.controler;


import fr.oc.bibliotheque.microservicebibliotheque.dao.LivreUniqueDao;
import fr.oc.bibliotheque.microservicebibliotheque.model.LivreUnique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivreUniqueControler {

    @Autowired
    LivreUniqueDao livreUniqueDao;

    @GetMapping(value = "/LivreUnique/{id}")
    public LivreUnique getLivreUnique(@PathVariable int id){
        return livreUniqueDao.getById(id);
    }
}
