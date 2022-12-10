package com.example.administrarCursos.dto;

import com.example.administrarCursos.model.Tema;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CursoTemaDTO {
    
    private String nombreCurso;
    private List<Tema> listaTemas;

    public CursoTemaDTO() {
    }

    public CursoTemaDTO(String nombreCurso, List<Tema> listaTemas) {
        this.nombreCurso = nombreCurso;
        this.listaTemas = listaTemas;
    }
}
