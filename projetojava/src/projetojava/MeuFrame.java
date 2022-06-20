package projetojava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame implements ActionListener{
	
	public MeuFrame() {
		
		super ("Meu Frame");
		
		JButton botão = new JButton("Clique");
		botão.addActionListener(this);
		getContentPane().add(botão);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MeuFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Parabéns, você clicou!");
	}
}
