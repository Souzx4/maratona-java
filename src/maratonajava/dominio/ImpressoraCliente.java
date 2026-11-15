package maratonajava.dominio;

public class ImpressoraCliente {
    public void imprimir2(Cliente cliente){
        System.out.println(cliente.nome);
        System.out.println(cliente.idade);
        System.out.println(cliente.salario);
        System.out.println("--------------------");
    }
}
