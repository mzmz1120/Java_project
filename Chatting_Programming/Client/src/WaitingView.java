import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WaitingView extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	
	public WaitingView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 602);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(97, 10, 307, 555);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(12, 10, 97, 42);
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setFont(new Font("Dialog", Font.PLAIN, 30));
		textField.setText("친구");
		panel.add(textField);
		textField.setColumns(10);
		
		JList listOnMember = new JList();
		listOnMember.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		listOnMember.setBounds(0, 132, 295, 423);
		panel.add(listOnMember);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(192, 26, 91, 23);
		panel.add(btnNewButton_1);
		
		JButton button = new JButton("\uCC44 \uD305 \uBC29");
		button.setBounds(0, 141, 97, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(new Color(204, 204, 204));
		btnNewButton.setBackground(new Color(204, 204, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		ImageIcon icon = new ImageIcon(WaitingView.class.getResource("/image/people.png"));
		Image img = icon.getImage();
		Image chageImage = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(chageImage);
		
		
		btnNewButton.setIcon(changeIcon);
		btnNewButton.setBounds(0, 22, 97, 87);
		contentPane.add(btnNewButton);
	}
}
