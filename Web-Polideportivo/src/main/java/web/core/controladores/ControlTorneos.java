package web.core.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import web.core.modelo.Equipo;
import web.core.modelo.Torneo;
import web.core.repositorios.CategoriaRepo;
import web.core.repositorios.EquipoRepo;
import web.core.repositorios.TorneoRepo;

@Controller
@RequestMapping("/admin/")
public class ControlTorneos {
	@Autowired
	private TorneoRepo torneoRepo;
	
	@Autowired
	private CategoriaRepo catRepo;
	
	@Autowired
	private EquipoRepo eqRepo;
	
	@GetMapping("/torneos")
	public ModelAndView homeAdmin(SpringDataWebProperties.Pageable pageable){
		ModelAndView mav = new ModelAndView("admin/torneos");
		mav.addObject("torneos", torneoRepo.findAll(pageable));
		return mav;
	}
	
	@GetMapping("/torneos/{id}")
	public ModelAndView modal(@PathVariable ("id") int id) {
		ModelAndView mav = new ModelAndView("admin/torneos");
		mav.addObject("equipos", eqRepo.findByCategoria(id));
		System.out.println(id);
		return mav;
	}
	
	@GetMapping("/nvoTorneo")
	public ModelAndView alta(SpringDataWebProperties.Pageable pageable) {
		ModelAndView mav = new ModelAndView("admin/nvoTorneo");
		mav.addObject("torneo", new Torneo());
		mav.addObject("categorias", catRepo.findAll(pageable) );
		mav.addObject("equipos", new Equipo());
		return mav;
	}

	@PostMapping
	public String nuevo(@ModelAttribute Torneo torneo, @ModelAttribute Equipo equipos) {
		 String cargados = equipos.getNombreEquipo();
	        String[] separar = cargados.split(",");
	        List<Equipo> listaEq = new ArrayList<Equipo>();
	       
	        for (String nombre : separar)
	        {
	            listaEq.add(new Equipo(nombre));
	        }
		torneoRepo.guardar(torneo, listaEq);
		return "redirect:/admin/torneos";
	}
}
