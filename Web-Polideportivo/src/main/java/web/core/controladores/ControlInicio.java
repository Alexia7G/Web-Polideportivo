package web.core.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlInicio {
	
	@GetMapping("/")
	public ModelAndView fixtureFecha() {
		return new ModelAndView("publico/fixtureFecha");
	}
}
