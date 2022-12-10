package com.example.administrarCursos.controller;

import com.example.administrarCursos.dto.CursoTemaDTO;
import com.example.administrarCursos.model.Curso;
import com.example.administrarCursos.service.ICursoService;
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
public class CursoController {
    
    //Inyeccion de dependencia mediante Autowired
    @Autowired
    private ICursoService cursoServ;
    
    //Crear un nuevo curso
    @PostMapping ("/cursos/crear")
    public String crearCurso(@RequestBody Curso curso) {
        cursoServ.crearCurso(curso);
        return "Curso creado correctamente";      
    }
    
    //Traer todos los cursos
    @GetMapping ("/cursos/traer")
    public List<Curso> traerCursos () {
        return cursoServ.traerCursos();
    }
    
    //Traer los temas de un determinado curso
    @GetMapping ("/cursos/temas/{idCurso}")
    public CursoTemaDTO temasPorCurso (@PathVariable Long idCurso) {
        return cursoServ.temasPorCurso(idCurso);
    
    }
    
    //Traer todos los cursos que contengan la palabra Java
    @GetMapping ("/cursos/java")
    public List<Curso> traerCursosJava () {
        return cursoServ.traerCursosJava();
    
    }
    
    //Modificar los datos de un curso
    @PutMapping("/curso/editar")
    public String editarCurso(@RequestBody Curso curso) {
        cursoServ.editarCurso(curso);
        return "Curso editado correctamente";
    }
    
    //Borrar un determinado curso
    @DeleteMapping("/curso/borrar/{idCurso}")
    public String borrarCurso(@PathVariable Long idCurso) {
        cursoServ.borrarCurso(idCurso);
        return "Curso eliminado correctamente";
    }
    
    //Traer un determinado curso
    @GetMapping("/curso/traer/{idCurso}")
    public Curso traerCurso(@PathVariable Long idCurso) {
        return cursoServ.traerCurso(idCurso);
    }
}
