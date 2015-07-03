package model;
import config.Config;

public class LauncherCategory extends Category {
	public LauncherCategory() {
		super(Config.LAUNCHER_MDPI,
				Config.LAUNCHER_HDPI,
				Config.LAUNCHER_XHDPI,
				Config.LAUNCHER_XXHDPI,
				Config.LAUNCHER_XXXHDPI,
				Config.IconType.LAUNCHER,
				Config.LAUNCHER_FOLDER);
	}
}
