package PaqC01;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiseñoContenedores extends JFrame {
    private JLabel NumId;
    private JTextField NumIdtext;
    private JLabel Peso;
    private JTextField Pesotext;
    private JLabel Desc;
    private JTextArea Desctext;
    private JLabel Emp_rem;
    private JLabel Emp_rec;
    private JTextField Emp_rectext;
    private JLabel Pais_proc;
    private JComboBox Pais_procbox;
    private JLabel Prior;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JCheckBox Insp_Aduanas;
    private JPanel mainPanel;
    private JTextField Emp_remtext;
    private JLabel Ops;
    private JButton Ap_button;
    private JButton Desap_button;
    private JTextField numCol_text;
    private JButton ContData_button;
    private JTextField ID_text;
    private JButton Cuantos_button;
    private JComboBox cuantosPais_box;
    private JTextField Cant_text;
    private JPanel auxPanel;
    private JLabel Estado;
    private JTextArea Estad_text;
    private JLabel Logo;
    private JLabel Mensajes;

    public DiseñoContenedores() {
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(1500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        NumIdtext.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                Mensajes.setText("Introduzca el número de identificación.");
                try {
                    int dato =Integer.parseInt(NumIdtext.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "El dato no es un entero, vuelve a teclearlo.");
                }
            }
        });
        Pesotext.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                Mensajes.setText("Introduzca el peso en toneladas.");
                try {
                    int dato = Integer.parseInt(Pesotext.getText());
                } catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"El dato no es un entero, vuelve a teclearlo.");
                }
            }
        });
        Desctext.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                Mensajes.setText("Complete la descripción del contenido.");
                //En este apartado no imponemos restricción
            }
        });
        Emp_remtext.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                Mensajes.setText("Escriba el nombre de la empresa remitente.");
                try {
                    Integer.toString(Integer.parseInt(Emp_remtext.getText()));
                    JOptionPane.showMessageDialog(null,"El dato no es correcto (debe ser String), vuelve a teclearlo.");
                } catch(NumberFormatException ex) {
                }
            }
        });
        Emp_rectext.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                Mensajes.setText("Escriba el nombre de la empresa receptora.");
                try {
                    Integer.toString(Integer.parseInt(Emp_rectext.getText()));
                    JOptionPane.showMessageDialog(null,"El dato no es correcto (debe ser String), vuelve a teclearlo.");
                } catch(NumberFormatException ex) {
                }
            }
        });
        Ap_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensajes.setText("Contenedor apilado.");
            }
        });
        Desap_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensajes.setText("Contenedor desapilado.");
            }
        });
        numCol_text.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                Mensajes.setText("Introduzca el número de columna de la que hay que desapilar");
                try {
                    int dato = Integer.parseInt(numCol_text.getText());
                } catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"El dato no es un entero, vuelve a teclearlo.");
                }
            }
        });
        ContData_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensajes.setText("Mostrando datos del contenedor.");
                DiseñoContenedoresP2 newframe = new DiseñoContenedoresP2();
                newframe.setVisible(true);
            }
        });
        ID_text.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                Mensajes.setText("Introduzca el ID del contenedor");
                try {
                    int dato = Integer.parseInt(ID_text.getText());
                } catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"El dato no es válido para la ID.");
                }
            }
        });
        Cuantos_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensajes.setText("Cantidad registrada.");
            }
        });
        cuantosPais_box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensajes.setText("Ciudad.");
            }
        });
        Cant_text.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                Mensajes.setText("Introduzca la cantidad");
                try {
                    int dato = Integer.parseInt(Cant_text.getText());
                } catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"El dato no es un entero, vuelve a teclearlo.");
                }
            }
        });
        Pais_procbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensajes.setText("País de procedencia registrado.");
            }
        });
        a1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensajes.setText("Prioridad anotada (Marque solo una).");
            }
        });
        a2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensajes.setText("Prioridad anotada (Marque solo una).");
            }
        });
        a3RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensajes.setText("Prioridad anotada (Marque solo una).");
            }
        });
        Insp_Aduanas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mensajes.setText("Inspección confirmada.");
            }
        });
        Estad_text.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                Mensajes.setText("Plano del hub.");
            }
        });
    }

    public DiseñoContenedores(JLabel logo) throws HeadlessException {
        Logo = logo;
        Logo.setSize(150, 128);
    }

    public static void main(String[] args) {
        DiseñoContenedores cont = new DiseñoContenedores();
    }
}
