import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrincipalBorderLayout {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		
		janela.setSize(1024, 768);
		janela.getContentPane().setBackground(Color.CYAN);

		janela.getContentPane().setLayout(new BorderLayout());
		
        JButton jbtn1 = new JButton("Botão 1");
        janela.add(jbtn1, BorderLayout.NORTH);		
		JButton jbtn2 = new JButton("Botão 2");
        janela.add(jbtn2, BorderLayout.SOUTH);
        JButton jbtn3 = new JButton("Botão 3");
        janela.add(jbtn3, BorderLayout.EAST);		
		JButton jbtn4 = new JButton("Botão 4");
        janela.add(jbtn4, BorderLayout.WEST);

        JPanel jCentralPanel = new JPanel();
        jCentralPanel.setLayout(new FlowLayout());
        JTextField jtxtf1 = new JTextField("Digite aqui...", 20);
        jCentralPanel.add(jtxtf1);
        JButton jbtn5 = new JButton("Botão 5");
        jCentralPanel.add(jbtn5);

        janela.add(jCentralPanel, BorderLayout.CENTER);
		
        janela.setVisible(true);
		
	}
}