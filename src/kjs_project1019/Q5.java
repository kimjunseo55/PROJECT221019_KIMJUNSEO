package kjs_project1019;

import java.awt.*;
import javax.swing.*;

public class  Q5 extends JFrame {
	Q5() {
		setTitle("4x4 Color Frame");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));
		
		Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK,
				Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY, Color.BLACK,
				Color.ORANGE, Color.BLUE, Color.MAGENTA};
		for (int i = 0; i < 16; i++) {
			JLabel label = new JLabel(i + "");
			label.setBackground(col[i]);
			label.setOpaque(true);
			c.add(label);
		}
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Q5();
	}

}