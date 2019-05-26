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
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

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
    private JLabel lblNumeros;
    private JLabel lblNumerosordenados;

    public GUI1() {
    	setTitle("Dise\u00F1o y An\u00E1lisis de Algoritmos --- Algoritmos de Ordenamiento\r\n");
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
        PanelInsertion.setToolTipText("");
        tabbedPane.addTab("Insertion Sort", null, PanelInsertion, null);
        PanelInsertion.setLayout(null);

        CantidadNumerosInsertion = new JLabel("Ingrese Cantidad ");
        CantidadNumerosInsertion.setToolTipText("Ingrese Cantidad de Numeros");
        CantidadNumerosInsertion.setBounds(25, 41, 218, 14);
        PanelInsertion.add(CantidadNumerosInsertion);

        CantidadNumerosInsertion1 = new JLabel("de Numeros a Ordenar:");
        CantidadNumerosInsertion1.setBounds(25, 66, 205, 14);
        PanelInsertion.add(CantidadNumerosInsertion1);

        TextNumerosInsertion = new JTextField();
        TextNumerosInsertion.setToolTipText("Ingrese Cantidad de Numeros");
        TextNumerosInsertion.setColumns(10);
        TextNumerosInsertion.setBounds(25, 91, 86, 20);
        PanelInsertion.add(TextNumerosInsertion);

        JlabelTiempoEstiamdoInsertionSort = new JLabel("Tiempo Estimado:");
        JlabelTiempoEstiamdoInsertionSort.setBounds(22, 158, 101, 14);
        PanelInsertion.add(JlabelTiempoEstiamdoInsertionSort);

        TiempoEstimadoInsertion = new JTextField();
        TiempoEstimadoInsertion.setToolTipText("Tiempo Estimado\r\n");
        TiempoEstimadoInsertion.setEditable(false);
        TiempoEstimadoInsertion.setColumns(10);
        TiempoEstimadoInsertion.setBounds(23, 183, 86, 20);
        PanelInsertion.add(TiempoEstimadoInsertion);

        JTextAreaInsertionSort = new JTextArea();
        JTextAreaInsertionSort.setEditable(false);
        JTextAreaInsertionSort.setBounds(213, 127, 334, 134);
        PanelInsertion.add(JTextAreaInsertionSort);

        BotonOrdenadosInsertionSort = new JButton("Generar Numeros Ordenados");
        BotonOrdenadosInsertionSort.setToolTipText("Generar Numeros Random");
        BotonOrdenadosInsertionSort.setBounds(313, 86, 210, 30);
        PanelInsertion.add(BotonOrdenadosInsertionSort);

        BotonRandomInssertionSort = new JButton("Generar Numeros Random");
        BotonRandomInssertionSort.setToolTipText("Generar Numeros Random");
        BotonRandomInssertionSort.setBounds(313, 44, 210, 30);
        PanelInsertion.add(BotonRandomInssertionSort);

        PanelMerge = new JPanel();
        PanelMerge.setToolTipText("Merge Sort");
        PanelMerge.setBackground(SystemColor.activeCaption);
        tabbedPane.addTab("Merge Sort\r\n", null, PanelMerge, null);
        PanelMerge.setLayout(null);

        CantidadNumerosMerge = new JLabel("Ingrese Cantidad ");
        CantidadNumerosMerge.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
        CantidadNumerosMerge.setToolTipText("Ingrese Cantidad de Numeros");
        CantidadNumerosMerge.setBounds(24, 52, 218, 14);
        PanelMerge.add(CantidadNumerosMerge);

        CantidadNumerosMerge1 = new JLabel("de Numeros a Ordenar:");
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
        JlabelTiempoEstiamdoMergeSort.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
        JlabelTiempoEstiamdoMergeSort.setBounds(324, 66, 114, 14);
        PanelMerge.add(JlabelTiempoEstiamdoMergeSort);

        TiempoEstimadoMerge = new JTextField();
        TiempoEstimadoMerge.setToolTipText("Tiempo Estimado\r\n");
        TiempoEstimadoMerge.setEditable(false);
        TiempoEstimadoMerge.setColumns(10);
        TiempoEstimadoMerge.setBounds(449, 63, 86, 20);
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
                
        lblNumeros = new JLabel("Todos los Numeros:");
        lblNumeros.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
        lblNumeros.setBounds(16, 115, 131, 14);
        PanelMerge.add(lblNumeros);
                
        lblNumerosordenados = new JLabel("Numeros Ordenados:");
        lblNumerosordenados.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
        lblNumerosordenados.setBounds(5, 130, 141, 14);
        PanelMerge.add(lblNumerosordenados);

        PanelQuick = new JPanel();
        PanelQuick.setToolTipText("Quick Sort\r\n");
        PanelQuick.setBackground(SystemColor.activeCaption);
        tabbedPane.addTab("Quick Sort\r\n", null, PanelQuick, null);
        PanelQuick.setLayout(null);

        BotonRandomQuickSort = new JButton("<html><Center>Generar Numeros Random<html><Center>");
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
        TiempoEstimadoQuick.setBounds(449, 63, 86, 20);
        PanelQuick.add(TiempoEstimadoQuick);
        TiempoEstimadoQuick.setColumns(10);

        JlabelTiempoEstiamdoQuickSort = new JLabel("Tiempo Estimado:");
        JlabelTiempoEstiamdoQuickSort.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
        JlabelTiempoEstiamdoQuickSort.setBounds(324, 66, 123, 14);
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
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(157, 115, 402, 55);
        PanelQuick.add(scrollPane_1);
        
                JTextAreaQuickSort = new JTextArea();
                scrollPane_1.setViewportView(JTextAreaQuickSort);
                JTextAreaQuickSort.setEditable(false);
                
                JLabel label = new JLabel("Todos los Numeros:");
                label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                label.setBounds(16, 115, 131, 14);
                PanelQuick.add(label);
                
                JLabel label_1 = new JLabel("Numeros Ordenados:");
                label_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
                label_1.setBounds(5, 130, 141, 14);
                PanelQuick.add(label_1);
    }
}