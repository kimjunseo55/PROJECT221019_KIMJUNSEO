package kjs_project1019;

import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		this.add(new JButton("Open"));
		this.add(new JButton("Read"));
		this.add(new JButton("Close"));
	}
}
class CenterPanel extends JPanel {
	public CenterPanel() {
		this.setLayout(null);
		String text[] = {"Hello", "Java", "Love"};
		int x, y;
		JLabel label;
		for (int i = 0; i < 3; i++) {
			x = (int)(Math.random() * 250);
			y = (int)(Math.random() * 250);
			label = new JLabel(text[i]);
			label.setLocation(x, y);
			label.setSize(50, 10);
			this.add(label);
		}
	}
}

public class OpenChallenge extends JFrame {
	public OpenChallenge() {
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new OpenChallenge();
	}
}