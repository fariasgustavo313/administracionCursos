package com.example.administrarCursos.service;
import com.example.administrarCursos.dto.CursoTemaDTO;
import com.example.administrarCursos.model.Curso;
import com.example.administrarCursos.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{

 @Autowired
    private ICursoRepository cursoRepo;
    
    @Override
    public List<Curso> traerCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public void crearCurso(Curso curso) {
        cursoRepo.saveAndFlush(curso);
    }

    @Override
    public void borrarCurso(Long id) {
        cursoRepo.deleteById(id);
    }

    @Override
    public Curso traerCurso(Long id) {
        return cursoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarCurso(Curso curso) {
        this.crearCurso(curso);
    }

    //Traer los temas correspondientes a un determinado curso
    @Override
    public CursoTemaDTO temasPorCurso(Long idCurso) {
        
        CursoTemaDTO curTemDTO = new CursoTemaDTO ();
        Curso curso = this.traerCurso(idCurso);
        curTemDTO.setNombreCurso(curso.getNombre());
        curTemDTO.setListaTemas(curso.getListaDeTemas());
        
        return curTemDTO;  
    }

    //Traer todos los cursos que contengan la palabra Java
    @Override
    public List<Curso> traerCursosJava() {
        String palabra = "Java";
        String textoComparar;
        
        List<Curso> listaCursos = this.traerCursos();
        List<Curso> listaCursosJava = new ArrayList<Curso>();
        
        for (Curso cur : listaCursos) {
            textoComparar = cur.getNombre();
            boolean contieneJava = textoComparar.contains(palabra);
            if (contieneJava == true) {
                listaCursosJava.add(cur);
            }
        }
    return listaCursosJava;
    }
    
}
