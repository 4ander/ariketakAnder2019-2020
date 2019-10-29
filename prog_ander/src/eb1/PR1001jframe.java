package eb1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PR1001jframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtKaixo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PR1001jframe frame = new PR1001jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PR1001jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblAnonimoa = new JLabel("Anonimoa");
		panel.add(lblAnonimoa);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		txtKaixo = new JTextField();
		txtKaixo.setText("Kaixo...");
		panel_1.add(txtKaixo);
		txtKaixo.setColumns(10);
		txtKaixo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtKaixo.setText("");
			}
		});
		txtKaixo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblAnonimoa.setText("kaixo, "+txtKaixo.getText());
			}
		});
		
		JButton btnOnartu = new JButton("onartu");
		contentPane.add(btnOnartu, BorderLayout.SOUTH);
		btnOnartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lblAnonimoa.setText("kaixo, "+txtKaixo.getText());
			}
		});
	}

}
