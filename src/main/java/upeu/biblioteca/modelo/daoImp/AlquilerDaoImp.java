package upeu.biblioteca.modelo.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import upeu.biblioteca.modelo.dao.AlquilerDao;
@Repository
public class AlquilerDaoImp implements AlquilerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select * from alquiler");
	}

}
