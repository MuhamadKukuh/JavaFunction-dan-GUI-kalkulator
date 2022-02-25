import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kasir {
    private JPanel kasir;
    private JComboBox comboBox1;
    private JTextField Jumlah;
    private JTextField Harga;
    private JTextArea List;
    private JButton Hitung;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kasir");
        frame.setContentPane(new Kasir().kasir);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Kasir() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String apa = (String)comboBox1.getSelectedItem();
                switch (apa){
                    case "Bang-bang":
                        Harga.setText("1500");
                        break;
                    case "Chocolatos":
                        Harga.setText("1000");
                        break;
                }
            }
        });
        Hitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(Jumlah.getText());
                int b = Integer.parseInt(Harga.getText());
                String barang = comboBox1.getSelectedItem().toString();
                int hasil = a * b;

//                List.setText("Nama barang = "+ comboBox1.getSelectedItem() );
//                List.setText("jumlah = "+ a );
                List.setText("Total Harga \t : "+ hasil +"\n jumlah \t :"+a +
                        "\n nama barang \t :"+ barang);

            }
        });
    }
}
