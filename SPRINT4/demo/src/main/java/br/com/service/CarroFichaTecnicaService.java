package br.com.service;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;

import br.com.demo.Entity.CarroFichaTecnica;


@Service
public class CarroFichaTecnicaService {
	
	@PersistenceUnit
	    
	private EntityManagerFactory emFactory;

    public CarroFichaTecnicaService(EntityManagerFactory emFactory) {
        this.emFactory = emFactory;
    }

    public CarroFichaTecnica getCarroFichaTecnicaByModel(String model) {
        EntityManager entityManager = emFactory.createEntityManager();
        entityManager.getTransaction().begin();
        CarroFichaTecnica fichaTecnica = entityManager.createQuery("SELECT c FROM CarroFichaTecnica c WHERE c.model = :model", CarroFichaTecnica.class)
                .setParameter("model", model)
                .getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return fichaTecnica;
    }
}