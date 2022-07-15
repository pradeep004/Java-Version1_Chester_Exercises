import java.awt.EventQueue;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	static JFrame frame ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
