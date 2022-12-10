package com.example.administrarCursos.service;
import com.example.administrarCursos.dto.CursoTemaDTO;
import com.example.administrarCursos.model.Curso;
import java.util.List;

public interface ICursoService {
    
    public List<Curso> traerCursos();
  
    public void crearCurso(Curso curso);
   
    public void borrarCurso(Long id);

    public Curso traerCurso(Long id);

    public void editarCurso(Curso curso);

    public CursoTemaDTO temasPorCurso(Long idCurso);

    public List<Curso> traerCursosJava();
    
  
}
