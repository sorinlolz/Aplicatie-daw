package Aplicatie.Zubere;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Carte, Long> {

}
