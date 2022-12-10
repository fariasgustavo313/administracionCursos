package com.example.administrarCursos.service;

import com.example.administrarCursos.model.Tema;
import java.util.List;

public interface ITemaService {
    
    public List<Tema> traerTemas();
  
    public void crearTema(Tema tema);
   
    public void borrarTema(Long id);

    public Tema traerTema(Long id);

    public void editarTema(Tema tema);
}
