package com.lsl.ssm.springdemo;

public class Demo {

	private String name = "";
	private String words = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public void say() {
		System.out.println(name + "说：\'" + words + "\'");
	}
}
