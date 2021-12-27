/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevin
 */
public class Conexion {

    Connection cx;

    public Conexion() {

    }

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cx = DriverManager.getConnection("jdbc:mysql://localhost/lista", "root", "");
            System.out.println("Se conectó");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
}
