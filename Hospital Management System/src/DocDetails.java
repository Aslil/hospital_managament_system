
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Color;

public class DocDetails extends javax.swing.JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;

	public DocDetails() {
		initComponents();
	}

	private void reset() {
		txtId.setText("");
		txtName.setText("");
		txtC.setText("");
		txtS.setText("");
		cmbG.setSelectedIndex(-1);
		btnSave.setEnabled(true);
		btnUpdate.setEnabled(false);
		btnDelete.setEnabled(false);
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		txtId = new javax.swing.JTextField();
		txtName = new javax.swing.JTextField();
		txtC = new javax.swing.JTextField();
		txtS = new javax.swing.JTextField();
		cmbG = new javax.swing.JComboBox();
		cmbG.setBackground(new Color(230, 230, 250));
		jPanel2 = new javax.swing.JPanel();
		btnSave = new javax.swing.JButton();
		btnSave.setBackground(new Color(144, 238, 144));
		btnUpdate = new javax.swing.JButton();
		btnUpdate.setBackground(new Color(102, 205, 170));
		btnDelete = new javax.swing.JButton();
		btnDelete.setBackground(new Color(255, 192, 203));
		btnNew = new javax.swing.JButton();
		btnNew.setBackground(new Color(255, 222, 173));
		btnGet = new javax.swing.JButton();
		btnGet.setBackground(new Color(169, 169, 169));

		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Doctor Details"));

		jLabel1.setText("Doctor ID");

		jLabel2.setText("Name");

		jLabel5.setText("Contact no");

		jLabel7.setText("Specialty");

		jLabel9.setText("Gender");

		cmbG.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
												.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(18)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtC)
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(txtName, Alignment.LEADING).addComponent(txtId,
																Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134,
																Short.MAX_VALUE))))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(91)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(cmbG, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtS, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))))
								.addContainerGap(69, GroupLayout.PREFERRED_SIZE)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(20)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1).addComponent(
						txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2).addComponent(
						txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel5).addComponent(txtC,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(26)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel9).addComponent(cmbG,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel7).addComponent(txtS,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(242, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		btnSave.setText("Save");
		btnSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSaveActionPerformed(evt);
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

		btnNew.setText("New");
		btnNew.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNewActionPerformed(evt);
			}
		});

		btnGet.setText("Get Data");
		btnGet.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnGetActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(42, 42, 42)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnGet, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
						.addContainerGap(86, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(btnSave)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btnUpdate)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btnDelete)
						.addGap(18, 18, 18).addComponent(btnNew).addGap(18, 18, 18).addComponent(btnGet)
						.addContainerGap(32, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(167)
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(179, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addGap(113)
						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(138)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(37)
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(121, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed
		try {
			int P = JOptionPane.showConfirmDialog(null, " Are you sure want to delete ?", "Confirmation",
					JOptionPane.YES_NO_OPTION);
			if (P == 0) {
				con = Connect.ConnectDB();
				String sql = "delete from Doctor where doctor_id = '" + txtId.getText() + "'";
				pst = con.prepareStatement(sql);
				pst.execute();
				JOptionPane.showMessageDialog(this, "Successfully deleted", "Record", JOptionPane.INFORMATION_MESSAGE);

				reset();
			}
		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}
	}

	private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
		reset();
	}

	private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			con = Connect.ConnectDB();
			if (txtId.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter doctor id", "Error", JOptionPane.ERROR_MESSAGE);
				return;

			}
			if (txtName.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter doctor name", "Error", JOptionPane.ERROR_MESSAGE);
				return;

			}

			if (txtC.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter contact no.", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			if (txtS.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter specialty", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			if (cmbG.getSelectedItem().equals("")) {
				JOptionPane.showMessageDialog(this, "Please select gender", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			Statement stmt;
			stmt = con.createStatement();
			String sql1 = "Select doctor_id from Doctor where doctor_id= '" + txtId.getText() + "'"; // variable
																										// isimleri
																										// sqldekiyle
																										// aynı olmalı.
			rs = stmt.executeQuery(sql1);
			if (rs.next()) {
				JOptionPane.showMessageDialog(this, "Doctor ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
				txtId.setText("");

				return;
			}
			String sql = "insert into Doctor(doctor_id,Doctorname,ContacNo,Specialty,Gender)values('" + txtId.getText()
					+ "','" + txtName.getText() + "','" + txtC.getText() + "','" + txtS.getText() + "','"
					+ cmbG.getSelectedItem() + "')";

			pst = con.prepareStatement(sql);
			pst.execute();
			JOptionPane.showMessageDialog(this, "Successfully saved", "Doctor Record", JOptionPane.INFORMATION_MESSAGE);
			btnSave.setEnabled(false);

		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}
	}

	private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			con = Connect.ConnectDB();
			String sql = "update Doctor set Doctorname='" + txtName.getText() + "',ContacNo='" + txtC.getText()
					+ "',Specialty='" + txtS.getText() + "',Gender='" + cmbG.getSelectedItem() + "' where DoctorID='"
					+ txtId.getText() + "'";
			pst = con.prepareStatement(sql);
			pst.execute();
			JOptionPane.showMessageDialog(this, "Successfully updated");
			btnUpdate.setEnabled(false);
		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}
	}

	private void btnGetActionPerformed(java.awt.event.ActionEvent evt) {
		this.hide();
		DocRec frm = new DocRec();
		frm.setVisible(true);
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
			java.util.logging.Logger.getLogger(DocDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DocDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DocDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DocDetails.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new DocDetails().setVisible(true);
			}
		});
	}

	public javax.swing.JButton btnDelete;
	public javax.swing.JButton btnGet;
	public javax.swing.JButton btnNew;
	public javax.swing.JButton btnSave;
	public javax.swing.JButton btnUpdate;
	public javax.swing.JComboBox cmbG;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	public javax.swing.JTextField txtC;
	public javax.swing.JTextField txtId;
	public javax.swing.JTextField txtName;
	public javax.swing.JTextField txtS;
}
