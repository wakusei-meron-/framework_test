package com.planet_meron.news.domain.entity;

import java.util.Date;

public class Article {

	private int id;
	private Date createdAt;
	private String title;
	private String body;
	private String imageThumbURL;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getImageThumbURL() {
		return imageThumbURL;
	}
	public void setImageThumbURL(String imageThumbURL) {
		this.imageThumbURL = imageThumbURL;
	}
	
	@Override
	public String toString() {
	
		String description = "----------------------------\n";
		description += "id : " + this.id + "\n";
		description += "created at : " + this.createdAt.toString() + "\n";
		description += "title : " + this.title + "\n";
		description += "body : " + this.body + "\n";
		description += "Thumbnail url : " + this.imageThumbURL + "\n";
		return description;
	}
}
