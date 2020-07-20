package upeu.biblioteca.modelo.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import upeu.biblioteca.modelo.dao.LibroDao;
@Repository
public class LibroDaoImp implements LibroDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select l.ASIN, l.titulo,l.fechalanzamiento,a.nautor,c.ncategoria,e.neditorial,l.idioma,l.paginas,l.descripcion,l.portada from autor as a,categoria as c,editorial as e,libro as l where l.idautor=a.idautor and l.idcategoria=c.idcategoria and l.ideditorial=e.ideditorial");
	}

}
