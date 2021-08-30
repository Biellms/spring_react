package br.org.generation.blogpessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import br.org.generation.blogpessoal.model.Usuario;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {
    
    @Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start(){
	   
		LocalDate data = LocalDate.parse("2000-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		usuarioRepository.save(new Usuario(0, "João da Silva", "joao@email.com.br", "13465278", data));
		
		usuarioRepository.save(new Usuario(0, "Manuela da Silva", "manuela@email.com.br", "13465278", data));
		
		usuarioRepository.save(new Usuario(0, "Adriana da Silva", "adriana@email.com.br", "13465278", data));

        usuarioRepository.save(new Usuario(0, "Paulo Antunes", "paulo@email.com.br", "13465278", data));

	}

	@Test
	@DisplayName("💾 Retorna o nome")
	public void deveRetornarNome() {

		Usuario usuario = usuarioRepository.findByNome("João da Silva");
		assertTrue(usuario.getNome().equals("João da Silva"));

	}

	@Test
	@DisplayName("💾 Retorna 3 usuarios")
	public void deveRetornarTresUsuarios() {

		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Silva");
		assertEquals(3, listaDeUsuarios.size());
		
	}

	@AfterAll
	public void end() {
		
		usuarioRepository.deleteAll();
		
	}
}