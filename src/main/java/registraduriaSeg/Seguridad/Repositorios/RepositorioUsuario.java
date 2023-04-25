package registraduriaSeg.Seguridad.Repositorios;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import registraduriaSeg.Seguridad.Modelos.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
    @Query("{'correo': ?0}")
    public Usuario getUserByEmail(String correo);
}
