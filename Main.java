import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            initialFrame InitialFrame = new initialFrame(800);
            JLabel ab = new JLabel() ;
            JPanel contentPane = new JPanel();
            InitialFrame .setContentPane(contentPane);
            contentPane .add(ab) ;
            InitialFrame .setVisible(true);
        });
    }
}
