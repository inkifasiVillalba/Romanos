import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrmRomanos extends JFrame {
    //metodo constructor
    public FrmRomanos(){
        setSize(300,300);
        setTitle("Conversión de Romanos");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel lblArabigo=new JLabel("Número Arabigo");
        lblArabigo.setBounds(10,10,100,25);
        getContentPane().add(lblArabigo);

        JTextField txtArabigo=new JTextField();
        txtArabigo.setBounds(110,10,100,25);
        getContentPane().add(txtArabigo);

        JButton btnCalcular=new JButton("Convertir");
        btnCalcular.setBounds(10,40,100,25);
        getContentPane().add(btnCalcular);

        JTextField txtRomano=new JTextField();
        txtRomano.setBounds(110,40,100,25);
        getContentPane().add(txtRomano);

        btnCalcular.addActionListener=new ActionListener() {
            
            

        }

    }

}
