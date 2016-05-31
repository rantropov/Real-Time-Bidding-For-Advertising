/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdministrativeRole;

import business.EcoSystem;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.Role.Role;
import business.employee.Person;
import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krush
 */
public class ManageUser extends javax.swing.JPanel {

    /**
     * Creates new form ManageUser
     */
    private JPanel userProcessContainer;
    private OrganizationDirectory organizationDir;
    private Enterprise enterprise;
    private EcoSystem system;

    public ManageUser(JPanel userProcessContainer, OrganizationDirectory organizationDir, EcoSystem system, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.system = system;
        this.enterprise = enterprise;
        populateOrgCombobox();

        //populateEmployeeCombobox();
        // populateRoleCombobox();
        populateUserTable();

    }

    public void populateUserTable() {
        DefaultTableModel dtm = (DefaultTableModel) userAccountjTable1.getModel();
        dtm.setRowCount(0);
        for (Organization organization : organizationDir.getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua.getUserName();
                row[1] = ua.getRole();
                dtm.addRow(row);
            }
        }

    }

    public void populateOrgCombobox() {
        organizationjComboBox1.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationjComboBox1.addItem(organization);
        }
    }

    public void populateEMployeeCombobox(Organization organization) {
        employeejComboBox2.removeAllItems();
        for (Person employee : organization.getPersonDir().getPersonList()) {
            employeejComboBox2.addItem(employee);
        }

    }

    public void populateRoleCombobox(Organization organization) {
        rolejComboBox3.removeAllItems();

        for (Role role : organization.getSupportedRole()) {
            rolejComboBox3.addItem(role);
        }

    }

    public void setVisible() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userAccountjTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        organizationjComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        employeejComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        rolejComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        usernamejTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordjTextField2 = new javax.swing.JTextField();
        submitjButton1 = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userAccountjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userAccountjTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 70, -1, 148));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Manage User Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel2.setText("Organization");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 280, -1, -1));

        organizationjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationjComboBox1ActionPerformed(evt);
            }
        });
        add(organizationjComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 277, 121, -1));

        jLabel3.setText("Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 318, 61, -1));

        employeejComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeejComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 315, 121, -1));

        jLabel4.setText("Role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 356, 61, -1));

        rolejComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(rolejComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 353, 121, -1));

        jLabel5.setText("User Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 394, -1, -1));

        usernamejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamejTextField1ActionPerformed(evt);
            }
        });
        add(usernamejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 391, 121, -1));

        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 432, -1, -1));
        add(passwordjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 429, 121, -1));

        submitjButton1.setText("Submit");
        submitjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButton1ActionPerformed(evt);
            }
        });
        add(submitjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 481, -1, -1));

        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 481, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void usernamejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamejTextField1ActionPerformed

    private void organizationjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationjComboBox1ActionPerformed
        // TODO add your handling code here
        Organization organization = (Organization) organizationjComboBox1.getSelectedItem();

        if (organization != null) {

            populateEMployeeCombobox(organization);
            populateRoleCombobox(organization);
        }
    }//GEN-LAST:event_organizationjComboBox1ActionPerformed

    private void submitjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButton1ActionPerformed
        // TODO add your handling code here:

        String username = usernamejTextField1.getText();
        String password = passwordjTextField2.getText();
        Organization organization = (Organization) organizationjComboBox1.getSelectedItem();
        Person employee = (Person) employeejComboBox2.getSelectedItem();
        Role role = (Role) rolejComboBox3.getSelectedItem();

        if (username.equals("") || password.equals("") || (organization.equals("") || (role.equals("")))) {
            JOptionPane.showMessageDialog(null, "Please fill all the values");
            return;
        }
        if(rolejComboBox3 == null || employeejComboBox2== null){
            JOptionPane.showMessageDialog(null,"Invalid Input");
            return;
        }

        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDir().getOrganizationList()) {
                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        if (username.equals(ua.getUserName())) {
                            JOptionPane.showMessageDialog(null, "User Name already exists in Organization");
                            return;
                        }
                    }
                    
                    for(Network n1 : system.getNetworkList()){
                        for(Enterprise e1 :n1.getEnterpriseDirectory().getEnterpriseList()){
                            for(UserAccount ua : e1.getUserAccountDirectory().getUserAccountList()){
                                 if (username.equals(ua.getUserName())) {
                            JOptionPane.showMessageDialog(null, "User Name already exists in Enterprise");
                            return;
                        }
                            }
                        }
                    }
                    
                    
                    
                    
                    
                }
            }
        }

        organization.getUserAccountDirectory().creatNewUserAccount(username, password, employee, role);

        /*
         if(organization.getName().equals(Organization.OrganizationType.Customer.getValue())){
                 
         Person customer = (Person) employeejComboBox2.getSelectedItem();
         int age = Integer.parseInt(agejTextField1.getText());
         String country = countryjTextField2.getText();
         String hobbies = hobbiesjTextField3.getText();
         String lastSearched = lastSearchedjTextField4.getText();
         Person c = system.getPersonDir().createNewCustomer(age, hobbies, country, hobbies, lastSearched);
         organization.getUserAccountDirectory().creatNewUserAccount(username, password, c , role);
         }
         else{
         organization.getUserAccountDirectory().creatNewUserAccount(username, password, employee, role);
             
         */
        populateUserTable();
        
        
       JOptionPane.showMessageDialog(null,"UserAccount Created");
    }//GEN-LAST:event_submitjButton1ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JComboBox employeejComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationjComboBox1;
    private javax.swing.JTextField passwordjTextField2;
    private javax.swing.JComboBox rolejComboBox3;
    private javax.swing.JButton submitjButton1;
    private javax.swing.JTable userAccountjTable1;
    private javax.swing.JTextField usernamejTextField1;
    // End of variables declaration//GEN-END:variables
}
