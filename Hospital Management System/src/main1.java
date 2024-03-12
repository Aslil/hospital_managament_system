import java.awt.Dimension;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JPanel;

public class main1 extends javax.swing.JFrame {

	public main1() {
		getContentPane().setBackground(SystemColor.activeCaption);
		setTitle("GENERAL HOSPITAL MAIN PAGE");
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		jMenuItem11 = new javax.swing.JMenuItem();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenuBar1.setForeground(SystemColor.inactiveCaption);
		jMenuBar1.setBackground(SystemColor.activeCaption);
		jMenu1 = new javax.swing.JMenu();
		jMenu1.setBackground(SystemColor.activeCaption);
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenu5 = new javax.swing.JMenu();
		jMenu7 = new javax.swing.JMenu();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenuItem9 = new javax.swing.JMenuItem();
		jMenuItem10 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();

		jMenuItem11.setText("jMenuItem11");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jMenu1.setText("User");
		jMenu1.setFont(new java.awt.Font("Arial", 0, 18));
		jMenu1.setPreferredSize(new Dimension(60, 20));

		jMenuItem1.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem1.setText("New User");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuItem2.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem2.setText("Change Password");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Patients");
		jMenu2.setFont(new java.awt.Font("Arial", 0, 18));
		jMenu2.setPreferredSize(new java.awt.Dimension(70, 25));

		jMenuItem6.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem6.setText("Registration");
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem6);

		jMenuBar1.add(jMenu2);
		jMenuItem7.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem7.setText("Payments");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});

		jMenuBar1.add(jMenu2);

		jMenuItem7.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem7.setText("Appointment");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem7);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("Doctors");
		jMenu3.setFont(new java.awt.Font("Arial", 0, 18));
		jMenu3.setPreferredSize(new java.awt.Dimension(71, 25));

		jMenuItem4.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem4.setText("Doctor Details");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem4);

		jMenuBar1.add(jMenu3);
		jMenu5.setText("Payments");
		jMenu5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		jMenu7.setText("Billings");
		jMenuItem8.setText("Medicines&Medical Fee");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});

		jMenu7.add(jMenuItem8);

		jMenu5.add(jMenu7);

		jMenuBar1.add(jMenu5);

		jMenu4.setText("Nurses");
		jMenu4.setFont(new java.awt.Font("Arial", 0, 18));
		jMenu4.setPreferredSize(new java.awt.Dimension(75, 25));

		jMenuItem5.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem5.setText("Nurse Details");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem5);

		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		labelimg = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/e.jpg"));
		labelimg.setIcon(img);

		panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(125)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE).addGap(147)
						.addComponent(labelimg, GroupLayout.PREFERRED_SIZE, 607, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 533, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(621, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup().addGap(53)
										.addComponent(panel, GroupLayout.PREFERRED_SIZE, 234,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(126, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(labelimg)))));
		panel_1.setLayout(null);

		lblNewLabel = new JLabel("GENERAL HOSPITAL");
		lblNewLabel.setBounds(33, 30, 441, 83);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Agency FB", Font.PLAIN, 70));

		lblNewLabel_1 = new JLabel("Your health is our happiness");
		lblNewLabel_1.setBounds(10, 112, 489, 76);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 40));
		panel.setLayout(null);

		lblNewLabel_2 = new JLabel("CONTACT DETAILS");
		lblNewLabel_2.setBounds(36, 33, 206, 48);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Agency FB", Font.PLAIN, 40));

		lblNewLabel_3 = new JLabel("+90 315 333 33 33");
		lblNewLabel_3.setBounds(45, 91, 174, 25);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));

		lblNewLabel_4 = new JLabel("+90 315 222 22 22");
		lblNewLabel_4.setBounds(44, 126, 175, 25);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));

		lblNewLabel_5 = new JLabel("generalhosp@mail.com");
		lblNewLabel_5.setBounds(23, 171, 219, 25);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		getContentPane().setLayout(layout);

		pack();
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		ChangePassword ob1 = new ChangePassword();
		ob1.setVisible(true);
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		NewUser ob1 = new NewUser();
		ob1.setVisible(true);
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		DocDetails ob1 = new DocDetails();
		ob1.setVisible(true);
	}

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		NurseDetails ob1 = new NurseDetails();
		ob1.setVisible(true);
	}

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		registration ob1 = new registration();
		ob1.setVisible(true);
	}

	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
		appointment ob1 = new appointment();
		ob1.setVisible(true);
	}

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
		billings ob1 = new billings();
		ob1.setVisible(true);
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
			java.util.logging.Logger.getLogger(main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new main1().setVisible(true);
			}
		});
	}

	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu7;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem10;
	private javax.swing.JMenuItem jMenuItem11;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	private JLabel labelimg;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JPanel panel;
	private JPanel panel_1;
}