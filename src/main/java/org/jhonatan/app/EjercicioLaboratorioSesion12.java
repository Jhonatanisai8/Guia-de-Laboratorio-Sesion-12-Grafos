package org.jhonatan.app;
public class EjercicioLaboratorioSesion12 {
    public static void main(String[] args) {
        System.out.println("GRAFOS");
        MatrizAdyacente adyacente = new MatrizAdyacente(5);
        adyacente.agregar(0, 1);
        adyacente.agregar(0, 1);
        adyacente.agregar(0, 2);
        adyacente.agregar(0, 3);
        adyacente.agregar(1, 0);
        adyacente.agregar(1, 0);
        adyacente.agregar(1, 4);
        adyacente.agregar(2, 0);
        adyacente.agregar(2, 3);
        adyacente.agregar(3, 4);
        adyacente.agregar(3, 0);
        adyacente.agregar(3, 2);
        adyacente.agregar(4, 1);
        adyacente.agregar(4, 2);
        adyacente.agregar(4, 4);
        adyacente.agregar(4, 4);
        adyacente.imprimir();
    }
}
