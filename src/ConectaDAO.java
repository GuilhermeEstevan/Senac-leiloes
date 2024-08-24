
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
 * @author Adm
 */
public class ConectaDAO  {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
            // Atualize a string de conexão conforme necessário
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uc11?user=root&password=123456&useSSL=false");
        } catch (SQLException erro) {
            // Melhore a mensagem de erro para ser mais informativa
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + erro.getMessage());
        }
        return conn;
    }
    
    // Método de teste da conexão
    public static void main(String[] args) {
        ConectaDAO dao = new ConectaDAO();
        dao.connectDB();
    }
}
