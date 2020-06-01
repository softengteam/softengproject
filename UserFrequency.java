
package e_ergasies;

import java.util.ArrayList;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.io.*;

public class UserFrequency extends javax.swing.JFrame 
{
    String username, password,datetim;
    int pos;
    Date date1,pddate1,pvdate1,eddate1,evdate1,currentdate = new Date();  
    
    public UserFrequency(String username, String password) 
    {
        initComponents();
        this.username=username;
        this.password=password;
        this.datetim=datetim;
    }
    
    void search(String username, String password,String datetim)
     {
        ArrayList <Project> projectsa=new ArrayList <Project>();
        ArrayList <Excercise> exercisea=new ArrayList <Excercise>();
        
        try 
        {
            date1=new SimpleDateFormat("dd/MM/yyyy").parse(datetim); 
        }
        catch(Exception e)
        {}
        //long interval = EndDate.getTime() - StartDate.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        
        System.out.println(formatter.format(currentdate));  
      
        for (int i=0;i<e_ergasies.users.size();i++)
        {
            if (e_ergasies.users.get(i).username.compareTo(username)==0 && e_ergasies.users.get(i).password.compareTo(password)==0)
            {
                pos=i;
                
                for (int j=0;j<e_ergasies.users.get(i).projectsdownl.size();j++)
                {
                    try
                    {
                        pddate1=new SimpleDateFormat("dd/MM/yyyy").parse(e_ergasies.users.get(i).projectsdownl.get(j).datetim); 
                    }
                    catch(Exception e)
                    {}
                     
                    if ((pddate1.compareTo(date1)>=0) && (pddate1.compareTo(currentdate)<=0))
                        projectsa.add(e_ergasies.users.get(i).projectsdownl.get(j));
                }
                
                for (int j=0;j<e_ergasies.users.get(i).projectsviewed.size();j++)
                {
                    try
                    {
                        pvdate1=new SimpleDateFormat("dd/MM/yyyy").parse(e_ergasies.users.get(i).projectsviewed.get(j).datetim); 
                    }
                    catch(Exception e)
                    {}
                      
                    if ((pvdate1.compareTo(date1)>=0) && (pvdate1.compareTo(currentdate)<=0))
                           projectsa.add(e_ergasies.users.get(i).projectsviewed.get(j));
                }
            }
           
        }
           new UserFrequency2(username,projectsa,datetim).setVisible(true);
     }

       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtdatetim = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Select Projects/Exercsises");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter Date");

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsearch)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdatetim, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdatetim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnsearch)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        search(username, password, txtdatetim.getText());
    }//GEN-LAST:event_btnsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtdatetim;
    // End of variables declaration//GEN-END:variables
}
