package Aplicatie.Zubere;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




public class AppController {

	@Autowired
	private BookService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Carte> listBooks=service.listAll();
		model.addAttribute("listBooks",listBooks);
		
		return "index";
	}
	@RequestMapping("/new")
	public String showNewBookForm(Model model) {
		Carte carte=new Carte();
		model.addAttribute("carte",carte);
		
		return "new_book";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("carte") Carte carte) {
		service.save(carte);
		return "redirect:/";
	
	}
	@RequestMapping("/edit/{id_carte}")
	public ModelAndView showEditBookForm(@PathVariable(name = "id_carte") Long id_carte) {
		 ModelAndView mav = new ModelAndView("edit_book");
		 Carte carte = service.get(id_carte);
		 mav.addObject("carte", carte);
		
		return mav;
	}
	@RequestMapping("/delete/{id_carte}")
	public String deleteProduct(@PathVariable(name = "id_carte") Long id_carte) {
	    service.delete(id_carte);
	    return "redirect:/";       
	}
}
