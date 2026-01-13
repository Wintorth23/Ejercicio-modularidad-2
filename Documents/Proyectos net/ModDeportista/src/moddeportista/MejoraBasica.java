/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moddeportista;

/**
 *
 * @author labesp
 */
public class MejoraBasica implements MejoraService{
    @Override
    public double aplicar(double promedio) {
        return promedio + 5;
    }
}
