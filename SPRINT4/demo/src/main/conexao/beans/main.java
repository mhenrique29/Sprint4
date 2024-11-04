import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class main {
	 public static void main(String[] args) {
	        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("NomeDaUnidadeDePersistencia");
	        EntityManager entityManager = entityManagerFactory.createEntityManager();

	        CarroDAO carroDAO = new CarroDAO(entityManager);

	        Carro carro = carroDAO.buscarPorId(1L);
	        System.out.println(carro);

	        entityManager.close();
	        entityManagerFactory.close();
	    }
}
EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
EntityManager entityManager = entityManagerFactory.createEntityManager();

/

entityManager.close();
JPAUtil.closeEntityManagerFactory();
}
}      