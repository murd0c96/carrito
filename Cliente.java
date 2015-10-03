package ar.edu.uno.progconobjetos1.carritodecompras.modulo;

import java.util.*;

public class Cliente {
	private String nombre;
	private String direccionEnvio;
	private String direccionCobro;
	private String email;
	private Tarjeta tarjeta;
	private ArrayList<Carrito> listaCarritos = new ArrayList<Carrito>();
	
	
	
	public Cliente(String nombre, String direccionEnvio, String direccionCobro, String email, Tarjeta tarjeta){
		this.setNombre(nombre);
		this.setDireccionEnvio(direccionEnvio);
		this.setDireccionCobro(direccionCobro);
		this.setEmail(email);
		this.setTarjeta(tarjeta);
		
	}
	//Getters y setters de la clase
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setDireccionEnvio(String direccionEnvio){
		this.direccionEnvio=direccionEnvio;
	}
	public String getDireccionEnvio(){
		return this.direccionEnvio;
	}
	public void setDireccionCobro(String direccionCobro){
		this.direccionCobro=direccionCobro;
	}
	public String getDireccionCobro(){
		return this.direccionCobro;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	//Metodo que genera un nuevo carrito en el cliente.
	public void agregarCarrito(Carrito nuevocarrito){
	listaCarritos.add(nuevocarrito);
	}
	
	
	public void comprar(Carrito carrito){
		if(this.tarjeta.verificarTarjeta(carrito.getCostoCarrito())==true)
			System.out.println("Felicidades "+this.getNombre()+", la compra de su carrito "+carrito.getNombreCarrito()+" ha sido realizada con exito!\nSe han debitado $"+carrito.getCostoCarrito()+" de su tarjeta.\n\nLos productos seran enviados a "+this.getDireccionEnvio()+"\n-------------------------------------------------------");
		else
			System.out.println("La operacion no pudo ser completada.\n La compra que usted desea realizar ($"+carrito.getCostoCarrito()+" supera el limite de su tarjeta: $"+this.tarjeta.getLimite());
	}
	
}
