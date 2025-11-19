package ro.emanuel.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ro.emanuel.dao.ParfumDAO;
import ro.emanuel.pojo.Parfum;

@Controller
public class ParfumController {

	@GetMapping("/parfum")
	public ModelAndView detaliiParfum(int id) throws ClassNotFoundException, SQLException {
		ModelMap map = new ModelMap();
		Parfum dbparfum = ParfumDAO.getParfumById(id);

		if (dbparfum != null) {
			map.put("x", dbparfum);
			return new ModelAndView("parfum", map);
		}

		map.put("errMsg", "Parfumul cu id " + id + " nu a fost gasit");

		return new ModelAndView("error", map);
	}

}
