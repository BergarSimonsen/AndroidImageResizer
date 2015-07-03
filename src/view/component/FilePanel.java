package view.component;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class FilePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private final String INPUT = "Input:";
	private final String OUTPUT = "Output:";
	private final String BUTTON_ICON_LOCATION = "/resource/open.png";
	private final String TITLE = "File";

	private JButton fileButton;
	private JButton okButton;
	private JTextField inputTextField;
	private JTextField outputTextField;
	private JLabel inputLabel;
	private JLabel outputLabel;

	public FilePanel() {
		init();
	}

	private void init() {
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		
		okButton = new JButton("OK");

		fileButton = new JButton();
		
		try {
			fileButton.setIcon(new ImageIcon(getClass().getResource(BUTTON_ICON_LOCATION)));
			fileButton.setBorder(null);
			fileButton.setMargin(new Insets(3, 5, 3, 5));
		} catch (Exception ex) {
			fileButton.setText("Open");
			System.out.println("Could not load button image!");
			ex.printStackTrace();
		}
		

		inputTextField = new JTextField();
		outputTextField = new JTextField();

		inputLabel = new JLabel(INPUT);
		outputLabel = new JLabel(OUTPUT);

		addToPanel(2, 0, constraint, fileButton, true);
		addToPanel(3, 0, constraint, okButton, true);

		addToPanel(0, 0, constraint, inputLabel, false);
		addToPanel(1, 0, constraint, inputTextField, false);

		addToPanel(0, 1, constraint, outputLabel, false);
		addToPanel(1, 1, constraint, outputTextField, false);

		TitledBorder border = BorderFactory.createTitledBorder(TITLE);
		setBorder(border);

	}

	private void addToPanel(int x, int y, GridBagConstraints c, JComponent comp, boolean button) {
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = 1;
		
		c.gridheight = (button) ? 2 : 1;
		
		if(x == 0)
			c.anchor = GridBagConstraints.WEST;
		if(x == 1)
			c.fill = GridBagConstraints.HORIZONTAL;

		switch(x) {
		case 0:
			c.weightx = 0.1;
			break;
		case 1:
			c.weightx = 1.0;
			break;
		default:
			c.weightx = 0.2;
			break;
		}
		
		c.weighty = 1.0;
		add(comp, c);
	}
}
