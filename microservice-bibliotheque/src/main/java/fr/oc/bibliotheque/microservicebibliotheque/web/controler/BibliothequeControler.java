package fr.oc.bibliotheque.microservicebibliotheque.web.controler;


import fr.oc.bibliotheque.microservicebibliotheque.dao.BibliothequeDao;
import fr.oc.bibliotheque.microservicebibliotheque.model.Bibliotheque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BibliothequeControler {

    @Autowired
    BibliothequeDao bibliothequeDao;

    @GetMapping(value = "/Bibliotheque/{id}")
    public Bibliotheque getBibliotheque(@PathVariable int id) {
        return bibliothequeDao.findById(id);
    }

}
