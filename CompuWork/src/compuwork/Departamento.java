
package compuwork;

public class Departamento {
 private static int contadorDepartamentos = 1;
    //Atributos
    
    private String nombre;
    private int id;

    //metodo constructor
    
    public Departamento() {
        this.nombre = "";
        this.id = Departamento.contadorDepartamentos;
        contadorDepartamentos++;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.id = Departamento.contadorDepartamentos;
        contadorDepartamentos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
     
    
    
    @Override
    public String toString(){
        return "Departamento: " + id + "\n" +
               "Nombre: " + nombre + "\n";
    }    
    
}  