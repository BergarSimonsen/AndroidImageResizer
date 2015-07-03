package model;
import config.Config;

public class NotificationCategory extends Category {
	public NotificationCategory() {
		super(Config.NOTIFICATION_MDPI,
				Config.NOTIFICATION_HDPI,
				Config.NOTIFICATION_XHDPI,
				Config.NOTIFICATION_XXHDPI,
				Config.NOTIFICATION_XXXHDPI,
				Config.IconType.NOTIFICATION,
				Config.NOTIFICATION_FOLDER);
	}
}
