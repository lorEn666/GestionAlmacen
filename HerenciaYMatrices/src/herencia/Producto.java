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

	public String getNombre() throws Exception {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca nombre del producto:");
		return leer.nextLine();
	}

	public String getIdentificador() {
		return identificador;
	}

	public String getIdentificadorAt() throws Exception {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca código identificador del producto:");
		return leer.nextLine();
	}

	public double getLitros() throws Exception {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca capacidad (litros) del producto:");
		return leer.nextDouble();
	}

	public double getPrecio() {
		return precio;
	}

	public double getPrecioAt() throws Exception {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca precio el producto:");
		return leer.nextDouble();
	}

	public String getMarca() throws Exception {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca marca del producto:");
		return leer.nextLine();
	}

	public String getOrigen() throws Exception {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca origen del agua:");
		return leer.nextLine();
	}

	public int getPorcentajeDeAzucar() throws Exception {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca porcentaje de azúcar del producto:");
		return leer.nextInt();
	}

	public boolean getPromocion() throws Exception {
		Scanner leer = new Scanner(System.in);
		System.out.println("¿El producto tiene promoción? (S/N)");
		
		if (leer.nextLine().toUpperCase().equals("S")) {
			return true;
		} else {
			return false;
		}
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
