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
        lapiz.fillRect(72 * escala, 56 * escala, 7 * escala, 1 * escala);
        lapiz.fillRect(74 * escala, 57 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(76 * escala, 58 * escala, 4 * escala, 1 * escala);
        lapiz.fillRect(77 * escala, 59 * escala, 9 * escala, 1 * escala);
        lapiz.fillRect(82 * escala, 56 * escala, 3 * escala, 3 * escala);
        lapiz.fillRect(83 * escala, 51 * escala, 2 * escala, 5 * escala);
        lapiz.fillRect(84 * escala, 48 * escala, 1 * escala, 3 * escala);
        lapiz.fillRect(85 * escala, 52 * escala, 1 * escala, 3 * escala);
        lapiz.fillRect(86 * escala, 51 * escala, 1 * escala, 3 * escala);
        lapiz.fillRect(87 * escala, 49 * escala, 1 * escala, 4 * escala);
        lapiz.fillRect(88 * escala, 47 * escala, 1 * escala, 4 * escala);
        lapiz.fillRect(79 * escala, 48 * escala, 1 * escala, 2 * escala);
        lapiz.fillRect(80 * escala, 49 * escala, 1 * escala, 2 * escala);
        lapiz.fillRect(81 * escala, 50 * escala, 2 * escala, 2 * escala);
        lapiz.fillRect(82 * escala, 52 * escala, 1 * escala, 1 * escala);
        lapiz.fillRect(78 * escala, 60 * escala, 6 * escala, 1 * escala);
        lapiz.fillRect(79 * escala, 61 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(80 * escala, 62 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(82 * escala, 63 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(84 * escala, 64 * escala, 4 * escala, 1 * escala);
        lapiz.fillRect(85 * escala, 65 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(74 * escala, 63 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(75 * escala, 64 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(76 * escala, 65 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(77 * escala, 66 * escala, 4 * escala, 1 * escala);
        lapiz.fillRect(78 * escala, 67 * escala, 6 * escala, 3 * escala);
        lapiz.fillRect(73 * escala, 69 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(77 * escala, 68 * escala, 1 * escala, 1 * escala);
        lapiz.fillRect(78 * escala, 70 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(77 * escala, 71 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(75 * escala, 72 * escala, 4 * escala, 1 * escala);
        lapiz.fillRect(82 * escala, 70 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(83 * escala, 71 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(84 * escala, 68 * escala, 1 * escala, 2 * escala);

        lapiz.fillRect(6 * escala, 59 * escala, 3 * escala, 3 * escala);
        lapiz.fillRect(7 * escala, 58 * escala, 4 * escala, 3 * escala);
        lapiz.fillRect(8 * escala, 57 * escala, 8 * escala, 2 * escala);
        lapiz.fillRect(13 * escala, 58 * escala, 8 * escala, 2 * escala);
        lapiz.fillRect(15 * escala, 60 * escala, 10 * escala, 1 * escala);
        lapiz.fillRect(19 * escala, 61 * escala, 7 * escala, 1 * escala);
        lapiz.fillRect(19 * escala, 57 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(20 * escala, 56 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(21 * escala, 55 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(22 * escala, 54 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(9 * escala, 57 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(10 * escala, 56 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(11 * escala, 55 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(11 * escala, 54 * escala, 6 * escala, 1 * escala);
        lapiz.fillRect(12 * escala, 53 * escala, 6 * escala, 1 * escala);
        lapiz.fillRect(12 * escala, 52 * escala, 7 * escala, 1 * escala);
        lapiz.fillRect(12 * escala, 51 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(12 * escala, 50 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(13 * escala, 49 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(13 * escala, 48 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(14 * escala, 46 * escala, 2 * escala, 2 * escala);
        lapiz.fillRect(15 * escala, 44 * escala, 1 * escala, 2 * escala);
        lapiz.fillRect(15 * escala, 44 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(16 * escala, 43 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(17 * escala, 42 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(18 * escala, 41 * escala, 1 * escala, 2 * escala);
        lapiz.fillRect(25 * escala, 45 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(23 * escala, 46 * escala, 3 * escala, 1 * escala);
        lapiz.fillRect(21 * escala, 47 * escala, 4 * escala, 1 * escala);
        lapiz.fillRect(19 * escala, 48 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(18 * escala, 49 * escala, 4 * escala, 1 * escala);
        lapiz.fillRect(16 * escala, 50 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(15 * escala, 51 * escala, 5 * escala, 1 * escala);
        lapiz.fillRect(11 * escala, 62 * escala, 1 * escala, 12 * escala);
        lapiz.fillRect(12 * escala, 63 * escala, 1 * escala, 12 * escala);
        lapiz.fillRect(10 * escala, 69 * escala, 1 * escala, 4 * escala);
        lapiz.fillRect(9 * escala, 71 * escala, 1 * escala, 2 * escala);
        lapiz.fillRect(13 * escala, 65 * escala, 2 * escala, 2 * escala);
        lapiz.fillRect(14 * escala, 64 * escala, 2 * escala, 2 * escala);
        lapiz.fillRect(15 * escala, 63 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(16 * escala, 62 * escala, 1 * escala, 1 * escala);
        lapiz.fillRect(13 * escala, 70 * escala, 1 * escala, 4 * escala);
        lapiz.fillRect(15 * escala, 69 * escala, 1 * escala, 3 * escala);
        lapiz.fillRect(16 * escala, 69 * escala, 2 * escala, 2 * escala);
        lapiz.fillRect(17 * escala, 67 * escala, 6 * escala, 2 * escala);
        lapiz.fillRect(19 * escala, 66 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(20 * escala, 65 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(21 * escala, 64 * escala, 2 * escala, 1 * escala);
        lapiz.fillRect(22 * escala, 63 * escala, 1 * escala, 1 * escala);
        lapiz.fillRect(14 * escala, 69 * escala, 1 * escala, 3 * escala);
        lapiz.fillRect(23 * escala, 68 * escala, 4 * escala, 1 * escala);
        lapiz.fillRect(23 * escala, 69 * escala, 3 * escala, 1 * escala);

        lapiz.fillRect(28 * escala, 84 * escala, 2 * escala, 7 * escala);
        lapiz.fillRect(30 * escala, 79 * escala, 1 * escala, 10 * escala );
        lapiz.fillRect(30 * escala, 79 * escala, 3 * escala, 8 * escala);

        // cafe oscuro
        lapiz.setColor(new Color(58, 56, 44));
    }
}