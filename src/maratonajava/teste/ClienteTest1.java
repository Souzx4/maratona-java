package maratonajava.teste;

import maratonajava.dominio.Cliente;
import maratonajava.dominio.ImpressoraCliente;

public class ClienteTest1 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        ImpressoraCliente impressoraCliente = new ImpressoraCliente();

        cliente.nome = "Pedro";
        cliente.salario = 2000;
        cliente.idade = 22;

        cliente2.nome = "Maria";
        cliente2.salario = 3000;
        cliente2.idade = 23;

        cliente3.nome = "Maria";
        cliente3.salario = 4000;
        cliente3.idade = 24;

        double salario = (cliente.salario + cliente2.salario + cliente3.salario)/3;

        impressoraCliente.imprimir2(cliente);
        impressoraCliente.imprimir2(cliente2);
        impressoraCliente.imprimir2(cliente3);
        System.out.println("media: " + salario);
    }
}
