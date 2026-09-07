package maratonajava.teste;

import maratonajava.dominio.Estudante;
import maratonajava.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Pedro";
        estudante01.idade = 23;
        estudante01.sexo = 'M';

        estudante02.nome = "maria";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
