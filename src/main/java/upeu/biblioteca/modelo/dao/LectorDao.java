package upeu.biblioteca.modelo.dao;

import java.util.List;
import java.util.Map;

public interface LectorDao {
	public List<Map<String, Object>> readAll();
}
