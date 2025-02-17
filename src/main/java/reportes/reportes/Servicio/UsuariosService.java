package reportes.reportes.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reportes.reportes.Modelo.Usuarios;
import reportes.reportes.Repositorio.UsuariosRepository;

import java.util.Optional;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    // Obtener un usuario por correo y contraseña
    public Optional<Usuarios> logeo(String correo, String contrasenia) {
        return usuariosRepository.findByCorreoAndContrasenia(correo, contrasenia);
    }
}
