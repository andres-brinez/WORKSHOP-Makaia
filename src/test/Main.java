package test;

import logica.Capitan;
import logica.Velero;
import logica.Yate;

public class Main {
    public static void main(String[] args) {
        //CREAMOS NUESTRO CAPITAN DE CADA EMBARCACION Y LOS DOS TIPOS DE EMBARCACIONES

        Capitan capitanVelero = new Capitan("Daniel","Marquez",123456789);
        Capitan capitanYate = new Capitan("Jean","Viaña",15975364);
        Velero velero = new Velero(capitanVelero,50000,2019,6.5F,5);
        Yate yate = new Yate(capitanYate,100000,2021,5.2F,8);

        //UTILIZAMOS FUNCIONALIDADES CREADAS EN NUESTRO VELERO
        System.out.println(velero.toString());
        velero.esGrande();
        System.out.println("Monto de alquiler del velero: "+velero.montoAlquiler());

        System.out.println();

        //UTILIZAMOS NUESTRAS FUNCIONALIDADES EN EL YATE
        System.out.println(yate.toString());
        yate.esLujo();
        System.out.println("Monto de alquiler del yate: "+yate.montoAlquiler());

    }
}
