package compuwork;

import compuwork.Presentacion.VentanaPrincipal;
import compuwork.Presentacion.InicioSesion;

public class CompuWork {
    

    public static void main(String[] args) {

        Empresa empresa = new Empresa("CompuWork", "Samaniego- Nariño");
        Administrador admin = new Administrador("yeferson","123456789","Yeferson Villota","1088728583","Samaniego");
        VentanaPrincipal ventana=new VentanaPrincipal (empresa);  
        empresa.setAdministrador(admin);
        InicioSesion sesion=new InicioSesion(ventana, true, empresa, ventana);
        sesion.setVisible(true);
    }
    
}
