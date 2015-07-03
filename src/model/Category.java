package model;
import config.Config;
import config.Config.IconType;

public class Category {
	private final String baseFolder = Config.BASE_FOLDER;

	private int mdpi;
	private int hdpi;
	private int xhdpi;
	private int xxhdpi;
	private int xxxhdpi;
	private IconType type;
	private String folder;

	public Category(int mdpi, int hdpi, int xhdpi, int xxhdpi, int xxxhdpi, IconType type, String folder) {
		this.mdpi = mdpi;
		this.hdpi = hdpi;
		this.xhdpi = xhdpi;
		this.xxhdpi = xxhdpi;
		this.xxxhdpi = xxhdpi;
		this.type = type;
		this.folder = baseFolder + folder;
	}

	public void setMdpi(int s) {
		mdpi = s;
	}

	public int getMdpi() {
		return mdpi;
	}

	public void setHdpi(int s) {
		hdpi = s;
	}

	public int getHdpi() {
		return hdpi;
	}

	public void setXhdpi(int s) {
		xhdpi = s;
	}

	public int getXhdpi() {
		return xhdpi;
	}

	public void setXxhdpi(int s) {
		xxhdpi = s;
	}

	public int getXxhdpi() {
		return xxhdpi;
	}

	public void setXxxhdpi(int s) {
		xxxhdpi = s;
	}

	public int getXxxhdpi() {
		return xxxhdpi;
	}

	public void setType(IconType t) {
		type = t;
	}

	public IconType getType() {
		return type;
	}

	public void setFolder(String f) {
		folder = baseFolder + f;
	}

	public String getFolder() {
		return folder;
	}
}
