package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class testCar1 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Civic";
        c1.Modelo = "Fiat";
        c1.ano = 2021;
        System.out.println( c1.nome + " do modelo " + c1.Modelo + " e ano " + c1.ano);
        System.out.println("----------------");

        Carro c2 = new Carro();
        c2.nome = "Toro";
        c2.Modelo = "Renegate";
        c2.ano = 2022;
        System.out.println(c2.nome + " do modelo " + c2.Modelo + " e ano " + c2.ano);

    }
}
