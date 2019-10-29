package probak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PER1001jframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtKaixo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PER1001jframe frame = new PER1001jframe();
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
	public PER1001jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		
		
		JLabel lblAnonimoa = new JLabel("Anonimoa");
		contentPane.add(lblAnonimoa);
		
		
		txtKaixo = new JTextField();
		
		txtKaixo.setText("Kaixo....");
		contentPane.add(txtKaixo);
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
		btnOnartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lblAnonimoa.setText("kaixo, "+txtKaixo.getText());
			}
		});
		contentPane.add(btnOnartu);
		
		
	}
}
