package upeu.biblioteca.service.Imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.biblioteca.modelo.dao.LectorDao;
import upeu.biblioteca.service.LectorService;
@Service
public class LectorServiceImp implements LectorService{
	@Autowired
	private LectorDao lectorDao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return lectorDao.readAll();
	}

}
