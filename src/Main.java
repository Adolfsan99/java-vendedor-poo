import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ESTE CODIGO IMPRIME AL VENDEDOR
        System.out.println(" ");
        System.out.println("VENDEDOR");
        Vendedor vendedor1 = new Vendedor("Pepe","Garcia","99999999999","Colombia","Nokia",800.000,20,"Call center",new ArrayList<>(),"Claro",new Coche("XAW457","BMW","B2 2006"));

        //ESTE CODIGO IMPRIME LOS DATOS DEL VENDEDOR
        vendedor1.imprimir();

        //ESTE CODIGO IMPRIME EL COCHE DEL VENDEDOR
        System.out.println("Y su coche actual es: " + vendedor1.coche.getMarca() + " " + vendedor1.coche.matricula + " " + vendedor1.coche.modelo + ".");

        //ESTE CODIGO CREA CLIENTES DANDOLES DE ALTA
        vendedor1.darDeAltaCliente("cliente 1");
        vendedor1.darDeAltaCliente("cliente 2");
        vendedor1.darDeAltaCliente("cliente 3");
        vendedor1.darDeAltaCliente("cliente 4");
        vendedor1.darDeAltaCliente("cliente 5");

        //ESTE CODIGO IMPRIME LA LISTA DEL VENDEDOR
        System.out.println(" ");
        System.out.println("Lista de clientes de vendedor");
        System.out.println(vendedor1.listaDeClientes);

        //ESTE CODIGO INCREMENTA EL SALARIO DEL VENDEDOR USANDO PORCENTAJES
        vendedor1.incrementarSalario(1.05);
        //ESTE CODIGO ACTUALIZA EL SALARIO PARA QUE SE VISUALICE EL SALARIO AUMENTADO
        System.out.println("Salario aumentado : " + vendedor1.salario);

        //ESTE CODIGO DE DE BAJA SOLO AL CLIENTE 4
        vendedor1.darDeBajaCliente("cliente 4");

        //ESTE CODIGO ACTUALIZA LA LISTA DE CLIENTES, (NO DEBERIA APARECER EL CLIENTE 4)
        System.out.println(" ");
        System.out.println("Lista de clientes de vendedor Actualizada");
        System.out.println(vendedor1.listaDeClientes);

        vendedor1.cambiarCoche(new Coche("ELPZ22","NISSAN","SPEC V"));

        System.out.println(" ");
        System.out.println("Y su nuevo coche es: " + vendedor1.coche.getMarca() + " " + vendedor1.coche.matricula + " " + vendedor1.coche.modelo + ".");

    }
}