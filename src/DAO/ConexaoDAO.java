package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rapha
 */
public class ConexaoDAO {
    
    public Connection conectaBD() {
        Connection conexao = null;
        
        try {
            String urlConexao = "jdbc:mysql://localhost:3306/crud_user?user=root&password=kauan639123321";
            conexao = DriverManager.getConnection(urlConexao);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return conexao;
    }
    
}
