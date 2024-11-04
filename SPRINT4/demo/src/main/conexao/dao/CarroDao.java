import jakarta.persistence.EntityManager;

public class CarroDao {
	private EntityManager entityManager;

    public void CarroDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Carro buscarPorId(Long id) {
        return entityManager.find(Carro.class, id);
    }

   
}

