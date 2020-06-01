package e_ergasies;

public class ProjectFormDelete extends javax.swing.JFrame 
{
    String wusername, wpassword;
    int pos;
    
    public ProjectFormDelete(String wusername, String wpassword)
    {
        initComponents();
        txtwarxi.setText(wusername);
        this.wusername=wusername;
        this.wpassword=wpassword;
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
                          e_ergasies.writers.get(i).projectsuploaded.remove(j);
                           break;
                    }
            }
            else
            {
                 System.out.println("e_ergasies.writers.get(i).username==username "+e_ergasies.writers.get(i).username+" usernname-"+wusername);
                 System.out.println("e_ergasies.writers.get(i).password "+e_ergasies.writers.get(i).password+" password-"+wpassword);
            }
        }
        
        dispose();
        new ProjectsFormWriterUpload(wusername,wpassword).setVisible(true);
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        txtexerdelete = new javax.swing.JTextField();
        txtwarxi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Project Deletion from Writer with username");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter Project Code to Delete");

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        txtwarxi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtwarxi.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(btndelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(txtwarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtexerdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtwarxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtexerdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addComponent(btndelete)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        search(wusername, wpassword, Integer.parseInt(txtexerdelete.getText()));
    }//GEN-LAST:event_btndeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtexerdelete;
    private javax.swing.JTextField txtwarxi;
    // End of variables declaration//GEN-END:variables
}
