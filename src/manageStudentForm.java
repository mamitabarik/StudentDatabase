
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Others
 */
public class manageStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form manageStudentForm
     */
   student std=new student();
    DefaultTableModel model;
    public manageStudentForm() throws ClassNotFoundException,SQLException  {
        initComponents();
       // std.fillstudentJtable(jTable1, "");
     
       DefaultTableModel dtm=new DefaultTableModel();
       
       dtm.addColumn("id");
       dtm.addColumn("First_Name");
       dtm.addColumn("Last_Name");
       dtm.addColumn("Sex");
       dtm.addColumn("Birth_Date");
       dtm.addColumn("Phone");
       dtm.addColumn("Address");
       
       ArrayList<manageStudent> listStudent=std.getListStudent();
       
       for(int i=0;i<listStudent.size();i++){
           
           dtm.addRow(new Object[]{listStudent.get(i).getId(),listStudent.get(i).getFirst_name(),listStudent.get(i).getLast_name(),listStudent.get(i).getSex(),
               listStudent.get(i).getBirthdate(),listStudent.get(i).getPhone(),listStudent.get(i).getAddress()});
            
           
       }
       jTable1.setModel(dtm);
       
       
       //button group
        ButtonGroup bg=new ButtonGroup();
        bg.add(jRadioButtonMale);
        bg.add(jRadioButtonFemale);
        model=(DefaultTableModel) jTable1.getModel();
        
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.yellow);
        jTable1.setSelectionBackground(Color.black);
      
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_FName = new javax.swing.JTextField();
        jTextField_LName = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jTextField_Phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jButtonRemoveStudent = new javax.swing.JButton();
        jButtonAddStudent1 = new javax.swing.JButton();
        jDateChooserBirthDate = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButtonEditStudent = new javax.swing.JButton();
        jTextField_STD_ID1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel1.setText("Manage Student");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Sex:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("BirthDate:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Address:");

        jTextField_FName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField_LName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRadioButtonMale.setText("Male");

        jRadioButtonFemale.setText("Female");

        jTextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jButtonRemoveStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRemoveStudent.setText("Remove");
        jButtonRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveStudentActionPerformed(evt);
            }
        });

        jButtonAddStudent1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAddStudent1.setText("Add");
        jButtonAddStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudent1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("First Name:");

        jButtonEditStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEditStudent.setText("Edit");
        jButtonEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditStudentActionPerformed(evt);
            }
        });

        jTextField_STD_ID1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonRemoveStudent)
                                .addGap(30, 30, 30)
                                .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAddStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_STD_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_STD_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jRadioButtonFemale))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDateChooserBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemoveStudent)
                    .addComponent(jButtonEditStudent)
                    .addComponent(jButtonAddStudent1))
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        // TODO add your handling code here:
        if(! Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jButtonRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveStudentActionPerformed
        // TODO add your handling code here:
        int id=Integer.valueOf(jTextField_STD_ID1.getText());
       try {
           std.insertUpdateDeleteStudent('d', id, null, null, null, null, null, null);
            MainForm.jLabel_StdCount.setText("Student Count = "+Integer.toString(MyFunction.countData("student")));
       } catch (SQLException ex) {
           Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButtonRemoveStudentActionPerformed

    private void jButtonAddStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudent1ActionPerformed
        // TODO add your handling code here:
         AddStudentForm AddSf=new AddStudentForm();
        AddSf.setVisible(true);
        AddSf.pack();
        AddSf.setLocationRelativeTo(null);
        AddSf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButtonAddStudent1ActionPerformed

    public boolean verifText(){
        
        if(jTextField_FName.getText().equals("") || jTextField_LName.getText().equals("") ||
                jTextField_Phone.getText().equals("") || jTextArea_Address.getText().equals("") ||
                    jTextField_STD_ID1.getText().equals("") || jDateChooserBirthDate.getDate() == null  )
                {
                    JOptionPane.showMessageDialog(null, "empty fields");
                    return false;
                }
        else if(jDateChooserBirthDate.getDate().compareTo(new Date())>0){
            JOptionPane.showMessageDialog(null, "no student from future");
            return false;
        }
        else
            return true;
    }
    
    private void jButtonEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditStudentActionPerformed
        // TODO add your handling code here:
        String fname=jTextField_FName.getText();
        String lname=jTextField_LName.getText();
        String phone=jTextField_Phone.getText();
        String address=jTextArea_Address.getText();
        int id=Integer.valueOf(jTextField_STD_ID1.getText());
        String sex = "";
        if(jRadioButtonFemale.isSelected()){
            sex="Female";
        }else if(jRadioButtonMale.isSelected()){
            sex="Male";
        }

        if(verifText()){
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String bdate=dateFormat.format(jDateChooserBirthDate.getDate());
            student std=new student();
            try {
                std.insertUpdateDeleteStudent('u', id, fname, lname, sex, bdate, phone, address);
                //MainForm.jLabel_StdCount.setText("Student Count = "+Integer.toString(MyFunction.countData("student")));

            } catch (SQLException ex) {
                Logger.getLogger(AddStudentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonEditStudentActionPerformed
    int rowIndex;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        rowIndex=jTable1.getSelectedRow();
        
        if(model.getValueAt(rowIndex,3).toString().equals("Male")){
            jRadioButtonMale.setSelected(true);
            jRadioButtonFemale.setSelected(false);
        }
        else{
            jRadioButtonFemale.setSelected(true);
            jRadioButtonMale.setSelected(false);
        }
        jTextField_STD_ID1.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
        jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
        jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
        
       Date bdate;
       try {
           bdate=new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
           jDateChooserBirthDate.setDate(bdate);
       } catch (ParseException ex) {
           Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
        rowIndex=jTable1.getSelectedRow();
        
        if(evt.getKeyCode()==KeyEvent.VK_UP ||evt.getKeyCode()==KeyEvent.VK_DOWN ){
            jTextField_STD_ID1.setText(model.getValueAt(rowIndex, 0).toString());
            jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
            jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
            jTextField_Phone.setText(model.getValueAt(rowIndex, 5).toString());
            jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
            
            if(model.getValueAt(rowIndex,3).toString().equals("Male")){
            jRadioButtonMale.setSelected(true);
            jRadioButtonFemale.setSelected(false);
            }
            else{
            jRadioButtonFemale.setSelected(true);
            jRadioButtonMale.setSelected(false);
            }
            Date bdate;
       try {
           bdate=new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
           jDateChooserBirthDate.setDate(bdate);
       } catch (ParseException ex) {
           Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
       }  
        }
    }//GEN-LAST:event_jTable1KeyReleased

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
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new manageStudentForm().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent1;
    private javax.swing.JButton jButtonEditStudent;
    private javax.swing.JButton jButtonRemoveStudent;
    private com.toedter.calendar.JDateChooser jDateChooserBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_STD_ID1;
    // End of variables declaration//GEN-END:variables
}
