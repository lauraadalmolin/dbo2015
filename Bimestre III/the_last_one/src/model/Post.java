package model;

import java.util.ArrayList;

public class Post {
	
	private String text;
	private ArrayList<String> lines = new ArrayList<String>();
	private String title;
	private int code;
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
}
