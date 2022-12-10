package com.example.administrarCursos.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tema {
    
    //Generacion de ID de manera automatica
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idTema;
    private String nombre;
    private String descripcion;

    public Tema() {
    }

    public Tema(Long idTema, String nombre, String descripcion) {
        this.idTema = idTema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
}
