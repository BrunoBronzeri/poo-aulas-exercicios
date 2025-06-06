import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Principal {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		
		janela.setSize(1024, 768);
		janela.getContentPane().setBackground(Color.CYAN);

		janela.getContentPane().setLayout(new FlowLayout());
		
        JButton jbtn1 = new JButton("Botão 1");
        janela.add(jbtn1);
		
		JButton jbtn2 = new JButton("Botão 2");
        janela.add(jbtn2);
		
        janela.setVisible(true);
		
	}
}