package eb3;

import java.awt.EventQueue;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DBIkasleak_interfazearekin2 {

	private JFrame frame;
	private JTextField txt_izena;
	private JTextField txt_nan;
	private JTextField txt_abizena;
	private JTextField txt_taldea;
	private JPanel informazio_panela;
	private JList ikasleak_lista;
	private JPanel opzio_panela;
	private JLabel lbl_nan;
	private JLabel lbl_izena;
	private JLabel lbl_abizena;
	private JButton btn_ezabatu;
	private JButton btn_aldatu;
	private JLabel lbl_taldea;
	private JButton btn_berria_sartu;
	private DefaultListModel DLM=new DefaultListModel();
	private Connection konexioa;
	private Statement st;
	private ResultSet rs;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DBIkasleak_interfazearekin2 window = new DBIkasleak_interfazearekin2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DBIkasleak_interfazearekin2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/*Interfazearen elementuak*/
		
		informazio_panela = new JPanel();
		informazio_panela.setBounds(0, 0, 784, 258);
		frame.getContentPane().add(informazio_panela);
		informazio_panela.setLayout(null);
		
		ikasleak_lista = new JList();
		ikasleak_lista.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println(eman_nan());
					st=konexioa.createStatement();
					rs=st.executeQuery("select * from ikasleak2 where nan='"+eman_nan()+"'");
					
					while (rs.next()){
						txt_nan.setText((String)rs.getObject("nan"));
						txt_izena.setText((String)rs.getObject("izena"));
						txt_abizena.setText((String)rs.getObject("abizenak"));
						txt_taldea.setText((String)rs.getObject("taldea"));
						}
						
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		ikasleak_lista.setBounds(48, 36, 681, 183);
		informazio_panela.add(ikasleak_lista);
		
		
		
		opzio_panela = new JPanel();
		opzio_panela.setBounds(0, 257, 784, 304);
		frame.getContentPane().add(opzio_panela);
		opzio_panela.setLayout(null);
		
		lbl_nan = new JLabel("Nan");
		lbl_nan.setBounds(35, 197, 48, 14);
		opzio_panela.add(lbl_nan);
		
		lbl_izena = new JLabel("Izena");
		lbl_izena.setBounds(235, 197, 48, 14);
		opzio_panela.add(lbl_izena);
		
		lbl_abizena = new JLabel("Abizena");
		lbl_abizena.setBounds(434, 197, 48, 14);
		opzio_panela.add(lbl_abizena);
		
		lbl_taldea = new JLabel("Taldea");
		lbl_taldea.setBounds(632, 197, 48, 14);
		opzio_panela.add(lbl_taldea);
		
		txt_izena = new JTextField();
		txt_izena.setColumns(10);
		txt_izena.setBounds(196, 222, 145, 20);
		opzio_panela.add(txt_izena);
		
		btn_ezabatu = new JButton("Ezabatu");
		btn_ezabatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					st.execute("Delete from ikasleak2 where nan='"+eman_nan()+"'");
					DLM.removeAllElements();
					konektatu();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_ezabatu.setBounds(10, 11, 120, 43);
		opzio_panela.add(btn_ezabatu);
		
		btn_aldatu = new JButton("Aldatu");
		btn_aldatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					st.execute("update ikasleak2 set nan='"+txt_nan.getText()+"', izena='"+txt_izena.getText()+"', abizenak='"+txt_abizena.getText()+"', taldea='"+txt_taldea.getText()+"' where nan='"+eman_nan()+"'");
					DLM.removeAllElements();
					konektatu();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_aldatu.setBounds(10, 68, 120, 43);
		opzio_panela.add(btn_aldatu);
		
		btn_berria_sartu = new JButton("Berria sartu");
		btn_berria_sartu.setBounds(10, 122, 120, 43);
		opzio_panela.add(btn_berria_sartu);
		btn_berria_sartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					st.execute("insert into ikasleak2 values('"+txt_nan.getText()+"','"+txt_izena.getText()+"','"+txt_abizena.getText()+"','"+txt_taldea.getText()+"')");
					DLM.removeAllElements();
					konektatu();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		txt_nan = new JTextField();
		txt_nan.setColumns(10);
		txt_nan.setBounds(10, 222, 145, 20);
		opzio_panela.add(txt_nan);
		
		txt_abizena = new JTextField();
		txt_abizena.setColumns(10);
		txt_abizena.setBounds(390, 222, 145, 20);
		opzio_panela.add(txt_abizena);
		
		txt_taldea = new JTextField();
		txt_taldea.setColumns(10);
		txt_taldea.setBounds(581, 222, 145, 20);
		opzio_panela.add(txt_taldea);
		
		/*Interfazearen elementuak bukatu*/
		/*datu basea irakurri eta listan jarri*/
		konektatu();
		// ondo burutu baldin bada
		
	
	}
	public void konektatu() {
		
		try {
			konexioa = DriverManager.getConnection("jdbc:mysql://localhost/ikasleak", "root", "");
			System.out.println("Konexio egokia.");
			st=konexioa.createStatement();
			rs=st.executeQuery("select * from ikasleak2");
			int lista=0;
			while (rs.next()){
				DLM.add(lista,"Nan: " + rs.getObject("nan") + ", Izena: " +
				rs.getObject("izena") + ", Abizena: " + rs.getObject("abizenak") + ", Taldea: " +
				rs.getObject("taldea"));
				lista++;
				}
			ikasleak_lista.setModel(DLM);
				// ResultSet itxi
				rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("konexio errorea");
			e.printStackTrace();
		}
		
		}
	
	public String eman_nan() {
		String aukeratua=(String) ikasleak_lista.getSelectedValue();
		String gordenan="";
		
		for(int i=5;aukeratua.charAt(i)!=44;i++) {
				gordenan+=aukeratua.charAt(i);
		}
		return gordenan;
		
	}
	
}
