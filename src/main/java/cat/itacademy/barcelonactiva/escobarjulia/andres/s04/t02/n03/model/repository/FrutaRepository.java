package cat.itacademy.barcelonactiva.escobarjulia.andres.s04.t02.n03.model.repository;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.escobarjulia.andres.s04.t02.n03.model.domain.Fruta;

 
@Repository
public interface FrutaRepository   extends MongoRepository<Fruta, String > {
	
	
	
	
}
	
