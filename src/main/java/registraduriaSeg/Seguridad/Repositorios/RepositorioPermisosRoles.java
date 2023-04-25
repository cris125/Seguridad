package registraduriaSeg.Seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import registraduriaSeg.Seguridad.Modelos.PermisosRoles;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
    @Query("{'rol.$id': ObjectId(?0),'permiso.$id': ObjectId(?1)}")
    PermisosRoles getPermisoRol(String id_rol,String id_permiso);
}
