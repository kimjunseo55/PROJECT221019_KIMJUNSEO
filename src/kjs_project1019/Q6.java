package kjs_project1019;

import java.awt.*;
import javax.swing.*;

public class Q6 extends JFrame {
	Q6() {
		setTitle("Random Labels");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for (int i = 0; i < 20; i++) {
			int x = (int)(Math.random() * 200) + 50;
			int y = (int)(Math.random() * 200) + 50;
			
			JLabel label = new JLabel(i + "");
			label.setBounds(x, y, 20, 20);
			label.setOpaque(true);
			label.setBackground(Color.blue);
			c.add(label);
		}
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Q6();
	}

}