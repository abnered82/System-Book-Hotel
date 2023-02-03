package Formularios;
import Entidades.CategoriaProducto;
import SuperClases.SuperCategoriaProducto;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class frmCategoriaProducto extends javax.swing.JInternalFrame {

    SuperCategoriaProducto scp = new SuperCategoriaProducto("categoria producto.txt");
    DefaultTableModel dtmCategoriaProducto = new DefaultTableModel();  
    int filaseleccionada; 
    
    public frmCategoriaProducto() {
        initComponents();
        cargarCabeceraTable();   
        tamañoCabeceraTable();
        listarTable(); 
        this.setLocation(2,57);
        this.btnGuardar.setEnabled(false);
        this.btnModificar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        this.txtidcatpro.setEnabled(false);
        this.txtcat.setEnabled(false);
        this.txtbuscar.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tapCategoria = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCategoriapro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidcatpro = new javax.swing.JTextField();
        txtcat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtCategoriapro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtCategoriapro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtCategoriapro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCategoriaproMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCategoriapro);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Criterios de Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtbuscar.setBackground(new java.awt.Color(204, 255, 255));
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbuscar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        tapCategoria.addTab("Buscar", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Id Categoria de Producto:");

        jLabel2.setText("Categoria");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtidcatpro)
                    .addComponent(txtcat, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidcatpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        tapCategoria.addTab("Nuevo-Modificar", jPanel4);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Botones"));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tapCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tapCategoria)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        // TODO add your handling code here:
        filtro("(?i)" + txtbuscar.getText(), jtCategoriapro);
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.bloquearEstados(true);
        this.txtidcatpro.setEnabled(false);
        this.limpiar();
        txtidcatpro.setText("" + scp.getCorrelativo());
        this.btnNuevo.setEnabled(false);
        this.btnGuardar.setEnabled(true);
        this.btnModificar.setEnabled(false);
        this.btnCancelar.setEnabled(true);
        tapCategoria.setSelectedIndex(1);
        txtcat.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(ValidarDatos().equals("")){
            if(getIdCategoriaHabitacion()== scp.buscaridCatPro2(getIdCategoriaHabitacion())){
                JOptionPane.showMessageDialog(this,"La categoría ya se encuentra registrada","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(getCategoria().equalsIgnoreCase(scp.buscarCat2(getCategoria()))){
                JOptionPane.showMessageDialog(this,"La categoría ya se encuentra registrada","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                try{
                    CategoriaProducto cp = new CategoriaProducto(getIdCategoriaHabitacion(),getCategoria());
                    scp.adicionar(cp);
                    listarTable();
                    scp.grabar();
                    this.bloquearEstados(false);
                    this.btnNuevo.setEnabled(true);
                    this.btnGuardar.setEnabled(false);
                    this.btnModificar.setEnabled(false);
                    this.btnCancelar.setEnabled(false);
                    this.requestFocus();
                    this.limpiar();
                    JOptionPane.showMessageDialog(this,"¡Categoría agregada con éxito!","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, e,"Mensaje del Sistema",JOptionPane.ERROR_MESSAGE); //JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Error" + ValidarDatos(),"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if(ValidarDatos().equals("")){
            if(getCategoria().equalsIgnoreCase(scp.buscarcatmod(getCategoria(), getIdCategoriaHabitacion()))){
                JOptionPane.showMessageDialog(this,"La categoria ya se encuentra registrada","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                try{
                    CategoriaProducto cp = scp.buscaridCatPro(getIdCategoriaHabitacion());
                    //                    obj.setIdCat(getIdCategoria()); //Al modificar no cambiara el ID Categoría
                    cp.setCategoriapro(getCategoria());
                    listarTable();
                    scp.grabar();
                    this.bloquearEstados(false);
                    this.btnNuevo.setEnabled(true);
                    this.btnGuardar.setEnabled(false);
                    this.btnModificar.setEnabled(false);
                    this.btnCancelar.setEnabled(false);
                    this.requestFocus();
                    this.limpiar();
                    JOptionPane.showMessageDialog(this,"¡Registro actualizado con éxito!","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, e,"Mensaje del Sistema",JOptionPane.ERROR_MESSAGE); //JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Error" + ValidarDatos(),"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.bloquearEstados(false);
        this.btnNuevo.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.btnModificar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        this.requestFocus();
        this.limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jtCategoriaproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCategoriaproMouseClicked
        // TODO add your handling code here:
        try{
            filaseleccionada = jtCategoriapro.getSelectedRow();        
            if(filaseleccionada == -1){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado ninguna fila","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                DefaultTableModel modelotabla = (DefaultTableModel) jtCategoriapro.getModel();
                                
                String id = jtCategoriapro.getValueAt(filaseleccionada,0).toString();                
                String descripcion = jtCategoriapro.getValueAt(filaseleccionada,1).toString();               
                
                txtidcatpro.setText(id);
                txtcat.setText(descripcion);
                
                this.bloquearEstados(true);
                this.btnNuevo.setEnabled(false);
                this.btnGuardar.setEnabled(false);
                this.btnModificar.setEnabled(true);
                this.btnCancelar.setEnabled(true);
                this.txtidcatpro.setEnabled(false); 
                tapCategoria.setSelectedIndex(1);
                txtcat.requestFocus();
                JOptionPane.showMessageDialog(this,"¡Categoría encontrada!","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);                             
            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(this,"Error" + ex + "\nPor favor inténtelo nuevamente","Mensaje del Sistema",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtCategoriaproMouseClicked
    public void filtro(String filtro, JTable jtableBuscar){
        dtmCategoriaProducto = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dtmCategoriaProducto);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(filtro));
    }
    
    public int getIdCategoriaHabitacion(){
        return Integer.parseInt(txtidcatpro.getText());        
    }
    
    public String getCategoria(){
        return txtcat.getText();
    }        
    
    public void listarTable(){        
        dtmCategoriaProducto.setRowCount(0);
        for(int i=0;i<scp.tamaño();i++){ 
            Object array[] = new Object[2];
            array[0] = scp.obtener(i).getIdcatpro(); 
            array[1] = scp.obtener(i).getCategoriapro(); 
            dtmCategoriaProducto.addRow(array); 
        }        
        jtCategoriapro.setModel(dtmCategoriaProducto);              
    }
    
    public void cargarCabeceraTable(){
        dtmCategoriaProducto.addColumn("ID Categoría Producto"); 
        dtmCategoriaProducto.addColumn("Descripción"); 
        jtCategoriapro.setModel(dtmCategoriaProducto);
    }       
    
    public void tamañoCabeceraTable(){
        TableColumnModel columnModel = jtCategoriapro.getColumnModel();  
        columnModel.getColumn(0).setPreferredWidth(130);
        columnModel.getColumn(1).setPreferredWidth(120);
    }
    
    /*public void ordenTabulacion(){
        txtIdCategoria.setNextFocusableComponent(txtDescripcion);
        txtDescripcion.setNextFocusableComponent(btnNuevo);        
        btnNuevo.setNextFocusableComponent(btnGuardar);
        btnGuardar.setNextFocusableComponent(btnModificar);
        btnModificar.setNextFocusableComponent(btnCancelar);
        btnCancelar.setNextFocusableComponent(btnSalir);
        btnSalir.setNextFocusableComponent(txtIdCategoria);
    }*/
    
    
    public void bloquearEstados(boolean estado){
        this.txtcat.setEnabled(estado);
        this.txtidcatpro.setEnabled(estado);
    }
       
    public void limpiar(){  
        this.txtcat.setText("");
        this.txtidcatpro.setText("");
    }
    
    public String ValidarDatos(){
        String mensajeValidarDatos = "";
        if(txtcat.getText().equals("")){
            mensajeValidarDatos += "\nPor favor ingrese la descripción de la Categoría";
            txtcat.requestFocus();
        }            
        return mensajeValidarDatos;              
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCategoriapro;
    private javax.swing.JTabbedPane tapCategoria;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcat;
    private javax.swing.JTextField txtidcatpro;
    // End of variables declaration//GEN-END:variables
}
