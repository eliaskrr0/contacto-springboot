package eliaskrr.contacto.repo;

import eliaskrr.contacto.modelo.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ContactoRepo extends JpaRepository<Contacto, Long> {
}
