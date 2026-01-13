/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moddeportista;

/**
 *
 * @author labesp
 */
public class ReporteRendimiento {

    public void mostrar(Deportista d, double promedio, boolean alto) {
        System.out.println("Deportista: " + d.getNombre());
        System.out.println("Rendimiento promedio: " + promedio);
        System.out.println("Nivel: " + (alto ? "ALTO" : "BAJO"));
    }

}
