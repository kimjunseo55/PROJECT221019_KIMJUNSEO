package kjs_project1019;
import java.awt.*;
import javax.swing.*;

class NorthPanel2 extends JPanel {
	public NorthPanel2() {
		setBackground(Color.LIGHT_GRAY);
		this.add(new JButton("열기"));
		this.add(new JButton("닫기"));
		this.add(new JButton("나가기"));
	}
}
class CenterPanel2 extends JPanel {
	public CenterPanel2() {
		this.setLayout(null);
		for (int i = 0; i < 20; i++) {
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			JLabel label = new JLabel("*");
			label.setForeground(Color.red);
			label.setLocation(x, y);
			label.setSize(20, 20);
			label.setOpaque(true);
			add(label);
		}
	}
}
class SouthPanel extends JPanel {
	public SouthPanel() {
		setBackground(Color.yellow);
		add(new JButton("Word Input"));
		add(new TextField(15));
	}
}

public class Q8 extends JFrame {
	Q8() {
		setTitle("여러 개의 패널을 가진 프레임");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		NorthPanel2 np = new NorthPanel2();
		CenterPanel2 cp = new CenterPanel2();
		SouthPanel sp = new SouthPanel();
		add(np, BorderLayout.NORTH);
		add(cp);
		add(sp, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Q8();
	}

}