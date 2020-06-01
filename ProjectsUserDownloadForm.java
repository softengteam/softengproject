package e_ergasies;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ProjectsUserDownloadForm extends javax.swing.JFrame 
{
    String username,password;
    int pos;
    
    public ProjectsUserDownloadForm(String username,String password)
    {
        initComponents();
        txtarxi.setText(username);
        txtarxi11.setText(username);
        this.username=username;
        this.password=password;
        addRowToJTable();
        addRowToJTable2();
    }
   
     public void addRowToJTable()
     {
         DefaultTableModel model= (DefaultTableModel) jTable11.getModel();

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

        ArrayList <Project> list=e_ergasies.users.get(pos).projectsdownl;
        Object rowData[]=new Object[10];

        for (int i=0; i<e_ergasies.users.size();i++)
        {
             if (pos==i)
                 for (int j=0; j<e_ergasies.users.get(i).projectsdownl.size();j++)
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
     
   public void addRowToJTable2()
   {
    DefaultTableModel model= (DefaultTableModel) jTable12.getModel();

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
  
   ArrayList <Project> list=e_ergasies.users.get(pos).projectsviewed;
   Object rowData[]=new Object[10];
 
   for (int i=0; i<e_ergasies.users.size();i++)
   {
        if (pos==i)
            for (int j=0; j<e_ergasies.users.get(i).projectsviewed.size();j++)
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        txtarxi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtarxi11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Downloaded Projects  from User");

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project Code", "LOC", "Theme", "Category", "Free Of Charge", "Upload Date", "Cost", "Time_Limited", "Project_Size", "Expires"
            }
        ));
        jScrollPane1.setViewportView(jTable11);

        txtarxi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtarxi.setForeground(new java.awt.Color(255, 0, 0));
        txtarxi.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project Code", "LOC", "Theme", "Category", "Free Of Charge", "Upload Date", "Cost", "Time_Limited", "Project_Size", "Expires"
            }
        ));
        jScrollPane2.setViewportView(jTable12);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Viewed Projects  from User");

        txtarxi11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtarxi11.setForeground(new java.awt.Color(255, 0, 0));
        txtarxi11.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(txtarxi11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtarxi11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTextField txtarxi;
    private javax.swing.JTextField txtarxi11;
    // End of variables declaration//GEN-END:variables
   
    javax.swing.JTable getJTable1()
    {
        return jTable11;
    }

}
