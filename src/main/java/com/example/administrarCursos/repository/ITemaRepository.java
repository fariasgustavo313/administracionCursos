package com.example.administrarCursos.repository;
import com.example.administrarCursos.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository <Tema, Long>{
    
}
