/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork;
import compuwork.ListaEmpleados;
import compuwork.Departamento;
import compuwork.Administrador;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String direccion;
    private ListaEmpleados listaEmpleados;
    private Administrador administrador;

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaEmpleados = new ListaEmpleados();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    //Metodos para la gestion de productos CRUD
    public boolean agregarEmpleado (Empleado empleado){
        return this.listaEmpleados.agregarEmpleado(empleado);
    }
    
    public Empleado buscarEmpleado (Empleado empleado){
        return this.listaEmpleados.buscarEmpleado(empleado);
    }
    
    public Empleado buscarEmpleado (String nombre){
        return this.listaEmpleados.buscarEmpleado(nombre);
    }
    
    public Empleado buscarEmpleado (long id){
        return this.listaEmpleados.buscarEmpleado(id);
    }
    
    public Empleado eliminarEmpleado(long id){
        return this.listaEmpleados.eliminarEmpleado(id);
    }
    
    public String mostrarLista (){
        return this.listaEmpleados.mostrarEmpleados();
    }
    
    
    
    public boolean iniciarSesion(String user, String password){
        return this.administrador.getUsername().equals(user) && this.administrador.getPassword().equals(password);
    }
    
    public ArrayList<Empleado> ObtenerEmpleados(){
        return this.listaEmpleados.getEmpleado();
    }
    
}

