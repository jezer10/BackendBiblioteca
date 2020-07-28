package upeu.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.biblioteca.service.LibroService;
@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping("/libro")
public class LibroController {
	@Autowired
	private LibroService libroService;
	@GetMapping("/all")
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return libroService.readAll();
	}
}
