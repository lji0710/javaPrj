package netio.multi.chat;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class ChatClientWindow extends JFrame {
	
	private JTextArea textInput;
	private JTextArea textOutput;
	private JPanel panel;
	private Button btnSend;

	public ChatClientWindow() {

		setSize(500, 700);

		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			// 닫아버림
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		// send 버튼
		btnSend = new Button("Send");
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				String msg = textOutput.getText();
				
				
				
				
				
				
				
/*				textOutput.setText(msg + textInput.getText()+ "\n");
				
				
				textOutput.setText(textOutput.getText() + textInput.getText()+ "\n");
				textInput.setText("");*/
				
			}
		});
		
				
		panel.add(btnSend,BorderLayout.LINE_END);
		
		textInput = new JTextArea();
		textInput.setPreferredSize(new Dimension(200, 100));
		panel.add(textInput, BorderLayout.CENTER);
		
		textOutput = new JTextArea();
		
		
		textOutput.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		textOutput.setEditable(false);
		textInput.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		this.add(panel, BorderLayout.PAGE_END);
		this.add(textOutput, BorderLayout.CENTER);

		// 버튼의 크기와 위치를 지정하지 않았음 : 크기 + 위치 : 레이아웃
		// 채팅창 만들기: 레이아웃 만들기
	}

}