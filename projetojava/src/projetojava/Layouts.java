package projetojava;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts extends JFrame {

	Layouts() {

		JPanel pa = new JPanel();
		pa.setLayout(new BorderLayout());
		pa.add(new JButton("Welcome"), BorderLayout.NORTH);
		pa.add(new JButton("Geeks"), BorderLayout.SOUTH);
		pa.add(new JButton("Layout"), BorderLayout.EAST);
		pa.add(new JButton("Border"), BorderLayout.WEST);
		pa.add(new JButton("GeeksforGeeks"), BorderLayout.CENTER);
		add(pa);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Layouts();
	}
}
