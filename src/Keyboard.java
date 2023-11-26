import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Keyboard {

	private static AtomicBoolean keyIsPressed = new AtomicBoolean(false);
	private static ArrayList<JButton> buttons = new ArrayList<JButton>();
	private static AudioInputStream audioIn;

	static public void keyboard(JPanel panel) {
		addButton(panel, "SPACE", 296, 503, 272, 23);
		addButton(panel, "Alt", 239, 503, 47, 23);
		addButton(panel, "Alt", 578, 503, 47, 23);
		addButton(panel, "FN", 635, 503, 55, 23);
		addButton(panel, "Win", 170, 503, 65, 23);
		addButton(panel, "Ctrl", 98, 503, 65, 23);
		addButton(panel, "Led", 700, 503, 65, 23);
		addButton(panel, "Ctrl", 775, 503, 65, 23);
		addButton(panel, "Shift", 98, 469, 65, 23);
		addButton(panel, "CapsLock", 98, 435, 98, 23);
		addButton(panel, "Tab", 98, 401, 89, 23);
		addButton(panel, "<>", 170, 469, 55, 23);
		addButton(panel, "Z", 235, 469, 47, 23);
		addButton(panel, "X", 288, 469, 47, 23);
		addButton(panel, "C", 341, 469, 47, 23);
		addButton(panel, "V", 392, 469, 47, 23);
		addButton(panel, "B", 444, 469, 47, 23);
		addButton(panel, "N", 496, 469, 47, 23);
		addButton(panel, "M", 547, 469, 47, 23);
		addButton(panel, ", ;", 604, 469, 47, 23);
		addButton(panel, ". :", 661, 469, 47, 23);
		addButton(panel, "-_", 718, 469, 47, 23);
		addButton(panel, "Shift", 775, 469, 133, 23);
		addButton(panel, "S", 256, 435, 47, 23);
		addButton(panel, "D", 309, 435, 47, 23);
		addButton(panel, "F", 362, 435, 47, 23);
		addButton(panel, "G", 413, 435, 47, 23);
		addButton(panel, "H", 465, 435, 47, 23);
		addButton(panel, "J", 517, 435, 47, 23);
		addButton(panel, "K", 568, 435, 47, 23);
		addButton(panel, "L", 620, 434, 47, 23);
		addButton(panel, "A", 206, 436, 47, 23);
		addButton(panel, "òç@", 675, 435, 55, 23);
		addButton(panel, "à°#", 732, 436, 55, 23);
		addButton(panel, "§ù", 793, 436, 47, 23);
		addButton(panel, "INVIO", 850, 405, 89, 53);
		addButton(panel, "<--", 807, 351, 122, 43);
		addButton(panel, "W", 247, 400, 47, 23);
		addButton(panel, "E", 300, 400, 47, 23);
		addButton(panel, "R", 353, 400, 47, 23);
		addButton(panel, "T", 404, 400, 47, 23);
		addButton(panel, "Y", 456, 400, 47, 23);
		addButton(panel, "U", 508, 400, 47, 23);
		addButton(panel, "I", 559, 400, 47, 23);
		addButton(panel, "O", 611, 399, 47, 23);
		addButton(panel, "Q", 197, 401, 47, 23);
		addButton(panel, "èé[", 723, 401, 55, 23);
		addButton(panel, "P", 666, 401, 47, 23);
		addButton(panel, "+*]", 784, 401, 55, 23);
		addButton(panel, "\\|", 98, 366, 47, 23);
		addButton(panel, "2", 205, 366, 47, 23);
		addButton(panel, "3", 258, 366, 47, 23);
		addButton(panel, "4", 311, 366, 47, 23);
		addButton(panel, "5", 362, 366, 47, 23);
		addButton(panel, "6", 414, 366, 47, 23);
		addButton(panel, "7", 466, 366, 47, 23);
		addButton(panel, "8", 517, 366, 47, 23);
		addButton(panel, "9", 569, 365, 47, 23);
		addButton(panel, "1", 155, 367, 47, 23);
		addButton(panel, "?'", 681, 367, 55, 23);
		addButton(panel, "0", 624, 367, 47, 23);
		addButton(panel, "ì^", 742, 367, 55, 23);

	}

	private static void addButton(JPanel panel, String text, int x, int y, int width, int height) {
		JButton button = new JButton(text);
		if (button.getText().equals("òç@") || button.getText().equals("à°#") || button.getText().equals("§ù")) {
			button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		} else {
			button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}

		button.setBounds(x, y, width, height);
		panel.add(button);
		buttons.add(button);
	}

	static public void KeyPressed(int keyCode) throws UnsupportedAudioFileException {

		switch (keyCode) {
			case KeyEvent.VK_0:
				keyIsPressed.set(true);
				SearchButton("0");
				Piano("Piano\\39210__jobro__piano-ff-062.wav");
				break;

			case KeyEvent.VK_1:
				keyIsPressed.set(true);
				SearchButton("1");
				Piano("Piano\\39201__jobro__piano-ff-053.wav");
				break;

			case KeyEvent.VK_2:
				keyIsPressed.set(true);
				SearchButton("2");
				Piano("Piano\\39202__jobro__piano-ff-054.wav");
				break;

			case KeyEvent.VK_3:
				keyIsPressed.set(true);
				SearchButton("3");
				Piano("Piano\\39203__jobro__piano-ff-055.wav");
				break;

			case KeyEvent.VK_4:
				keyIsPressed.set(true);
				SearchButton("4");
				Piano("Piano\\39204__jobro__piano-ff-056.wav");
				break;

			case KeyEvent.VK_5:
				keyIsPressed.set(true);
				SearchButton("5");
				Piano("Piano\\39205__jobro__piano-ff-057.wav");
				break;

			case KeyEvent.VK_6:
				keyIsPressed.set(true);
				SearchButton("6");
				Piano("Piano\\39206__jobro__piano-ff-058.wav");
				break;

			case KeyEvent.VK_7:
				keyIsPressed.set(true);
				SearchButton("7");
				Piano("Piano\\39207__jobro__piano-ff-059.wav");
				break;

			case KeyEvent.VK_8:
				keyIsPressed.set(true);
				SearchButton("8");
				Piano("Piano\\39208__jobro__piano-ff-060.wav");
				break;

			case KeyEvent.VK_9:
				keyIsPressed.set(true);
				SearchButton("9");
				Piano("Piano\\39209__jobro__piano-ff-061.wav");
				break;

			case KeyEvent.VK_ENTER:
				keyIsPressed.set(true);
				SearchButton("INVIO");
				break;

			case KeyEvent.VK_BACK_SPACE:
				keyIsPressed.set(true);
				SearchButton("<--");
				break;

			case KeyEvent.VK_TAB:
				keyIsPressed.set(true);
				SearchButton("Tab");
				break;

			case KeyEvent.VK_SHIFT:
				keyIsPressed.set(true);
				SearchButton("Shift");
				break;

			case KeyEvent.VK_CONTROL:
				keyIsPressed.set(true);
				SearchButton("Ctrl");
				break;

			case KeyEvent.VK_ALT:
				keyIsPressed.set(true);
				SearchButton("Alt");
				break;

			case KeyEvent.VK_CAPS_LOCK:
				keyIsPressed.set(true);
				SearchButton("CapsLock");
				break;

			case KeyEvent.VK_SPACE:
				keyIsPressed.set(true);
				SearchButton("SPACE");
				break;

			case KeyEvent.VK_COMMA:
				keyIsPressed.set(true);
				SearchButton(", ;");
				Piano("Piano\\\\39198__jobro__piano-ff-050.wav");
				break;

			case KeyEvent.VK_MINUS:
				keyIsPressed.set(true);
				SearchButton("-_");
				Piano("Piano\\39200__jobro__piano-ff-052.wav");
				break;

			case KeyEvent.VK_PERIOD:
				keyIsPressed.set(true);
				SearchButton(". :");
				Piano("Piano\\39199__jobro__piano-ff-051.wav");
				break;

			case KeyEvent.VK_A:
				keyIsPressed.set(true);
				SearchButton("A");
				Piano("Piano\\39181__jobro__piano-ff-034.wav");
				break;

			case KeyEvent.VK_B:
				keyIsPressed.set(true);
				SearchButton("B");
				Piano("Piano\\39195__jobro__piano-ff-047.wav");
				break;

			case KeyEvent.VK_C:
				keyIsPressed.set(true);
				SearchButton("C");
				Piano("Piano\\39193__jobro__piano-ff-045.wav");
				break;

			case KeyEvent.VK_D:
				keyIsPressed.set(true);
				SearchButton("D");
				Piano("Piano\\39183__jobro__piano-ff-036.wav");
				break;

			case KeyEvent.VK_E:
				keyIsPressed.set(true);
				SearchButton("E");
				Piano("Piano\\39173__jobro__piano-ff-026.wav");
				break;

			case KeyEvent.VK_F:
				keyIsPressed.set(true);
				SearchButton("F");
				Piano("Piano\\39184__jobro__piano-ff-037.wav");
				break;

			case KeyEvent.VK_G:
				keyIsPressed.set(true);
				SearchButton("G");
				Piano("Piano\\39185__jobro__piano-ff-038.wav");
				break;

			case KeyEvent.VK_H:
				keyIsPressed.set(true);
				SearchButton("H");
				Piano("Piano\\39186__jobro__piano-ff-039.wav");
				break;

			case KeyEvent.VK_I:
				keyIsPressed.set(true);
				SearchButton("I");
				Piano("Piano\\39178__jobro__piano-ff-031.wav");
				break;

			case KeyEvent.VK_L:
				keyIsPressed.set(true);
				SearchButton("L");
				Piano("Piano\\39189__jobro__piano-ff-042.wav");
				break;

			case KeyEvent.VK_M:
				keyIsPressed.set(true);
				SearchButton("M");
				Piano("Piano\\39197__jobro__piano-ff-049.wav");
				break;

			case KeyEvent.VK_N:
				keyIsPressed.set(true);
				SearchButton("N");
				Piano("Piano\\39196__jobro__piano-ff-048.wav");
				break;

			case KeyEvent.VK_S:
				keyIsPressed.set(true);
				SearchButton("S");
				Piano("Piano\\39182__jobro__piano-ff-035.wav");
				break;

			case KeyEvent.VK_T:
				keyIsPressed.set(true);
				SearchButton("T");
				Piano("C:\\Users\\Utente\\Desktop\\codici\\java\\MusicalKeyboard\\Piano\\39175__jobro__piano-ff-028.wav");
				break;

			case KeyEvent.VK_U:
				keyIsPressed.set(true);
				SearchButton("U");
				Piano("Piano\\39177__jobro__piano-ff-030.wav");
				break;

			case KeyEvent.VK_V:
				keyIsPressed.set(true);
				SearchButton("V");
				Piano("Piano\\39194__jobro__piano-ff-046.wav");
				break;

			case KeyEvent.VK_Z:
				keyIsPressed.set(true);
				SearchButton("Z");
				Piano("Piano\\39190__jobro__piano-ff-043.wav");
				break;

			case KeyEvent.VK_Y:
				keyIsPressed.set(true);
				SearchButton("Y");
				Piano("Piano\\39176__jobro__piano-ff-029.wav");
				break;

			case KeyEvent.VK_Q:
				keyIsPressed.set(true);
				SearchButton("Q");
				Piano("Piano\\39171__jobro__piano-ff-024.wav");
				break;

			case KeyEvent.VK_P:
				keyIsPressed.set(true);
				SearchButton("P");
				Piano("Piano\\39180__jobro__piano-ff-033.wav");
				break;

			case KeyEvent.VK_R:
				keyIsPressed.set(true);
				SearchButton("R");
				Piano("C:\\Users\\Utente\\Desktop\\codici\\java\\MusicalKeyboard\\Piano\\39174__jobro__piano-ff-027.wav");
				break;

			case KeyEvent.VK_X:
				keyIsPressed.set(true);
				SearchButton("X");
				Piano("Piano\\39191__jobro__piano-ff-044.wav");
				break;

			case KeyEvent.VK_K:
				keyIsPressed.set(true);
				SearchButton("K");
				Piano("Piano\\39188__jobro__piano-ff-041.wav");
				break;

			case KeyEvent.VK_J:
				keyIsPressed.set(true);
				SearchButton("J");
				Piano("Piano\\39187__jobro__piano-ff-040.wav");
				break;

			case KeyEvent.VK_W:
				keyIsPressed.set(true);
				SearchButton("W");
				Piano("Piano\\39172__jobro__piano-ff-025.wav");
				break;

			case KeyEvent.VK_O:
				keyIsPressed.set(true);
				SearchButton("O");
				Piano("Piano\\39179__jobro__piano-ff-032.wav");
				break;

			case KeyEvent.VK_PLUS:
				keyIsPressed.set(true);
				SearchButton("+*]");
				break;

			case KeyEvent.VK_WINDOWS:
				keyIsPressed.set(true);
				SearchButton("Win");
				break;
		}

	}

	static public void KeyReleased(int keyCode) {

		switch (keyCode) {
			case KeyEvent.VK_0:
				keyIsPressed.set(false);
				SearchButton("0");
				break;

			case KeyEvent.VK_1:
				keyIsPressed.set(false);
				SearchButton("1");
				break;

			case KeyEvent.VK_2:
				keyIsPressed.set(false);
				SearchButton("2");
				break;

			case KeyEvent.VK_3:
				keyIsPressed.set(false);
				SearchButton("3");
				break;

			case KeyEvent.VK_4:
				keyIsPressed.set(false);
				SearchButton("4");
				break;

			case KeyEvent.VK_5:
				keyIsPressed.set(false);
				SearchButton("5");
				break;

			case KeyEvent.VK_6:
				keyIsPressed.set(false);
				SearchButton("6");
				break;

			case KeyEvent.VK_7:
				keyIsPressed.set(false);
				SearchButton("7");
				break;

			case KeyEvent.VK_8:
				keyIsPressed.set(false);
				SearchButton("8");
				break;

			case KeyEvent.VK_9:
				keyIsPressed.set(false);
				SearchButton("9");
				break;

			case KeyEvent.VK_ENTER:
				keyIsPressed.set(false);
				SearchButton("INVIO");
				break;

			case KeyEvent.VK_BACK_SPACE:
				keyIsPressed.set(false);
				SearchButton("<--");
				break;

			case KeyEvent.VK_TAB:
				keyIsPressed.set(false);
				SearchButton("Tab");
				break;

			case KeyEvent.VK_SHIFT:
				keyIsPressed.set(false);
				SearchButton("Shift");
				break;

			case KeyEvent.VK_CONTROL:
				keyIsPressed.set(false);
				SearchButton("Ctrl");
				break;

			case KeyEvent.VK_ALT:
				keyIsPressed.set(false);
				SearchButton("Alt");
				break;

			case KeyEvent.VK_CAPS_LOCK:
				keyIsPressed.set(false);
				SearchButton("CapsLock");
				break;

			case KeyEvent.VK_SPACE:
				keyIsPressed.set(false);
				SearchButton("SPACE");
				break;

			case KeyEvent.VK_COMMA:
				keyIsPressed.set(false);
				SearchButton(", ;");
				break;

			case KeyEvent.VK_MINUS:
				keyIsPressed.set(false);
				SearchButton("-_");
				break;

			case KeyEvent.VK_PERIOD:
				keyIsPressed.set(false);
				SearchButton(". :");
				break;

			case KeyEvent.VK_A:
				keyIsPressed.set(false);
				SearchButton("A");
				break;

			case KeyEvent.VK_B:
				keyIsPressed.set(false);
				SearchButton("B");
				break;

			case KeyEvent.VK_C:
				keyIsPressed.set(false);
				SearchButton("C");
				break;

			case KeyEvent.VK_D:
				keyIsPressed.set(false);
				SearchButton("D");
				break;

			case KeyEvent.VK_E:
				keyIsPressed.set(false);
				SearchButton("E");
				break;

			case KeyEvent.VK_F:
				keyIsPressed.set(false);
				SearchButton("F");
				break;

			case KeyEvent.VK_G:
				keyIsPressed.set(false);
				SearchButton("G");
				break;

			case KeyEvent.VK_H:
				keyIsPressed.set(false);
				SearchButton("H");
				break;

			case KeyEvent.VK_I:
				keyIsPressed.set(false);
				SearchButton("I");
				break;

			case KeyEvent.VK_L:
				keyIsPressed.set(false);
				SearchButton("L");
				break;

			case KeyEvent.VK_M:
				keyIsPressed.set(false);
				SearchButton("M");
				break;

			case KeyEvent.VK_N:
				keyIsPressed.set(false);
				SearchButton("N");
				break;

			case KeyEvent.VK_S:
				keyIsPressed.set(false);
				SearchButton("S");
				break;

			case KeyEvent.VK_T:
				keyIsPressed.set(false);
				SearchButton("T");
				break;

			case KeyEvent.VK_U:
				keyIsPressed.set(false);
				SearchButton("U");
				break;

			case KeyEvent.VK_V:
				keyIsPressed.set(false);
				SearchButton("V");
				break;

			case KeyEvent.VK_Z:
				keyIsPressed.set(false);
				SearchButton("Z");
				break;

			case KeyEvent.VK_Y:
				keyIsPressed.set(false);
				SearchButton("Y");
				break;

			case KeyEvent.VK_Q:
				keyIsPressed.set(false);
				SearchButton("Q");
				break;

			case KeyEvent.VK_P:
				keyIsPressed.set(false);
				SearchButton("P");
				break;

			case KeyEvent.VK_R:
				keyIsPressed.set(false);
				SearchButton("R");
				break;

			case KeyEvent.VK_X:
				keyIsPressed.set(false);
				SearchButton("X");
				break;

			case KeyEvent.VK_K:
				keyIsPressed.set(false);
				SearchButton("K");
				break;

			case KeyEvent.VK_J:
				keyIsPressed.set(false);
				SearchButton("J");
				break;

			case KeyEvent.VK_W:
				keyIsPressed.set(false);
				SearchButton("W");
				break;

			case KeyEvent.VK_O:
				keyIsPressed.set(false);
				SearchButton("O");
				break;

			case KeyEvent.VK_PLUS:
				keyIsPressed.set(false);
				SearchButton("+*]");
				break;

			case KeyEvent.VK_WINDOWS:
				keyIsPressed.set(false);
				SearchButton("Win");
				break;

		}

	}

	private static void SearchButton(String text) {

		for (JButton button : buttons) {
			if (button.getText().equals(text) && keyIsPressed.get()) {
				button.setForeground(Color.GREEN);
			} else if (button.getText().equals(text) && !keyIsPressed.get()) {
				button.setForeground(Color.BLACK);
			}
		}

	}

	private static void Piano(String path) {
		try {
			audioIn = AudioSystem.getAudioInputStream(new File(path));
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
		} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e1) {
			e1.printStackTrace();
		}
	}

}
