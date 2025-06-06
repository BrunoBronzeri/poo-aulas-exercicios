import javax.swing.*;
import java.awt.*;

public class Exercicio3 extends JFrame {
    public Exercicio3() {
        setTitle("Exercício 3");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel campos = new JPanel(new GridLayout(2, 1));
        campos.add(new JTextField(20));
        campos.add(new JTextField(20));
        add(campos, BorderLayout.NORTH);

        JPanel botoes = new JPanel();
        botoes.add(new JButton("Salvar"));
        botoes.add(new JButton("Limpar"));
        add(botoes, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Exercicio3().setVisible(true);
    }
}
