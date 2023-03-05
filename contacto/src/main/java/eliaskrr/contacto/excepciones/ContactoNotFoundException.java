package eliaskrr.contacto.excepciones;

public class ContactoNotFoundException extends RuntimeException {
    public ContactoNotFoundException(Long id) {
        super("¡No se encontró el contacto con el id " + id + "!");
    }
}
