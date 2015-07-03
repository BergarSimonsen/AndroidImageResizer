package view;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import config.Config;
public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private final String TITLE = "Android Image Resizer";

	private final int WIDTH = 800;
	private final int HEIGHT = 600;

	private Container contentPane;
	private JPanel mainPanel;

	private JFileChooser fileChooser;
	private JButton openFileButton;

	// Category check boxes
	private JCheckBox actionBarCB;
	private JCheckBox contextualCB;
	private JCheckBox launcherCB;
	private JCheckBox notificationCB;
	private JPanel cbPanel;

	// Size check boxes
	private JPanel sizeCBPanel;
	private JCheckBox mdpiCB;
	private JCheckBox hdpiCB;
	private JCheckBox xhdpiCB;
	private JCheckBox xxhdpiCB;
	private JCheckBox xxxhdpiCB;

	public GUI() {
		initUI();
	}

	private void initUI() {
		setTitle(TITLE);
		//        setSize(300, 200);
		setMinimumSize(new Dimension(WIDTH, HEIGHT));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


		contentPane = getContentPane();
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		openFileButton = new JButton("Open Image");
		mainPanel.add(openFileButton, BorderLayout.NORTH);

		JPanel mainCBPanel = new JPanel();
		mainCBPanel.setLayout(new BoxLayout(mainCBPanel, BoxLayout.Y_AXIS));

		mainPanel.add(mainCBPanel, BorderLayout.CENTER);


		initCategoryCheckBoxes(mainCBPanel);
		initSizeCheckBoxes(mainCBPanel);



		contentPane.add(mainPanel);
		setVisible(true);
	}

	private void initSizeCheckBoxes(JPanel parent) {
		sizeCBPanel = new JPanel();
		sizeCBPanel.setLayout(new FlowLayout());
		mdpiCB = new JCheckBox(Config.AppStrings.MDPI);
		hdpiCB = new JCheckBox(Config.AppStrings.HDPI);
		xhdpiCB = new JCheckBox(Config.AppStrings.XHDPI);
		xxhdpiCB = new JCheckBox(Config.AppStrings.XXHDPI);
		xxxhdpiCB = new JCheckBox(Config.AppStrings.XXXHDPI);

		sizeCBPanel.add(mdpiCB);
		sizeCBPanel.add(hdpiCB);
		sizeCBPanel.add(xhdpiCB);
		sizeCBPanel.add(xxhdpiCB);
		sizeCBPanel.add(xxxhdpiCB);

		//Titled borders
		TitledBorder border = BorderFactory.createTitledBorder(Config.AppStrings.SIZE);
		sizeCBPanel.setBorder(border);

		parent.add(sizeCBPanel);
	}

	private void initCategoryCheckBoxes(JPanel parent) {
		actionBarCB = new JCheckBox(Config.AppStrings.ACTIONBAR);
		contextualCB = new JCheckBox(Config.AppStrings.CONTEXTUAL);
		launcherCB = new JCheckBox(Config.AppStrings.LAUNCHER);
		notificationCB = new JCheckBox(Config.AppStrings.NOTIFICATION);

		cbPanel = new JPanel();
		cbPanel.setLayout(new FlowLayout());
		cbPanel.add(actionBarCB);
		cbPanel.add(contextualCB);
		cbPanel.add(launcherCB);
		cbPanel.add(notificationCB);

		//Titled borders
		TitledBorder border = BorderFactory.createTitledBorder(Config.AppStrings.CATEGORY);
		cbPanel.setBorder(border);

		parent.add(cbPanel);
	}
}
