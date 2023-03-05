package eliaskrr.contacto.servicio;

import eliaskrr.contacto.modelo.Contacto;

import java.util.List;

public interface ContactoServicio {
    Contacto agregarContacto(Contacto contacto);

    List<Contacto> obtenerTodosContactos();

    Contacto actualizarContacto(Contacto contacto, Long id);

    Contacto obtenerContacto(Long id);
    void eliminarContacto(Long id);
}
