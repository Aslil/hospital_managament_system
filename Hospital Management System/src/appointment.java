
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

public class appointment extends javax.swing.JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;

	public appointment() {
		initComponents();
	}

	private void Reset() {
		txtId.setText("");
		txtdocName.setText("");
		txtDate.setText("");
		txtSpec.setText("");
		btnSave.setEnabled(true);
		btnUpdate.setEnabled(false);
		btnDelete.setEnabled(false);
		txtId.requestDefaultFocus();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(39, 67, 79, 13);
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setBounds(39, 100, 79, 13);
		jLabel4 = new javax.swing.JLabel();
		jLabel4.setBounds(39, 129, 79, 13);
		jLabel5 = new javax.swing.JLabel();
		jLabel5.setBounds(39, 158, 79, 13);
		txtId = new javax.swing.JTextField();
		txtId.setBounds(119, 64, 146, 23);
		txtdocName = new javax.swing.JTextField();
		txtdocName.setBounds(119, 97, 146, 23);
		txtSpec = new javax.swing.JTextField();
		txtSpec.setBounds(119, 126, 146, 23);
		txtDate = new javax.swing.JTextField();
		txtDate.setBounds(119, 155, 146, 36);
		jScrollPane1 = new javax.swing.JScrollPane();
		jScrollPane1.setBounds(178, 354, 2, 2);
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

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Detail's"));

		jLabel1.setText("Patient ID");

		jLabel2.setText("DoctorName");

		jLabel4.setText("Specialization");

		jLabel5.setText("Date");

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		btnSave.setText("Get Appointment");
		btnSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSaveActionPerformed(evt);
			}
		});

		btnNew.setText("New Appointment");
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
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(43, 43, 43)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
						.addContainerGap(18, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(btnSave)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btnNew)
						.addGap(18, 18, 18).addComponent(btnUpdate).addGap(18, 18, 18).addComponent(btnDelete)
						.addGap(18, 18, 18).addComponent(btnGetData).addContainerGap(34, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
				.addGap(147)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jPanel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
						.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
				.addGap(152)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
				.addContainerGap(28, Short.MAX_VALUE)
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(47)));
		jPanel1.setLayout(null);
		jPanel1.add(jLabel1);
		jPanel1.add(jLabel2);
		jPanel1.add(jLabel4);
		jPanel1.add(jLabel5);
		jPanel1.add(jScrollPane1);
		jPanel1.add(txtDate);
		jPanel1.add(txtSpec);
		jPanel1.add(txtdocName);
		jPanel1.add(txtId);
		getContentPane().setLayout(layout);

		pack();
	}

	private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
		Reset();
	}

	private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			con = Connect.ConnectDB();
			if (txtId.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter patient id", "Error", JOptionPane.ERROR_MESSAGE);
				return;

			}
			if (txtdocName.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter doctor name", "Error", JOptionPane.ERROR_MESSAGE);
				return;

			}
			if (txtSpec.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter specialization", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (txtDate.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter date.", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			Statement stmt;
			stmt = con.createStatement();
			String sql1 = "Select PatientID from appointment where PatientID= '" + txtId.getText() + "'";
			rs = stmt.executeQuery(sql1);
			if (rs.next()) {
				JOptionPane.showMessageDialog(this, "Patient ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
				txtId.setText("");
				txtId.requestDefaultFocus();
				return;
			}
			String sql = "insert into appointment (PatientID,docName,Date,Spec)values('" + txtId.getText() + "','"
					+ txtdocName.getText() + "','" + txtDate.getText() + "','" + txtSpec.getText() + "')";

			pst = con.prepareStatement(sql);
			pst.execute();
			JOptionPane.showMessageDialog(this, "Successfully Appointed", "Patient", JOptionPane.INFORMATION_MESSAGE);
			btnSave.setEnabled(false);

		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}

	}

	private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {
		this.hide();
		PatientRec frm = new PatientRec();
		frm.setVisible(true);
	}

	private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			con = Connect.ConnectDB();
			String sql = "update appointment set docName='" + txtdocName.getText() + "',Date='" + txtDate.getText()
					+ "',Spec='" + txtSpec.getText() + "' where PatientID='" + txtId.getText() + "'";
			pst = con.prepareStatement(sql);
			pst.execute();
			JOptionPane.showMessageDialog(this, "Successfully updated", "Record", JOptionPane.INFORMATION_MESSAGE);
			btnUpdate.setEnabled(false);

		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}
	}

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			int P = JOptionPane.showConfirmDialog(null, " Are you sure want to delete ?", "Confirmation",
					JOptionPane.YES_NO_OPTION);
			if (P == 0) {
				con = Connect.ConnectDB();
				String sql = "delete from appointment where PatientID = '" + txtId.getText() + "'";
				pst = con.prepareStatement(sql);
				pst.execute();
				JOptionPane.showMessageDialog(this, "Successfully deleted", "Record", JOptionPane.INFORMATION_MESSAGE);

				Reset();
			}
		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
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
			java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new appointment().setVisible(true);
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
	public javax.swing.JTextField txtSpec;
	public javax.swing.JTextField txtDate;
	public javax.swing.JTextField txtId;
	public javax.swing.JTextField txtdocName;
}