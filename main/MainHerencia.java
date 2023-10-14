package com.alejomarquez.herencia.main;

import com.alejomarquez.herencia.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class MainHerencia {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        Vehiculo vehiculo = new Vehiculo();
        Taxi taxi = new Taxi();
        Bicicleta bici =new Bicicleta();
        BicicletaMontana mtb = new BicicletaMontana();
        BicicletaRuta rutera = new BicicletaRuta();

        vehiculos.add(taxi);
        vehiculos.add(bici);
        vehiculos.add(mtb);
        vehiculos.add(rutera);

        Vehiculo vehiculo1 = mtb;

        ((BicicletaMontana)vehiculo1).setTipoSuspension("");

        taxi.setEmpresa("Amarillo");
        if (taxi instanceof Vehiculo){
            System.out.println(taxi + " Es un vehiculo");
        }else {
            System.out.println("No es un vehiculo");
        }
        if (bici instanceof Bicicleta){
            System.out.println("Es un vehiculo");
        }else {
            System.out.println("No es un vehiculo");
        }
        if (vehiculo instanceof Bicicleta){
            System.out.println("Es un vehiculo");
        }else {
            System.out.println("No es un vehiculo");
        }
        if (rutera instanceof Vehiculo){
            System.out.println("Es un vehiculo");
        }else {
            System.out.println("No es un vehiculo");
        }

    }
}
