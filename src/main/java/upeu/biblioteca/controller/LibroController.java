package upeu.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.biblioteca.service.LibroService;

@RestController
public class LibroController {
	@Autowired
	private LibroService libroService;
	@GetMapping("/libro")
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return libroService.readAll();
	}
}
