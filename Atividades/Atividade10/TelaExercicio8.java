import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaExercicio8 extends JFrame {
    private JTextField campo1;
    private JTextField campo2;
    private JLabel labelTecla;
    private JLabel labelMouse;
    private JLabel labelMovel;

    public TelaExercicio8() {
        setTitle("Exercícios 1 a 8");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel superior com campos de texto
        JPanel painelCampos = new JPanel(new GridLayout(2, 1));
        campo1 = new JTextField(20);
        campo2 = new JTextField(20);
        painelCampos.add(campo1);
        painelCampos.add(campo2);
        add(painelCampos, BorderLayout.NORTH);

        // Painel inferior com botões
        JPanel painelBotoes = new JPanel();
        JButton botaoSalvar = new JButton("Salvar");
        botaoSalvar.addActionListener(new BotaoSalvarClick());
        painelBotoes.add(botaoSalvar);

        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.addActionListener(e -> {
            campo1.setText("");
            campo2.setText("");
        });
        painelBotoes.add(botaoLimpar);
        add(painelBotoes, BorderLayout.SOUTH);
        
        // Label à esquerda para mostrar coordenadas do mouse
        labelMouse = new JLabel("Coordenadas (dentro dos inputs): X =    , Y =     ");
        // Adiciona labelMouse com margem à esquerda (WEST)
        JPanel painelOeste = new JPanel(new BorderLayout());
        painelOeste.setBorder(BorderFactory.createEmptyBorder(0, 50, 420, 0)); // 50px da borda esquerda
        painelOeste.add(labelMouse, BorderLayout.CENTER);
        add(painelOeste, BorderLayout.WEST);        
        
        // Painel central contendo tanto o label de tecla quanto o componente móvel
        labelTecla = new JLabel("Última tecla: ");
        labelTecla.setHorizontalAlignment(SwingConstants.CENTER);
        labelTecla.setBounds(200, 20, 400, 30);

        // Adicionar listener de tecla
        KeyListener keyListener = new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                labelTecla.setText("Última tecla: " + e.getKeyChar());
            }
        };
        campo1.addKeyListener(keyListener);
        campo2.addKeyListener(keyListener);

        // Adicionar listener de movimento do mouse
        MouseMotionListener mouseMotionListener = new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                labelMouse.setText("Coordenadas (dentro dos inputs): X = " + e.getX() + ", Y = " + e.getY());
            }
        };
        campo1.addMouseMotionListener(mouseMotionListener);
        campo2.addMouseMotionListener(mouseMotionListener);

        // Label móvel no centro
        labelMovel = new JLabel("Arraste-me");
        labelMovel.setOpaque(true);
        labelMovel.setBackground(Color.LIGHT_GRAY);
        labelMovel.setBounds(300, 100, 100, 30); 

        JPanel painelCentro = new JPanel(null); // Layout nulo para posicionamento absoluto
        painelCentro.add(labelTecla);
        painelCentro.add(labelMovel);
        add(painelCentro, BorderLayout.CENTER);

        // Lógica de arrasto
        labelMovel.addMouseListener(new MouseAdapter() {
            // Point offset;

            public void mousePressed(MouseEvent e) {
            //     offset = e.getPoint();
            //    labelMovel.putClientProperty("offset", offset);
            }
        });

        labelMovel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point novaPos = labelMovel.getLocation();
                novaPos.translate(e.getX() - labelMovel.getX(), e.getY() - labelMovel.getY());
                labelMovel.setLocation(novaPos);
            }
        });
    }

    // Inner class do botão Salvar
    private class BotaoSalvarClick implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Botão Salvar clicado!");
        }
    }
}
