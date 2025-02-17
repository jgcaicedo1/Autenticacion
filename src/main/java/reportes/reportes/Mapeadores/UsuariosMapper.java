package reportes.reportes.Mapeadores;

import reportes.reportes.Dto.UsuariosDTO;
import reportes.reportes.Modelo.Usuarios;

public class UsuariosMapper {

    public static UsuariosDTO toDTO(Usuarios usuario) {
        UsuariosDTO dto = new UsuariosDTO();
        dto.setIdUsuario(usuario.getIdUsuario());
        dto.setNombre(usuario.getNombre());
        dto.setIdentificacion(usuario.getIdentificacion());
        dto.setTelefono(usuario.getTelefono());
        dto.setCorreo(usuario.getCorreo());
        dto.setContrasenia(usuario.getContrasenia());
        dto.setIdRol(usuario.getIdRol());
        dto.setIdEstado(usuario.getIdEstado());
        return dto;
    }

    public static Usuarios toEntity(UsuariosDTO dto) {
        Usuarios usuario = new Usuarios();
        usuario.setIdUsuario(dto.getIdUsuario());
        usuario.setNombre(dto.getNombre());
        usuario.setIdentificacion(dto.getIdentificacion());
        usuario.setTelefono(dto.getTelefono());
        usuario.setCorreo(dto.getCorreo());
        usuario.setContrasenia(dto.getContrasenia());
        usuario.setIdRol(dto.getIdRol());
        usuario.setIdEstado(dto.getIdEstado());
        return usuario;
    }
}
