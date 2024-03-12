
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;


public class NurseDetails extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
   
    public NurseDetails() {
        initComponents();
    }
private void Reset()
{
    txtId.setText("");
    txtName.setText("");
    txtContact.setText("");
    txtAdd.setText("");
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    txtId.requestDefaultFocus();
}
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(16, 42, 61, 13);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(16, 75, 61, 13);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(16, 104, 61, 13);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(16, 133, 67, 13);
        txtId = new javax.swing.JTextField();
        txtId.setBounds(87, 37, 158, 23);
        txtName = new javax.swing.JTextField();
        txtName.setBounds(87, 64, 158, 33);
        txtAdd = new javax.swing.JTextField();
        txtAdd.setBounds(87, 101, 158, 28);
        txtContact = new javax.swing.JTextField();
        txtContact.setBounds(87, 133, 158, 28);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBounds(146, 329, 2, 2);
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnSave.setBackground(new Color(255, 222, 173));
        btnNew = new javax.swing.JButton();
        btnNew.setBackground(new Color(144, 238, 144));
        btnUpdate = new javax.swing.JButton();
        btnUpdate.setBackground(new Color(250, 250, 210));
        btnDelete = new javax.swing.JButton();
        btnDelete.setBackground(new Color(255, 192, 203));
        btnGetData = new javax.swing.JButton();
        btnGetData.setBackground(new Color(176, 224, 230));

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nurse Detail's"));

        jLabel1.setText("Nurse ID");

        jLabel2.setText("Name");

        jLabel4.setText("Address");

        jLabel5.setText("Contact No.");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnGetData.setText("GetData");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnGetData)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(20))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(147)
        					.addComponent(jPanel1, 0, 0, Short.MAX_VALUE))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(123)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel5);
        jPanel1.add(jScrollPane1);
        jPanel1.add(txtContact);
        jPanel1.add(txtAdd);
        jPanel1.add(txtName);
        jPanel1.add(txtId);
        getContentPane().setLayout(layout);

        pack();
    }

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
    Reset();       
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
try{
            con=Connect.ConnectDB();
            if (txtId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter nurse id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter nurse name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtAdd.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtContact.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter contact no.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
           
          
   Statement stmt;
       stmt= con.createStatement();
       String sql1="Select NurseID from nurse where NurseID= '" + txtId.getText() + "'";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Nurse ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtId.setText("");
        txtId.requestDefaultFocus();
       return;
      }
            String sql= "insert into nurse(NurseID,Nursename,ContactNo,Address)values('"+ txtId.getText() + "','"+ txtName.getText() + "','"+ txtContact.getText() + "','" + txtAdd.getText() + "')";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Registered","Nurse",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
                                          

    }

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {
this.hide();
PatientRec frm=new PatientRec();
frm.setVisible(true);       
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            con=Connect.ConnectDB();
            String sql= "update nurse set Nursename='"+ txtName.getText() + "',ContactNo='"+ txtContact.getText() + "',Address='" + txtAdd.getText() + "' where NurseID='" + txtId.getText() + "'";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }        
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from nurse where NurseID = '" + txtId.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }      
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {
   
             ;
    }

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnGetData;
    public javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtAdd;
    public javax.swing.JTextField txtContact;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtName;
}