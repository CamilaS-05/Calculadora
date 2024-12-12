package Calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class interfaz {
	



	    public static void main(String[] args) {
	        // Crear el marco de la calculadora
	        JFrame frame = new JFrame("Calculadora");
	        frame.setSize(400, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new GridLayout(5, 2));

	        // Crear componentes
	        JLabel labelNum1 = new JLabel("Primer número:");
	        JTextField textNum1 = new JTextField();

	        JLabel labelNum2 = new JLabel("Segundo número:");
	        JTextField textNum2 = new JTextField();

	        JLabel labelResultado = new JLabel("Resultado:");
	        JTextField textResultado = new JTextField();
	        textResultado.setEditable(false);

	        JButton buttonSumar = new JButton("Sumar");
	        JButton buttonRestar = new JButton("Restar");
	        JButton buttonMultiplicar = new JButton("Multiplicar");
	        JButton buttonDividir = new JButton("Dividir");

	        // Añadir ActionListener a los botones
	        buttonSumar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    double num1 = Double.parseDouble(textNum1.getText());
	                    double num2 = Double.parseDouble(textNum2.getText());
	                    double resultado = num1 + num2;
	                    textResultado.setText(String.valueOf(resultado));
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });

	        buttonRestar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    double num1 = Double.parseDouble(textNum1.getText());
	                    double num2 = Double.parseDouble(textNum2.getText());
	                    double resultado = num1 - num2;
	                    textResultado.setText(String.valueOf(resultado));
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });

	        buttonMultiplicar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    double num1 = Double.parseDouble(textNum1.getText());
	                    double num2 = Double.parseDouble(textNum2.getText());
	                    double resultado = num1 * num2;
	                    textResultado.setText(String.valueOf(resultado));
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });

	        buttonDividir.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    double num1 = Double.parseDouble(textNum1.getText());
	                    double num2 = Double.parseDouble(textNum2.getText());
	                    if (num2 == 0) {
	                        throw new ArithmeticException("No se puede dividir entre cero.");
	                    }
	                    double resultado = num1 / num2;
	                    textResultado.setText(String.valueOf(resultado));
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
	                } catch (ArithmeticException ex) {
	                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });

	        // Añadir componentes al marco
	        frame.add(labelNum1);
	        frame.add(textNum1);

	        frame.add(labelNum2);
	        frame.add(textNum2);

	        frame.add(buttonSumar);
	        frame.add(buttonRestar);

	        frame.add(buttonMultiplicar);
	        frame.add(buttonDividir);

	        frame.add(labelResultado);
	        frame.add(textResultado);

	        // Hacer visible el marco
	        frame.setVisible(true);
	    }
	}



