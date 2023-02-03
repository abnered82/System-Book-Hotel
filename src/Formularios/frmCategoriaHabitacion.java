package Formularios;
import Entidades.CategoriaHabitacion;
import SuperClases.SuperCategoriaHabitacion;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
public class frmCategoriaHabitacion extends javax.swing.JInternalFrame {
    SuperCategoriaHabitacion sch = new SuperCategoriaHabitacion("categoria habitacion.txt");
    DefaultTableModel dtmCategoriaHabitacion = new DefaultTableModel();  
    int filaseleccionada; 
    
    public frmCategoriaHabitacion() {
        initComponents();
        cargarCabeceraTable();   
        tamañoCabeceraTable();
        listarTable(); 
        this.setLocation(2,57);
        this.btnGuardar.setEnabled(false);
        this.btnModificar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        this.txtidcathab.setEnabled(false);
        this.txtcat.setEnabled(false);
        this.txtbuscar.requestFocus();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tapCategoria = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCategoria = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidcathab = new javax.swing.JTextField();
        txtcat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        tapCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jtCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCategoria);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Criterios de Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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
                .addComponent(txtbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tapCategoria.addTab("Buscar", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Id Categoria de Habitacion:");

        jLabel2.setText("Categoria                           :");

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
                    .addComponent(txtidcathab)
                    .addComponent(txtcat, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidcathab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        tapCategoria.addTab("Nuevo/Modificar", jPanel4);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Botones"));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tapCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tapCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if(ValidarDatos().equals("")){
            if(getCategoria().equalsIgnoreCase(sch.buscarcatmod(getCategoria(), getIdCategoriaHabitacion()))){
                JOptionPane.showMessageDialog(this,"La categoria ya se encuentra registrada","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                try{
                    CategoriaHabitacion ch = sch.buscaridCatHab(getIdCategoriaHabitacion());                         
//                    obj.setIdCat(getIdCategoria()); //Al modificar no cambiara el ID Categoría
                    ch.setCategoria(getCategoria());                 
                    listarTable();
                    sch.grabar();                    
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(ValidarDatos().equals("")){
            if(getIdCategoriaHabitacion()== sch.buscaridCatHab2(getIdCategoriaHabitacion())){
                JOptionPane.showMessageDialog(this,"La categoría ya se encuentra registrada","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(getCategoria().equalsIgnoreCase(sch.buscarCat2(getCategoria()))){
                JOptionPane.showMessageDialog(this,"La categoría ya se encuentra registrada","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                try{
                    CategoriaHabitacion ch = new CategoriaHabitacion(getIdCategoriaHabitacion(),getCategoria());                 
                    sch.adicionar(ch); 
                    listarTable();
                    sch.grabar();             
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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.bloquearEstados(true);
        this.txtidcathab.setEnabled(false);
        this.limpiar();                   
        txtidcathab.setText("" + sch.getCorrelativo());      
        this.btnNuevo.setEnabled(false);
        this.btnGuardar.setEnabled(true);        
        this.btnModificar.setEnabled(false);
        this.btnCancelar.setEnabled(true);        
        tapCategoria.setSelectedIndex(1);
        txtcat.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

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

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        // TODO add your handling code here:
        filtro("(?i)" + txtbuscar.getText(), jtCategoria);
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void jtCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCategoriaMouseClicked
        // TODO add your handling code here:
        try{
            filaseleccionada = jtCategoria.getSelectedRow();        
            if(filaseleccionada == -1){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado ninguna fila","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                DefaultTableModel modelotabla = (DefaultTableModel) jtCategoria.getModel();
                                
                String id = jtCategoria.getValueAt(filaseleccionada,0).toString();                
                String descripcion = jtCategoria.getValueAt(filaseleccionada,1).toString();               
                
                txtidcathab.setText(id);
                txtcat.setText(descripcion);
                
                this.bloquearEstados(true);
                this.btnNuevo.setEnabled(false);
                this.btnGuardar.setEnabled(false);
                this.btnModificar.setEnabled(true);
                this.btnCancelar.setEnabled(true);
                this.txtidcathab.setEnabled(false); 
                tapCategoria.setSelectedIndex(1);
                txtcat.requestFocus();
                JOptionPane.showMessageDialog(this,"¡Categoría encontrada!","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);                             
            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(this,"Error" + ex + "\nPor favor inténtelo nuevamente","Mensaje del Sistema",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jtCategoriaMouseClicked

    public void filtro(String filtro, JTable jtableBuscar){
        dtmCategoriaHabitacion = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dtmCategoriaHabitacion);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(filtro));
    }
    
    public int getIdCategoriaHabitacion(){
        return Integer.parseInt(txtidcathab.getText());        
    }
    
    public String getCategoria(){
        return txtcat.getText();
    }        
    
    public void listarTable(){        
        dtmCategoriaHabitacion.setRowCount(0);
        for(int i=0;i<sch.tamaño();i++){ 
            Object array[] = new Object[2];
            array[0] = sch.obtener(i).getIdcathab(); 
            array[1] = sch.obtener(i).getCategoria(); 
            dtmCategoriaHabitacion.addRow(array); 
        }        
        jtCategoria.setModel(dtmCategoriaHabitacion);              
    }
    
    public void cargarCabeceraTable(){
        dtmCategoriaHabitacion.addColumn("ID Categoría Habitacion"); 
        dtmCategoriaHabitacion.addColumn("Descripción"); 
        jtCategoria.setModel(dtmCategoriaHabitacion);
    }       
    
    public void tamañoCabeceraTable(){
        TableColumnModel columnModel = jtCategoria.getColumnModel();  
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
        this.txtidcathab.setEnabled(estado);
    }
       
    public void limpiar(){  
        this.txtcat.setText("");
        this.txtidcathab.setText("");
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
    private javax.swing.JTable jtCategoria;
    private javax.swing.JTabbedPane tapCategoria;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcat;
    private javax.swing.JTextField txtidcathab;
    // End of variables declaration//GEN-END:variables
}
