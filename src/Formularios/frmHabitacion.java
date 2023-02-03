package Formularios;
import Entidades.habitacion;
import SuperClases.SuperCategoriaHabitacion;
import SuperClases.SuperHabitacion;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
public class frmHabitacion extends javax.swing.JInternalFrame {    
    SuperCategoriaHabitacion sch = new SuperCategoriaHabitacion("categoria habitacion.txt");
    SuperHabitacion sh = new SuperHabitacion("habitacion.txt");
    DefaultTableModel dtmHabitacion = new DefaultTableModel();
    int filaseleccionada;    

    public frmHabitacion() {
        initComponents();
        this.setLocation(2,57);
        cargarCabeceraTable();   
        tamañoCabeceraTable();
        ordenTabulacion();
        listarTable();       
        cargarCboCategoria();
        this.btnGuardar.setEnabled(false);
        this.btnModificar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        this.txtprehab.setEnabled(false);
        this.cbonum.setEnabled(false);
        this.cbopis.setEnabled(false);
        this.cbocathab.setEnabled(false);
        this.txtbuscar.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tapProducto = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jthabitacion = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbocathab = new javax.swing.JComboBox<>();
        txtprehab = new javax.swing.JTextField();
        cbopis = new javax.swing.JComboBox<>();
        cbonum = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        tapProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Criterios de Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbuscar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jthabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jthabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jthabitacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jthabitacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        tapProducto.addTab("Buscar", jPanel1);

        jLabel1.setText("Piso             :");

        jLabel2.setText("Número       :");

        jLabel3.setText("Precio          :");

        jLabel4.setText("Categoria   :");

        cbocathab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbocathabItemStateChanged(evt);
            }
        });
        cbocathab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocathabActionPerformed(evt);
            }
        });

        cbopis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbopisActionPerformed(evt);
            }
        });

        cbonum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbonumItemStateChanged(evt);
            }
        });
        cbonum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbocathab, 0, 158, Short.MAX_VALUE)
                            .addComponent(cbopis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtprehab))
                        .addGap(160, 160, 160))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cbonum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbocathab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbopis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbonum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprehab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        tapProducto.addTab("Nuevo/Modificar", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Botones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tapProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tapProducto)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.limpiar(); 
        this.btnNuevo.setEnabled(false);
        this.btnGuardar.setEnabled(true);        
        this.btnModificar.setEnabled(false);
        this.btnCancelar.setEnabled(true);
        tapProducto.setSelectedIndex(1);
        this.cbonum.setEnabled(true);
        this.cbopis.setEnabled(true);
        this.cbocathab.setEnabled(true);
        txtprehab.requestFocus(); 
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(ValidarDatos().equals("")){
            if(getNumero().equalsIgnoreCase(sh.buscarnum2(getNumero()))){
                JOptionPane.showMessageDialog(this,"La habitacion ya se encuentra registrado","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }            
            else{
                try{
                    habitacion h = new habitacion(getCategoria(),getPiso(),getNumero(),getPrecio());                 
                    sh.adicionar(h); 
                    listarTable();
                    sh.grabar();             
                    //this.bloquearEstados(false);            
                    this.btnNuevo.setEnabled(true);
                    this.btnGuardar.setEnabled(false);
                    this.btnModificar.setEnabled(false);
                    this.btnCancelar.setEnabled(false);                  
                    this.requestFocus();
                    this.limpiar();               
                    JOptionPane.showMessageDialog(this,"¡Habitacion agregado con éxito!","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
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
            if(getNumero().equalsIgnoreCase(sh.buscatnummod(getCategoria(), getNumero()))){
                JOptionPane.showMessageDialog(this,"La habitacion ya se encuentra registrado","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                try{
                    habitacion h = sh.buscarnum(getNumero());                         
//                    obj.setIdEmp(getIdProducto()); //Al modificar no cambiara el ID Producto
                    h.setCategoria(getCategoria()); 
                    h.setPiso(getPiso());
                    h.setNumero(getNumero());
                    h.setPrecio(getPrecio()); 
                    listarTable();
                    sh.grabar();                    
                    //this.bloquearEstados(false);
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
        //this.bloquearEstados(false);
        this.btnNuevo.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.btnModificar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        this.cbocathab.setEnabled(false);
        this.cbonum.setEnabled(false);
        this.cbopis.setEnabled(false);
        this.requestFocus();
        this.limpiar(); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        // TODO add your handling code here:
        filtro("(?i)" + txtbuscar.getText(), jthabitacion);
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void jthabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jthabitacionMouseClicked
        // TODO add your handling code here:
        try{
            filaseleccionada = jthabitacion.getSelectedRow();
            if(filaseleccionada == -1){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado ninguna fila","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                DefaultTableModel modelotabla = (DefaultTableModel) jthabitacion.getModel();

                String categoria = jthabitacion.getValueAt(filaseleccionada,0).toString();
                String piso = jthabitacion.getValueAt(filaseleccionada,1).toString();
                String numero = jthabitacion.getValueAt(filaseleccionada,2).toString();
                String precio = jthabitacion.getValueAt(filaseleccionada,3).toString(); cbocathab.setSelectedItem(categoria);
                cbopis.setSelectedItem(piso);
                cbonum.setSelectedItem(numero);
                
                txtprehab.setText(precio);            

                //this.bloquearEstados(true);
                this.btnNuevo.setEnabled(false);
                this.btnGuardar.setEnabled(false);
                this.btnModificar.setEnabled(true);
                this.btnCancelar.setEnabled(true);
                this.cbocathab.setEnabled(true);
                this.cbonum.setEnabled(true);
                this.cbopis.setEnabled(true);
                tapProducto.setSelectedIndex(1);
                txtprehab.requestFocus();
                JOptionPane.showMessageDialog(this,"¡Habitacion encontrado!","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(this,"Error" + ex + "\nPor favor inténtelo nuevamente","Mensaje del Sistema",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jthabitacionMouseClicked

    private void cbonumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbonumActionPerformed

    private void cbocathabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocathabActionPerformed
        // TODO add your handling code here:
        int cathab;
       cathab = this.cbocathab.getSelectedIndex();
       if (cathab==0){
           this.txtprehab.setText("200");
       }
       else if (cathab==1){
           this.txtprehab.setText("800");
       } 
       if (cathab==2){
           this.txtprehab.setText("1500");        
       }
       if (cathab==3){
           this.txtprehab.setText("1200");     
       }
       
    }//GEN-LAST:event_cbocathabActionPerformed

    private void cbocathabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbocathabItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
            this.cbopis.setModel(new DefaultComboBoxModel(this.getpisos(this.cbocathab.getSelectedItem().toString())));
        }
        
    }//GEN-LAST:event_cbocathabItemStateChanged

    private void cbonumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbonumItemStateChanged
        // TODO add your handling code here:
        /*if(evt.getStateChange() == ItemEvent.SELECTED){
            this.cbonum.setModel(new DefaultComboBoxModel(this.getnumcuarto(this.cbopis.getSelectedItem().toString())));
        }*/
    }//GEN-LAST:event_cbonumItemStateChanged

    private void cbopisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbopisActionPerformed
        // TODO add your handling code here:
        carganumero();
    }//GEN-LAST:event_cbopisActionPerformed

    /*public void combocathab(boolean estado){
        if(estado=true){
        this.cbopis.addItem("Piso 1");
           this.cbopis.addItem("Piso 2");
           this.cbopis.addItem("Piso 3");
           this.cbopis.addItem("Piso 4");
           this.cbopis.addItem("Piso 5");}
        
    }
    public void combocathab2(){
        
        this.cbopis.addItem("Piso 6");
           this.cbopis.addItem("Piso 7");
           this.cbopis.addItem("Piso 8");
           this.cbopis.addItem("Piso 9");
           this.cbopis.addItem("Piso 10");     
    }*/
    
    public String[] getpisos(String cathab){
        String[] pisos = new String[5];
        if(cathab.equalsIgnoreCase("economica")){
            pisos[0] = "piso 1";
            pisos[1] = "piso 2";
            pisos[2] = "piso 3";
            pisos[3] = "piso 4";
            pisos[4] = "piso 5";
        }
        if(cathab.equalsIgnoreCase("bussiness")){
            pisos[0] = "piso 6";
            pisos[1] = "piso 7";
            pisos[2] = "piso 8";
            pisos[3] = "piso 9";
            pisos[4] = "piso 10";
        }
        if(cathab.equalsIgnoreCase("presidencial")){
            pisos[0] = "piso 11";
            pisos[1] = "piso 12";
            pisos[2] = "piso 13";
            pisos[3] = "piso 14";
            pisos[4] = "piso 15";
        }
        if(cathab.equalsIgnoreCase("turista")){
            pisos[0] = "piso 16";
            pisos[1] = "piso 17";
            pisos[2] = "piso 18";
            pisos[3] = "piso 19";
            pisos[4] = "piso 20";
        }
        return pisos;
    }
    public String[] getnumcuarto(String pisos){
        String[] cuarto = new String[3];
        if(pisos.equalsIgnoreCase("piso 1")){
            cuarto[0] = "Cuarto 101";
            cuarto[1] = "Cuarto 102";
            cuarto[2] = "Cuarto 103";
        }
        if(pisos.equalsIgnoreCase("piso 2")){
            cuarto[0] = "Cuarto 201";
            cuarto[1] = "Cuarto 202";
            cuarto[2] = "Cuarto 203";
        }
        if(pisos.equalsIgnoreCase("piso 3")){
            cuarto[0] = "Cuarto 301";
            cuarto[1] = "Cuarto 302";
            cuarto[2] = "Cuarto 303";
        }
        if(pisos.equalsIgnoreCase("piso 4")){
            cuarto[0] = "Cuarto 401";
            cuarto[1] = "Cuarto 402";
            cuarto[2] = "Cuarto 403";
        }
        if(pisos.equalsIgnoreCase("piso 5")){
            cuarto[0] = "Cuarto 501";
            cuarto[1] = "Cuarto 502";
            cuarto[2] = "Cuarto 503";
        }
        if(pisos.equalsIgnoreCase("piso 6")){
            cuarto[0] = "Cuarto 601";
            cuarto[1] = "Cuarto 602";
            cuarto[2] = "Cuarto 603";
        }
        if(pisos.equalsIgnoreCase("piso 7")){
            cuarto[0] = "Cuarto 701";
            cuarto[1] = "Cuarto 702";
            cuarto[2] = "Cuarto 703";
        }
        if(pisos.equalsIgnoreCase("piso 8")){
            cuarto[0] = "Cuarto 801";
            cuarto[1] = "Cuarto 802";
            cuarto[2] = "Cuarto 803";
        }
        
        
        
        return cuarto;
    }
    
    DefaultComboBoxModel modelnum;
    public void carganumero(){
        String[] piso1={"cuarto 101","cuarto 102","cuarto 103"};
String[] piso2={"cuarto 201","cuarto 202","cuarto 203"};
String[] piso3={"cuarto 301","cuarto 302","cuarto 303"};
String[] piso4={"cuarto 401","cuarto 402","cuarto 403"};
String[] piso5={"cuarto 501","cuarto 502","cuarto 503"};
String[] piso6={"cuarto 601","cuarto 602","cuarto 603"};
String[] piso7={"cuarto 701","cuarto 702","cuarto 703"};
String[] piso8={"cuarto 801","cuarto 802","cuarto 803"};
String[] piso9={"cuarto 901","cuarto 902","cuarto 903"};
String[] piso10={"cuarto 1001","cuarto 1002","cuarto 1003"};
String[] piso11={"cuarto 1101","cuarto 1102","cuarto 1103"};
String[] piso12={"cuarto 1201","cuarto 1202","cuarto 1203"};
String[] piso13={"cuarto 1301","cuarto 1302","cuarto 1303"};
String[] piso14={"cuarto 1401","cuarto 1402","cuarto 1403"};
String[] piso15={"cuarto 1501","cuarto 1502","cuarto 1503"};
String[] piso16={"cuarto 1601","cuarto 1602","cuarto 1603"};
String[] piso17={"cuarto 1701","cuarto 1702","cuarto 1703"};
String[] piso18={"cuarto 1801","cuarto 1802","cuarto 1803"};
String[] piso19={"cuarto 1901","cuarto 1902","cuarto 1903"};
String[] piso20={"cuarto 2001","cuarto 2002","cuarto 2003"};
String[] piso21={"cuarto 2101","cuarto 2102","cuarto 2103"};
String[] piso22={"cuarto 2201","cuarto 2202","cuarto 2203"};
String[] piso23={"cuarto 2301","cuarto 2302","cuarto 2303"};
String[] piso24={"cuarto 2401","cuarto 2402","cuarto 2403"};
String[] piso25={"cuarto 2501","cuarto 2502","cuarto 2503"};
String[] piso26={"cuarto 2601","cuarto 2602","cuarto 2603"};
String[] piso27={"cuarto 2701","cuarto 2702","cuarto 2703"};
String[] piso28={"cuarto 2801","cuarto 2802","cuarto 2803"};
String[] piso29={"cuarto 2901","cuarto 2902","cuarto 2903"};
String[] piso30={"cuarto 3001","cuarto 3002","cuarto 3003"};
String[] piso31={"cuarto 3101","cuarto 3102","cuarto 3103"};
String[] piso32={"cuarto 3201","cuarto 3202","cuarto 3203"};
String[] piso33={"cuarto 3301","cuarto 3302","cuarto 3303"};
String[] piso34={"cuarto 3401","cuarto 3402","cuarto 3403"};
String[] piso35={"cuarto 3501","cuarto 3502","cuarto 3503"};
String[] piso36={"cuarto 3601","cuarto 3602","cuarto 3603"};
String[] piso37={"cuarto 3701","cuarto 3702","cuarto 3703"};
String[] piso38={"cuarto 3801","cuarto 3802","cuarto 3803"};
String[] piso39={"cuarto 3901","cuarto 3902","cuarto 3903"};
String[] piso40={"cuarto 4001","cuarto 4002","cuarto 4003"};
String[] piso41={"cuarto 4101","cuarto 4102","cuarto 4103"};
String[] piso42={"cuarto 4201","cuarto 4202","cuarto 4203"};
String[] piso43={"cuarto 4301","cuarto 4302","cuarto 4303"};
String[] piso44={"cuarto 4401","cuarto 4402","cuarto 4403"};
String[] piso45={"cuarto 4501","cuarto 4502","cuarto 4503"};
String[] piso46={"cuarto 4601","cuarto 4602","cuarto 4603"};
String[] piso47={"cuarto 4701","cuarto 4702","cuarto 4703"};
String[] piso48={"cuarto 4801","cuarto 4802","cuarto 4803"};
String[] piso49={"cuarto 4901","cuarto 4902","cuarto 4903"};
String[] piso50={"cuarto 5001","cuarto 5002","cuarto 5003"};
String[] piso51={"cuarto 5101","cuarto 5102","cuarto 5103"};
String[] piso52={"cuarto 5201","cuarto 5202","cuarto 5203"};
String[] piso53={"cuarto 5301","cuarto 5302","cuarto 5303"};
String[] piso54={"cuarto 5401","cuarto 5402","cuarto 5403"};
String[] piso55={"cuarto 5501","cuarto 5502","cuarto 5503"};
String[] piso56={"cuarto 5601","cuarto 5602","cuarto 5603"};
String[] piso57={"cuarto 5701","cuarto 5702","cuarto 5703"};
String[] piso58={"cuarto 5801","cuarto 5802","cuarto 5803"};
String[] piso59={"cuarto 5901","cuarto 5902","cuarto 5903"};
String[] piso60={"cuarto 6001","cuarto 6002","cuarto 6003"};
        
        
        String pisos=cbopis.getSelectedItem().toString();
        if(pisos.equals("piso 1")){
            modelnum = new DefaultComboBoxModel(piso1);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 2")){
            modelnum = new DefaultComboBoxModel(piso2);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 3")){
            modelnum = new DefaultComboBoxModel(piso3);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 4")){
            modelnum = new DefaultComboBoxModel(piso4);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 5")){
            modelnum = new DefaultComboBoxModel(piso5);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 6")){
            modelnum = new DefaultComboBoxModel(piso6);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 7")){
            modelnum = new DefaultComboBoxModel(piso7);
            cbonum.setModel(modelnum);
        }else if(pisos.equals("piso 8")){
            modelnum = new DefaultComboBoxModel(piso8);
            cbonum.setModel(modelnum);
        }else if(pisos.equals("piso 9")){
            modelnum = new DefaultComboBoxModel(piso9);
            cbonum.setModel(modelnum);
        }else if(pisos.equals("piso 10")){
            modelnum = new DefaultComboBoxModel(piso10);
            cbonum.setModel(modelnum);
        }else if(pisos.equals("piso 11")){
            modelnum = new DefaultComboBoxModel(piso11);
            cbonum.setModel(modelnum);
        }else if(pisos.equals("piso 12")){
            modelnum = new DefaultComboBoxModel(piso12);
            cbonum.setModel(modelnum);
        }else if(pisos.equals("piso 13")){
            modelnum = new DefaultComboBoxModel(piso13);
            cbonum.setModel(modelnum);
        }else if(pisos.equals("piso 14")){
            modelnum = new DefaultComboBoxModel(piso14);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 15")){
            modelnum = new DefaultComboBoxModel(piso15);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 16")){
            modelnum = new DefaultComboBoxModel(piso16);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 17")){
            modelnum = new DefaultComboBoxModel(piso17);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 18")){
            modelnum = new DefaultComboBoxModel(piso18);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 19")){
            modelnum = new DefaultComboBoxModel(piso19);
            cbonum.setModel(modelnum);
        }
        else if(pisos.equals("piso 20")){
            modelnum = new DefaultComboBoxModel(piso20);
            cbonum.setModel(modelnum);
        }
    }
    
    
    
    public void filtro(String filtro, JTable jtableBuscar){
        dtmHabitacion = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dtmHabitacion);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(filtro));
    }
    
    public String getNumero(){
        return cbonum.getSelectedItem().toString();        
    }
    
    public String getPiso(){
        return cbopis.getSelectedItem().toString();
    } 
    
    public String getCategoria(){
        return cbocathab.getSelectedItem().toString();
    }
    
    public double getPrecio(){
        return Double.parseDouble(txtprehab.getText());
    }
    
    public void listarTable(){        
        dtmHabitacion.setRowCount(0);
        for(int i=0;i<sh.tamaño();i++){ 
            Object array[] = new Object[4];
            array[0] = sh.obtener(i).getCategoria(); 
            array[1] = sh.obtener(i).getPiso(); 
            array[2] = sh.obtener(i).getNumero(); 
            array[3] = sh.obtener(i).getPrecio();
            dtmHabitacion.addRow(array); 
        }        
        jthabitacion.setModel(dtmHabitacion);               
    }
    
    public void cargarCabeceraTable(){
        dtmHabitacion.addColumn("Categoria Habitacion"); 
        dtmHabitacion.addColumn("Piso");
        dtmHabitacion.addColumn("Numero");
        dtmHabitacion.addColumn("Precio");    
        jthabitacion.setModel(dtmHabitacion);
    }       
    
    public void tamañoCabeceraTable(){
        TableColumnModel columnModel = jthabitacion.getColumnModel();  
        columnModel.getColumn(0).setPreferredWidth(120);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(2).setPreferredWidth(120);
        columnModel.getColumn(3).setPreferredWidth(120);
    }
    
    public void ordenTabulacion(){          
        cbocathab.setNextFocusableComponent(cbopis);
        cbopis.setNextFocusableComponent(cbocathab);
        cbocathab.setNextFocusableComponent(txtprehab);
        txtprehab.setNextFocusableComponent(btnNuevo);
//        btnGenerar.setNextFocusableComponent(btnImprimir);
//        btnImprimir.setNextFocusableComponent(btnNuevo);
        btnNuevo.setNextFocusableComponent(btnGuardar);
        btnGuardar.setNextFocusableComponent(btnModificar);
        btnModificar.setNextFocusableComponent(btnCancelar);
        btnCancelar.setNextFocusableComponent(btnSalir);
        btnSalir.setNextFocusableComponent(cbocathab);        
    }
    public void limpiar(){  
        this.cbocathab.setSelectedIndex(0);
        this.cbopis.setSelectedIndex(0);
        this.cbonum.setSelectedIndex(0);
        this.txtprehab.setText("");
    }  
    public void cargarCboCategoria(){
        for(int i=0;i<sch.tamaño();i++){             
            cbocathab.addItem(sch.obtener(i).getCategoria().toString()); 
        }
    }
    public String ValidarDatos(){
        String mensajeValidarDatos = ""; 
        if(txtprehab.getText().equals("")){
            mensajeValidarDatos += "\nPor favor ingrese el precio del Habitacion";
            txtprehab.requestFocus();
        }        
        return mensajeValidarDatos;               
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbocathab;
    private javax.swing.JComboBox<String> cbonum;
    private javax.swing.JComboBox<String> cbopis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jthabitacion;
    private javax.swing.JTabbedPane tapProducto;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtprehab;
    // End of variables declaration//GEN-END:variables
}
