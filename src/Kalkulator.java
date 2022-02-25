import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.latihan.function;

public class Kalkulator {
    private JPanel KalkulatorPanel;
    private JTextField angka1;
    private JTextField angka2;
    private JButton tambahButton;
    private JButton kurangButton;
    private JButton kaliButton;
    private JButton bagiButton;
    private JButton modulusButton;
    private JTextField hasil;
    private JButton luasPersegiButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().KalkulatorPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Kalkulator() {
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a, b, c;

                a = Integer.parseInt(angka1.getText());
                b = Integer.parseInt(angka2.getText());

                c = a + b;

                hasil.setText(String.valueOf(c));

            }
        });
        kurangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a, b, c;

                a = Integer.parseInt(angka1.getText());
                b = Integer.parseInt(angka2.getText());

                c = a - b;

                hasil.setText(String.valueOf(c));
            }
        });
        kaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a, b, c;

                a = Integer.parseInt(angka1.getText());
                b = Integer.parseInt(angka2.getText());

                c = a * b;

                hasil.setText(String.valueOf(c));
            }
        });
        modulusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a, b, c;

                a = Double.parseDouble(angka1.getText());
                b = Double.parseDouble(angka2.getText());

                c = a % b;

                if (a < b){
                    hasil.setText(String.valueOf("Tidak Memiliki Hasil"));
                }else{
                    hasil.setText(String.valueOf(c));
                }

            }
        });
        bagiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a, b, c;

                a = Double.parseDouble(angka1.getText());
                b = Double.parseDouble(angka2.getText());

                c = a / b;

                hasil.setText(String.valueOf(c));
            }
        });
        luasPersegiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(angka1.getText());
                int b = Integer.parseInt(angka2.getText());

                int c = a * b;

                hasil.setText(String.valueOf(c));
            }
        });
    }
}
