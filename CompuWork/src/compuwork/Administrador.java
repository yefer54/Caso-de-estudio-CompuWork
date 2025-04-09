/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork;

/**
 *
 * @author Pc
 */
public class Administrador {
    //atributos
    private String username;
    private String password;

    public Administrador(String username, String password, String nombre , String cedula, String direccion ) {
        this.username = username;
        this.password = password;
      
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
