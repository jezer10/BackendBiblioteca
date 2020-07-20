package upeu.biblioteca.service.Imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.biblioteca.modelo.dao.AlquilerDao;
import upeu.biblioteca.service.AlquilerService;
@Service
public class AlquilerServiceImp implements AlquilerService {
	@Autowired
	private AlquilerDao alquilerDao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return alquilerDao.readAll();
	}

}
