
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// The table is used to show the user the necessary information that is stored in the database. Which will be able to click on and then view/change the information at the text box bottom left
public class ManageEmployees extends javax.swing.JFrame {

    /**
     * Creates new form ManageProjects
     */
    public ManageEmployees() {
        initComponents();
        show_User();
        activeEmployeesPanel.setVisible(false);
        addEmployeesPanel.setVisible(false);
        searchEmployeePanel.setVisible(false);
        //showDefaultValue();

    }

    boolean addEmp = false;
    boolean activeEmp = false;
    boolean activeSearch = false;
    ResultSet rs;
    Connection con;
    Statement stmnt;

    public ArrayList<User> userList() {
        ArrayList<User> usersList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // making a connection with the mysql database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chopGui?useSSL=false", "root", "andrew01");
            stmnt = con.createStatement();
            String query1 = "SELECT * FROM Employee";
            ResultSet rs = stmnt.executeQuery(query1);

            User user;
            while (rs.next()) {
                user = new User(rs.getInt("empID"), rs.getString("empRole"), rs.getString("empName"), rs.getString("empSurN"), rs.getString("empConNum"), rs.getString("empEmail"));
                usersList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error " + e);
        }
        return usersList;
    }

    public void show_User() {
        ArrayList<User> list = userList();
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[6];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getEmpID();
            row[1] = list.get(i).getEmpRole();
            row[2] = list.get(i).getEmpName();
            row[3] = list.get(i).getEmpSurname();
            row[4] = list.get(i).getEmpConNum();
            row[5] = list.get(i).getEmpEmail();
            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        viewActiveEmployee = new javax.swing.JButton();
        activeEmployeesPanel = new javax.swing.JPanel();
        activeEmpSurname = new javax.swing.JTextField();
        activeEmpContactNo = new javax.swing.JTextField();
        activeEmpEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        activeEmpID = new javax.swing.JTextField();
        deleteEmpRec = new javax.swing.JButton();
        activeEmpName = new javax.swing.JTextField();
        lblempName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        activeEmpRole = new javax.swing.JTextField();
        addEmployee = new javax.swing.JButton();
        addEmployeesPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        empSurname = new javax.swing.JTextField();
        empContact = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        empEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        empIDNum = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        empName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        addEmployeeRecord = new javax.swing.JButton();
        cancelAddEmp = new javax.swing.JButton();
        empRole = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        searchEmployeePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        empNameSearch = new javax.swing.JTextField();
        searchEmployeeBtn = new javax.swing.JButton();
        resetSearch = new javax.swing.JButton();
        empSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 720));
        setSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "empID", "empRole", "empName", "empSurname", "empContNum", "empEmail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(261, 111, 699, 216);

        viewActiveEmployee.setText("View");
        viewActiveEmployee.setName("btnProjectView"); // NOI18N
        viewActiveEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActiveEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(viewActiveEmployee);
        viewActiveEmployee.setBounds(268, 330, 80, 32);

        activeEmployeesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Active Employees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24))); // NOI18N
        activeEmployeesPanel.setName("pnlActive"); // NOI18N

        activeEmpSurname.setName("tfieldClientName"); // NOI18N

        activeEmpContactNo.setName("tFieldtext\tContactPerson"); // NOI18N
        activeEmpContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeEmpContactNoActionPerformed(evt);
            }
        });

        jLabel5.setText("Email:");

        deleteEmpRec.setText("Delete");
        deleteEmpRec.setName("btnProjectDelete"); // NOI18N
        deleteEmpRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmpRecActionPerformed(evt);
            }
        });

        lblempName.setText("Employee Name:");

        jLabel13.setText("Employee Surname:");
        jLabel13.setName("lblClientName"); // NOI18N

        jLabel14.setText("Contact No:");
        jLabel14.setName("text\tlblContactPerson"); // NOI18N

        jLabel17.setText("ID No:");

        jLabel10.setText("Role:");

        javax.swing.GroupLayout activeEmployeesPanelLayout = new javax.swing.GroupLayout(activeEmployeesPanel);
        activeEmployeesPanel.setLayout(activeEmployeesPanelLayout);
        activeEmployeesPanelLayout.setHorizontalGroup(
            activeEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeEmployeesPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(activeEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activeEmpContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblempName)
                    .addComponent(activeEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(59, 59, 59)
                .addGroup(activeEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activeEmpSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activeEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addGap(52, 52, 52)
                .addGroup(activeEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(activeEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activeEmpRole, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activeEmployeesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteEmpRec)
                .addGap(43, 43, 43))
        );
        activeEmployeesPanelLayout.setVerticalGroup(
            activeEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeEmployeesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(activeEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(activeEmployeesPanelLayout.createSequentialGroup()
                        .addComponent(lblempName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activeEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activeEmpContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(activeEmployeesPanelLayout.createSequentialGroup()
                        .addGroup(activeEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(activeEmployeesPanelLayout.createSequentialGroup()
                                .addGroup(activeEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activeEmpSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(activeEmployeesPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(activeEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(activeEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(activeEmployeesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activeEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(activeEmployeesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activeEmpRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36)
                .addComponent(deleteEmpRec)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        activeEmpSurname.getAccessibleContext().setAccessibleDescription("");
        activeEmpContactNo.getAccessibleContext().setAccessibleDescription("");
        activeEmpEmail.getAccessibleContext().setAccessibleDescription("");
        jLabel5.getAccessibleContext().setAccessibleDescription("");
        activeEmpID.getAccessibleContext().setAccessibleDescription("");
        activeEmpName.getAccessibleContext().setAccessibleDescription("");
        lblempName.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(activeEmployeesPanel);
        activeEmployeesPanel.setBounds(80, 360, 530, 290);

        addEmployee.setText("Add");
        addEmployee.setName("btnAdd"); // NOI18N
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(addEmployee);
        addEmployee.setBounds(360, 330, 70, 32);

        addEmployeesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jLabel11.setText("Employee Surname:");
        jLabel11.setName("lblClientName"); // NOI18N

        empSurname.setName("tfieldClientName"); // NOI18N

        empContact.setName("tFieldtext\tContactPerson"); // NOI18N
        empContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empContactActionPerformed(evt);
            }
        });

        jLabel12.setText("Contact No:");
        jLabel12.setName("text\tlblContactPerson"); // NOI18N

        jLabel15.setText("Email:");

        jLabel16.setText("ID No:");

        jLabel19.setText("Employee Name:");

        addEmployeeRecord.setText("Add");
        addEmployeeRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeRecordActionPerformed(evt);
            }
        });

        cancelAddEmp.setText("Cancel");
        cancelAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddEmpActionPerformed(evt);
            }
        });

        jLabel18.setText("Role:");

        javax.swing.GroupLayout addEmployeesPanelLayout = new javax.swing.GroupLayout(addEmployeesPanel);
        addEmployeesPanel.setLayout(addEmployeesPanelLayout);
        addEmployeesPanelLayout.setHorizontalGroup(
            addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                        .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empContact, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel19)
                            .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(empSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(70, 70, 70)
                        .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(empRole, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                        .addComponent(addEmployeeRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelAddEmp)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        addEmployeesPanelLayout.setVerticalGroup(
            addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                        .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addEmployeesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(addEmployeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmployeeRecord)
                    .addComponent(cancelAddEmp))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(addEmployeesPanel);
        addEmployeesPanel.setBounds(620, 360, 523, 290);

        jPanel5.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(180, 80, 831, 15);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sticker.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 10, 120, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paragraph@1x.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 30, 830, 50);

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(180, 80, 830, 15);

        jLabel1.setText("Employee Name:");

        empNameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameSearchActionPerformed(evt);
            }
        });

        searchEmployeeBtn.setText("Search");
        searchEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmployeeBtnActionPerformed(evt);
            }
        });

        resetSearch.setText("Reset");
        resetSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchEmployeePanelLayout = new javax.swing.GroupLayout(searchEmployeePanel);
        searchEmployeePanel.setLayout(searchEmployeePanelLayout);
        searchEmployeePanelLayout.setHorizontalGroup(
            searchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchEmployeePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(searchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchEmployeePanelLayout.createSequentialGroup()
                        .addComponent(searchEmployeeBtn)
                        .addGap(18, 18, 18)
                        .addComponent(resetSearch))
                    .addGroup(searchEmployeePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        searchEmployeePanelLayout.setVerticalGroup(
            searchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchEmployeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(empNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchEmployeeBtn)
                    .addComponent(resetSearch))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        getContentPane().add(searchEmployeePanel);
        searchEmployeePanel.setBounds(970, 120, 220, 220);

        empSearch.setText("Search");
        empSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empSearchActionPerformed(evt);
            }
        });
        getContentPane().add(empSearch);
        empSearch.setBounds(450, 330, 71, 32);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Installation of back up genators at Watershed in Waterfront 5.png"))); // NOI18N
        jLabel6.setText("jLabel5");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1200, 720);

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(activeEmployeesPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void viewActiveEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActiveEmployeeActionPerformed

        activeEmp = false;
        if (addEmp == false) {

            addEmployeesPanel.setVisible(false);
            activeEmployeesPanel.setVisible(true);
            addEmp = true;

        } else if (addEmp == true) {
            activeEmployeesPanel.setVisible(false);
            addEmp = false;
        }


    }//GEN-LAST:event_viewActiveEmployeeActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        addEmp = false;
        if (activeEmp == false) {
            activeEmployeesPanel.setVisible(false);
            addEmployeesPanel.setVisible(true);
            activeEmp = true;

        } else if (activeEmp == true) {
            addEmployeesPanel.setVisible(false);
            activeEmp = false;
        }
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void empContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empContactActionPerformed

    private void activeEmpContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeEmpContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activeEmpContactNoActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        Home hme = new Home();
        hme.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    public boolean testID(String empID) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher match = pattern.matcher(empID);
        boolean isValid = match.find();
        if (isValid) {
            return true;
        } else {
            return false;
        }
    }


    private void addEmployeeRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeRecordActionPerformed

        String empName = this.empName.getText();
        String empSurname = this.empSurname.getText();
        String empID = empIDNum.getText(); // make it a string (just gonna have to add validation to prevent users from entering letters)
        String empContactNum = empContact.getText();
        String empEmail = this.empEmail.getText();
        String empRole = this.empRole.getText();
        int contactNumSize = empContactNum.length();
        
        boolean empIDTest = testID(empID);
        
        if (!empName.isEmpty() || !empSurname.isEmpty() || !empContactNum.isEmpty() || !empEmail.isEmpty() || !empRole.isEmpty() || !empID.isEmpty()) {
            if (empEmail.contains("@") && empEmail.contains(".")) {
                if (contactNumSize >= 10 && contactNumSize <= 11) {
                    if (empIDTest == true) {
                        new Database().addEmpRecord(empName, empSurname, empID, empContactNum, empEmail, empRole);
                        addEmployeesPanel.setVisible(false);
                        viewEmpPage();
                    }else{
                        JOptionPane.showMessageDialog(null, "Please enter a valid ID number");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid contact number!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a valid email address!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill in all of the fields before proceeding to add an employee");
        }

    }//GEN-LAST:event_addEmployeeRecordActionPerformed

    private void cancelAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAddEmpActionPerformed
        empName.setText("");
        empSurname.setText("");
        empIDNum.setText("");
        empContact.setText("");
        empEmail.setText("");
        empRole.setText("");
    }//GEN-LAST:event_cancelAddEmpActionPerformed

    public void showDefaultValue() { // show first value that is stored in the table
        String query1 = "SELECT * FROM Employee";
        try {
            new Database();
            stmnt = con.prepareStatement(query1);
            rs = stmnt.executeQuery(query1);
            rs.next();
            activeEmpName.setText(rs.getString("empID"));
            activeEmpSurname.setText(rs.getString("empSurN"));
            activeEmpID.setText(rs.getString("empID"));
            activeEmpContactNo.setText(rs.getString("empConNum"));
            activeEmpEmail.setText(rs.getString("empEmail"));
            activeEmpRole.setText(rs.getString("empRole"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error at data retrieve " + e);
        }
    }


    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = jTable2.getSelectedRow();

        String selectionData = jTable2.getModel().getValueAt(row, 0).toString();
        String query1 = "SELECT * FROM Employee WHERE empID = " + selectionData;
        try {
            new Database();
            stmnt = con.prepareStatement(query1);
            rs = stmnt.executeQuery(query1);
            if (rs.next()) {
                activeEmpName.setText(rs.getString("empID"));
                activeEmpSurname.setText(rs.getString("empSurN"));
                activeEmpID.setText(rs.getString("empID"));
                activeEmpContactNo.setText(rs.getString("empConNum"));
                activeEmpEmail.setText(rs.getString("empEmail"));
                activeEmpRole.setText(rs.getString("empRole"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error at data retrieve " + e);
        }

    }//GEN-LAST:event_jTable2MouseClicked

    private void empNameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameSearchActionPerformed

    private void empSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSearchActionPerformed

        if (activeSearch == false) {

            searchEmployeePanel.setVisible(true);
            activeSearch = true;

        } else if (activeSearch == true) {
            searchEmployeePanel.setVisible(false);
            activeSearch = false;
        }
    }//GEN-LAST:event_empSearchActionPerformed
    public ArrayList<User> searchUserList() {
        ArrayList<User> usersList = new ArrayList<>();
        try {
            String searchName = empNameSearch.getText();
            Class.forName("com.mysql.cj.jdbc.Driver"); // making a connection with the mysql database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chopGui?useSSL=false", "root", "andrew01");
            stmnt = con.createStatement();

            String query1 = "SELECT * FROM Employee WHERE empName LIKE '%" + searchName + "'"
                    + "OR empName LIKE '" + searchName + "%'"
                    + "OR empName LIKE '%" + searchName + "%'";
            ResultSet rs = stmnt.executeQuery(query1);

            User user;
            while (rs.next()) {
                user = new User(rs.getInt("empID"), rs.getString("empRole"), rs.getString("empName"), rs.getString("empSurN"), rs.getString("empConNum"), rs.getString("empEmail"));
                usersList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error " + e);
        }
        return usersList;
    }

    public void showSearchedUser() {
        ArrayList<User> list = searchUserList();
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[6];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getEmpID();
            row[1] = list.get(i).getEmpRole();
            row[2] = list.get(i).getEmpName();
            row[3] = list.get(i).getEmpSurname();
            row[4] = list.get(i).getEmpConNum();
            row[5] = list.get(i).getEmpEmail();
            dtm.addRow(row);
        }
    }
    private void searchEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmployeeBtnActionPerformed
        showSearchedUser();

    }//GEN-LAST:event_searchEmployeeBtnActionPerformed

    private void resetSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetSearchActionPerformed
        empNameSearch.setText("");
        show_User();
    }//GEN-LAST:event_resetSearchActionPerformed

    public void viewEmpPage() {
        this.dispose();
        ManageEmployees mng = new ManageEmployees();
        mng.setVisible(true);
    }
    private void deleteEmpRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmpRecActionPerformed
        String empID = activeEmpID.getText();
        new Database().deleteEmployeeRecord(empID);
        JOptionPane.showMessageDialog(null, "Employee record has been removed from the database");
        viewEmpPage();
    }//GEN-LAST:event_deleteEmpRecActionPerformed

    private void showActiveEmpJobs() {

    }

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField activeEmpContactNo;
    private javax.swing.JTextField activeEmpEmail;
    private javax.swing.JTextField activeEmpID;
    private javax.swing.JTextField activeEmpName;
    private javax.swing.JTextField activeEmpRole;
    private javax.swing.JTextField activeEmpSurname;
    private javax.swing.JPanel activeEmployeesPanel;
    private javax.swing.JButton addEmployee;
    private javax.swing.JButton addEmployeeRecord;
    private javax.swing.JPanel addEmployeesPanel;
    private javax.swing.JButton cancelAddEmp;
    private javax.swing.JButton deleteEmpRec;
    private javax.swing.JTextField empContact;
    private javax.swing.JTextField empEmail;
    private javax.swing.JTextField empIDNum;
    private javax.swing.JTextField empName;
    private javax.swing.JTextField empNameSearch;
    private javax.swing.JTextField empRole;
    private javax.swing.JButton empSearch;
    private javax.swing.JTextField empSurname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblempName;
    private javax.swing.JButton resetSearch;
    private javax.swing.JButton searchEmployeeBtn;
    private javax.swing.JPanel searchEmployeePanel;
    private javax.swing.JButton viewActiveEmployee;
    // End of variables declaration//GEN-END:variables

}
