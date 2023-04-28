package com.github.joicegn;

import com.google.gson.annotations.SerializedName;

public class Villager {
	private int id;
	private Name name;
	private String personality;
	@SerializedName("birthday-string")
	private String birthday;
	@SerializedName("catch-phrase")
	private String catchPhrase;
	@SerializedName("image_uri")
	private String imageURI;
	@SerializedName("bubble-color")
	private String bubbleColor;
		
	public int getId() {
		return id;
	}

	public String getName() {
		return name.getNameUSen();
	}

	public String getPersonality() {
		return personality;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public String getImageURI() {
		return imageURI;
	}

	public String getBubbleColor() {
		return bubbleColor;
	}

	@Override
	public String toString() {
		return "Villager [id=" + id + ", name=" + getName() + ", personality=" + personality + ", birthday=" + birthday
				+ ", catchPhrase=" + catchPhrase + ", imageURI=" + imageURI + ", bubbleColor=" + bubbleColor + "]";
	}
		
}
