/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.view.LayoutFrame;
import java.sql.SQLException;

/**
 *
 * @author bimsara
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
           LayoutFrame l1 = new LayoutFrame();
           l1.setLocationRelativeTo(null);
           l1.setSize(1067, 662);
           
           l1.setVisible(true);
    }
}
