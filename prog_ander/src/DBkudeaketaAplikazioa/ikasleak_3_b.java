package DBkudeaketaAplikazioa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class ikasleak_3_b {
	public JFrame Frame;
	private JList ikasleLista;
	private JTextField txtNan;
	private JTextField txtIzena;
	private JTextField txtAbizena;
	private JTextField txtTaldea;
	private JButton btnPlus;
	private JButton btnMinus;
	private JLabel lblNan;
	private JLabel lblIzena;
	private JLabel lblAbizena;
	private JLabel lblTaldea;
	private ArrayList<ikasleak>ALikasleak=new ArrayList<ikasleak>();
	private DefaultListModel DLM=new DefaultListModel();
	private JButton btnGorde;
	private int aukera;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ikasleak_3_b window=new ikasleak_3_b();
					window.Frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
			}
			}
		});
	}
	public ikasleak_3_b() {
		Frame=new JFrame();
		Frame.setBounds(100,100,800,600);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.getContentPane().setLayout(null);
		
		ikasleLista = new JList();
		ikasleLista.setBounds(437, 39, 306, 469);
		Frame.getContentPane().add(ikasleLista);
		ikasleLista.addMouseListener(new MouseAdapter() {
			public void MouseClicked(MouseEvent e) {
				aukera=ikasleLista.getSelectedIndex();
			}
		});
		
		txtNan = new JTextField();
		txtNan.setBounds(54, 69, 135, 34);
		Frame.getContentPane().add(txtNan);
		txtNan.setColumns(10);
		
		txtIzena = new JTextField();
		txtIzena.setColumns(10);
		txtIzena.setBounds(54, 142, 135, 34);
		Frame.getContentPane().add(txtIzena);
		
		txtAbizena = new JTextField();
		txtAbizena.setColumns(10);
		txtAbizena.setBounds(54, 212, 135, 34);
		Frame.getContentPane().add(txtAbizena);
		
		txtTaldea = new JTextField();
		txtTaldea.setColumns(10);
		txtTaldea.setBounds(54, 280, 135, 34);
		Frame.getContentPane().add(txtTaldea);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ikasleak ik=new ikasleak(txtNan.getText(),txtIzena.getText(),txtAbizena.getText(),txtTaldea.getText());
				ALikasleak.add(ik);
				eguneratu();
			}
		});
		btnPlus.setFont(new Font("Segoe UI Light", Font.ITALIC, 63));
		btnPlus.setBounds(35, 352, 113, 80);
		Frame.getContentPane().add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ALikasleak.remove(aukera);
				eguneratu();
			}
		});
		btnMinus.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 63));
		btnMinus.setBounds(145, 352, 113, 80);
		Frame.getContentPane().add(btnMinus);
		
		lblNan = new JLabel("Nan-a");
		lblNan.setBounds(54, 50, 125, 22);
		Frame.getContentPane().add(lblNan);
		
		lblIzena = new JLabel("Izena");
		lblIzena.setBounds(54, 120, 125, 22);
		Frame.getContentPane().add(lblIzena);
		
		lblAbizena = new JLabel("Abizena");
		lblAbizena.setBounds(54, 187, 125, 22);
		Frame.getContentPane().add(lblAbizena);
		
		lblTaldea = new JLabel("Taldea");
		lblTaldea.setBounds(54, 257, 125, 22);
		Frame.getContentPane().add(lblTaldea);
		
		btnGorde = new JButton("Gorde");
		btnGorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gordeFitxategian();
			}

			
		});
		btnGorde.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 24));
		btnGorde.setBounds(86, 428, 113, 80);
		Frame.getContentPane().add(btnGorde);
		//hau fitxategia sortzen den lehen momentuan bakarrik erabili, bestela errorea emango du
		/*ikasleak ik1=new ikasleak("1A","i1","a1","t1");
		ikasleak ik2=new ikasleak("2A","i2","a2","t2");
		ikasleak ik3=new ikasleak("3A","i3","a3","t3");
		
		ALikasleak.add(ik1);
		ALikasleak.add(ik2);
		ALikasleak.add(ik3);
		
		gordeFitxategian();*/
		
		fitxategiaIrakurri();
		ListaBete();
		
		
		
	}
	private void ListaBete() {
		for(int i=0;i<ALikasleak.size();i++) {
			DLM.add(i, ALikasleak.get(i));
		}
		ikasleLista.setModel(DLM);
		
	}
	private void fitxategiaIrakurri() {
		try {
			FileWriter fitxategia=new FileWriter("fitxategiak/dbaldaketa.dat",true);
			FileInputStream fis=new FileInputStream("fitxategiak/dbaldaketa.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			ALikasleak=(ArrayList<ikasleak>)ois.readObject();
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void eguneratu() {
		DLM.removeAllElements();
		for(int i=0;i<ALikasleak.size();i++) {
			DLM.add(i, ALikasleak.get(i));
		}
		ikasleLista.setModel(DLM);
	}
	private void gordeFitxategian() {
		try {
			
			FileOutputStream fos=new FileOutputStream("fitxategiak/dbaldaketa.dat");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(ALikasleak);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
