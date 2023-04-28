import java.util.List;

public class Vendedor extends Empleado {

    String areaDeVenta;
    List<String> listaDeClientes;
    String movil;
    Coche coche;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, double aniosAntiguedad, String areaDeVenta, List<String> listaDeClientes, String movil, Coche coche) {
        super(nombre, apellidos, dni, direccion, telefono, salario, aniosAntiguedad);
        this.areaDeVenta = areaDeVenta;
        this.listaDeClientes = listaDeClientes;
        this.movil = movil;
        this.coche = coche;
    }


    public void darDeAltaCliente(String cliente) {

        listaDeClientes.add(cliente);

    }



    public void darDeBajaCliente(String cliente) {

        listaDeClientes.remove(cliente);

    }



    public void cambiarCoche(Coche coche) {

        this.coche = coche;

    }



    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(porcentaje);
    }




}