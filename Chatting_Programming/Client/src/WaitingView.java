import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class WaitingView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private Vector UserVec = new Vector(); // 연결된 사용자를 저장할 벡터
	private Vector RoomVec = new Vector(); // 생성된 방룸
	
	/**
	 * Create the frame.
	 * 
	 * @throws BadLocationException
	 */

	public WaitingView(String username, String ip_addr, String port_no) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 633);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(102, 0, 342, 555);
		contentPane.add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(23, 55, 97, 42);
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setFont(new Font("Dialog", Font.PLAIN, 30));
		textField.setText("친구");
		panel.add(textField);
		textField.setColumns(10);

		JList<Object> listOnMember = new JList<Object>();
		listOnMember.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		listOnMember.setBounds(23, 109, 295, 423);
		panel.add(listOnMember);
		
		
		

		JButton btnNewButton_1 = new JButton("");
		ImageIcon plus_icon = new ImageIcon (WaitingView.class.getResource("/image/다운로드.png"));
		Image plus_img = plus_icon.getImage();
		Image plus_changeImage = plus_img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon plus_changeIcon = new ImageIcon(plus_changeImage);
		
		btnNewButton_1.setIcon(plus_changeIcon);
		btnNewButton_1.setBounds(215, 33, 103, 62);
		panel.add(btnNewButton_1);

		
		JButton button = new JButton("");
		ImageIcon chat_icon = new ImageIcon(WaitingView.class.getResource("/image/free-icon-speech-bubble-151808.png"));
		Image chat_img = chat_icon.getImage();
		Image chat_changeImage = chat_img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon chat_changeIcon = new ImageIcon(chat_changeImage);
		
		button.setIcon(chat_changeIcon);
		button.setBounds(0, 95, 97, 87);
		contentPane.add(button);
		
		button.setForeground(new Color(204, 204, 204));
		button.setBackground(new Color(204, 204, 204));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("대화방");
			}
		});
		
		setVisible(true);

		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(new Color(204, 204, 204));
		btnNewButton.setBackground(new Color(204, 204, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("친구");
			}
		});

		ImageIcon icon = new ImageIcon(WaitingView.class.getResource("/image/free-icon-user-747376.png"));
		Image img = icon.getImage();
		Image chageImage = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(chageImage);
		

		btnNewButton.setIcon(changeIcon);
		btnNewButton.setBounds(0, 10, 97, 87);
		contentPane.add(btnNewButton);
	}
}
