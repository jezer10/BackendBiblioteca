package upeu.biblioteca.service.Imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.biblioteca.modelo.dao.CategoriaDao;
import upeu.biblioteca.service.CategoriaService;
@Service
public class CategoriaServiceImp implements CategoriaService {
	@Autowired
	private CategoriaDao categoriaDao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return categoriaDao.readAll();
	}

}
