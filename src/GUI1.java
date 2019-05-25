import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GUI1 extends JFrame {

	private JPanel contentPane;
	public JTabbedPane tabbedPane;
	public JPanel PanelInsertion;
	public JPanel PanelMerge;
	public JPanel PanelQuick;
	public JButton BotonRandomQuickSort;
	public JTextArea JTextAreaQuickSort;
	private JButton BotonOrdenadosQuickSort;
	private JTextField TiempoEstimadoQuick;
	private JTextField TextNumerosQuick;
	public  JLabel JlabelTiempoEstiamdoQuickSort;
	public JLabel CantidadNumerosQuick;
	public JLabel CantidadNumerosQuick1;
	private JTextField TextNumerosMerge;
	private JTextField TiempoEstimadoMerge;
	public JLabel CantidadNumerosMerge;
	public JLabel CantidadNumerosMerge1;
	public JLabel JlabelTiempoEstiamdoMergeSort;
	public JTextArea JTextAreaMergeSort;
	public JButton BotonOrdenadosMergeSort;
	public JButton BotonRandomMergeSort;
	
	
	
	
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI1 frame = new GUI1();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public GUI1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.text);
		tabbedPane.setToolTipText("Insertion Sort\r\n");
		tabbedPane.setBounds(10, 11, 574, 300);
		contentPane.add(tabbedPane);
		
		PanelInsertion = new JPanel();
		PanelInsertion.setBackground(SystemColor.activeCaption);
		PanelInsertion.setToolTipText("Insertion Sort");
		tabbedPane.addTab("Insertion Sort", null, PanelInsertion, null);
		
		PanelMerge = new JPanel();
		PanelMerge.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Merge Sort\r\n", null, PanelMerge, null);
		PanelMerge.setLayout(null);
		
		CantidadNumerosMerge = new JLabel("Ingrese Cantidad ");
		CantidadNumerosMerge.setToolTipText("Ingrese Cantidad de Numeros");
		CantidadNumerosMerge.setBounds(24, 41, 218, 14);
		PanelMerge.add(CantidadNumerosMerge);
		
		CantidadNumerosMerge1 = new JLabel("de Numeros a Ordenar:");
		CantidadNumerosMerge1.setBounds(24, 66, 205, 14);
		PanelMerge.add(CantidadNumerosMerge1);
		
		TextNumerosMerge = new JTextField();
		TextNumerosMerge.setToolTipText("Ingrese Cantidad de Numeros");
		TextNumerosMerge.setColumns(10);
		TextNumerosMerge.setBounds(24, 91, 86, 20);
		PanelMerge.add(TextNumerosMerge);
		
		JlabelTiempoEstiamdoMergeSort = new JLabel("Tiempo Estimado:");
		JlabelTiempoEstiamdoMergeSort.setBounds(21, 158, 101, 14);
		PanelMerge.add(JlabelTiempoEstiamdoMergeSort);
		
		TiempoEstimadoMerge = new JTextField();
		TiempoEstimadoMerge.setToolTipText("Tiempo Estimado\r\n");
		TiempoEstimadoMerge.setEditable(false);
		TiempoEstimadoMerge.setColumns(10);
		TiempoEstimadoMerge.setBounds(22, 183, 86, 20);
		PanelMerge.add(TiempoEstimadoMerge);
		
		JTextAreaMergeSort = new JTextArea();
		JTextAreaMergeSort.setEditable(false);
		JTextAreaMergeSort.setBounds(212, 127, 334, 134);
		PanelMerge.add(JTextAreaMergeSort);
		
		BotonOrdenadosMergeSort = new JButton("Generar Numeros Ordenados");
		BotonOrdenadosMergeSort.setToolTipText("Generar Numeros Random");
		BotonOrdenadosMergeSort.setBounds(312, 86, 210, 30);
		PanelMerge.add(BotonOrdenadosMergeSort);
		
		BotonRandomMergeSort = new JButton("Generar Numeros Random");
		BotonRandomMergeSort.setToolTipText("Generar Numeros Random");
		BotonRandomMergeSort.setBounds(312, 44, 210, 30);
		PanelMerge.add(BotonRandomMergeSort);
		
		PanelQuick = new JPanel();
		PanelQuick.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Quick Sort\r\n", null, PanelQuick, null);
		PanelQuick.setLayout(null);
		
		BotonRandomQuickSort = new JButton("Generar Numeros Random");
		BotonRandomQuickSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		BotonRandomQuickSort.setToolTipText("Generar Numeros Random");
		BotonRandomQuickSort.setBounds(314, 45, 208, 30);
		PanelQuick.add(BotonRandomQuickSort);
		
		JTextAreaQuickSort = new JTextArea();
		JTextAreaQuickSort.setEditable(false);
		JTextAreaQuickSort.setBounds(214, 127, 334, 134);
		PanelQuick.add(JTextAreaQuickSort);
		
		BotonOrdenadosQuickSort = new JButton("Generar Numeros Ordenados");
		BotonOrdenadosQuickSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotonOrdenadosQuickSort.setToolTipText("Generar Numeros Random");
		BotonOrdenadosQuickSort.setBounds(314, 86, 208, 30);
		PanelQuick.add(BotonOrdenadosQuickSort);
		
		TiempoEstimadoQuick = new JTextField();
		TiempoEstimadoQuick.setEditable(false);
		TiempoEstimadoQuick.setToolTipText("Tiempo Estimado\r\n");
		TiempoEstimadoQuick.setBounds(24, 192, 86, 20);
		PanelQuick.add(TiempoEstimadoQuick);
		TiempoEstimadoQuick.setColumns(10);
		
		JlabelTiempoEstiamdoQuickSort= new JLabel("Tiempo Estimado:");
		JlabelTiempoEstiamdoQuickSort.setBounds(23, 167, 101, 14);
		PanelQuick.add(JlabelTiempoEstiamdoQuickSort);
		
		TextNumerosQuick = new JTextField();
		TextNumerosQuick.setToolTipText("Ingrese Cantidad de Numeros");
		TextNumerosQuick.setBounds(24, 86, 86, 20);
		PanelQuick.add(TextNumerosQuick);
		TextNumerosQuick.setColumns(10);
		
		CantidadNumerosQuick = new JLabel("Ingrese Cantidad ");
		CantidadNumerosQuick.setToolTipText("Ingrese Cantidad de Numeros");
		CantidadNumerosQuick.setBounds(24, 42, 218, 14);
		PanelQuick.add(CantidadNumerosQuick);
		
		CantidadNumerosQuick1 = new JLabel("de Numeros a Ordenar:");
		CantidadNumerosQuick1.setBounds(24, 61, 203, 14);
		PanelQuick.add(CantidadNumerosQuick1);
	}
}
