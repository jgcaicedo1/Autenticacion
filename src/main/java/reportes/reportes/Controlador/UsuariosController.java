package reportes.reportes.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import reportes.reportes.Dto.UsuariosDTO;
import reportes.reportes.Modelo.Usuarios;
import reportes.reportes.Servicio.UsuariosService;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("/login")
    public ResponseEntity<Usuarios> Logeo(@RequestBody UsuariosDTO dto) {

        Optional<Usuarios> usuario = usuariosService.logeo(dto.getCorreo(),dto.getContrasenia());

        if (usuario.isPresent()) {
            return ResponseEntity.ok(usuario.get()); // Devuelve el usuario si existe
        } else {
            return ResponseEntity.notFound().build(); // Devuelve 404 si no se encuentra
        }
    }
}