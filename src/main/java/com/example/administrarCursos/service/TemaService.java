package com.example.administrarCursos.service;
import com.example.administrarCursos.model.Tema;
import com.example.administrarCursos.repository.ITemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService {

    @Autowired
    private ITemaRepository temaRepo;
    
    @Override
    public List<Tema> traerTemas() {
        return temaRepo.findAll();
    }

    @Override
    public void crearTema(Tema tema) {
        temaRepo.save(tema);    }

    @Override
    public void borrarTema(Long id) {
        temaRepo.deleteById(id);
    }

    @Override
    public Tema traerTema(Long id) {
        Tema tm = temaRepo.findById(id).orElse(null);
        return tm;
    }

    @Override
    public void editarTema(Tema tema) {
        //acá se puede hacer también que edite parte por parte para que sea más detallado
        this.crearTema(tema);
    }
    
}
