
package compuwork;

import java.util.ArrayList;


public class DepartamentoLista {
    
    //ArrayList
    
    private ArrayList<Empleado> empleado;

    public DepartamentoLista (ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }
    
   
    public ArrayList<Empleado> getEmpleado()  {
        return empleado;
    }
    
    public boolean agregarEmpleado (Empleado empleado) {
        return this.empleado.add(empleado);
    }
    
    public Empleado buscarEmpleado (Empleado empleado){
        for (int i = 0; i < this.empleado.size(); i++){
            Empleado e=this.empleado.get(i);
            if(e.equals(empleado)){
                return e;
            }
        }
        return null;
    }
    public Empleado buscarEmpleado (long id) {
        for (int i = 0; i < this.empleado.size(); i++){
            Empleado e=this.empleado.get(i);
            if (e.getId()==id){
                return e;
            }
        }
        return null;
    
    }
    private int buscarIndiceEmpleado(long id){
        for (int i = 0; i < this.empleado.size(); i++){
            Empleado e=this.empleado.get(i);
            if (e.getId()==id){
                return i;
            }
        }
        return -1;
    }
    
    // modificar producto
    
    public Empleado actualizarEmpleado(long id, Empleado empleado){
        int index=this.buscarIndiceEmpleado(id);
        if (index >=0){
            return this.empleado.set(index, empleado);
            
        }else{
            return null;
        }
    }
    
    //eliminar producto
    
    public Empleado eliminarEmpleado (long id) {
        int index =this.buscarIndiceEmpleado(id);
        if (index>=0) {
            return this.empleado.remove(index);
        }else{
            return null;
        }
    }
    
    //mostrar
    
    public String mostrarTrabajadores(){
        String trabajadores="";
        for (int i = 0; i < empleado.size(); i++) {
            Empleado e=this.empleado.get(i);
            trabajadores+=e.toString() + "\n";
            
        }
        return trabajadores;
        
    }
}    

