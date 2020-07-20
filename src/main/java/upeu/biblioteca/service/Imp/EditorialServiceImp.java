package upeu.biblioteca.service.Imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.biblioteca.modelo.dao.EditorialDao;
import upeu.biblioteca.service.EditorialService;
@Service
public class EditorialServiceImp implements EditorialService {
	@Autowired
	private EditorialDao editorialDao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return editorialDao.readAll();
	}

}
