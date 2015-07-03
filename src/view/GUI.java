package view;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import view.component.CheckBoxPanel;
import view.component.FilePanel;
import view.component.StatusPanel;
import config.Config;
public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private final String TITLE = "Android Image Resizer";

	private final int WIDTH = 600;
	private final int HEIGHT = 200;

	private Container contentPane;
	private JPanel mainPanel;

	public GUI() {
		initUI();
	}

	private void initUI() {
		setTitle(TITLE);
		setSize(new Dimension(WIDTH, HEIGHT));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		contentPane = getContentPane();
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		FilePanel filePanel = new FilePanel();
		StatusPanel statusPanel = new StatusPanel();
		CheckBoxPanel checkBoxPanel = new CheckBoxPanel();


		mainPanel.add(filePanel, BorderLayout.NORTH);
		mainPanel.add(checkBoxPanel, BorderLayout.CENTER);
		mainPanel.add(statusPanel, BorderLayout.SOUTH);

		contentPane.add(mainPanel);
		
		setVisible(true);
	}
}
