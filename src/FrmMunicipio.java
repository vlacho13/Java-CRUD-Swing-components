
import edu.uniciencia.directorio.daos.MunicipioDAO;
import edu.uniciencia.directorio.datos.Municipio;
import static java.lang.Integer.parseInt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class FrmMunicipio extends javax.swing.JInternalFrame {

    ModeloTablaMunicipio modelo = null;
    MunicipioDAO dao = null;
    Map<String, Municipio> db = new HashMap<>();

    public FrmMunicipio() {
        initComponents();

        dao = new MunicipioDAO();
        modelo = new ModeloTablaMunicipio();

        jTable1.setModel(modelo);
        modelo.fireTableDataChanged();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jTxtNombre = new javax.swing.JTextField();
        jTxtCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnActualizar = new javax.swing.JButton();
        jBtnBuscar = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        jLabel3.setText("Codigo Postal ");

        jTxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdActionPerformed(evt);
            }
        });

        jTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombreActionPerformed(evt);
            }
        });

        jTxtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodActionPerformed(evt);
            }
        });

        jLabel4.setText("MUNICIPIO");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Descripcion", "Codigo Postal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBtnActualizar.setText("Actualizar");
        jBtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarActionPerformed(evt);
            }
        });

        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnBuscarMouseClicked(evt);
            }
        });
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jBtnAgregar.setText("Agregar");
        jBtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAgregarMouseClicked(evt);
            }
        });
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtCod)
                                    .addComponent(jTxtNombre)
                                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnLimpiar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBuscar)
                    .addComponent(jBtnActualizar)
                    .addComponent(jBtnAgregar)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdActionPerformed

    private void jTxtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodActionPerformed

    private void jBtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarActionPerformed
        Municipio p = dao.buscarMunicipio(jTxtId.getText());
        if (p == null) {
            JOptionPane.showMessageDialog(this, "No encontrado");
            return;
        }
        copiarDatos(p, true);
        dao.actualizarMunicipio(p);
        limpiar();
        cargarTabla();
    }//GEN-LAST:event_jBtnActualizarActionPerformed

    private void jBtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBuscarMouseClicked

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        Municipio p = dao.buscarMunicipio(jTxtId.getText());
        if (p != null) {
            copiarDatos(p, false);
        } else {
            JOptionPane.showMessageDialog(this, "Municipio no encontrado");
        }
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jBtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAgregarMouseClicked
        // TODO add your handling code here:
        Municipio p = db.get(jTxtId.getText());
        if (p == null) {
            p = new Municipio();
            db.put(jTxtId.getText(), p);
        }
        copiarDatos(p, true);
        limpiar();
    }//GEN-LAST:event_jBtnAgregarMouseClicked

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        Municipio p = new Municipio();
        copiarDatos(p, true);
        dao.agregarMunicipio(p);
        JOptionPane.showMessageDialog(this, "Se ha guardado exitosamente.");
        limpiar();
        cargarTabla();
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        dao.eliminarMunicipio(jTxtId.getText());
        limpiar();
        cargarTabla();
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLimpiarMouseClicked
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jBtnLimpiarMouseClicked

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizar;
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCod;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables

    public void copiarDatos(Municipio p, boolean x) {
        if (x) {
            p.setIdMunicipio((jTxtId.getText()));
            p.setNombre(jTxtNombre.getText());
            p.setCodigoPostal(jTxtCod.getText());

        } else {
            jTxtId.setText(jTxtId.getText());
            jTxtNombre.setText(p.getNombre());
            jTxtCod.setText(p.getCodigoPostal());
        }
    }

    public void limpiar() {
        jTxtId.setText("");
        jTxtNombre.setText("");
        jTxtCod.setText("");
    }

    public void cargarTabla() {
        List<Municipio> lista = dao.getListaMunicipios();
        modelo.setLista(lista);
        modelo.fireTableDataChanged();
    }

}
