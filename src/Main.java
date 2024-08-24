/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilh
 */
public class Main {
    
    public static void main(String[] args) {
        // Definir o Look and Feel, se desejar
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(cadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Iniciar a interface gráfica
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroVIEW().setVisible(true);  // Chama a tela de cadastro
            }
        });
    }

}
