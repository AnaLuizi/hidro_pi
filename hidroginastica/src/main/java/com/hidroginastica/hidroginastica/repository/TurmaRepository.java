package com.hidroginastica.hidroginastica.repository;

import org.springframework.data.repository.CrudRepository;

import com.hidroginastica.hidroginastica.moldels.Turma;

public interface TurmaRepository  extends CrudRepository<Turma, String>{
	
	Turma findByCodigo(long codigo);


}
