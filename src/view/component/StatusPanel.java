package view.component;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel statusTitleLabel;
	private JLabel statusLabel;

	public StatusPanel() {
		init();
	}

	private void init() {
		setLayout(new BorderLayout());
		statusTitleLabel = new JLabel("Status:   ");
		statusLabel = new JLabel("");

		add(statusTitleLabel, BorderLayout.WEST);
		add(statusLabel, BorderLayout.CENTER);
		
		setBorder(BorderFactory.createTitledBorder(""));
	}

}
