package cat.itacademy.barcelonactiva.escobarjulia.andres.s04.t02.n03.model.domain;

import org.springframework.data.annotation.Id;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
 
//import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fruta")
public class Fruta {

	@Id
	private String  id;

	private String nombre;
	private int cantidadQuilos;
	
	public Fruta() {
		// TODO Auto-generated constructor stub
	}

	public Fruta(String nombre, int cantidadQuilos) {
		this.nombre = nombre;
		this.cantidadQuilos = cantidadQuilos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadQuilos() {
		return cantidadQuilos;
	}

	public void setCantidadQuilos(int cantidadQuilos) {
		this.cantidadQuilos = cantidadQuilos;
	}

	public String  getId() {
		return id;
	}
	public void  setId( String id) {
		this.id =  id;
	}
	@Override
	public String toString() {
		return "Fruta [id=" + id + ", nombre=" + nombre + ", cantidadQuilos=" + cantidadQuilos + "]";
	}

}
