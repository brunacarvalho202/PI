package org.generation.projetointegrador.repository;

import java.util.List;

import org.generation.projetointegrador.model.PostagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long>{

	public List<PostagemModel> findAllByTituloContainingIgnoreCase(@Param ("titulo") String titulo);
}
