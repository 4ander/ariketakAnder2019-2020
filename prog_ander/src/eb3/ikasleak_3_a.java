package eb3;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
import java.util.ArrayList;

public class ikasleak_3_a {

	private JFrame frame;
	private JPanel informazio_panela;
	private JList ikasleak_lista;
	private JPanel opzio_panela;
	private JButton btn_eguneratu;
	private DefaultListModel DLM=new DefaultListModel();
	private Connection konexioa;
	private Statement st;
	private ResultSet rs;
	private ArrayList<String>Ezabaketak=new ArrayList<String>();
	private  int ezabaketak=0;
	private  int aldaketak=0;
	private  int inserzioak=0;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ikasleak_3_a window = new ikasleak_3_a();
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
	public ikasleak_3_a() {
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
		
		
		informazio_panela = new JPanel();
		informazio_panela.setBounds(0, 0, 784, 258);
		frame.getContentPane().add(informazio_panela);
		informazio_panela.setLayout(null);
		
		ikasleak_lista = new JList();
		ikasleak_lista.setBounds(48, 36, 681, 183);
		informazio_panela.add(ikasleak_lista);
		
		
		
		opzio_panela = new JPanel();
		opzio_panela.setBounds(0, 257, 784, 304);
		frame.getContentPane().add(opzio_panela);
		opzio_panela.setLayout(null);
		
		btn_eguneratu = new JButton("Eguneratu");
		btn_eguneratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ezabaketa();
				DLM.removeAllElements();
				konektatu();
				System.out.println("Ezabaketa kopurua "+ezabaketak+" izan da");

			}

			
		});
		btn_eguneratu.setBounds(10, 11, 120, 43);
		opzio_panela.add(btn_eguneratu);
		
		
		konektatu();
		
		
	
		
		
		
		
		
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
	private ArrayList<String> ikasleak_b_AL() {
		ArrayList<String>fitxategiko_nanak=new ArrayList<String>();
		try {
			File fitxategib=new File("fitxategiak/dbezabatu.txt");
			FileWriter fw=new FileWriter("fitxategiak/dbezabatu.txt",true);
			FileReader fr=new FileReader(fitxategib);
			BufferedReader br=new BufferedReader(fr);
			String nanak;
			fw.close();

			while ((nanak=br.readLine())!=null) {
				fitxategiko_nanak.add(nanak);	
			}
			
				
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return fitxategiko_nanak;				
	}

	private ArrayList<String> DB_AL() {
		ArrayList<String>dbko_nanak=new ArrayList<String>();
		
		try {
			rs=st.executeQuery("select nan from ikasleak2");
			while(rs.next()) {
				dbko_nanak.add((String)rs.getObject("nan"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbko_nanak;
		
	}

	private void ezabaketa() {
		System.out.println("datu basea: ");
		for(int znbk=0;znbk<DB_AL().size();znbk++) {
			System.out.println(DB_AL().get(znbk));
		}
		System.out.println("Fitxategiko datuak: ");
		for(int znbk1=0;znbk1<ikasleak_b_AL().size();znbk1++) {
			System.out.println(ikasleak_b_AL().get(znbk1));
		}
			try {
				for(int y=0;y<ikasleak_b_AL().size();y++) {
					for(int w=0;w<DB_AL().size();w++) {
						if(ikasleak_b_AL().get(y).equals(DB_AL().get(w))) {
							st.execute("delete from ikasleak2 where nan='"+ikasleak_b_AL().get(y)+"'");
							ezabaketak++;
						}
					}
				}
				
			}
			catch(Exception e) {
				
			}
			
		
	}
	
	
	
}
