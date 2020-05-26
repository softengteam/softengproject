package e_ergasies;

public class ExcerciseFormModify extends javax.swing.JFrame 
{
    String wusername, wpassword;
    int pos;
    
    public ExcerciseFormModify(String wusername, String wpassword)
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
                System.out.println("Found writer in Pos "+i);
                pos=i;
                
                for (int j=0;j<e_ergasies.writers.get(i).exercisesuploaded.size();j++)
                    if (e_ergasies.writers.get(i).exercisesuploaded.get(j).exercisecode==code)
                    {   
                        System.out.println("Found exercise in Pos "+j);
                        new ExcercisesWriterForm2(wusername,wusername,e_ergasies.writers.get(i).ListExercsisesuploaded().get(j).category,e_ergasies.writers.get(i).ListExercsisesuploaded().get(j).theme,e_ergasies.writers.get(i).ListExercsisesuploaded().get(j).pages,e_ergasies.writers.get(i).ListExercsisesuploaded().get(j).exercisecode,e_ergasies.writers.get(i).ListExercsisesuploaded().get(j).free_of_charge,e_ergasies.writers.get(i).ListExercsisesuploaded().get(j).exercost).setVisible(true);
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

        txtexercode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtarxi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter Excercise Code to Modify");

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Excercise Modification by Writer");

        txtarxi.setEditable(false);
        txtarxi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(btnsearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtexercode, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtarxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtexercode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addComponent(btnsearch)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        search(wusername, wpassword, Integer.parseInt(txtexercode.getText()));
    }//GEN-LAST:event_btnsearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtarxi;
    private javax.swing.JTextField txtexercode;
    // End of variables declaration//GEN-END:variables
}
