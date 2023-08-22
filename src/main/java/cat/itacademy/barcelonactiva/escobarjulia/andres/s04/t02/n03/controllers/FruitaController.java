package cat.itacademy.barcelonactiva.escobarjulia.andres.s04.t02.n03.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.escobarjulia.andres.s04.t02.n03.model.domain.Fruta;
import cat.itacademy.barcelonactiva.escobarjulia.andres.s04.t02.n03.model.repository.FrutaRepository;
import cat.itacademy.barcelonactiva.escobarjulia.andres.s04.t02.n03.model.services.FrutaService;

@RestController
@RequestMapping("/fruta")
public class FruitaController {
 
	/*
	*/
	@Autowired
	FrutaService frutaService;
		
	@PostMapping("/add")
	public ResponseEntity<Fruta> createFruta(@RequestBody Fruta fruta) {
//        long frutaId = 0;
        String  frutaId = "";

        System.out.println("fruta" + fruta );
        frutaId = frutaService.addFruta(fruta);

        if(frutaId != ""){
			return new ResponseEntity<>(fruta, HttpStatus.CREATED);

        }else{
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> DeleteId(@PathVariable("id") String id) {
		Optional<Fruta> frutaData = frutaService.GetFrutaByID(id);
		System.out.println("delete ");
		if (frutaData.isPresent()) {
			frutaService.DeleteItem(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateFruta(@PathVariable("id") String id, @RequestBody Fruta fruta) {
	
    //verify if the id provided is valid before update
    boolean isTodoIdValid=frutaService.isFrutaItemIdValid(id);

		    if(isTodoIdValid){
		        String frutaId="";
		        frutaId=frutaService.UpdateFrutaItem(id,fruta);
		        
		        if(frutaId != "") {
		        	fruta.setId(frutaId);
					return new ResponseEntity<>(fruta , HttpStatus.OK);
		        }else{
		            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		        }
		
		    }else {
//		 		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 		return     new  ResponseEntity<>("El id no encontrado base datos" , HttpStatus.NOT_FOUND);
		 		
		    }

	}
 
 
	@GetMapping("/getAll")
	public ResponseEntity<List<Fruta>> getAllFrutas(@RequestParam(required = false) String nombre) {
		
			List<Fruta> fruta  =  frutaService.getMyFrutaList();
			if ( fruta.size() > 0 ) {
				return new ResponseEntity<>( frutaService.getMyFrutaList() , HttpStatus.OK);
			}else {
		        return new ResponseEntity(HttpStatus.NOT_FOUND);
	 
		        	 
			}
	}
 
	@GetMapping("/getOne/{id}")
	public ResponseEntity<?> getFrutaById(@PathVariable("id") String id) {
		Optional<Fruta> frutaData = frutaService.GetFrutaByID(id);

		if (frutaData.isPresent()) {
			return new ResponseEntity<>(frutaData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Introduzca un Id que exista en la base de datos",HttpStatus.NOT_FOUND);
		}
	}
	

}
