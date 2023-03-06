package eliaskrr.contacto.modelo;

import lombok.*;

import javax.persistence.*;


@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString
@Entity
@Table(name = "contacto")
public class Contacto {

    @Id
    @Column(name = "id_contacto", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContacto;
    @Column(name = "numero", length = 9)
    private int numero;
    @Column(name = "nombre", length = 10)
    private String nombre;
    @Column(name = "apellidos", length = 30)
    private String apellidos;
}
