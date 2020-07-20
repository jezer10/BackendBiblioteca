package upeu.biblioteca.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.biblioteca.service.AlquilerService;

@RestController
public class AlquilerController {
	@Autowired
	private AlquilerService alquilerService;
	@GetMapping("/alquiler")
	public List<Map<String, Object>> listar(){
		return alquilerService.readAll();
	}
}
