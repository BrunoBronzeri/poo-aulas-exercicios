import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 1");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        JTextField campo1 = new JTextField(20);
        JTextField campo2 = new JTextField(20);
        JButton salvar = new JButton("Salvar");
        JButton limpar = new JButton("Limpar");

        painel.add(campo1);
        painel.add(campo2);
        painel.add(salvar);
        painel.add(limpar);

        frame.add(painel);
        frame.setVisible(true);
    }
}
