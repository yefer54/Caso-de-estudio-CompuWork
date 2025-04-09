
package compuwork;

public class Empleado {
    private static int contadorEmpleados = 1;
    //Atributos
    
    private String nombre;
    private int edad;
    private int id;
    private long CC;

    //metodo constructor
    
    public Empleado() {
        this.nombre = "";
        this.edad = 0;
        this.CC = 0;
        this.id = Empleado.contadorEmpleados;
        contadorEmpleados++;
    }

    public Empleado(String nombre, int edad, long CC) {
        this.nombre = nombre;
        this.edad = edad;
        this.CC = CC;
        this.id = Empleado.contadorEmpleados;
        contadorEmpleados++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCC() {
        return CC;
    }

    public void setCC(long CC) {
        this.CC = CC;
    }
    
     
    
    
    @Override
    public String toString(){
        return "Persona: " + id + "\n" +
               "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "CC: " + CC + "\n";
    }    
    
}
