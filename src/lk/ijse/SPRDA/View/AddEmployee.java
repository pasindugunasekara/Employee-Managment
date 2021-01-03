/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.SPRDA.View;

import com.sun.media.jfxmedia.MediaError;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.SPRDA.Controller.EmployeeController;
import lk.ijse.SPRDA.Controller.TotalCurrentlyEmployeeController;
import lk.ijse.SPRDA.model.Employee;

/**
 *
 * @author HP
 */
public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();
        loadAllCurrentlyEmployee();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtEm_ID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        cmbState = new javax.swing.JComboBox<>();
        txtAddress = new javax.swing.JTextField();
        txtJoinDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnUpdateEmployee = new javax.swing.JButton();
        btnRegistrationEmployee = new javax.swing.JButton();
        btnUnregistration = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 580));

        jPanel4.setBackground(new java.awt.Color(189, 195, 199));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEm_ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEm_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEm_IDActionPerformed(evt);
            }
        });
        jPanel4.add(txtEm_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 240, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Employee ID");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("State");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Contact");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 100, 20));

        txtBirthday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdayActionPerformed(evt);
            }
        });
        jPanel4.add(txtBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 240, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Date Of Birthday");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, 20));

        txtContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        jPanel4.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 240, 30));

        cmbState.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        cmbState.setBorder(null);
        cmbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStateActionPerformed(evt);
            }
        });
        jPanel4.add(cmbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 250, 30));

        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel4.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 250, 30));

        txtJoinDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtJoinDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJoinDateActionPerformed(evt);
            }
        });
        jPanel4.add(txtJoinDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 250, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Address");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Date of Join (dd-mm-yy)");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, -1, -1));

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 240, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Employee Name");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, 20));

        txtCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        jPanel4.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 240, 30));

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 240, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("City");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Email");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        btnUpdateEmployee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateEmployee.setText("Update");
        btnUpdateEmployee.setBorder(null);
        btnUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmployeeActionPerformed(evt);
            }
        });
        jPanel4.add(btnUpdateEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 120, 30));

        btnRegistrationEmployee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrationEmployee.setText("Register");
        btnRegistrationEmployee.setBorder(null);
        btnRegistrationEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationEmployeeActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistrationEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 120, 30));

        btnUnregistration.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUnregistration.setText("Delete");
        btnUnregistration.setBorder(null);
        btnUnregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnregistrationActionPerformed(evt);
            }
        });
        jPanel4.add(btnUnregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 120, 30));

        jPanel5.setBackground(new java.awt.Color(149, 165, 166));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setForeground(new java.awt.Color(102, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employees");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 210, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/road couple.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1840, 0, 2060, 1160));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 580));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Address", "Contact", "Birthday", "State", "City", "Email", "Join Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 820, 210));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 620));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthdayActionPerformed

    private void txtEm_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEm_IDActionPerformed
        
        if(txtEm_ID.getText().trim().length()>0){
            
            try {
                Employee OBJ= new EmployeeController().getEmployee(txtEm_ID.getText().trim());
                
                if(OBJ!=null){
                    txtAddress.setText(OBJ.getAddress());
                    txtName.setText(OBJ.getName());
                    txtContact.setText(OBJ.getContact());
                    txtBirthday.setText(OBJ.getBirthday());
                    txtCity.setText(OBJ.getCity());
                    txtEmail.setText(OBJ.getEmail());
                    txtJoinDate.setText(OBJ.getJoin_date());
                    cmbState.setSelectedItem(OBJ.getState());
                    
                    
                }else{
                    JOptionPane.showMessageDialog(this, "No Result Found","Warning",JOptionPane.WARNING_MESSAGE);
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Please insert an Employee Id","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_txtEm_IDActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void cmbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStateActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtJoinDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJoinDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJoinDateActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new DashBoardView().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnRegistrationEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationEmployeeActionPerformed
        
        try {
            String Ep_id=txtEm_ID.getText();
            String Name=txtName.getText();
            String Address=txtAddress.getText();
            String Contact=txtContact.getText();
            String Birthday=txtBirthday.getText();
            String State=cmbState.getSelectedItem().toString();
            String City=txtCity.getText();
            String Email=txtEmail.getText();
            String Join_date=txtJoinDate.getText();
            
            Employee e1=new Employee(Ep_id, Name, Address, Contact, Birthday, State, City, Email, Join_date);
            
            boolean isSaved=new EmployeeController().saveEmployee(e1);
            
            if(isSaved){
                JOptionPane.showMessageDialog(null, "Saved");
            }else{
                JOptionPane.showMessageDialog(null, "Try again");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrationEmployeeActionPerformed

    private void btnUnregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnregistrationActionPerformed
            
            if(txtEm_ID.getText().trim().length()>3){
                try {
                    
                    if (new EmployeeController().dropEmployee(txtEm_ID.getText().trim())) {
                        JOptionPane.showMessageDialog(null,"Deleted..");
                    }else{
                        JOptionPane.showMessageDialog(null,"Something went Wrong!!", "WARNING",JOptionPane.WARNING_MESSAGE);
                    }
                    
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Please Insert an ID","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_btnUnregistrationActionPerformed

    private void btnUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeActionPerformed
            if(txtEm_ID.getText().trim().length()>3){
                      
                try {
                    String Ep_id=txtEm_ID.getText();
                    String Name=txtName.getText();
                    String Address=txtAddress.getText();
                    String Contact=txtContact.getText();
                    String Birthday=txtBirthday.getText();
                    String State=cmbState.getSelectedItem().toString();
                    String City=txtCity.getText();
                    String Email=txtEmail.getText();
                    String Join_date=txtJoinDate.getText();
                    
                    Employee e1=new Employee(Ep_id, Name, Address, Contact, Birthday, State, City, Email, Join_date);
                    
                    if(new EmployeeController().updateState(e1)){
                        JOptionPane.showMessageDialog(null,"Done...");
                    }else{
                        JOptionPane.showMessageDialog(null,"Please Try Again","WARNING",JOptionPane.WARNING_MESSAGE);
                    }
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
                      
                  }else{
                      JOptionPane.showMessageDialog(null,"Please Insert an ID","ERROR",JOptionPane.ERROR_MESSAGE);
                  }
    }//GEN-LAST:event_btnUpdateEmployeeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

        
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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrationEmployee;
    private javax.swing.JButton btnUnregistration;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEm_ID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtJoinDate;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void loadAllCurrentlyEmployee() {
        
        try {
            
            List<Employee> employeeList= new TotalCurrentlyEmployeeController().getAllEmployees();
            
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            
            for(Employee tempEmployee:employeeList){
                model.addRow(new Object[]{
                    tempEmployee.getEp_id(),
                    tempEmployee.getName(),
                    tempEmployee.getAddress(),
                    tempEmployee.getContact(),
                    tempEmployee.getBirthday(),
                    tempEmployee.getState(),
                    tempEmployee.getCity(),
                    tempEmployee.getEmail(),
                    tempEmployee.getJoin_date(),
               });
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TotalCurrentlyEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TotalCurrentlyEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}