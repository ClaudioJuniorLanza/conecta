package br.com.conecta.resources;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.conecta.model.Anuncios;
import br.com.conecta.repository.AnuncioRepository;

@RestController
@RequestMapping("/agricultor")
public class AgricultorResource {
	
	@Autowired
	private AnuncioRepository anuncioRepository;
	
	@GetMapping
	public List<Anuncios> listar() {
		return anuncioRepository.findAll();
	}

}
