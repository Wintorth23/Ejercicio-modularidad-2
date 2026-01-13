/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moddeportista;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class ModDeportista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        RendimientoService rendimientoService = new RendimientoServiceImp1();
        MejoraService mejoraService = new MejoraBasica();
        ReporteRendimiento reporte = new ReporteRendimiento();

        System.out.print("Ingrese el nombre del deportista: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la cantidad de marcas: ");
        int n = sc.nextInt();

        double[] marcas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la marca " + (i + 1) + ": ");
            marcas[i] = sc.nextDouble();
        }

        Deportista dep = new Deportista(nombre, marcas);

        double promedio = rendimientoService.calcularPromedio(dep.getMarcas());
        boolean alto = rendimientoService.esRendimientoAlto(promedio);

        System.out.print("Desea aplicar mejora(1=Si / 0=No): ");
        int op = sc.nextInt();

        if (op == 1) {
            promedio = mejoraService.aplicar(promedio);
        }

        reporte.mostrar(dep, promedio, alto);
        sc.close();
    }
    
}
