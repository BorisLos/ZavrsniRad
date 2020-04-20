/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.moje.zavrsnirad.view;

import hr.moje.zavrsnirad.controller.ObradaOperater;
import hr.moje.zavrsnirad.model.Operater;
import hr.moje.zavrsnirad.util.ZRadException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author LasovicaPC
 */
public class Registracija extends javax.swing.JFrame {
    
    private final ObradaOperater obrada;
    //private Object pswLozinkaPonovo;
    //private Object e;
    

    /**
     * Creates new form Registracija
     */
    public Registracija() {
        initComponents();
        obrada=new ObradaOperater();
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
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        pswLozinka = new javax.swing.JPasswordField();
        pswLozinkaPonovo = new javax.swing.JPasswordField();
        btnRegistriraj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("email");

        jLabel2.setText("Lozinka");
        jLabel2.setToolTipText("");

        jLabel3.setText("Lozinka ponovo");
        jLabel3.setToolTipText("");

        jLabel4.setText("Ime");
        jLabel4.setToolTipText("");

        jLabel5.setText("Prezime");
        jLabel5.setToolTipText("");

        pswLozinka.setText("jPasswordField1");

        pswLozinkaPonovo.setText("jPasswordField1");

        btnRegistriraj.setLabel("Registriraj");
        btnRegistriraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pswLozinkaPonovo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(txtIme, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(pswLozinka, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnRegistriraj)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswLozinkaPonovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnRegistriraj)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrirajActionPerformed
       if(!Arrays.equals(pswLozinka.getPassword(), pswLozinkaPonovo.getPassword())){
            JOptionPane.showMessageDialog(null, "Lozinke ne odgovaraju");
            return;
    }//GEN-LAST:event_btnRegistrirajActionPerformed

        Operater o = new Operater();
        o.setIme(txtIme.getText());
        o.setPrezime(txtPrezime.getText());
        o.setEmail(txtEmail.getText());
        o.setLozinka(BCrypt.hashpw(new String(pswLozinka.getPassword()), 
                BCrypt.gensalt()));
        obrada.setEntitet(o);
        try {
            obrada.create();
            JOptionPane.showMessageDialog(null, "Uspješno registrirani, prijavite se s novim podacima");
            dispose();
        }catch(ZRadException e){
            JOptionPane.showMessageDialog(null, e.getPoruka());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistriraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pswLozinka;
    private javax.swing.JPasswordField pswLozinkaPonovo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables
}
