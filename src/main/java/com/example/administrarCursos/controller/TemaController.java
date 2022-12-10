package com.example.administrarCursos.controller;

import com.example.administrarCursos.model.Tema;
import com.example.administrarCursos.service.ITemaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    
    //Inyeccion de dependencia mediante Autowired
    @Autowired
    private ITemaService temaServ;
    
    //Traer un determinado tema
    @GetMapping ("/temas/traer")
    public List<Tema> traerTemas() {
        return temaServ.traerTemas();
    }
    
    //Crear un nuevo tema
    @PostMapping ("/temas/crear")
    public String crearTema(@RequestBody Tema tema) {
        temaServ.crearTema(tema);
        return "Tema creado correctamente";   
    }
    
    //Modificar los datos de un determinado tema
    @PutMapping("/tema/editar")
    public String editarTema(@RequestBody Tema tema) {
        temaServ.editarTema(tema);
        return "Tema editado correctamente";
    }
    
    //Borrar un determinado tema
    @DeleteMapping("/tema/borrar/{idTema}")
    public String borrarTema(@PathVariable Long idTema) {
        temaServ.borrarTema(idTema);
        return "Tema eliminado correctamente";
    }
    
    //Traer un determinado tema
    @GetMapping("/tema/buscar/{idTema}")
    public Tema traerTema(@PathVariable Long idTema) {
        return temaServ.traerTema(idTema);
    }
}
