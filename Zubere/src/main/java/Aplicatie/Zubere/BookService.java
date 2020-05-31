package Aplicatie.Zubere;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookService {
	@Autowired
	private BookRepository repo;
	
	public List<Carte> listAll(){
		return repo.findAll();
	}
	public void save(Carte c) {
		repo.save(c);
	}
	public Carte get(Long id) {
		return repo.findById(id).get();
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}

}
