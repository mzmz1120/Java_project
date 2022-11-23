// JavaObjClient.java
// ObjecStream 사용하는 채팅 Client

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import java.awt.Label;
import java.awt.Panel;

public class ClientMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUserName;
	private JTextField txtIpAddress;
	private JTextField txtPortNumber;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientMain frame = new ClientMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 321);
		contentPane = new JPanel();
		setSize(400,600);
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(89, 358, 82, 33);
		contentPane.add(lblNewLabel);
		
		txtUserName = new JTextField();
		txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserName.setBounds(229, 358, 116, 33);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblIpAddress = new JLabel("IP Address");
		lblIpAddress.setBounds(89, 404, 82, 33);
		contentPane.add(lblIpAddress);
		
		txtIpAddress = new JTextField();
		txtIpAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtIpAddress.setText("127.0.0.1");
		txtIpAddress.setColumns(10);
		txtIpAddress.setBounds(229, 404, 116, 33);
		contentPane.add(txtIpAddress);
		
		JLabel lblPortNumber = new JLabel("Port Number");
		lblPortNumber.setBounds(89, 447, 82, 33);
		contentPane.add(lblPortNumber);
		
		txtPortNumber = new JTextField();
		txtPortNumber.setText("30000");
		txtPortNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtPortNumber.setColumns(10);
		txtPortNumber.setBounds(229, 447, 116, 33);
		contentPane.add(txtPortNumber);
		
		JButton btnConnect = new JButton("로그인");
		btnConnect.setBounds(102, 490, 205, 38);
		contentPane.add(btnConnect);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ClientMain.class.getResource("/image/카카오톡_로고_3.png")));
		lblNewLabel_1.setBounds(63, 55, 307, 278);
		contentPane.add(lblNewLabel_1);
		
		
		Myaction action = new Myaction();
		btnConnect.addActionListener(action);
		txtUserName.addActionListener(action);
		txtIpAddress.addActionListener(action);
		txtPortNumber.addActionListener(action);
	}
	class Myaction implements ActionListener // 내부클래스로 액션 이벤트 처리 클래스
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			String username = txtUserName.getText().trim();
			String ip_addr = txtIpAddress.getText().trim();
			String port_no = txtPortNumber.getText().trim();
			WaitingView view1 = new WaitingView(username, ip_addr, port_no);
			ChattingView view2 = new ChattingView(username, ip_addr, port_no);
			setVisible(false);
		}
	}
}


