package herencia;

import java.util.Scanner;

public abstract class Producto {

	protected String nombre;
	protected String identificador;
	protected double litros;
	protected double precio;
	protected String marca;

	public Producto(String nombre, String identificador, double litros, double precio, String marca) {
		this.nombre = nombre;
		this.identificador = identificador;
		this.litros = litros;
		this.precio = precio;
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public String getIdentificador() {
		return identificador;
	}

	public double getLitros() {
		return litros;
	}

	public double getPrecio() {
		return precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " Identificador: " + identificador + " Litros: " + litros + " Precio: " + precio
				+ " Marca: " + marca;
	}
}