package upeu.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.biblioteca.service.CategoriaService;
@RestController
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	@GetMapping("/categoria")
	public List<Map<String, Object>> listar() {
		return categoriaService.readAll();
	}
}
