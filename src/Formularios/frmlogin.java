package Formularios;
import javax.swing.JOptionPane;
import SuperClases.conexion;
import Entidades2.trabajador;
import Dao.daoLogin;
import javax.swing.table.DefaultTableModel;
public class frmlogin extends javax.swing.JFrame {

    int contador;
   
    
    
    public frmlogin() {
        initComponents();
        setLocationRelativeTo(null);
        Limpiador();
        this.txtusuario.requestFocus();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        iconologin = new javax.swing.JLabel();
        fondologin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña.png"))); // NOI18N
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        txtusuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 158, -1));

        txtcontraseña.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 158, -1));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 51));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 100, -1));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 51));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 100, -1));

        btnSalir.setBackground(new java.awt.Color(0, 0, 51));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 100, -1));

        iconologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginnnnnn.png"))); // NOI18N
        getContentPane().add(iconologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, 260));

        fondologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal.jpg"))); // NOI18N
        fondologin.setText("jLabel3");
        getContentPane().add(fondologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.txtusuario.setText("");
        this.txtcontraseña.setText("");
        this.txtusuario.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        
        if(logeo()==true){
            JOptionPane.showMessageDialog(this,"Bienvenido:"+ "\n" +this.txtusuario.getText());
            frmprincical fpri = new frmprincical();
            fpri.setVisible(true);
            dispose();
        }
        else if (txtusuario.getText().isEmpty() || txtcontraseña.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Error" + ValidarCamposLogin(),"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            if(contador>1){
            JOptionPane.showMessageDialog(this,"Error" + "\nPor cuestiones de seguridad, el sistema se esta cerrando..." ,"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            dispose();
            }
        }
        else{
            if(contador>1){
                JOptionPane.showMessageDialog(this,"Error" + "\nPor cuestiones de seguridad, el sistema se esta cerrando..." ,"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
            else{
            JOptionPane.showMessageDialog(this,"Error" + "\nEl usuario o contraseña introducido son incorrectos..." ,"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            Limpiador();
            this.txtusuario.requestFocus();
            }
        }
        contador++;
    }//GEN-LAST:event_btnIngresarActionPerformed

    public boolean logeo(){
        if(txtusuario.getText().equals("luigi") && txtcontraseña.getText().equals("123")){
            return true;
        }
        else
            if(txtusuario.getText().equals("harold") && txtcontraseña.getText().equals("harold")){
            return true;
        }
        else
                if(txtusuario.getText().equals("franklin") && txtcontraseña.getText().equals("franklin")){
            return true;
        }else
            if(txtusuario.getText().equals("marco") && txtcontraseña.getText().equals("marco")){
            return true;
        }
        else
            if(txtusuario.getText().equals("carlos") && txtcontraseña.getText().equals("carlos")){
            return true;
        }
        else
            return false;
    }
    private String ValidarCamposLogin(){
        String msg = "";
        if(this.txtusuario.getText().equals("")){
            msg += "\nPor favor ingrese el usuario";
            txtusuario.requestFocus();
        }
        if(this.txtcontraseña.getText().equals("")){
            msg += "\nPor favor ingrese la contraseña";
            txtcontraseña.requestFocus();
        }
        return  msg;
    }
    
    private void Limpiador(){
        this.txtusuario.setText("");
        this.txtcontraseña.setText("");
    }
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondologin;
    private javax.swing.JLabel iconologin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
