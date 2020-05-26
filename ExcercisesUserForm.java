package e_ergasies;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
        
public class ExcercisesUserForm extends javax.swing.JFrame 
{
    String username,password;
    int pos;
    
    public ExcercisesUserForm(String username,String password) 
    {
        initComponents();
        txtarxi.setText(username);
        txtarxi2.setText(username);
        this.username=username;
        this.password=password;
        addRowToJTable();
        addRowToJTable2();
    }
    
    
    public void addRowToJTable()
    {
       DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
       jTable1.setAutoCreateRowSorter(true);

       for (int i=0;i<e_ergasies.users.size();i++)
       {
           if (e_ergasies.users.get(i).username.compareTo(username)==0 && e_ergasies.users.get(i).password.compareTo(password)==0)
           {
               pos=i;
           }
           else
           {
                System.out.println("e_ergasies.users.get(i).username==username "+e_ergasies.users.get(i).username+" usernname-"+username);
                System.out.println("e_ergasies.users.get(i).password "+e_ergasies.users.get(i).password+" password-"+password);
           }
       }

       ArrayList <Excercise> list=e_ergasies.users.get(pos).ListExercsisesviewed();
       Object rowData[]=new Object[6];

       for (int i=0; i<e_ergasies.users.size();i++)
       {
            if (pos==i)
                for (int j=0; j<e_ergasies.users.get(i).exercisesviewed.size();j++)
                 {
                    rowData[0]=list.get(j).exercisecode;
                    rowData[1]=list.get(j).pages;
                    rowData[2]=list.get(j).theme;
                    rowData[3]=list.get(j).category;       
                    rowData[4]=list.get(j).free_of_charge;
                    rowData[5]=list.get(j).exercost;

                    model.addRow(rowData);
                }
       }
    }
    
    public void addRowToJTable2()
    {
       DefaultTableModel model= (DefaultTableModel) jTable2.getModel();
       jTable2.setAutoCreateRowSorter(true);

       for (int i=0;i<e_ergasies.users.size();i++)
       {
           if (e_ergasies.users.get(i).username.compareTo(username)==0 && e_ergasies.users.get(i).password.compareTo(password)==0)
           {
               pos=i;
           }
           else
           {
                System.out.println("e_ergasies.users.get(i).username==username "+e_ergasies.users.get(i).username+" usernname-"+username);
                System.out.println("e_ergasies.users.get(i).password "+e_ergasies.users.get(i).password+" password-"+password);
           }
       }

       ArrayList <Excercise> list=e_ergasies.users.get(pos).ListExercsisesdownloaded();
       Object rowData[]=new Object[6];

       for (int i=0; i<e_ergasies.users.size();i++)
       {
            if (pos==i)
                for (int j=0; j<e_ergasies.users.get(i).exercisesdownl.size();j++)
                 {
                    rowData[0]=list.get(j).exercisecode;
                    rowData[1]=list.get(j).pages;
                    rowData[2]=list.get(j).theme;
                    rowData[3]=list.get(j).category;       
                    rowData[4]=list.get(j).free_of_charge;
                    rowData[5]=list.get(j).exercost;

                    model.addRow(rowData);
                }
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtarxi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtarxi2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Excercises Viewed from User with Username:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ExerciseCode", "Theme", "Category", "Pages", "Payable", "Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtarxi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtarxi.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ExerciseCode", "Theme", "Category", "Pages", "Payable", "Cost"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Excercises Downloaded from User with Username:");

        txtarxi2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtarxi2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtarxi2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtarxi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    javax.swing.JTable getJTable1()
    {
        return jTable1;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtarxi;
    private javax.swing.JTextField txtarxi2;
    // End of variables declaration//GEN-END:variables

}
