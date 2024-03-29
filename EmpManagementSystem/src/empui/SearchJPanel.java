/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package empui;

import empmodel.EmpHistory;
import empmodel.Employee;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author vivekhanagoji
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    
    boolean isPresent = false;
    EmpHistory history;
    public SearchJPanel(EmpHistory history) {
        initComponents();
        
        
        this.history = history;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        cbAttributes = new javax.swing.JComboBox<>();
        lblPhoto = new javax.swing.JLabel();

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

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

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        cbAttributes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee ID", "Employee Name", "Employee Age" }));
        cbAttributes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAttributesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(cbAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnSearch)
                        .addGap(0, 232, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
          // TODO add your handling code here:
        
       //if(empID = )
      // int selectedRowIndex = tblEmployees.getSelectedRow();
       
      // DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
     // Employee selectEmployees = (Employee) model.getValueAt(selectedRowIndex, 0);
      
   /*  int empid = Integer.parseInt(txtEmpId.getText());
     
     for (empid : getHistory(getEmpId))
     {
         
     }*/ 
   // int empid = Integer.parseInt(txtSearch.getText());
   // int age = Integer.parseInt(txtSearch.getText());
   // String empName = txtSearch.getText();
   ArrayList<Employee> empList = history.getHistory();
   
   String cbSearchType = cbAttributes.getSelectedItem().toString();
   String cbValues = txtSearch.getText();
   
    ArrayList<Employee> employeeList = new ArrayList<>();
    
    if (cbSearchType.equalsIgnoreCase("Employee Name"))
    {
        for (Employee employee : empList) {
                if (employee.getName().contains(cbValues)) {

                    employeeList.add(employee);
                    isPresent = true;
                }
            }
    }
    else if (cbSearchType.equalsIgnoreCase("Employee ID")) {
            for (Employee employee : empList) {

                if (Integer.parseInt(cbValues) == employee.getEmpId()) {

                    employeeList.add(employee);
                    isPresent = true;
                }

            }
        } 
    else if (cbSearchType.equals("Employee Age")) {
            for (Employee employee : empList) {

                if (Integer.parseInt(cbValues) == employee.getAge()) {

                    employeeList.add(employee);
                    isPresent = true;
                }

            }
        }
    
  
 //  String empName = txtSearch.getText();
     
    DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        model.setRowCount(0);
      if (txtSearch.getText().length() == 0)  
      {
          JOptionPane.showMessageDialog(this," Enter something to search");
        return;
      }
        for (Employee em : employeeList){
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
       // boolean isPresent = false;
             
       Image img = Toolkit.getDefaultToolkit().createImage(em.getUploadPhoto());
        img = img.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        lblPhoto.setIcon(icon);
       } 
       if (isPresent == false) {
            JOptionPane.showMessageDialog(null, "No Records found");
            return;
        }
                    
            
      
            
           
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void cbAttributesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAttributesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAttributesActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbAttributes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static boolean isNumeric(final String str) {

        // null or empty
        if (str == null || str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;

    }

}

