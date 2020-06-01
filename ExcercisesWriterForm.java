
package e_ergasies;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.WindowConstants;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JOptionPane;
public class ExcercisesWriterForm extends javax.swing.JFrame 
{
   String  wusername,wpassword;
   int pos;
    
   public ExcercisesWriterForm(String wusername,String wpassword) 
   {
        initComponents();
        this.wusername=wusername;
        this.wpassword=wpassword;
        txtwarxi.setText(wusername);
        addRowToJTable();
        
    }
    
public void addRowToJTable()
{
   ExcercisesUserForm exfr=new ExcercisesUserForm("","");
   DefaultTableModel model= (DefaultTableModel) exfr.getJTable1().getModel();
   
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
   Object rowData[]=new Object[9];
 
   for (int i=0; i<e_ergasies.writers.size();i++)
   {
        if (pos==i)
            for (int j=0; j<e_ergasies.writers.get(i).exercisesuploaded.size();j++)
             {
                rowData[0]=list.get(j).exercisecode;
                rowData[1]=list.get(j).pages;
                rowData[2]=list.get(j).theme;
                rowData[3]=list.get(j).category;
                if (chkdorean.isEnabled()==true)
                    list.get(j).setFree_of_charge(true);
                else
                     list.get(j).setFree_of_charge(false);
                
                rowData[4]=list.get(j).free_of_charge;
                rowData[5]=list.get(j).exercost;
                
                rowData[6]=list.get(j).time_limited;
                rowData[7]=list.get(j).exercise_size;
                rowData[8]=list.get(j).expires;
                
                
                model.addRow(rowData);
            }
   }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txttheme = new javax.swing.JTextField();
        txtcategory = new javax.swing.JTextField();
        txtpages = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtwarxi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtcost = new javax.swing.JTextField();
        chkdorean = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtsize = new javax.swing.JTextField();
        chkdorean1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtenduse = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Κωδικός");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Θέμα");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Κατηγορία");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Σελίδες");

        txtcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txttheme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtcategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtpages.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Excercise Upload from Writer with Username:");

        txtwarxi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtwarxi.setEnabled(false);
        txtwarxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwarxiActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Κόστος");

        chkdorean.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkdorean.setText("Δωρεάν");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Μέγεθος (KB)");

        chkdorean1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkdorean1.setText("Χρήση για Περιορισμένο Χρονικό Διάστημα");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Λήξη");

        txtenduse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 184, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtwarxi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtsize, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(chkdorean)
                                            .addGap(52, 52, 52)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtcost, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtpages, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txttheme, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcategory))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(chkdorean1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtenduse, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtwarxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkdorean)
                            .addComponent(chkdorean1)
                            .addComponent(jLabel9)
                            .addComponent(txtenduse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtwarxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwarxiActionPerformed
        
    }//GEN-LAST:event_txtwarxiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        Excercise newexer=new Excercise();
        if (Integer.parseInt(txtsize.getText())>5000)
        {
            JOptionPane.showMessageDialog(null,"Υπέρβαση Ορίου Μεγεθους 5000 ΚBytes. H Εργασία δεν μπορεί να ανέβει");
            System.exit(0);
        }
        //Excercise(int exercisecode, int pages, String theme, String category,boolean free_of_charge,float exercost,boolean time_limited,int exercise_size,String expires) 
        if (chkdorean.isSelected()==true && chkdorean1.isSelected()==true)
        {
            newexer=new Excercise(Integer.parseInt(txtcode.getText()),Integer.parseInt(txtpages.getText()),txttheme.getText(),txtcategory.getText(),true,Float.parseFloat(txtcost.getText()),true,Integer.parseInt(txtsize.getText()),txtenduse.getText());
            e_ergasies.excercises.add(newexer);
        }
        
        if (chkdorean.isSelected()==true && chkdorean1.isSelected()==false)
        {
            newexer=new Excercise(Integer.parseInt(txtcode.getText()),Integer.parseInt(txtpages.getText()),txttheme.getText(),txtcategory.getText(),true,Float.parseFloat(txtcost.getText()),false,Integer.parseInt(txtsize.getText()),txtenduse.getText());
            e_ergasies.excercises.add(newexer);
        }
        
        if (chkdorean.isSelected()==false && chkdorean1.isSelected()==true)
        {
            newexer=new Excercise(Integer.parseInt(txtcode.getText()),Integer.parseInt(txtpages.getText()),txttheme.getText(),txtcategory.getText(),false,Float.parseFloat(txtcost.getText()),true,Integer.parseInt(txtsize.getText()),txtenduse.getText());
            e_ergasies.excercises.add(newexer);
        }
        
        if (chkdorean.isSelected()==false && chkdorean1.isSelected()==false)
        {
            newexer=new Excercise(Integer.parseInt(txtcode.getText()),Integer.parseInt(txtpages.getText()),txttheme.getText(),txtcategory.getText(),false,Float.parseFloat(txtcost.getText()),false,Integer.parseInt(txtsize.getText()),txtenduse.getText());
            e_ergasies.excercises.add(newexer);
        }
            
        for (int i=0;i<e_ergasies.writers.size();i++)
             if (e_ergasies.writers.get(i).username.compareTo(wusername)==0 && e_ergasies.writers.get(i).password.compareTo(wpassword)==0)
             {
                     e_ergasies.writers.get(i).exercisesuploaded.add(newexer);
                     break;
              }
         
         dispose();
         new ExcercisesFormWriterUpload(wusername,wpassword).setVisible(true);     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         dispose();  
         new SecondFormWriter(wusername,wpassword).setVisible(true); 
    }//GEN-LAST:event_jButton2ActionPerformed
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkdorean;
    private javax.swing.JCheckBox chkdorean1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtcost;
    private javax.swing.JTextField txtenduse;
    private javax.swing.JTextField txtpages;
    private javax.swing.JTextField txtsize;
    private javax.swing.JTextField txttheme;
    private javax.swing.JTextField txtwarxi;
    // End of variables declaration//GEN-END:variables
}
