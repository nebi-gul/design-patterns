package org.example.behavorial.mediator;

public class Main {
    public static void main(String[] args){
        Plane plane1 = new Plane("001");
        Plane plane2 = new Plane("002");
        Plane plane3 = new Plane("003");
        Plane plane4 = new Plane("004");
        Plane plane5 = new Plane("005");
        Plane plane6 = new Plane("006");

        plane1.requestDeparture();
        plane2.requestLanding();
        plane3.requestLanding();
        plane4.requestDeparture();
        plane5.requestLanding();
        plane6.requestLanding();
    }
}
