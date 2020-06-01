
package e_ergasies;

public class ProjectFormModify extends javax.swing.JFrame 
{
     String wusername, wpassword;
    int pos;
    
    public ProjectFormModify(String wusername, String wpassword) 
    {
        initComponents();
        this.wusername=wusername;
        this.wpassword=wpassword;
        txtarxi.setText(wusername);
    }
    
     void search(String wusername, String wpassword,int code)
     {
         for (int i=0;i<e_ergasies.writers.size();i++)
        {
            if (e_ergasies.writers.get(i).username.compareTo(wusername)==0 && e_ergasies.writers.get(i).password.compareTo(wpassword)==0)
            {
                pos=i;
                
                for (int j=0;j<e_ergasies.writers.get(i).projectsuploaded.size();j++)
                    if (e_ergasies.writers.get(i).projectsuploaded.get(j).pcode==code)
                    {   
                        new ProjectsWriterForm2(wusername,wusername,e_ergasies.writers.get(i).ListProjectsuploaded().get(j).category,e_ergasies.writers.get(i).ListProjectsuploaded().get(j).theme,e_ergasies.writers.get(i).ListProjectsuploaded().get(j).loc,e_ergasies.writers.get(i).ListProjectsuploaded().get(j).free_of_charge,e_ergasies.writers.get(i).ListProjectsuploaded().get(j).datetim,e_ergasies.writers.get(i).ListProjectsuploaded().get(j).pcode,e_ergasies.writers.get(i).ListProjectsuploaded().get(j).projectcost).setVisible(true);
                        break;
                    }
            }
            else
            {
                 System.out.println("e_ergasies.writers.get(i).username==username "+e_ergasies.writers.get(i).username+" usernname-"+wusername);
                 System.out.println("e_ergasies.writers.get(i).password "+e_ergasies.writers.get(i).password+" password-"+wpassword);
            }
        }
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtprojectcode = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtarxi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter Project Code to Modify");

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Project Modification by Writer");

        txtarxi.setEditable(false);
        txtarxi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprojectcode, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtprojectcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnsearch)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        search(wusername, wpassword, Integer.parseInt(txtprojectcode.getText()));
    }//GEN-LAST:event_btnsearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtarxi;
    private javax.swing.JTextField txtprojectcode;
    // End of variables declaration//GEN-END:variables
}
