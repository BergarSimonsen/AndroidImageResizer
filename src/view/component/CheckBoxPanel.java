package view.component;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import config.Config;

public class CheckBoxPanel extends JPanel {

	private static final long serialVersionUID = 1L;

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

	public CheckBoxPanel() {
		init();
	}

	private void init() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		initSize();
		initCategory();
	}

	private void initSize() {
		sizeCBPanel = new JPanel();
		sizeCBPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

		mdpiCB = new JCheckBox(Config.AppStrings.MDPI);
		hdpiCB = new JCheckBox(Config.AppStrings.HDPI);
		xhdpiCB = new JCheckBox(Config.AppStrings.XHDPI);
		xxhdpiCB = new JCheckBox(Config.AppStrings.XXHDPI);
		xxxhdpiCB = new JCheckBox(Config.AppStrings.XXXHDPI);
		
		mdpiCB.setSelected(true);
		hdpiCB.setSelected(true);
		xhdpiCB.setSelected(true);
		xxhdpiCB.setSelected(true);
		xxxhdpiCB.setSelected(true);
		

		sizeCBPanel.add(mdpiCB);
		sizeCBPanel.add(hdpiCB);
		sizeCBPanel.add(xhdpiCB);
		sizeCBPanel.add(xxhdpiCB);
		sizeCBPanel.add(xxxhdpiCB);

		//Titled borders
		TitledBorder border = BorderFactory.createTitledBorder(Config.AppStrings.SIZE);
		sizeCBPanel.setBorder(border);

		add(sizeCBPanel);
	}

	private void initCategory() {
		actionBarCB = new JCheckBox(Config.AppStrings.ACTIONBAR);
		contextualCB = new JCheckBox(Config.AppStrings.CONTEXTUAL);
		launcherCB = new JCheckBox(Config.AppStrings.LAUNCHER);
		notificationCB = new JCheckBox(Config.AppStrings.NOTIFICATION);
		
		actionBarCB.setSelected(true);
		contextualCB.setSelected(true);
		launcherCB.setSelected(true);
		notificationCB.setSelected(true);

		cbPanel = new JPanel();
		cbPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		cbPanel.add(actionBarCB);
		cbPanel.add(contextualCB);
		cbPanel.add(launcherCB);
		cbPanel.add(notificationCB);

		//Titled borders
		TitledBorder border = BorderFactory.createTitledBorder(Config.AppStrings.CATEGORY);
		cbPanel.setBorder(border);

		add(cbPanel);
	}

}
