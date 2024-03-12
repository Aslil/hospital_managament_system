
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
import java.awt.SystemColor;

public class NewUser extends javax.swing.JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;

	public NewUser() {
		initComponents();
	}

	private void reset() {
		txtName.setText("");
		txtUsername.setText("");
		jPassword.setText("");
		txtContactno.setText("");
		Save.setEnabled(true);
		Delete.setEnabled(false);
		Update.setEnabled(false);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		txtName = new javax.swing.JTextField();
		txtUsername = new javax.swing.JTextField();
		txtContactno = new javax.swing.JTextField();
		jPassword = new javax.swing.JPasswordField();
		jPanel2 = new javax.swing.JPanel();
		jPanel2.setForeground(new Color(0, 0, 0));
		New = new javax.swing.JButton();
		New.setBackground(new Color(255, 160, 122));
		Save = new javax.swing.JButton();
		Save.setBackground(new Color(144, 238, 144));
		Update = new javax.swing.JButton();
		Update.setBackground(SystemColor.info);
		Update.setForeground(SystemColor.desktop);
		Delete = new javax.swing.JButton();
		Delete.setForeground(new Color(0, 0, 0));
		Delete.setBackground(new Color(255, 182, 193));
		GetData = new javax.swing.JButton();
		GetData.setBackground(new Color(176, 224, 230));

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("NewUser");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("User Details"));
		jPanel1.setFont(new java.awt.Font("Arial", 0, 18));

		jLabel1.setText("Name");

		jLabel2.setText("User Name");

		jLabel3.setText("Password");

		jLabel5.setText("Contact no.");

		txtUsername.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtUsernameActionPerformed(evt);
			}
		});

		jPassword.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel2).addComponent(jLabel1).addComponent(jLabel3))
								.addGap(23, 23, 23)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtUsername).addComponent(jPassword).addComponent(txtName,
												javax.swing.GroupLayout.PREFERRED_SIZE, 105,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel5).addGap(18, 18, 18).addComponent(txtContactno)))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(21, 21, 21)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(txtContactno,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(39, Short.MAX_VALUE)));

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		New.setText("New");
		New.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				NewActionPerformed(evt);
			}
		});

		Save.setText("Save");
		Save.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SaveActionPerformed(evt);
			}
		});

		Update.setText("Update");
		Update.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UpdateActionPerformed(evt);
			}
		});

		Delete.setText("Delete");
		Delete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DeleteActionPerformed(evt);
			}
		});

		GetData.setText("Get Data");
		GetData.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GetDataActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(36)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(GetData, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(New, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(Update, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(Save, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Delete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap(29, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(22).addComponent(New)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(Save)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(Update)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(Delete)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(GetData)
						.addContainerGap(19, Short.MAX_VALUE)));
		jPanel2.setLayout(jPanel2Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(31)
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(45))
				.addGroup(Alignment.LEADING,
						layout.createSequentialGroup().addGap(37).addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(53, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}

	private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void NewActionPerformed(java.awt.event.ActionEvent evt) {
		reset();
	}

	private void SaveActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			con = Connect.ConnectDB();
			if (txtName.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter name");
				return;
			}
			if (txtUsername.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter user name");
				return;
			}

			if (jPassword.equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter password");
				return;
			}
			if (txtContactno.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter contact no.");
				return;
			}
			Statement stmt;
			stmt = con.createStatement();
			String sql1 = "Select user_name from registration where user_name= '" + txtUsername.getText() + "'";
			rs = stmt.executeQuery(sql1);
			if (rs.next()) {
				JOptionPane.showMessageDialog(this, "User name already exists");
				txtUsername.setText("");
				return;
			}

			String sql = "insert into registration(user_name,password,name,contact_no)values('" + txtUsername.getText()
					+ "','" + jPassword.getText() + "','" + txtName.getText() + "','" + txtContactno.getText() + "')";
			pst = con.prepareStatement(sql);
			pst.execute();
			String sql2 = "insert into users(user_name,password)values('" + txtUsername.getText() + "','"
					+ jPassword.getText() + "')";

			pst = con.prepareStatement(sql2);
			pst.execute();
			JOptionPane.showMessageDialog(this, "Successfully Registered");
			Save.setEnabled(false);
		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}
	}

	private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			int P = JOptionPane.showConfirmDialog(null, " Are you sure want to delete ?", "Confirmation",
					JOptionPane.YES_NO_OPTION);
			if (P == 0) {
				con = Connect.ConnectDB();

				String sql = "delete from registration where user_name = '" + txtUsername.getText() + "'";
				pst = con.prepareStatement(sql);
				pst.execute();
				String sql1 = "delete from Users where user_name = '" + txtUsername.getText() + "'";
				pst = con.prepareStatement(sql1);
				pst.execute();
				JOptionPane.showMessageDialog(this, "Successfully deleted");
				reset();
			}
		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}

	}

	private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			con = Connect.ConnectDB();

			String sql = "update registration set password='" + jPassword.getText() + "',name='" + txtName.getText()
					+ "',email_id='" + "',contact_no='" + txtContactno.getText() + "' where user_name='"
					+ txtUsername.getText() + "'";

			pst = con.prepareStatement(sql);
			pst.execute();
			String sql2 = "update users set password='" + jPassword.getText() + "' where user_name='"
					+ txtUsername.getText() + "'";

			pst = con.prepareStatement(sql2);
			pst.execute();
			JOptionPane.showMessageDialog(this, "Successfully updated", "User info", JOptionPane.INFORMATION_MESSAGE);
			Update.setEnabled(false);
		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}
	}

	private void GetDataActionPerformed(java.awt.event.ActionEvent evt) {
		this.hide();
		UserRecord ob1 = new UserRecord();
		ob1.setVisible(true);
	}

	private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {

	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Metal".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewUser().setVisible(true);
			}
		});
	}

	public javax.swing.JButton Delete;
	private javax.swing.JButton GetData;
	public javax.swing.JButton New;
	public javax.swing.JButton Save;
	public javax.swing.JButton Update;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	public static javax.swing.JPasswordField jPassword;
	public javax.swing.JTextField txtContactno;
	public javax.swing.JTextField txtName;
	public javax.swing.JTextField txtUsername;
}