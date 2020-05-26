package e_ergasies;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ExcercisesFormWriterUpload extends javax.swing.JFrame 
{
    String wusername,wpassword;
    int pos;
    
    public ExcercisesFormWriterUpload(String username,String password) 
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
   
   ArrayList <Excercise> list=e_ergasies.writers.get(pos).ListExercsisesuploaded();
   Object rowData[]=new Object[6];
 
   for (int i=0; i<e_ergasies.writers.size();i++)
   {
        if (pos==i)
            for (int j=0; j<e_ergasies.writers.get(i).exercisesuploaded.size();j++)
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtarxi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exer_Code", "Pages", "Category", "Theme", "Payable", "Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtarxi.setEditable(false);
        txtarxi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Exercises uploaded by Writer");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(48, 48, 48))
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
