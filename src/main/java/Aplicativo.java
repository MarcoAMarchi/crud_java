import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Aplicativo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicativo");
    }
}
