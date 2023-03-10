package Formularios;
import Entidades.Cliente;
import SuperClases.SuperCliente;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
public class frmCliente extends javax.swing.JInternalFrame {
    
    SuperCliente scli = new SuperCliente("cliente.txt");
    DefaultTableModel dtmCliente = new DefaultTableModel();

    int filaseleccionada;
    public frmCliente() {
        initComponents();
        this.setLocation(2,57);
        this.LlenaCombo();
        this.LlenaLista();
        this.listar();
        this.bloquear(false);
        this.bloquear_controles(true, true,false,false,false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtcodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        cbosexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        tapCliente = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtcliente = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setTitle("CLIENTE");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setText("Codigo        :");

        jLabel2.setText("Nombre       :");

        jLabel3.setText("Apellido       :");

        jLabel4.setText("DNI             :");

        jLabel5.setText("Edad           :");

        jLabel6.setText("Sexo           :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txtapellido)
                            .addComponent(txtdni)
                            .addComponent(txtedad)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbosexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Botones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        jLabel7.setText("Buscar:");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        jtcliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jtcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtclienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtcliente);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tapClienteLayout = new javax.swing.GroupLayout(tapCliente);
        tapCliente.setLayout(tapClienteLayout);
        tapClienteLayout.setHorizontalGroup(
            tapClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tapClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tapClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addGroup(tapClienteLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tapClienteLayout.setVerticalGroup(
            tapClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tapClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(tapClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar Cliente", tapCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int msg = JOptionPane.showConfirmDialog(this, "Deseas Registrar al cliente","Grabar",JOptionPane.YES_NO_OPTION);
        if(ValidarDatos().equals("")){
        if(msg == JOptionPane.YES_OPTION){
            Cliente c = new Cliente(getCodigo(),getNombre(),getApellido(),getDni(),getEdad(),getSexo()); 
            scli.adicionar(c);
            listar();
            scli.grabar();//GRABAR DATOS AL ARCHIVO
            JOptionPane.showMessageDialog(this, "Registrado Satisfactoriamente!!!");
            limpiar();
        }
        else{
            this.txtcodigo.requestFocus();
        }
        } 
        else{
            JOptionPane.showMessageDialog(this,"Error" + ValidarDatos(),"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
        } 
        //this.bloquear(false);
            
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int msg = JOptionPane.showConfirmDialog(this, "Deseas Buscar al Cliente","Buscar",JOptionPane.YES_NO_OPTION);
        if(msg == JOptionPane.YES_OPTION){
            Cliente c = scli.buscarCliente(getCodigo());
            if(c == null){
                JOptionPane.showMessageDialog(this, "No se encontro!!!");
                this.txtapellido.requestFocus();
            }
            else{
                    this.txtcodigo.setText("" + c.getCodigo());
                    this.txtnombre.setText("" + c.getNombre());
                    this.txtapellido.setText("" + c.getApellido());
                    this.txtdni.setText("" + c.getDni());
                    this.txtedad.setText("" + c.getEdad());
                    this.cbosexo.setSelectedItem("" + c.getSexo());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        bloquear(true);//activa los controles
        txtnombre.requestFocus();//el puntero del mouse sobre el text field codigo
        txtcodigo.setText(String.valueOf(scli.getCorrelativo()));
        txtcodigo.setEnabled(false);
        this.bloquear_controles(false, true,true,true,false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int msg = JOptionPane.showConfirmDialog(this, "Deseas Modificar el Cliente","Modificar",JOptionPane.YES_NO_OPTION);
        if(msg == JOptionPane.YES_OPTION){
            Cliente c = scli.buscarCliente(getCodigo());
            if(c != null){
                c.setNombre(getNombre());
                c.setCodigo(getCodigo());
                c.setApellido(getApellido());
                c.setDni(getDni());
                c.setEdad(getEdad());
                c.setSexo(getSexo());
                listar();//ACTUALIZAR LISTA
                
                JOptionPane.showMessageDialog(this, "Reegistro Actualizado!!!","Mensaje",3);
                limpiar();
            }
            else{
                    JOptionPane.showMessageDialog(this,"No se encontro!!!","Mensaje",3);
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        this.bloquear(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int msg = JOptionPane.showConfirmDialog(this, "Deseas Eliminar al Cliente","Eliminar",JOptionPane.YES_NO_OPTION);
        if(msg == JOptionPane.YES_OPTION){
            Cliente c = scli.buscarCliente(getCodigo());
            scli.eliminar(c);
            listar();
            scli.grabar();//GRABAR DATOS AL ARCHIVO
            JOptionPane.showMessageDialog(this,"Registro Eliminado!!!","Eliminar",2);
            limpiar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        filtro("(?i)" + txtbuscar.getText(), jtcliente);
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void jtclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtclienteMouseClicked
        try{
            filaseleccionada = jtcliente.getSelectedRow();
            if(filaseleccionada == -1){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado ninguna fila","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                DefaultTableModel modelotabla = (DefaultTableModel) jtcliente.getModel();

                String codigo = jtcliente.getValueAt(filaseleccionada,0).toString();
                String nombre = jtcliente.getValueAt(filaseleccionada,1).toString();
                String apellido = jtcliente.getValueAt(filaseleccionada,2).toString();
                String dni = jtcliente.getValueAt(filaseleccionada,3).toString();
                String edad = jtcliente.getValueAt(filaseleccionada,4).toString();
                String sexo = jtcliente.getValueAt(filaseleccionada,5).toString();
                
                txtcodigo.setText(codigo);
                txtnombre.setText(nombre);
                txtapellido.setText(apellido);
                txtdni.setText(dni);
                txtedad.setText(edad);
                cbosexo.setSelectedItem(sexo);
                jTabbedPane1.setSelectedIndex(0);
                //this.bloquear_controles(false, true,true,true,true);
                txtcodigo.requestFocus();
                JOptionPane.showMessageDialog(this,"??Empleado encontrado!","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                this.btnActualizar.setEnabled(true);
                this.txtnombre.setEnabled(true);
                this.txtapellido.setEnabled(true);
                this.txtdni.setEnabled(true);
                this.cbosexo.setEnabled(true);
                this.txtedad.setEnabled(true);
            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(this,"Error" + ex + "\nPor favor int??ntelo nuevamente","Mensaje del Sistema",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtclienteMouseClicked
    
    
    /*Obtenener elementos de los objetos SWING*/
    public int getCodigo()          {return Integer.parseInt(this.txtcodigo.getText()); }
    public String getNombre()       {return this.txtnombre.getText(); }
    public String getApellido()     {return this.txtapellido.getText(); }
    public String getDni()          {return this.txtdni.getText(); }
    public int getEdad()            {return Integer.parseInt(this.txtedad.getText()); }
    public String getSexo()         {return this.cbosexo.getSelectedItem().toString(); }
    public String getApellido2()     {return this.txtbuscar.getText(); }
    
    
    
    
    //llena el jtable cliente y asignica el modelo 
    public void LlenaLista(){
        dtmCliente.addColumn("Codigo");
        dtmCliente.addColumn("Nombre");
        dtmCliente.addColumn("Apellido");
        dtmCliente.addColumn("DNI");
        dtmCliente.addColumn("Edad");
        dtmCliente.addColumn("Sexo");
        
        jtcliente.setModel(dtmCliente);
    }
    //llena el combo sexo
    public void LlenaCombo(){
        cbosexo.addItem("Masculino");
        cbosexo.addItem("Femenino");
    }
    
    public void listar(){
        if(scli.tama??o() == 0){
            JOptionPane.showMessageDialog(null, "Lista sin elementos!!!","Validar",2);
        }
        else{
        }
        dtmCliente.setRowCount(0); //LIMPIA LAS FILAS DEL JTABLE
        for(int i=0;i<scli.tama??o();i++){
            Object vec[]=new Object[6];
            vec[0] = scli.obtener(i).getCodigo();
            vec[1] = scli.obtener(i).getNombre();
            vec[2] = scli.obtener(i).getApellido();
            vec[3] = scli.obtener(i).getDni();
            vec[4] = scli.obtener(i).getEdad();
            vec[5] = scli.obtener(i).getSexo();
            
            //AGREGAR AL JTABLE
            dtmCliente.addRow(vec);
        }
        jtcliente.setModel(dtmCliente);
    }
    
    public void bloquear(boolean valor){
        this.txtcodigo.setEnabled(valor);
        this.txtnombre.setEnabled(valor);
        this.txtapellido.setEnabled(valor);
        this.txtdni.setEnabled(valor);
        this.txtedad.setEnabled(valor);
        this.cbosexo.setEnabled(valor);
    }
    
    public void limpiar(){
            this.txtcodigo.setText("");
        this.txtnombre.setText("");
        this.txtapellido.setText("");
        this.txtdni.setText("");
        this.cbosexo.setSelectedIndex(0);
        this.txtedad.setText("");
    }
    
    public void bloquear_controles(boolean nuevo,boolean buscar,boolean registrar,boolean actualizar,boolean eliminar){
        btnNuevo.setEnabled(nuevo);
        btnBuscar.setEnabled(buscar);
        
        btnRegistrar.setEnabled(registrar);
        btnActualizar.setEnabled(actualizar);
        btnEliminar.setEnabled(eliminar);
    }
    
    public void filtro(String filtro, JTable jtableBuscar){
        dtmCliente = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dtmCliente);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(filtro));
    }   
    
    public String ValidarDatos(){
        String mensajeValidarDatos = ""; 
        if(txtnombre.getText().equals("")){
            mensajeValidarDatos += "\nPor favor ingresar nombre";
            txtnombre.requestFocus();
        }else
            if (txtapellido.getText().equals("")) {
            mensajeValidarDatos += "Por favor ingresar apellido";
            txtapellido.requestFocus();
        }else
            if (txtdni.getText().equals("")) {
            mensajeValidarDatos += "Por favor ingresar dni";
            txtdni.requestFocus();
        }else
            if (txtedad.getText().equals("")) {
            mensajeValidarDatos += "Por favor ingresar edad";
            txtedad.requestFocus();
        }
        return mensajeValidarDatos;               
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbosexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtcliente;
    private javax.swing.JPanel tapCliente;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
