/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UserDTO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author rapha
 */
public class UsuarioDAO {

    Connection conexao;

    public ResultSet autenticacaoUsuario(UserDTO ObjUserDto) {
        conexao = (Connection) new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT * FROM usuario WHERE nome_usuario = ? AND senha_usuario = ?";
           
            PreparedStatement pstm = (PreparedStatement) conexao.prepareStatement(sql);
            pstm.setString(1, ObjUserDto.getNome_usuario());
            pstm.setString(2, ObjUserDto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
            return null;
        }
    }

}
