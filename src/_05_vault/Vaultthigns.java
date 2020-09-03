package _05_vault;
import java.util.Random;

import javax.swing.JOptionPane;
public class Vaultthigns {
	
	void tryCode() {
		Random ran = new Random();
		int code = ran.nextInt(1000000);
		int i = 0;
		for(i=0; i>1000000; i++) {
			if(i == code) {
				JOptionPane.showMessageDialog(null, "You got the code");
			}
		}
	}
}
