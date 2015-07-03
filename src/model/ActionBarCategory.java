package model;
import config.Config;

public class ActionBarCategory extends Category {
	public ActionBarCategory() {
		super(Config.ACTION_BAR_MDPI,
				Config.ACTION_BAR_HDPI,
				Config.ACTION_BAR_XHDPI,
				Config.ACTION_BAR_XXHDPI,
				Config.ACTION_BAR_XXXHDPI,
				Config.IconType.ACTION_BAR,
				Config.ACTION_BAR_FOLDER);
	}
}
