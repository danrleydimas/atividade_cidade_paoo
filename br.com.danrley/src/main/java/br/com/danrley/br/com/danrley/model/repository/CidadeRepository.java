package br.com.danrley.br.com.danrley.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.danrley.br.com.danrley.model.bean.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Long> {
	public Cidade findOneByLongitudeAndLatitude ( Integer longitude ,Integer latitude);

}
