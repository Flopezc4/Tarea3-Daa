package gui;

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
import javax.swing.JDialog;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class GUI1 extends JFrame {

    private JPanel contentPane;
    private JTabbedPane tabbedPane;
    private JPanel PanelInsertion;
    private JPanel PanelMerge;
    private JPanel PanelQuick;
    public JButton BotonRandomQuickSort;
    public JTextArea JTextAreaQuickSort;
    public JButton BotonOrdenadosQuickSort;
    public JTextField TiempoEstimadoQuick;
    public JTextField TextNumerosQuick;
    private JLabel JlabelTiempoEstiamdoQuickSort;
    private JLabel CantidadNumerosQuick;
    private JLabel CantidadNumerosQuick1;
    public JTextField TextNumerosMerge;
    public JTextField TiempoEstimadoMerge;
    private JLabel CantidadNumerosMerge;
    private JLabel CantidadNumerosMerge1;
    private JLabel JlabelTiempoEstiamdoMergeSort;
    public JTextArea JTextAreaMergeSort;
    public JButton BotonOrdenadosMergeSort;
    public JButton BotonRandomMergeSort;
    public JTextField TextNumerosInsertion;
    public JTextField TiempoEstimadoInsertion;
    private JLabel CantidadNumerosInsertion;
    private JLabel CantidadNumerosInsertion1;
    private JLabel JlabelTiempoEstiamdoInsertionSort;
    public JTextArea JTextAreaInsertionSort;
    public JButton BotonOrdenadosInsertionSort;
    public JButton BotonRandomInssertionSort;
    private JScrollPane scrollPane;
    private JLabel labeltodoslosnumerosMerge;
    private JLabel labelnumerosordenadosMerge;
    private JScrollPane scrollPane_2;
    private JLabel CantidadNumerosArrays;
    private JLabel CantidadNumerosArrays1;
    public JTextField TextNumerosArrays;
    private JLabel JlabelTiempoEstiamdoArraysSort;
    public JTextField TiempoEstimadoArrays;
    private JLabel labeltodoslosnumerosArrays;
    private JLabel labelnumerosordenadosArrays;
    public JTextArea JTextAreaArraysSort;
    public JButton BotonOrdenadosArraySort;
    public JButton BotonRandomArraysSort;
    private JScrollPane scrollPane_3;
    private JLabel CantidadNumerosCollection;
    private JLabel CantidadNumerosCollection1;
    public JTextField TextNumerosCollectionSort;
    private JLabel JlabelTiempoEstiamdoCollectionSort;
    public JTextField TiempoEstimadoCollection;
    public JTextArea JTextAreaCollectionSort;
    private JLabel labeltodoslosnumerosCollection;
    private JLabel labelnumerosordenadosCollection;
    public JButton BotonOrdenadosCollectionSort;
    public JButton BotonRandomCollectionSort;
    private JScrollPane scrollPane_4;
    public JLabel labeltodoslosnumerosInsertion;
    public JLabel labelnumerosordenadosInsertion;
    public JScrollPane scrollPane_1;
    public JLabel labeltodoslosnumerosQuick ;
    public JLabel labelnumerosordenadosQuick;
    public JPanel PanelArraySort;
    public JPanel PanelCollectionSort;
    
    
    
    
    
    public JPanel PanelComparacion;
    public JTextArea textAreaTabla;
    public JButton BotonComparacionInsert;
    public JButton BotonComparacionMerge;
    public JButton BotonComparacionQuick;
    public JButton BotonComparacionArrays;
    public JButton BotonComparacionCollection;
    public JScrollPane scrollPane_5;
    public JTextField JTextComparacionInsert;
    public JTextField JTextComparacionArrays;
    public JTextField JTextComparacionQuick;
    public JTextField JTextComparacionMerge;
    public JTextField JTextComparacionCollection;
    public JLabel LabelComparar;
    public JTextField TextCompararNumeros;
    public JLabel lblIngresarCantidadDe;
    public JButton JButtonComparar;
    private JLabel nano1;
    private JLabel nano2;
    private JLabel nano4;
    private JLabel nano3;
    private JLabel nano5;
    private JLabel label;
    private JLabel label_1;

    public GUI1() {
    	setTitle("Dise\u00F1o y An\u00E1lisis de Algoritmos --- Algoritmos de Ordenamiento\r\n");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 610, 361);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnInformacion = new JMenu("Información");
        menuBar.add(mnInformacion);
        
        JMenuItem mntmInfo = new JMenuItem("Desarrolladores");
        mntmInfo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		

        		
        		JOptionPane.showMessageDialog(null,		"Diseño y Análisis de Algoritmos\n "
        				+ "								Algoritmos de Ordenamiento\n\n"
        				+ "					Fernando López -> Jefe de Proyecto\n"
        				+ "					Rodrigo Mamani -> Desarrolladores\n"
        				+ "					Bryan Townsend -> Desarrolladores","Información", JOptionPane.INFORMATION_MESSAGE);      		
        	}
        });
        mnInformacion.add(mntmInfo);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
                contentPane.setLayout(new BorderLayout(0, 0));
                
                JPanel panel = new JPanel();
                contentPane.add(panel);
                panel.setLayout(new BorderLayout(0, 0));
                
                        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
                        panel.add(tabbedPane, BorderLayout.CENTER);
                        tabbedPane.setForeground(new Color(255, 255, 255));
                        tabbedPane.setBackground(new Color(0, 128, 0));
                        tabbedPane.setToolTipText("Insertion Sort\r\n");
                        
                                PanelInsertion = new JPanel();
                                PanelInsertion.setBackground(new Color(0, 204, 153));
                                PanelInsertion.setToolTipText("");
                                tabbedPane.addTab("Insertion Sort", null, PanelInsertion, null);
                                PanelInsertion.setLayout(null);
                                
                                        CantidadNumerosInsertion = new JLabel("Ingrese Cantidad ");
                                        CantidadNumerosInsertion.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                        CantidadNumerosInsertion.setToolTipText("Ingrese Cantidad de Numeros");
                                        CantidadNumerosInsertion.setBounds(24, 52, 218, 14);
                                        PanelInsertion.add(CantidadNumerosInsertion);
                                        
                                                CantidadNumerosInsertion1 = new JLabel("de Numeros a Ordenar:");
                                                CantidadNumerosInsertion1.setToolTipText("Ingrese Cantidad de Numeros");
                                                CantidadNumerosInsertion1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                CantidadNumerosInsertion1.setBounds(24, 66, 164, 14);
                                                PanelInsertion.add(CantidadNumerosInsertion1);
                                                
                                                        TextNumerosInsertion = new JTextField();
                                                        TextNumerosInsertion.setToolTipText("Ingrese Cantidad de Numeros");
                                                        TextNumerosInsertion.setColumns(10);
                                                        TextNumerosInsertion.setBounds(182, 63, 86, 20);
                                                        PanelInsertion.add(TextNumerosInsertion);
                                                        
                                                                JlabelTiempoEstiamdoInsertionSort = new JLabel("Tiempo Estimado:");
                                                                JlabelTiempoEstiamdoInsertionSort.setToolTipText("Tiempo Estimado");
                                                                JlabelTiempoEstiamdoInsertionSort.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                JlabelTiempoEstiamdoInsertionSort.setBounds(296, 66, 114, 14);
                                                                PanelInsertion.add(JlabelTiempoEstiamdoInsertionSort);
                                                                
                                                                        TiempoEstimadoInsertion = new JTextField();
                                                                        TiempoEstimadoInsertion.setToolTipText("Tiempo Estimado\r\n");
                                                                        TiempoEstimadoInsertion.setEditable(false);
                                                                        TiempoEstimadoInsertion.setColumns(10);
                                                                        TiempoEstimadoInsertion.setBounds(406, 63, 86, 20);
                                                                        PanelInsertion.add(TiempoEstimadoInsertion);
                                                                        
                                                                                BotonOrdenadosInsertionSort = new JButton("<html><Center>Generar Numeros Ordenados<html><Center>");
                                                                                BotonOrdenadosInsertionSort.setForeground(Color.BLACK);
                                                                                BotonOrdenadosInsertionSort.addActionListener(new ActionListener() {
                                                                                	public void actionPerformed(ActionEvent arg0) {
                                                                                	}
                                                                                });
                                                                                BotonOrdenadosInsertionSort.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
                                                                                BotonOrdenadosInsertionSort.setVerticalAlignment(SwingConstants.TOP);
                                                                                BotonOrdenadosInsertionSort.setBackground(Color.RED);
                                                                                BotonOrdenadosInsertionSort.setToolTipText("Generar Numeros Ordenados\r\n");
                                                                                BotonOrdenadosInsertionSort.setBounds(200, 192, 149, 55);
                                                                                PanelInsertion.add(BotonOrdenadosInsertionSort);
                                                                                
                                                                                        BotonRandomInssertionSort = new JButton("<html><Center>Generar Numeros Random<html><Center>\r\n");
                                                                                        BotonRandomInssertionSort.setForeground(Color.BLACK);
                                                                                        BotonRandomInssertionSort.setVerticalAlignment(SwingConstants.TOP);
                                                                                        BotonRandomInssertionSort.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
                                                                                        BotonRandomInssertionSort.setBackground(Color.BLUE);
                                                                                        BotonRandomInssertionSort.addActionListener(new ActionListener() {
                                                                                        	public void actionPerformed(ActionEvent arg0) {
                                                                                        	}
                                                                                        });
                                                                                        BotonRandomInssertionSort.setToolTipText("Generar Numeros Random");
                                                                                        BotonRandomInssertionSort.setBounds(386, 192, 149, 55);
                                                                                        PanelInsertion.add(BotonRandomInssertionSort);
                                                                                        
                                                                                        labeltodoslosnumerosInsertion = new JLabel("Todos los Numeros:");
                                                                                        labeltodoslosnumerosInsertion.setToolTipText("Todos Los Numeros");
                                                                                        labeltodoslosnumerosInsertion.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                                                                                        labeltodoslosnumerosInsertion.setBounds(16, 115, 131, 14);
                                                                                        PanelInsertion.add(labeltodoslosnumerosInsertion);
                                                                                        
                                                                                        labelnumerosordenadosInsertion = new JLabel("Numeros Ordenados:");
                                                                                        labelnumerosordenadosInsertion.setToolTipText("Todos Los Numeros Ordenados");
                                                                                        labelnumerosordenadosInsertion.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                                                                                        labelnumerosordenadosInsertion.setBounds(5, 130, 141, 14);
                                                                                        PanelInsertion.add(labelnumerosordenadosInsertion);
                                                                                        
                                                                                        scrollPane_2 = new JScrollPane();
                                                                                        scrollPane_2.setBounds(157, 115, 402, 55);
                                                                                        PanelInsertion.add(scrollPane_2);
                                                                                        
                                                                                                JTextAreaInsertionSort = new JTextArea();
                                                                                                scrollPane_2.setViewportView(JTextAreaInsertionSort);
                                                                                                JTextAreaInsertionSort.setEditable(false);
                                                                                                
                                                                                                JLabel label_2 = new JLabel("MiliSegundos");
                                                                                                label_2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 10));
                                                                                                label_2.setBounds(494, 67, 65, 14);
                                                                                                PanelInsertion.add(label_2);
                                                                                                
                                                                                                        PanelMerge = new JPanel();
                                                                                                        PanelMerge.setToolTipText("Merge Sort");
                                                                                                        PanelMerge.setBackground(new Color(0, 204, 153));
                                                                                                        tabbedPane.addTab("Merge Sort\r\n", null, PanelMerge, null);
                                                                                                        PanelMerge.setLayout(null);
                                                                                                        
                                                                                                                CantidadNumerosMerge = new JLabel("Ingrese Cantidad ");
                                                                                                                CantidadNumerosMerge.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                                                                CantidadNumerosMerge.setToolTipText("Ingrese Cantidad de Numeros");
                                                                                                                CantidadNumerosMerge.setBounds(24, 52, 218, 14);
                                                                                                                PanelMerge.add(CantidadNumerosMerge);
                                                                                                                
                                                                                                                        CantidadNumerosMerge1 = new JLabel("de Numeros a Ordenar:");
                                                                                                                        CantidadNumerosMerge1.setToolTipText("Ingrese Cantidad de Numeros");
                                                                                                                        CantidadNumerosMerge1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                                                                        CantidadNumerosMerge1.setBounds(24, 66, 164, 14);
                                                                                                                        PanelMerge.add(CantidadNumerosMerge1);
                                                                                                                        
                                                                                                                                TextNumerosMerge = new JTextField();
                                                                                                                                TextNumerosMerge.setForeground(Color.BLACK);
                                                                                                                                TextNumerosMerge.setBackground(Color.WHITE);
                                                                                                                                TextNumerosMerge.setToolTipText("Ingrese Cantidad de Numeros");
                                                                                                                                TextNumerosMerge.setColumns(10);
                                                                                                                                TextNumerosMerge.setBounds(182, 63, 86, 20);
                                                                                                                                PanelMerge.add(TextNumerosMerge);
                                                                                                                                
                                                                                                                                        JlabelTiempoEstiamdoMergeSort = new JLabel("Tiempo Estimado:");
                                                                                                                                        JlabelTiempoEstiamdoMergeSort.setToolTipText("Tiempo Estimado");
                                                                                                                                        JlabelTiempoEstiamdoMergeSort.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                                                                                        JlabelTiempoEstiamdoMergeSort.setBounds(296, 66, 114, 14);
                                                                                                                                        PanelMerge.add(JlabelTiempoEstiamdoMergeSort);
                                                                                                                                        
                                                                                                                                                TiempoEstimadoMerge = new JTextField();
                                                                                                                                                TiempoEstimadoMerge.setToolTipText("Tiempo Estimado\r\n");
                                                                                                                                                TiempoEstimadoMerge.setEditable(false);
                                                                                                                                                TiempoEstimadoMerge.setColumns(10);
                                                                                                                                                TiempoEstimadoMerge.setBounds(406, 63, 86, 20);
                                                                                                                                                PanelMerge.add(TiempoEstimadoMerge);
                                                                                                                                                
                                                                                                                                                        BotonOrdenadosMergeSort = new JButton("<html><Center>Generar Numeros Ordenados<html><Center>");
                                                                                                                                                        BotonOrdenadosMergeSort.setVerticalAlignment(SwingConstants.TOP);
                                                                                                                                                        BotonOrdenadosMergeSort.setBackground(Color.RED);
                                                                                                                                                        BotonOrdenadosMergeSort.setForeground(Color.BLACK);
                                                                                                                                                        BotonOrdenadosMergeSort.addActionListener(new ActionListener() {
                                                                                                                                                        	public void actionPerformed(ActionEvent arg0) {
                                                                                                                                                        	}
                                                                                                                                                        });
                                                                                                                                                        BotonOrdenadosMergeSort.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
                                                                                                                                                        BotonOrdenadosMergeSort.setToolTipText("Generar Numeros Ordenados\r\n");
                                                                                                                                                        BotonOrdenadosMergeSort.setBounds(200, 192, 149, 55);
                                                                                                                                                        PanelMerge.add(BotonOrdenadosMergeSort);
                                                                                                                                                        
                                                                                                                                                                BotonRandomMergeSort = new JButton("<html><Center>Generar Numeros Random<html><Center>");
                                                                                                                                                                BotonRandomMergeSort.addActionListener(new ActionListener() {
                                                                                                                                                                	public void actionPerformed(ActionEvent arg0) {
                                                                                                                                                                	}
                                                                                                                                                                });
                                                                                                                                                                BotonRandomMergeSort.setVerticalAlignment(SwingConstants.TOP);
                                                                                                                                                                BotonRandomMergeSort.setForeground(Color.BLACK);
                                                                                                                                                                BotonRandomMergeSort.setBackground(Color.BLUE);
                                                                                                                                                                BotonRandomMergeSort.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
                                                                                                                                                                BotonRandomMergeSort.setToolTipText("Generar Numeros Random");
                                                                                                                                                                BotonRandomMergeSort.setBounds(386, 192, 149, 55);
                                                                                                                                                                PanelMerge.add(BotonRandomMergeSort);
                                                                                                                                                                
                                                                                                                                                                scrollPane = new JScrollPane();
                                                                                                                                                                scrollPane.setBounds(157, 115, 402, 55);
                                                                                                                                                                PanelMerge.add(scrollPane);
                                                                                                                                                                
                                                                                                                                                                JTextAreaMergeSort = new JTextArea();
                                                                                                                                                                scrollPane.setViewportView(JTextAreaMergeSort);
                                                                                                                                                                JTextAreaMergeSort.setEditable(false);
                                                                                                                                                                
        labeltodoslosnumerosMerge = new JLabel("Todos los Numeros:");
        labeltodoslosnumerosMerge.setToolTipText("Todos Los Numeros");
        labeltodoslosnumerosMerge.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
        labeltodoslosnumerosMerge.setBounds(16, 115, 131, 14);
        PanelMerge.add(labeltodoslosnumerosMerge);
        
        labelnumerosordenadosMerge = new JLabel("Numeros Ordenados:");
        labelnumerosordenadosMerge.setToolTipText("Todos Los Numeros Ordenados");
        labelnumerosordenadosMerge.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
        labelnumerosordenadosMerge.setBounds(5, 130, 141, 14);
        PanelMerge.add(labelnumerosordenadosMerge);
        
        JLabel label_3 = new JLabel("MiliSegundos");
        label_3.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 10));
        label_3.setBounds(494, 67, 65, 14);
        PanelMerge.add(label_3);
        
                PanelQuick = new JPanel();
                PanelQuick.setToolTipText("Quick Sort\r\n");
                PanelQuick.setBackground(new Color(0, 204, 153));
                tabbedPane.addTab("Quick Sort\r\n", null, PanelQuick, null);
                PanelQuick.setLayout(null);
                
                        BotonRandomQuickSort = new JButton("<html><Center>Generar Numeros Random<html><Center>");
                        BotonRandomQuickSort.setForeground(Color.BLACK);
                        BotonRandomQuickSort.setVerticalAlignment(SwingConstants.TOP);
                        BotonRandomQuickSort.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
                        BotonRandomQuickSort.setBackground(Color.BLUE);
                        BotonRandomQuickSort.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent arg0) {

                            }
                        });
                        BotonRandomQuickSort.setToolTipText("Generar Numeros Random");
                        BotonRandomQuickSort.setBounds(386, 192, 149, 55);
                        PanelQuick.add(BotonRandomQuickSort);
                        
                                BotonOrdenadosQuickSort = new JButton("<html><Center>Generar Numeros Ordenados<html><Center>");
                                BotonOrdenadosQuickSort.setForeground(Color.BLACK);
                                BotonOrdenadosQuickSort.setVerticalAlignment(SwingConstants.TOP);
                                BotonOrdenadosQuickSort.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
                                BotonOrdenadosQuickSort.setBackground(Color.RED);
                                BotonOrdenadosQuickSort.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                    }
                                });
                                BotonOrdenadosQuickSort.setToolTipText("Generar Numeros Ordenados\r\n");
                                BotonOrdenadosQuickSort.setBounds(200, 192, 149, 55);
                                PanelQuick.add(BotonOrdenadosQuickSort);
                                
                                        TiempoEstimadoQuick = new JTextField();
                                        TiempoEstimadoQuick.setEditable(false);
                                        TiempoEstimadoQuick.setToolTipText("Tiempo Estimado\r\n");
                                        TiempoEstimadoQuick.setBounds(406, 63, 86, 20);
                                        PanelQuick.add(TiempoEstimadoQuick);
                                        TiempoEstimadoQuick.setColumns(10);
                                        
                                                JlabelTiempoEstiamdoQuickSort = new JLabel("Tiempo Estimado:");
                                                JlabelTiempoEstiamdoQuickSort.setToolTipText("Tiempo Estimado");
                                                JlabelTiempoEstiamdoQuickSort.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                JlabelTiempoEstiamdoQuickSort.setBounds(296, 66, 114, 14);
                                                PanelQuick.add(JlabelTiempoEstiamdoQuickSort);
                                                
                                                        TextNumerosQuick = new JTextField();
                                                        TextNumerosQuick.setToolTipText("Ingrese Cantidad de Numeros");
                                                        TextNumerosQuick.setBounds(182, 63, 86, 20);
                                                        PanelQuick.add(TextNumerosQuick);
                                                        TextNumerosQuick.setColumns(10);
                                                        
                                                                CantidadNumerosQuick = new JLabel("Ingrese Cantidad ");
                                                                CantidadNumerosQuick.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                CantidadNumerosQuick.setToolTipText("Ingrese Cantidad de Numeros");
                                                                CantidadNumerosQuick.setBounds(24, 52, 218, 14);
                                                                PanelQuick.add(CantidadNumerosQuick);
                                                                
                                                                        CantidadNumerosQuick1 = new JLabel("de Numeros a Ordenar:");
                                                                        CantidadNumerosQuick1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                        CantidadNumerosQuick1.setBounds(24, 66, 203, 14);
                                                                        PanelQuick.add(CantidadNumerosQuick1);
                                                                        
                                                                        scrollPane_1 = new JScrollPane();
                                                                        scrollPane_1.setBounds(157, 115, 402, 55);
                                                                        PanelQuick.add(scrollPane_1);
                                                                        
                                                                                JTextAreaQuickSort = new JTextArea();
                                                                                scrollPane_1.setViewportView(JTextAreaQuickSort);
                                                                                JTextAreaQuickSort.setEditable(false);
                                                                                
                                                                                labeltodoslosnumerosQuick = new JLabel("Todos los Numeros:");
                                                                                labeltodoslosnumerosQuick.setToolTipText("Todos Los Numeros");
                                                                                labeltodoslosnumerosQuick.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                                                                                labeltodoslosnumerosQuick.setBounds(16, 115, 131, 14);
                                                                                PanelQuick.add(labeltodoslosnumerosQuick);
                                                                                
                                                                                labelnumerosordenadosQuick = new JLabel("Numeros Ordenados:");
                                                                                labelnumerosordenadosQuick.setToolTipText("Todos Los Numeros Ordenados");
                                                                                labelnumerosordenadosQuick.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                                                                                labelnumerosordenadosQuick.setBounds(5, 130, 141, 14);
                                                                                PanelQuick.add(labelnumerosordenadosQuick);
                                                                                
                                                                                JLabel label_4 = new JLabel("MiliSegundos");
                                                                                label_4.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 10));
                                                                                label_4.setBounds(494, 67, 65, 14);
                                                                                PanelQuick.add(label_4);
                                                                                
                                                                                PanelArraySort = new JPanel();
                                                                                PanelArraySort.setBackground(new Color(0, 204, 153));
                                                                                tabbedPane.addTab("ArraysSort", null, PanelArraySort, null);
                                                                                PanelArraySort.setLayout(null);
                                                                                
                                                                                CantidadNumerosArrays = new JLabel("Ingrese Cantidad ");
                                                                                CantidadNumerosArrays.setToolTipText("Ingrese Cantidad de Numeros");
                                                                                CantidadNumerosArrays.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                                CantidadNumerosArrays.setBounds(24, 52, 218, 14);
                                                                                PanelArraySort.add(CantidadNumerosArrays);
                                                                                
                                                                                CantidadNumerosArrays1 = new JLabel("de Numeros a Ordenar:");
                                                                                CantidadNumerosArrays1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                                CantidadNumerosArrays1.setBounds(24, 66, 164, 14);
                                                                                PanelArraySort.add(CantidadNumerosArrays1);
                                                                                
                                                                                TextNumerosArrays = new JTextField();
                                                                                TextNumerosArrays.setToolTipText("Ingrese Cantidad de Numeros");
                                                                                TextNumerosArrays.setColumns(10);
                                                                                TextNumerosArrays.setBounds(182, 63, 86, 20);
                                                                                PanelArraySort.add(TextNumerosArrays);
                                                                                
                                                                                JlabelTiempoEstiamdoArraysSort = new JLabel("Tiempo Estimado:");
                                                                                JlabelTiempoEstiamdoArraysSort.setToolTipText("Tiempo Estimado");
                                                                                JlabelTiempoEstiamdoArraysSort.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                                JlabelTiempoEstiamdoArraysSort.setBounds(296, 66, 114, 14);
                                                                                PanelArraySort.add(JlabelTiempoEstiamdoArraysSort);
                                                                                
                                                                                TiempoEstimadoArrays = new JTextField();
                                                                                TiempoEstimadoArrays.setToolTipText("Tiempo Estimado\r\n");
                                                                                TiempoEstimadoArrays.setEditable(false);
                                                                                TiempoEstimadoArrays.setColumns(10);
                                                                                TiempoEstimadoArrays.setBounds(406, 63, 86, 20);
                                                                                PanelArraySort.add(TiempoEstimadoArrays);
                                                                                
                                                                                labeltodoslosnumerosArrays = new JLabel("Todos los Numeros:");
                                                                                labeltodoslosnumerosArrays.setToolTipText("Todos Los Numeros");
                                                                                labeltodoslosnumerosArrays.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                                                                                labeltodoslosnumerosArrays.setBounds(16, 115, 131, 14);
                                                                                PanelArraySort.add(labeltodoslosnumerosArrays);
                                                                                
                                                                                labelnumerosordenadosArrays = new JLabel("Numeros Ordenados:");
                                                                                labelnumerosordenadosArrays.setToolTipText("Todos Los Numeros Ordenados");
                                                                                labelnumerosordenadosArrays.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                                                                                labelnumerosordenadosArrays.setBounds(5, 130, 141, 14);
                                                                                PanelArraySort.add(labelnumerosordenadosArrays);
                                                                                
                                                                                BotonOrdenadosArraySort = new JButton("<html><Center>Generar Numeros Ordenados<html><Center>");
                                                                                BotonOrdenadosArraySort.setVerticalAlignment(SwingConstants.TOP);
                                                                                BotonOrdenadosArraySort.setToolTipText("Generar Numeros Ordenados\r\n");
                                                                                BotonOrdenadosArraySort.setForeground(Color.BLACK);
                                                                                BotonOrdenadosArraySort.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
                                                                                BotonOrdenadosArraySort.setBackground(Color.RED);
                                                                                BotonOrdenadosArraySort.setBounds(200, 192, 149, 55);
                                                                                PanelArraySort.add(BotonOrdenadosArraySort);
                                                                                
                                                                                BotonRandomArraysSort = new JButton("<html><Center>Generar Numeros Random<html><Center>");
                                                                                BotonRandomArraysSort.addActionListener(new ActionListener() {
                                                                                	public void actionPerformed(ActionEvent arg0) {
                                                                                	}
                                                                                });
                                                                                BotonRandomArraysSort.setVerticalAlignment(SwingConstants.TOP);
                                                                                BotonRandomArraysSort.setToolTipText("Generar Numeros Random");
                                                                                BotonRandomArraysSort.setForeground(Color.BLACK);
                                                                                BotonRandomArraysSort.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
                                                                                BotonRandomArraysSort.setBackground(Color.BLUE);
                                                                                BotonRandomArraysSort.setBounds(386, 192, 149, 55);
                                                                                PanelArraySort.add(BotonRandomArraysSort);
                                                                                
                                                                                scrollPane_3 = new JScrollPane();
                                                                                scrollPane_3.setBounds(157, 115, 402, 55);
                                                                                PanelArraySort.add(scrollPane_3);
                                                                                
                                                                                JTextAreaArraysSort = new JTextArea();
                                                                                scrollPane_3.setViewportView(JTextAreaArraysSort);
                                                                                JTextAreaArraysSort.setEditable(false);
                                                                                
                                                                                JLabel label_5 = new JLabel("MiliSegundos");
                                                                                label_5.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 10));
                                                                                label_5.setBounds(494, 67, 65, 14);
                                                                                PanelArraySort.add(label_5);
                                                                                
                                                                                PanelCollectionSort = new JPanel();
                                                                                PanelCollectionSort.setBackground(new Color(0, 204, 153));
                                                                                tabbedPane.addTab("CollectionSort\r\n", null, PanelCollectionSort, null);
                                                                                PanelCollectionSort.setLayout(null);
                                                                                
                                                                                CantidadNumerosCollection = new JLabel("Ingrese Cantidad ");
                                                                                CantidadNumerosCollection.setToolTipText("Ingrese Cantidad de Numeros");
                                                                                CantidadNumerosCollection.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                                CantidadNumerosCollection.setBounds(24, 52, 218, 14);
                                                                                PanelCollectionSort.add(CantidadNumerosCollection);
                                                                                
                                                                                CantidadNumerosCollection1 = new JLabel("de Numeros a Ordenar:");
                                                                                CantidadNumerosCollection1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                                CantidadNumerosCollection1.setBounds(24, 66, 164, 14);
                                                                                PanelCollectionSort.add(CantidadNumerosCollection1);
                                                                                
                                                                                TextNumerosCollectionSort = new JTextField();
                                                                                TextNumerosCollectionSort.setToolTipText("Ingrese Cantidad de Numeros");
                                                                                TextNumerosCollectionSort.setColumns(10);
                                                                                TextNumerosCollectionSort.setBounds(182, 63, 86, 20);
                                                                                PanelCollectionSort.add(TextNumerosCollectionSort);
                                                                                
                                                                                JlabelTiempoEstiamdoCollectionSort = new JLabel("Tiempo Estimado:");
                                                                                JlabelTiempoEstiamdoCollectionSort.setToolTipText("Tiempo Estimado");
                                                                                JlabelTiempoEstiamdoCollectionSort.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
                                                                                JlabelTiempoEstiamdoCollectionSort.setBounds(296, 66, 114, 14);
                                                                                PanelCollectionSort.add(JlabelTiempoEstiamdoCollectionSort);
                                                                                
                                                                                TiempoEstimadoCollection = new JTextField();
                                                                                TiempoEstimadoCollection.setToolTipText("Tiempo Estimado\r\n");
                                                                                TiempoEstimadoCollection.setEditable(false);
                                                                                TiempoEstimadoCollection.setColumns(10);
                                                                                TiempoEstimadoCollection.setBounds(406, 63, 86, 20);
                                                                                PanelCollectionSort.add(TiempoEstimadoCollection);
                                                                                
                                                                                labeltodoslosnumerosCollection = new JLabel("Todos los Numeros:");
                                                                                labeltodoslosnumerosCollection.setToolTipText("Todos Los Numeros");
                                                                                labeltodoslosnumerosCollection.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                                                                                labeltodoslosnumerosCollection.setBounds(16, 115, 131, 14);
                                                                                PanelCollectionSort.add(labeltodoslosnumerosCollection);
                                                                                
                                                                                labelnumerosordenadosCollection = new JLabel("Numeros Ordenados:");
                                                                                labelnumerosordenadosCollection.setToolTipText("Todos Los Numeros Ordenados");
                                                                                labelnumerosordenadosCollection.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                                                                                labelnumerosordenadosCollection.setBounds(5, 130, 141, 14);
                                                                                PanelCollectionSort.add(labelnumerosordenadosCollection);
                                                                                
                                                                                BotonOrdenadosCollectionSort = new JButton("<html><Center>Generar Numeros Ordenados<html><Center>");
                                                                                BotonOrdenadosCollectionSort.setVerticalAlignment(SwingConstants.TOP);
                                                                                BotonOrdenadosCollectionSort.setToolTipText("Generar Numeros Ordenados\r\n");
                                                                                BotonOrdenadosCollectionSort.setForeground(Color.BLACK);
                                                                                BotonOrdenadosCollectionSort.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
                                                                                BotonOrdenadosCollectionSort.setBackground(Color.RED);
                                                                                BotonOrdenadosCollectionSort.setBounds(200, 192, 149, 55);
                                                                                PanelCollectionSort.add(BotonOrdenadosCollectionSort);
                                                                                
                                                                                BotonRandomCollectionSort = new JButton("<html><Center>Generar Numeros Random<html><Center>");
                                                                                BotonRandomCollectionSort.setVerticalAlignment(SwingConstants.TOP);
                                                                                BotonRandomCollectionSort.setToolTipText("Generar Numeros Random");
                                                                                BotonRandomCollectionSort.setForeground(Color.BLACK);
                                                                                BotonRandomCollectionSort.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
                                                                                BotonRandomCollectionSort.setBackground(Color.BLUE);
                                                                                BotonRandomCollectionSort.setBounds(386, 192, 149, 55);
                                                                                PanelCollectionSort.add(BotonRandomCollectionSort);
                                                                                
                                                                                scrollPane_4 = new JScrollPane();
                                                                                scrollPane_4.setBounds(157, 115, 402, 55);
                                                                                PanelCollectionSort.add(scrollPane_4);
                                                                                
                                                                                JTextAreaCollectionSort = new JTextArea();
                                                                                scrollPane_4.setViewportView(JTextAreaCollectionSort);
                                                                                JTextAreaCollectionSort.setEditable(false);
                                                                                
                                                                                JLabel label_6 = new JLabel("MiliSegundos");
                                                                                label_6.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 10));
                                                                                label_6.setBounds(494, 67, 65, 14);
                                                                                PanelCollectionSort.add(label_6);
                                                                                
                                                                                PanelComparacion = new JPanel();
                                                                                PanelComparacion.setBackground(new Color(0, 204, 153));
                                                                                tabbedPane.addTab("Comparaci\u00F3n", null, PanelComparacion, null);
                                                                                PanelComparacion.setLayout(null);
                                                                                
                                                                                BotonComparacionInsert = new JButton("InsertionSort");
                                                                                BotonComparacionInsert.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
                                                                                BotonComparacionInsert.setBackground(new Color(173, 255, 47));
                                                                                BotonComparacionInsert.setBounds(10, 53, 111, 33);
                                                                                PanelComparacion.add(BotonComparacionInsert);
                                                                                
                                                                                BotonComparacionMerge = new JButton("MergeSort");
                                                                                BotonComparacionMerge.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
                                                                                BotonComparacionMerge.setBackground(new Color(0, 206, 209));
                                                                                BotonComparacionMerge.setBounds(410, 53, 111, 33);
                                                                                PanelComparacion.add(BotonComparacionMerge);
                                                                                
                                                                                BotonComparacionQuick = new JButton("QuickSort");
                                                                                BotonComparacionQuick.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
                                                                                BotonComparacionQuick.setBackground(new Color(218, 165, 32));
                                                                                BotonComparacionQuick.setBounds(230, 135, 111, 33);
                                                                                PanelComparacion.add(BotonComparacionQuick);
                                                                                
                                                                                BotonComparacionArrays = new JButton("ArraysSort");
                                                                                BotonComparacionArrays.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
                                                                                BotonComparacionArrays.setBackground(new Color(147, 112, 219));
                                                                                BotonComparacionArrays.setBounds(10, 135, 111, 33);
                                                                                PanelComparacion.add(BotonComparacionArrays);
                                                                                
                                                                                BotonComparacionCollection = new JButton("CollectionSort");
                                                                                BotonComparacionCollection.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
                                                                                BotonComparacionCollection.setBackground(new Color(220, 20, 60));
                                                                                BotonComparacionCollection.setBounds(414, 135, 111, 33);
                                                                                PanelComparacion.add(BotonComparacionCollection);
                                                                                
                                                                                scrollPane_5 = new JScrollPane();
                                                                                scrollPane_5.setBounds(151, 213, 360, 55);
                                                                                PanelComparacion.add(scrollPane_5);
                                                                                
                                                                                textAreaTabla = new JTextArea();
                                                                                scrollPane_5.setViewportView(textAreaTabla);
                                                                                textAreaTabla.setEditable(false);
                                                                                
                                                                                JTextComparacionInsert = new JTextField();
                                                                                JTextComparacionInsert.setEditable(false);
                                                                                JTextComparacionInsert.setBounds(25, 91, 65, 20);
                                                                                PanelComparacion.add(JTextComparacionInsert);
                                                                                JTextComparacionInsert.setColumns(10);
                                                                                
                                                                                JTextComparacionArrays = new JTextField();
                                                                                JTextComparacionArrays.setEditable(false);
                                                                                JTextComparacionArrays.setBounds(25, 173, 65, 20);
                                                                                PanelComparacion.add(JTextComparacionArrays);
                                                                                JTextComparacionArrays.setColumns(10);
                                                                                
                                                                                JTextComparacionQuick = new JTextField();
                                                                                JTextComparacionQuick.setEditable(false);
                                                                                JTextComparacionQuick.setBounds(255, 173, 65, 20);
                                                                                PanelComparacion.add(JTextComparacionQuick);
                                                                                JTextComparacionQuick.setColumns(10);
                                                                                
                                                                                JTextComparacionMerge = new JTextField();
                                                                                JTextComparacionMerge.setEditable(false);
                                                                                JTextComparacionMerge.setBounds(420, 91, 65, 20);
                                                                                PanelComparacion.add(JTextComparacionMerge);
                                                                                JTextComparacionMerge.setColumns(10);
                                                                                
                                                                                JTextComparacionCollection = new JTextField();
                                                                                JTextComparacionCollection.setEditable(false);
                                                                                JTextComparacionCollection.setBounds(420, 173, 65, 20);
                                                                                PanelComparacion.add(JTextComparacionCollection);
                                                                                JTextComparacionCollection.setColumns(10);
                                                                                
                                                                                LabelComparar = new JLabel("Comparar:");
                                                                                LabelComparar.setFont(new Font("Impact", Font.PLAIN, 14));
                                                                                LabelComparar.setBounds(255, 25, 65, 14);
                                                                                PanelComparacion.add(LabelComparar);
                                                                                
                                                                                TextCompararNumeros = new JTextField();
                                                                                TextCompararNumeros.setToolTipText("Ingresar Cantidad de Numeros");
                                                                                TextCompararNumeros.setBounds(242, 41, 86, 20);
                                                                                PanelComparacion.add(TextCompararNumeros);
                                                                                TextCompararNumeros.setColumns(10);
                                                                                
                                                                                lblIngresarCantidadDe = new JLabel("Ingresar Cantidad de Numeros a\r\n");
                                                                                lblIngresarCantidadDe.setFont(new Font("Impact", Font.PLAIN, 14));
                                                                                lblIngresarCantidadDe.setBounds(203, 5, 197, 14);
                                                                                PanelComparacion.add(lblIngresarCantidadDe);
                                                                                
                                                                                JButtonComparar = new JButton("<html><Center>Comparar<html><Center>");
                                                                                JButtonComparar.setForeground(new Color(255, 255, 255));
                                                                                JButtonComparar.setBackground(new Color(0, 0, 0));
                                                                                JButtonComparar.setFont(new Font("Sitka Small", Font.PLAIN, 11));
                                                                                JButtonComparar.setVerticalAlignment(SwingConstants.TOP);
                                                                                JButtonComparar.setBounds(242, 63, 88, 23);
                                                                                PanelComparacion.add(JButtonComparar);
                                                                                
                                                                                nano1 = new JLabel("MiliSegundos");
                                                                                nano1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 10));
                                                                                nano1.setBounds(92, 95, 86, 14);
                                                                                PanelComparacion.add(nano1);
                                                                                
                                                                                nano2 = new JLabel("MiliSegundos");
                                                                                nano2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 10));
                                                                                nano2.setBounds(92, 176, 86, 14);
                                                                                PanelComparacion.add(nano2);
                                                                                
                                                                                nano4 = new JLabel("MiliSegundos");
                                                                                nano4.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 10));
                                                                                nano4.setBounds(487, 177, 76, 14);
                                                                                PanelComparacion.add(nano4);
                                                                                
                                                                                nano3 = new JLabel("MiliSegundos");
                                                                                nano3.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 10));
                                                                                nano3.setBounds(487, 94, 76, 14);
                                                                                PanelComparacion.add(nano3);
                                                                                
                                                                                nano5 = new JLabel("MiliSegundos");
                                                                                nano5.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 10));
                                                                                nano5.setBounds(324, 179, 86, 14);
                                                                                PanelComparacion.add(nano5);
                                                                                
                                                                                label = new JLabel("Todos los Numeros:");
                                                                                label.setToolTipText("Todos Los Numeros");
                                                                                label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                                                                                label.setBounds(22, 215, 129, 14);
                                                                                PanelComparacion.add(label);
                                                                                
                                                                                label_1 = new JLabel("Numeros Ordenados:");
                                                                                label_1.setToolTipText("Todos Los Numeros Ordenados");
                                                                                label_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                                                                                label_1.setBounds(10, 229, 141, 14);
                                                                                PanelComparacion.add(label_1);
    }
}