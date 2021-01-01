/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expensetrackertest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Raghav Gupta
 */
public class MainTestScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainTestScreen
     */
    public MainTestScreen() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        MainTabbedPane = new javax.swing.JTabbedPane();
        InputPanel = new javax.swing.JPanel();
        ComboBoxCategorySelect = new javax.swing.JComboBox<>();
        TextFieldAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ViewPanel = new javax.swing.JPanel();
        ViewButton = new javax.swing.JButton();
        ChooseCategoryComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        DetailsTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        StartDateTextField = new javax.swing.JTextField();
        EndDateTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBoxCategorySelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "electricity", "study", "fuel", "food", "clothes", "misc" }));
        ComboBoxCategorySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCategorySelectActionPerformed(evt);
            }
        });

        TextAreaDescription.setColumns(20);
        TextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(TextAreaDescription);

        jLabel1.setText("Amount");
        jLabel1.setToolTipText("");

        jLabel2.setText("Description");
        jLabel2.setToolTipText("");

        jLabel3.setText("Select Category");

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Rs.");

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InputPanelLayout.createSequentialGroup()
                                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxCategorySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(InputPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1))
                        .addGap(26, 26, 26))
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboBoxCategorySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MainTabbedPane.addTab("Enter Expense Details", InputPanel);

        ViewButton.setText("View Details");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        ChooseCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all", "electricity", "study", "fuel", "food", "clothes", "misc" }));
        ChooseCategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseCategoryComboBoxActionPerformed(evt);
            }
        });

        DetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "S.No.", "Category", "Description", "Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(DetailsTable);

        jLabel5.setText("Choose Category");

        StartDateTextField.setToolTipText("Please enter the Date in the format (yyyy-MM-dd): eg 2020-12-31.");
        StartDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateTextFieldActionPerformed(evt);
            }
        });

        EndDateTextField.setToolTipText("Please enter the Date in the format (yyyy-MM-dd): eg 2020-12-31.");
        EndDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndDateTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("From");

        jLabel7.setText("to");

        javax.swing.GroupLayout ViewPanelLayout = new javax.swing.GroupLayout(ViewPanel);
        ViewPanel.setLayout(ViewPanelLayout);
        ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ChooseCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(215, 215, 215)
                        .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StartDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EndDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChooseCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(StartDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(EndDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        MainTabbedPane.addTab("View Expense Details", ViewPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(MainTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(MainTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }


    Connection con;

    private void getConnectionFromSQL() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://13.232.22.132:3306/db1", "raghav", "redhat");
        } catch (SQLException e) {

            System.out.println("My SQL ERROR: " + e.getMessage());
        }

    }

    /*
    
    View:  select *  from expense_tracker where Date(created_at) > '2020-12-25' and Date(created_at) < '2021-01-02' and category = 'clothes';
    Update:
     */
    ResultSet rs;

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed

        String category = (String) ComboBoxCategorySelect.getSelectedItem();

        try {
            double amount = Double.parseDouble(TextFieldAmount.getText());

            String description = TextAreaDescription.getText();

            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String date = formatter.format(calendar.getTime());
            getConnectionFromSQL();

            try {
                PreparedStatement ps = con.prepareStatement("Insert into expense_tracker(category,amount,description,created_at) values(?,?,?,?)");
                ps.setString(1, category);
                ps.setDouble(2, amount);
                ps.setString(3, description);
                ps.setString(4, date);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Details Saved");
                TextFieldAmount.setText("");
                TextAreaDescription.setText("");
                con.close();
            } catch (SQLException e) {

                JOptionPane.showMessageDialog(this, "MYSQL ERROR: " + e.getMessage());
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Please Enter the Valid Amount.");
        }


    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed

        String categoryChosen = (String) ChooseCategoryComboBox.getSelectedItem();
        String startDate = StartDateTextField.getText();
        String endDate = EndDateTextField.getText();
        boolean showAll = false;
        boolean fromToEnd = false;
        getConnectionFromSQL();
        if (startDate.trim().equals("") || endDate.trim().equals("")) {

//            JOptionPane.showMessageDialog(this, "Please enter the Date in the format (yyyy-MM-dd): eg 2020-12-31");
            fromToEnd = true;

        }
        if (categoryChosen.equals("all")) {

            showAll = true;

        }

        try {
            PreparedStatement ps;
            if (showAll && fromToEnd) {
                ps = con.prepareStatement("Select * from expense_tracker");
            } else {
                if (!showAll && fromToEnd) {
                    ps = con.prepareStatement("Select * from expense_tracker where category = ? ");
                    ps.setString(1, categoryChosen);
                } else {

                    ps = con.prepareStatement("Select * from expense_tracker where Date(created_at)>= ? and  Date(created_at) <= ? and category = ? ");

                    ps.setString(1, startDate);
                    ps.setString(2, endDate);
                    ps.setString(3, categoryChosen);

                }
            }

            rs = ps.executeQuery();
            int rowCount = 0;
            while (rs.next()) {
                rowCount++;
            }
            if (rowCount == 0) {

                JOptionPane.showMessageDialog(this, "No Details Found ");
            }

            Object[][] dt = new Object[rowCount][5];
            rs = ps.executeQuery();
            rowCount = 0;
            while (rs.next()) {
                dt[rowCount][0] = rowCount + 1;
                dt[rowCount][1] = rs.getString("category");
                dt[rowCount][2] = rs.getString("description");
                dt[rowCount][3] = rs.getString("created_at");
                dt[rowCount][4] = rs.getString("amount");

                rowCount++;
            }
            String[] columnName = {"S.No", "Category", "Description", "Date", "Amount"};

            DefaultTableModel dtm = new DefaultTableModel(dt, columnName) {

                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

            DetailsTable.setModel(dtm);

            con.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(this, "MYSQL ERROR: " + e);
        }

    }//GEN-LAST:event_ViewButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainTestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainTestScreen().setVisible(true);
            }
        });
    }

    private javax.swing.JComboBox<String> ChooseCategoryComboBox;
    private javax.swing.JComboBox<String> ComboBoxCategorySelect;
    private javax.swing.JTable DetailsTable;
    private javax.swing.JTextField EndDateTextField;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JTabbedPane MainTabbedPane;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField StartDateTextField;
    private javax.swing.JTextArea TextAreaDescription;
    private javax.swing.JTextField TextFieldAmount;
    private javax.swing.JButton ViewButton;
    private javax.swing.JPanel ViewPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
