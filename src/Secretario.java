public class Secretario extends Empleado {

    String despacho;
    String numeroDeFax;


    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, double aniosAntiguedad, String despacho, String numeroDeFax) {
        super(nombre, apellidos, dni, direccion, telefono, salario, aniosAntiguedad);
        this.despacho = despacho;
        this.numeroDeFax = numeroDeFax;
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(porcentaje);
    }



    public void imprimir() {

        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("DNI: " + this.dni);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Salario: " + this.salario);
        System.out.println("Años antiguedad: " + this.aniosAntiguedad);

        System.out.println("Despacho: " + this.despacho);
        System.out.println("FAX: " + this.numeroDeFax);
    }

}
