package eliaskrr.contacto.controlador;

import eliaskrr.contacto.modelo.Contacto;
import eliaskrr.contacto.servicio.ContactoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacto")
public class ContactoControlador {

    @Autowired
    private ContactoServicio contactoServicio;

    @PostMapping(path = "/agregar")
    public Contacto agregarContacto(@RequestBody Contacto nuevoContacto) {
        return contactoServicio.agregarContacto(nuevoContacto);
    }

    @GetMapping(path = "/consultar")
    public List<Contacto> obtenerTodosContactos() {
        return contactoServicio.obtenerTodosContactos();
    }

    @GetMapping(path = "/consultar/{id}")
    public Contacto obtenerContacto(@PathVariable Long id) {
        return contactoServicio.obtenerContacto(id);
    }

    @PutMapping(path = "/actualizar/{id}")
    public Contacto actualizarContacto(@RequestBody Contacto contactoActualizado, @PathVariable Long id) {
        return contactoServicio.actualizarContacto(contactoActualizado, id);
    }

    @DeleteMapping("/contacto/{id}")
    public void eliminarContacto(@PathVariable Long id) {
        contactoServicio.eliminarContacto(id);
    }
}
