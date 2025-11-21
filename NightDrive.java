import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NightDrive extends JFrame implements ActionListener {

    private JButton boton1;
    private JPanel hojita;
    public static void main(String[] args) {

        NightDrive frame = new NightDrive();
        frame.setSize(500, 700);
        frame.createGUI();
        frame.setVisible(true);
        frame.setTitle("Night Drive");
    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        hojita = new JPanel();
        hojita.setPreferredSize(new Dimension(400, 600));
        hojita.setBackground(Color.white);
        window.add(hojita);

        boton1 = new JButton("Oprimir");
        window.add(boton1);
        boton1.addActionListener(this);
    }

    int escala = 4;

    public void actionPerformed(ActionEvent event) {
        Graphics lapiz = hojita.getGraphics();
        
        // rosa oscuro
        lapiz.setColor(new Color(223, 65, 85));


        // color negro
        lapiz.setColor(Color.black);
        lapiz.fillRect(67 * escala, 136 * escala, 15 * escala, 1 * escala);
        lapiz.fillRect(65 * escala, 135 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(72 * escala, 135 * escala, 12 * escala, 1 * escala);
        lapiz.fillRect(63 * escala, 134 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(71 * escala, 134 * escala, 14 * escala, 1 * escala);
        lapiz.fillRect(90 * escala, 134 * escala, 1 * escala, 1 * escala);
        lapiz.fillRect(61 * escala, 133 * escala, 6 * escala, 1 * escala);
        lapiz.fillRect(70 * escala, 133 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(76 * escala, 133 * escala, 17 * escala, 1 * escala);
        lapiz.fillRect(64 * escala, 132 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(63 * escala, 131 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(78 * escala, 122 * escala, 3 * escala, 12 * escala);
        lapiz.fillRect(78 * escala, 120 * escala, 2 * escala, 2 * escala);
        lapiz.fillRect(77 * escala, 113 * escala, 1 * escala, 8 * escala);
        lapiz.fillRect(76 * escala, 112 * escala, 1 * escala, 5 * escala);
        lapiz.fillRect(75 * escala, 110 * escala, 1 * escala, 4 * escala);
        lapiz.fillRect(80 * escala, 116 * escala, 1 * escala, 4 * escala);
        lapiz.fillRect(81 * escala, 114 * escala, 1 * escala, 4 * escala);
        lapiz.fillRect(82 * escala, 112 * escala, 1 * escala, 3 * escala);
        lapiz.fillRect(81 * escala, 125 * escala, 1 * escala, 5 * escala);
        lapiz.fillRect(82 * escala, 124 * escala, 1 * escala, 5 * escala);
        lapiz.fillRect(83 * escala, 122 * escala, 1 * escala, 6 * escala);
        lapiz.fillRect(84 * escala, 121 * escala, 1 * escala, 7 * escala);
        lapiz.fillRect(85 * escala, 119 * escala, 1 * escala, 5 * escala);
        lapiz.fillRect(86 * escala, 117 * escala, 1 * escala, 4 * escala);
        lapiz.fillRect(84 * escala, 126 * escala, 2 * escala, 2 * escala);
        lapiz.fillRect(86 * escala, 125 * escala, 2 * escala, 2 * escala);
        lapiz.fillRect(88 * escala, 124 * escala, 1 * escala, 2 * escala);
        lapiz.fillRect(82 * escala, 132 * escala, 12 * escala, 1 * escala);
        lapiz.fillRect(86 * escala, 131 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(70 * escala, 132 * escala, 4 * escala, 1 * escala);
        lapiz.fillRect(69 * escala, 131 * escala, 4 * escala, 1 * escala);
        lapiz.fillRect(68 * escala, 130 * escala,  5 * escala, 1 * escala);
        lapiz.fillRect(67 * escala, 129 * escala, 4 * escala, 1 * escala);
        lapiz.fillRect(65 * escala, 128 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(63 * escala, 127 * escala, 8 * escala, 1 * escala);
        lapiz.fillRect(62 * escala, 126 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(69 * escala, 123 * escala, 3 * escala, 4 * escala);
        lapiz.fillRect(60 * escala, 125 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(68 * escala, 122 * escala, 2 * escala, 3 * escala);
        lapiz.fillRect(67 * escala, 121 * escala, 2 * escala, 2 * escala);
        lapiz.fillRect(67 * escala, 119 * escala, 1 * escala, 2 * escala);
        lapiz.fillRect(71 * escala, 121 * escala, 2 * escala, 4 * escala);
        lapiz.fillRect(72 * escala, 117 * escala, 1 * escala, 4 * escala);
        lapiz.fillRect(78 * escala, 116 * escala, 1 * escala, 1 * escala);
        lapiz.fillRect(77 * escala, 117 * escala, 4 * escala, 3 * escala);

        lapiz.fillRect(67 * escala, 54 * escala, 7 * escala, 1 * escala);
        lapiz.fillRect(69 * escala, 53 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(69 * escala, 55 * escala, 9 * escala, 1 * escala);
        lapiz.fillRect(72 * escala, 50 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(76 * escala, 50 * escala, 1 * escala, 1 * escala);
        lapiz.fillRect(73 * escala, 51 * escala, 2 * escala, 2 * escala);
        lapiz.fillRect(75 * escala, 52 * escala, 1 * escala, 2 * escala);
        lapiz.fillRect(76 * escala, 51 * escala, 2 * escala, 8 * escala);

        // cafe oscuro
        lapiz.setColor(new Color(58, 56, 44));
    }
}