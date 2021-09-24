package br.org.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

/**
 * 
 * A Annotation @Repository: indica que a Classe é uma classe repositório,
 * ou seja, é responsável pela comunicação com o Banco de dados através dos métodos
 * padrão e das Method Queries, que são consultas personalizadas através de palavras
 * chave que representam as instruções da linguagem SQL
 * 
 */

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {


}
