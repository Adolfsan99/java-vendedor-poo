public class Empleado {

    String nombre;
    String apellidos;
    String dni;
    String direccion;
    String telefono;
    double salario;
    double aniosAntiguedad;

    Empleado supervisor;




    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, double aniosAntiguedad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.aniosAntiguedad = aniosAntiguedad;
    }



    public void imprimir() {

        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("DNI: " + this.dni);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Salario: " + this.salario);
        System.out.println("Años antiguedad: " + this.aniosAntiguedad);

    }



    public void cambiarSupervisor(Empleado supervisor) {

        this.supervisor = supervisor;

    }



    public void incrementarSalario(double porcentaje) {

        this.salario = this.salario*porcentaje;

    }

}

