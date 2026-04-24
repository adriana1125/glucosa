package datosglucosa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
public class MAIIN extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	List<registro> registros=new ArrayList<>();// creo mi arraylist
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAIIN frame = new MAIIN();
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
	public MAIIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 22, 404, 241);
		contentPane.add(tabbedPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setToolTipText("");
		tabbedPane.addTab("Registro", null, toolBar, null);
		
		JPanel panel = new JPanel();
		toolBar.add(panel);
		panel.setLayout(null);
		
		JLabel lblNOMBRE = new JLabel("Nombre: ");
		lblNOMBRE.setBounds(81, 20, 92, 14);
		panel.add(lblNOMBRE);
		
		textField = new JTextField();
		textField.setBounds(152, 18, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblGLUCOSA = new JLabel("Glucosa:");
		lblGLUCOSA.setBounds(81, 59, 92, 14);
		panel.add(lblGLUCOSA);
		
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 57, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnGUARDAR = new JButton("Guardar");
		btnGUARDAR.setBounds(129, 136, 89, 23);
		panel.add(btnGUARDAR);
		btnGUARDAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nombre = textField.getText();
				double glucosa = Double.parseDouble(textField_1.getText());


			}
		});
		
		JToolBar toolBar_1 = new JToolBar();
		tabbedPane.addTab("Historial", null, toolBar_1, null);
		
		JPanel panel_1 = new JPanel();
		toolBar_1.add(panel_1);
		panel_1.setLayout(null);
		
	
	}
}
