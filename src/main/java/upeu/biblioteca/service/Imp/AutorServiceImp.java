package upeu.biblioteca.service.Imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.biblioteca.modelo.dao.AutorDao;
import upeu.biblioteca.service.AutorService;
@Service
public class AutorServiceImp implements AutorService {
	@Autowired
	private AutorDao autorDao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return autorDao.readAll();
	}

}
