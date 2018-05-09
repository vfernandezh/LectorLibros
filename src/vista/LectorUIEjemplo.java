package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class LectorUIEjemplo extends JFrame {

	private JPanel contentPane;
	protected JTextArea textArea;
	protected JButton btnAtras;
	protected JButton btnMarcar;
	protected JButton btnIrAMarca;
	protected JButton btnAlante;
	protected JLabel lblNumeroPagina;

	/**
	 * Create the frame.
	 */
	public LectorUIEjemplo() {
		setTitle("Lector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 490);
		setResizable(false);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		contentPane.add(textArea, BorderLayout.CENTER);

		// Panel de botones
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		lblNumeroPagina = new JLabel("0");
		btnAtras = new JButton("<<");
		btnAlante = new JButton(">>");
		btnMarcar = new JButton("Marcar");
		btnIrAMarca = new JButton("Ir a Marca");

		panel.add(btnAtras);
		panel.add(btnMarcar);
		panel.add(btnIrAMarca);
		panel.add(btnAlante);
		panel.add(lblNumeroPagina);

	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public JButton getBtnAtras() {
		return btnAtras;
	}

	public JButton getBtnMarcar() {
		return btnMarcar;
	}

	public JButton getBtnIrAMarca() {
		return btnIrAMarca;
	}

	public JButton getBtnAlante() {
		return btnAlante;
	}

	public JLabel getLblNumeroPagina() {
		return lblNumeroPagina;
	}

}
