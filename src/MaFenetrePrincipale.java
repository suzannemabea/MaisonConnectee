import javax.swing.*;
import java.awt.*;

public class MaFenetrePrincipale extends JFrame {

	public MaFenetrePrincipale() {
		
		JFrame frame = new JFrame();
		
		setVisible(true);
		
		setTitle("Smart Home"); // Le titre de notre ihm
		setSize(400, 300);// Je définis la taille de ma fenetre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Permet de terminer le processus lordqu'on clique sur x
		setLocationRelativeTo(null);
		setResizable(false);
        
        
        JButton b = new JButton ("Créer un scenario");

        JButton bt = new JButton ("Ajouter des appareils ");
        b.setBounds(50,100,80,30); 
        bt.setBounds(50,100,80,30); 
        
        JLabel label = new JLabel("Welcome At Our SmartHome");
       
       
        //maFenetrePrincipale.add(b);
       // maFenetrePrincipale.add(bt);
        //maFenetrePrincipale.setLayout(new FlowLayout(FlowLayout.CENTER));
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        //panel.add(label);
        panel.add(b);
        panel.add(bt);
        add(label, BorderLayout.NORTH);
        add(panel);

        
        
        setVisible(true);
        
        
	}
	
}
