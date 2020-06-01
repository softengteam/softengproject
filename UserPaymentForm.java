package e_ergasies;

public class UserPaymentForm extends javax.swing.JFrame 
{
    String username,passsword;
    int pos;
    
    public UserPaymentForm(String username,String passsword) 
    {
        initComponents();
        compute_payment(username);
        txtwarxi.setText(username);
    }
    
     void compute_payment(String username)
    {
      float sum1=0,sum2=0,sum3=0,sum4=0;
      
      for (int i=0; i<e_ergasies.users.size();i++)
       {
            if (pos==i)
            {
                for (int j=0; j<e_ergasies.users.get(i).projectsdownl.size();j++)
                    sum1+=e_ergasies.users.get(i).projectsdownl.get(j).projectcost;

                for (int j=0; j<e_ergasies.users.get(i).projectsviewed.size();j++)
                    sum2+=e_ergasies.users.get(i).projectsviewed.get(j).projectcost;

                 for (int j=0; j<e_ergasies.users.get(i).exercisesdownl.size();j++)
                    sum3+=e_ergasies.users.get(i).exercisesdownl.get(j).exercost;
                 
                 for (int j=0; j<e_ergasies.users.get(i).exercisesviewed.size();j++)
                    sum4+=e_ergasies.users.get(i).exercisesviewed.get(j).exercost;
                 
                txtprojviewpay.setText(Float.toString(sum2));
                txtprojdownpay.setText(Float.toString(sum1));
                txtviewexerpay.setText(Float.toString(sum4));
                txtdownexerpay.setText(Float.toString(sum3));
                
                txtpayment.setText(Float.toString((sum1+sum2+sum3+sum4)));
            }
       }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtwarxi = new javax.swing.JTextField();
        txtpayment = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtviewexerpay = new javax.swing.JTextField();
        txtprojviewpay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtprojdownpay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdownexerpay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Total Payment for User");

        txtwarxi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtwarxi.setEnabled(false);

        txtpayment.setEditable(false);
        txtpayment.setBackground(new java.awt.Color(255, 255, 204));
        txtpayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpayment.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User Payment for Viewed Exercises");

        txtviewexerpay.setEditable(false);
        txtviewexerpay.setBackground(new java.awt.Color(255, 255, 204));
        txtviewexerpay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtviewexerpay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtviewexerpay.setEnabled(false);

        txtprojviewpay.setEditable(false);
        txtprojviewpay.setBackground(new java.awt.Color(255, 255, 204));
        txtprojviewpay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtprojviewpay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprojviewpay.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Payment for Viewed Projects");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("User Payment for Downloaded Projects");

        txtprojdownpay.setEditable(false);
        txtprojdownpay.setBackground(new java.awt.Color(255, 255, 204));
        txtprojdownpay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtprojdownpay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprojdownpay.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("User Payment for Downloaded Exercises");

        txtdownexerpay.setEditable(false);
        txtdownexerpay.setBackground(new java.awt.Color(255, 255, 204));
        txtdownexerpay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdownexerpay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdownexerpay.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtwarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(txtpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprojviewpay, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtviewexerpay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprojdownpay, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdownexerpay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtwarxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtviewexerpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdownexerpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprojdownpay, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprojviewpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtdownexerpay;
    private javax.swing.JTextField txtpayment;
    private javax.swing.JTextField txtprojdownpay;
    private javax.swing.JTextField txtprojviewpay;
    private javax.swing.JTextField txtviewexerpay;
    private javax.swing.JTextField txtwarxi;
    // End of variables declaration//GEN-END:variables
}
