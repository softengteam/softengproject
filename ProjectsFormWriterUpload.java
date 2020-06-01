package e_ergasies;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ProjectsFormWriterUpload extends javax.swing.JFrame 
{
    String wusername,wpassword;
    int pos;
    
    public ProjectsFormWriterUpload(String username,String password) 
    {
        initComponents();
        txtarxi.setText(username);
        this.wusername=username;
        this.wpassword=password;
        addRowToJTable();
       
    }
       
    public void addRowToJTable()
    {
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();

       for (int i=0;i<e_ergasies.writers.size();i++)
       {
           if (e_ergasies.writers.get(i).username.compareTo(wusername)==0 && e_ergasies.writers.get(i).password.compareTo(wpassword)==0)
           {
               pos=i;
           }
           else
           {
                System.out.println("e_ergasies.writers.get(i).username==username "+e_ergasies.writers.get(i).username+" usernname-"+wusername);
                System.out.println("e_ergasies.writers.get(i).password "+e_ergasies.writers.get(i).password+" password-"+wpassword);
           }
       }

       ArrayList <Project> list=e_ergasies.writers.get(pos).ListProjectsuploaded();
       Object rowData[]=new Object[10];

       for (int i=0; i<e_ergasies.writers.size();i++)
       {
            if (pos==i)
            {  
                for (int j=0; j<e_ergasies.writers.get(i).projectsuploaded.size();j++)
                 {
                    rowData[0]=list.get(j).pcode;
                    rowData[1]=list.get(j).loc;
                    rowData[2]=list.get(j).theme;
                    rowData[3]=list.get(j).category;
                    rowData[4]=list.get(j).free_of_charge;
                    rowData[5]=list.get(j).datetim;
                    rowData[6]=list.get(j).projectcost;
                    rowData[7]=list.get(j).time_limited;
                    rowData[8]=list.get(j).project_size;
                    rowData[9]=list.get(j).expires;
                  
                    model.addRow(rowData);

                }
            }
       }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtarxi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProjectCode", "LOC", "Theme", "Category", "Free Of Charge", "Upload Date", "Cost", "Time_Limited", "Exercise_Size", "Expires"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Projects Upload from Writer");

        txtarxi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtarxi.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(337, 337, 337)
                                .addComponent(jButton1)))
                        .addGap(0, 358, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose(); 
       new SecondFormWriter(wusername,wpassword).setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtarxi;
    // End of variables declaration//GEN-END:variables
}
