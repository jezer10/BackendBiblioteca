package upeu.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.biblioteca.service.LectorService;

@RestController
public class LectorController {
	@Autowired
	private LectorService lectorService;
	@GetMapping("/lector")
	public List<Map<String, Object>> listar(){
		return lectorService.readAll();
	}
}
