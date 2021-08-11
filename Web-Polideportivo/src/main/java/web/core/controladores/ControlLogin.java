package web.core.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ControlLogin {
	
	@GetMapping("/login")
	public ModelAndView fixtureFecha() {
		return new ModelAndView("admin/login");
	}
}