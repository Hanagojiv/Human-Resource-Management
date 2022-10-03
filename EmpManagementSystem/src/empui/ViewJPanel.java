/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package empui;

import empmodel.EmpHistory;
import empmodel.Employee;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vivekhanagoji
 */
public class ViewJPanel extends javax.swing.JPanel {
    
    //int i;

    /**
     * Creates new form ViewJPanel
     */
    String photoUrl="";
    EmpHistory history;
    public ViewJPanel(EmpHistory history) {
        initComponents();
        
        this.history = history;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblEmpId = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        txtStartD = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        lblPositionInfo = new javax.swing.JLabel();
        txtPositionInfo = new javax.swing.JTextField();
        lblContactInfo = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lblPhoneNo = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        lblEmailId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();
        btnUploadImg = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Employee Catalogue ");

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position", "Phone Number", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblEmpId.setText("Employee ID:");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        lblStartDate.setText("Start Date:");

        lblLevel.setText("Level:");

        lblTeamInfo.setText("Team Info:");

        lblPositionInfo.setText("Position title:");

        lblContactInfo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblContactInfo.setText("Contact Information");

        lblPhoneNo.setText("Phone Number:");

        lblEmailId.setText("Email ID:");

        lblName.setText("Name:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Details");

        jLabel2.setText(" Employee Photo:");

        btnUploadImg.setText("Upload Image");
        btnUploadImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnView)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmpId)
                                    .addComponent(lblAge)
                                    .addComponent(lblName)
                                    .addComponent(lblStartDate)
                                    .addComponent(lblGender)
                                    .addComponent(lblLevel)
                                    .addComponent(lblTeamInfo)
                                    .addComponent(lblPositionInfo)
                                    .addComponent(lblContactInfo)
                                    .addComponent(lblPhoneNo)
                                    .addComponent(lblEmailId)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStartD, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPositionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnUploadImg, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnView)
                    .addComponent(btnUpdate))
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPositionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPositionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUploadImg)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        
       int selectedRowIndex = tblEmployees.getSelectedRow();
       if (selectedRowIndex <0){
           
           JOptionPane.showMessageDialog(this,"Please select a row to delete");
           return;
       }
       DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
      Employee selectEmployees = (Employee) model.getValueAt(selectedRowIndex, 0);
       
      history.deleteEmployee(selectEmployees);
      
      
      JOptionPane.showMessageDialog(this,"Employee deleted");
      
      populateTable();

       
         
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        
           
       int selectedRowIndex = tblEmployees.getSelectedRow();
       if (selectedRowIndex <0){
           
           JOptionPane.showMessageDialog(this,"Please select a row to view employee details");
           return;
       }
       DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
      Employee selectEmployees = (Employee) model.getValueAt(selectedRowIndex, 0);
      
      
        
      txtName.setText(String.valueOf(selectEmployees.getName()));
      txtEmpId.setText(String.valueOf(selectEmployees.getEmpId()));
      txtAge.setText(String.valueOf(selectEmployees.getAge()));
      txtGender.setText(String.valueOf(selectEmployees.getGender()));
      txtStartD.setText(String.valueOf(selectEmployees.getStartDate()));
      txtLevel.setText(String.valueOf(selectEmployees.getLevel()));
      txtTeamInfo.setText(String.valueOf(selectEmployees.getTeamInfo()));
      txtPositionInfo.setText(String.valueOf(selectEmployees.getPositionTitle()));
      txtPhoneNo.setText(String.valueOf(selectEmployees.getPhoneNo()));
      txtEmailId.setText(String.valueOf(selectEmployees.getEmail())); 
      Image img = Toolkit.getDefaultToolkit().createImage(selectEmployees.getUploadPhoto());
        img = img.getScaledInstance(lblPic.getWidth(), lblPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        lblPic.setIcon(icon);
       
    //  int columnDetails = tblEmployees
     // Employee EmployeesID = (Employee) model.getValueAt(, 1);
       
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       
        boolean valid = validationForFields();
   int selectedRowIndex = tblEmployees.getSelectedRow();
       if (selectedRowIndex <0){
           
           JOptionPane.showMessageDialog(this,"Please select a row to Update employee details");
           return;
       }
       
     
       DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
      Employee selectEmployees = (Employee) model.getValueAt(selectedRowIndex, 0);
      
      selectEmployees.setName(String.valueOf(txtName.getText()));
      selectEmployees.setEmpId(Integer.parseInt(txtEmpId.getText()));
      selectEmployees.setAge(Integer.parseInt(txtAge.getText()));
      selectEmployees.setGender(String.valueOf(txtGender.getText()));
      selectEmployees.setStartDate(String.valueOf(txtStartD.getText()));
      selectEmployees.setLevel(String.valueOf(txtLevel.getText()));
      selectEmployees.setTeamInfo(String.valueOf(txtTeamInfo.getText()));
      selectEmployees.setPositionTitle(String.valueOf(txtPositionInfo.getText()));
    //  selectEmployees.setPhoneNo(Integer.parseInt(txtPhoneNo.getText()));
     selectEmployees.setPhoneNo(String.valueOf(txtPhoneNo.getText()));
      selectEmployees.setEmail(String.valueOf(txtEmailId.getText()));
      selectEmployees.setUploadPhoto(photoUrl);
      
      
      populateTable();
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUploadImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImgActionPerformed
        // TODO add your handling code here:
        JFileChooser filePicker = new JFileChooser();

        filePicker.showOpenDialog(null);
        photoUrl = filePicker.getSelectedFile().getAbsolutePath();
    }//GEN-LAST:event_btnUploadImgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUploadImg;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContactInfo;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblPositionInfo;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtPositionInfo;
    private javax.swing.JTextField txtStartD;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        model.setRowCount(0);
            
        for (Employee em : history.getHistory()){
            
            Object[] row = new Object[10];
            row[0] = em;
            row[1] = em.getEmpId();
            row[2] = em.getAge();
            row[3] = em.getGender();
            row[4] = em.getStartDate();
            row[5] = em.getLevel();
            row[6] = em.getTeamInfo();
            row[7] = em.getPositionTitle();
            row[8] = em.getPhoneNo();
            row[9] = em.getEmail();
            
            
            model.addRow(row);
        }
    }

 private boolean validationForFields() {

        
        
          if(txtName.getText().length()==0)
    {
        JOptionPane.showMessageDialog(this," Name Can't be blank, please enter Employee Name");
       txtName.requestFocus();
        txtName.setText("");
        return false;
    }
        else{
        if(!txtName.getText().matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
            {
                 JOptionPane.showMessageDialog(this," Invalid name. ");
  txtName.requestFocus();
                 txtName.setText("");
                 return false;
                
                
            }
          }

    //getting Employee ID details
   if(txtEmpId.getText().isBlank() && !isNumeric(txtEmpId.getText()))
    {
        JOptionPane.showMessageDialog(this," Entered Employee ID is invalid ");
        txtEmpId.requestFocus();
        txtEmpId.setText("");
        return false;
    }
        else
        {
             if(!txtEmpId.getText().matches("^[0-9]{0,6}$"))
             {
                JOptionPane.showMessageDialog(this," Invalid Employee ");
                txtEmpId.requestFocus();
                return false;
                
             }  
        }
   if(txtAge.getText().isBlank() && !isNumeric(txtAge.getText()))
   {
         JOptionPane.showMessageDialog(this," Age is invalid ");
         txtAge.requestFocus();
         txtAge.setText("");
        return false;
   }
          
        else
        {
              if(!txtAge.getText().matches("^0?(1[89]|[2-9]\\d)$"))
              {
                  JOptionPane.showMessageDialog(this," Employee should be between 18 to 99 years old. ");
                  txtAge.requestFocus(); 
                  txtAge.setText("");
                  return false;
              }
              
        }
 if(txtStartD.getText().isBlank())
    {
        JOptionPane.showMessageDialog(this," Date cannot be blank, please enter a valid Start Date ");
         txtStartD.requestFocus();
         txtStartD.setText("");
        return false;
    }
        else
           {
               if(!txtStartD.getText().matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"))
               {
                   JOptionPane.showMessageDialog(this," Invalid Date format MM/DD/YYYY ");
                    txtStartD.requestFocus();
                    txtStartD.setText("");
                   return false;
               }
            }
 if(txtPhoneNo.getText().isBlank() && !isNumeric(txtPhoneNo.getText()))
 {
         JOptionPane.showMessageDialog(this," Date cannot be blank, please enter a valid Start Date ");
         txtPhoneNo.requestFocus();
         txtPhoneNo.setText("");
        return false;
 }
        else
        {
            if(!txtPhoneNo.getText().matches("^[2-9]{2}[0-9]{8}$"))
            {
                    JOptionPane.showMessageDialog(this," Invalid Phone Number format, please enter a valid 10 digit US Phone No. ");
                    txtPhoneNo.requestFocus();
                    txtPhoneNo.setText("");
                   return false;
            }
        }
 if(txtGender.getText().isBlank())
 {
         JOptionPane.showMessageDialog(this," Gender cannot be blank, please enter employee's gender ");
         txtGender.requestFocus();
         txtGender.setText("");
        return false;
 }
  if(txtLevel.getText().isBlank())
 {
         JOptionPane.showMessageDialog(this," Level cannot be blank ");
         txtLevel.requestFocus();
         txtLevel.setText("");
        return false;
 }
   if(txtTeamInfo.getText().isBlank())
 {
         JOptionPane.showMessageDialog(this," Team Information cannot be blank please enter employee's team details. ");
         txtTeamInfo.requestFocus();
         txtTeamInfo.setText("");
        return false;
 }
   if(txtEmailId.getText().isBlank())
 {
         JOptionPane.showMessageDialog(this," Please enter the Email Id ");
         txtEmailId.requestFocus();
         txtEmailId.setText("");
        return false;
 }
   else
   {
       if(!txtEmailId.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
       {
           JOptionPane.showMessageDialog(this," Invalid email address ");
                    txtEmailId.requestFocus();
                    txtEmailId.setText("");
                   return false;
       }
   }

        return true;
    }
 public boolean isNumeric (String a)
 {

     try{
         int input = Integer.parseInt(a);
         
                 
     }catch (NumberFormatException nfe){
         return false;
     }
     return true;
 }

}


