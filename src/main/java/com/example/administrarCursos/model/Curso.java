package com.example.administrarCursos.model;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Curso {
    
    //Generacion de ID de manera automatica
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idCurso;
    private String nombre;
    private String modalidad;
    private String fechaFinalizacion;
    //Relacion uno a muchos
    @OneToMany
    private List<Tema> listaDeTemas;

    public Curso() {
    }

    public Curso(Long idCurso, String nombre, String modalidad, String fechaFinalizacion, List<Tema> listaDeTemas) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fechaFinalizacion = fechaFinalizacion;
        this.listaDeTemas = listaDeTemas;
    }    
    
}
