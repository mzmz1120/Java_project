
// ChatMsg.java 채팅 메시지 ObjectStream 용.
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;

class ChatMsg implements Serializable {
	private static final long serialVersionUID = 1L;
	public String code; // 
	public String UserName;
	public String data;
	public ImageIcon img;
	public MouseEvent mouse_e;
	

	public ChatMsg(String UserName, String code, String msg) {
		this.code = code;
		this.UserName = UserName;
		this.data = msg;
	}
	
	
}