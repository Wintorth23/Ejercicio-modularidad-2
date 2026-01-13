/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moddeportista;

/**
 *
 * @author labesp
 */
public class Deportista {
    private String nombre;
    private double[] marcas;

    public Deportista(String nombre, double[] marcas) {
        this.nombre = nombre;
        this.marcas = marcas;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public double[] getMarcas() {
	return marcas;
    }

    public void setMarcas(double[] marcas) {
	this.marcas = marcas;
    }

    
}
