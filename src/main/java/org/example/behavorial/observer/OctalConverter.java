package org.example.behavorial.observer;

import org.example.behavorial.mediator.Plane;

public class OctalConverter extends Observer{
    public  OctalConverter (Subject subject){
        this.subject =subject;
        this.subject.subscribe(this);
    }
    @Override
    public void  update(){
        int number = this.subject.getNumber();
        System.out.println("Değişen yeni değerin octal değeri : " + Integer.toOctalString(number));
    }
}
