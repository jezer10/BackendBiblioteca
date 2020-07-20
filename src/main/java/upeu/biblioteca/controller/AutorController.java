package upeu.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.biblioteca.service.AutorService;

@RestController
public class AutorController {
	@Autowired
	private AutorService autorService;
	@GetMapping("/autor")
	public List<Map<String, Object>> listar() {
		return autorService.readAll();
	}
	
}
