package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class testProf1 {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.nome = "Maria";
        p1.sexo = 'M';
        p1.idade = 18;
        System.out.println(p1.nome + " " + p1.sexo + " " + p1.idade);
    }
}
