import javax.swing.*;
import java.awt.*;

public class Exercicio2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 2");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel camposPanel = new JPanel();
        camposPanel.setLayout(new GridLayout(2, 1));
        camposPanel.add(new JTextField(20));
        camposPanel.add(new JTextField(20));
        frame.add(camposPanel, BorderLayout.NORTH);

        JPanel botoesPanel = new JPanel();
        botoesPanel.add(new JButton("Salvar"));
        botoesPanel.add(new JButton("Limpar"));
        frame.add(botoesPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
