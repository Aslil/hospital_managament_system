
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class PatientRec extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
 
    public PatientRec() {
        initComponents();
        con= Connect.ConnectDB();
        Get_Data();
    }
private void Get_Data(){
           String sql="select PatientID as 'Patient ID', PatientName as 'Patient Name',Address,ContactNo as 'Contact No', from patientregistration";
           try{
                pst=con.prepareStatement(sql);
                rs= pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PatientID", "PatientName", "ContactNo", "Adress"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        pack();
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        try{
            con=Connect.ConnectDB();
            int row= jTable1.getSelectedRow();
            String table_click= jTable1.getModel().getValueAt(row, 0).toString();
            String sql= "select * from PatientRegistration where PatientID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
                this.hide();
                registration frm = new registration();
                frm.setVisible(true);
                String add1=rs.getString("PatientID");
                frm.txtId.setText(add1);
                String add2=rs.getString("Patientname");
                frm.txtName.setText(add2);
                String add15=rs.getString("Address");
                frm.txtAdd.setText(add15);
                String add16=rs.getString("ContactNo");
                frm.txtContact.setText(add16);
                frm.btnUpdate.setEnabled(true);
                frm.btnDelete.setEnabled(true);
                frm.btnSave.setEnabled(false);
             
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }        
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {

     
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
            java.util.logging.Logger.getLogger(PatientRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRec().setVisible(true);
            }
        });
    }

    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
}