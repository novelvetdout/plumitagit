package py.uaa.edu.actividad1.clases;

import java.util.Date;

public class Factura {
	private Date FechaEmision; //modificador de acceso + tipo de dato + atributo
	private int precio;
	private String nombre;


// Getters y Setters

public Date getFechaEmision() {
	return FechaEmision;
}

public void setFechaEmision(Date FechaEmision) {
	this.FechaEmision = FechaEmision;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
}
