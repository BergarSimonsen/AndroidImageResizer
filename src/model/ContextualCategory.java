package model;
import config.Config;

public class ContextualCategory extends Category {
	public ContextualCategory() {
		super(Config.CONTEXTUAL_MDPI,
				Config.CONTEXTUAL_HDPI,
				Config.CONTEXTUAL_XHDPI,
				Config.CONTEXTUAL_XXHDPI,
				Config.CONTEXTUAL_XXXHDPI,
				Config.IconType.CONTEXTUAL,
				Config.CONTEXTUAL_FOLDER);
	}
}
