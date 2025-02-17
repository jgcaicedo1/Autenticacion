package reportes.reportes.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import reportes.reportes.Modelo.Usuarios;

import java.util.Optional;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    Optional<Usuarios> findByCorreoAndContrasenia(String correo, String contrasenia);
}
