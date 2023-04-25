package registraduriaSeg.Seguridad.Repositorios;

import registraduriaSeg.Seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends MongoRepository<Rol,String> {
}
