import javax.swing.*;
import java.awt.*;

public class Exercicio4 extends JFrame {
    public Exercicio4() {
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

        // Adicione no Exercicio3

        JButton salvar = new JButton("Salvar");
        salvar.addActionListener(new BotaoSalvarClick());
        botoes.add(salvar);

        // Inner class
        class BotaoSalvarClick implements java.awt.event.ActionListener {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Botão Salvar clicado!");
            }
        }

    }

    public static void main(String[] args) {
        new Exercicio4().setVisible(true);
    }
    
}
