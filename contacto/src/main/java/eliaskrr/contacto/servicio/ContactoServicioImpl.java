package eliaskrr.contacto.servicio;

import eliaskrr.contacto.excepciones.ContactoNotFoundException;
import eliaskrr.contacto.modelo.Contacto;
import eliaskrr.contacto.repo.ContactoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactoServicioImpl implements ContactoServicio {
    @Autowired
    private ContactoRepo contactoRepo;

    @Override
    public Contacto agregarContacto(Contacto contacto) {
        return contactoRepo.save(contacto);
    }

    @Override
    public List<Contacto> obtenerTodosContactos() {
        return contactoRepo.findAll();
    }

    @Override
    public Contacto actualizarContacto(Contacto contactoActualizado, Long id) {
        return contactoRepo.findById(id)
                // Actualiza
                .map(contacto -> {
                    contacto.setNumero(contactoActualizado.getNumero());
                    contacto.setNombre(contactoActualizado.getNombre());
                    contacto.setApellidos(contactoActualizado.getApellidos());
                    return contactoRepo.save(contacto);
                })
                // Inserta
                .orElseGet(() -> {
                   contactoActualizado.setIdContacto(id);
                   return contactoRepo.save(contactoActualizado);
                });
    }

    @Override
    public Contacto obtenerContacto(Long id) {
        return contactoRepo.findById(id)
                .orElseThrow(() -> new ContactoNotFoundException(id));
    }

    @Override
    public void eliminarContacto(Long id) {
        contactoRepo.deleteById(id);
    }
}
