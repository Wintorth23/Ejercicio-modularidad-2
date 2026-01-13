/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moddeportista;

/**
 *
 * @author labesp
 */
public class RendimientoServiceImp1 implements RendimientoService{
      @Override
    public double calcularPromedio(double[] marcas) {
	double suma = 0;
        for (double m : marcas) {
            suma += m;
        }
        return suma / marcas.length;
    }

    @Override
    public boolean esRendimientoAlto(double promedio) {
	return promedio >= 80;
    }
    
}
