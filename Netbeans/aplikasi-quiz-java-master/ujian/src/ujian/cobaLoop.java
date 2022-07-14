package tes;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;

public class cobaLoop {

	private JFrame formCoba;
	private JTextField textField;
	
	private ArrayList<JLabel> soal = new ArrayList<JLabel>();
	private ArrayList<ButtonGroup> opsiSoal = new ArrayList<ButtonGroup>();
	private ArrayList<ArrayList<JRadioButton>> opsi = new ArrayList<ArrayList<JRadioButton>>();
	int posisiSoalY = 10;
	int posisiOpsiY = 37;

	// java-mysql connect
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/pbo";
	static final String USER = "root";
	static final String PASS = "";
	
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cobaLoop window = new cobaLoop();
					window.formCoba.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cobaLoop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		formCoba = new JFrame();
		formCoba.setResizable(true);
		formCoba.setBounds(100, 100, 480, 300);
		formCoba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formCoba.getContentPane().setLayout(null);
		
		createSoal();		
	}
	
	public void createSoal() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM soal");
			int i = 0;
			while(rs.next()) {
				//soal
				soal.add(new JLabel(rs.getString("soal")));
				soal.get(i).setBounds(10, posisiSoalY, 442, 20);
				formCoba.getContentPane().add(soal.get(i));
				
				//opsi A
				opsi.add(new ArrayList<JRadioButton>());
				opsi.get(i).add(new JRadioButton(rs.getString("jawaban_a")));
				opsi.get(i).get(0).setBounds(10, posisiOpsiY, 109, 23);
				formCoba.getContentPane().add(opsi.get(i).get(0));
//				opsi.get(i).get(0).setText();
				
				//opsi B
				opsi.add(new ArrayList<JRadioButton>());
				opsi.get(i).add(new JRadioButton(rs.getString("jawaban_b")));
				opsi.get(i).get(1).setBounds(121, posisiOpsiY, 109, 23);
				formCoba.getContentPane().add(opsi.get(i).get(1));
				
				//opsi C
				opsi.add(new ArrayList<JRadioButton>());
				opsi.get(i).add(new JRadioButton(rs.getString("jawaban_c")));
				opsi.get(i).get(2).setBounds(232, posisiOpsiY, 109, 23);
				formCoba.getContentPane().add(opsi.get(i).get(2));
				
				//opsi D
				opsi.add(new ArrayList<JRadioButton>());
				opsi.get(i).add(new JRadioButton(rs.getString("jawaban_d")));
				opsi.get(i).get(3).setBounds(343, posisiOpsiY, 109, 23);
				formCoba.getContentPane().add(opsi.get(i).get(3));
				
				
				//buttonGroup biar cuma ada 1 radio button yg bisa dipilih
				for(int j=0; j<4; j++) {
					opsiSoal.add(new ButtonGroup());
					opsiSoal.get(i).add(opsi.get(i).get(j));
				}
				
				i++;
//				posisi y nambah 60 tiap loop
				posisiSoalY += 60;
				posisiOpsiY += 60;
			}
			
			stmt.close();
			conn.close();
		} catch(Exception e) {
			System.out.println("Koneksi gagal");
			System.out.println(e);
		}
		
	}
}
