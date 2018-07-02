package com.lsl.ssm.service;

/**
 * 依赖注入范例
 * @author LSL
 *
 */
public class Dialogue {

	// 说话的人
	private String person = "Nobody";
	// 说话内容
	private String words = "Nothing";
	/**
	 *  获取说话的人
	 * @return
	 */
	public String getPerson() {
		return person;
	}
	/**
	 * 设置说话的人
	 * @param person
	 */
	public void setPerson(String person) {
		this.person = person;
	}
	
	/**
	 * 获取说话内容
	 * @return
	 */
	public String getWords() {
		return words;
	}
	
	/**
	 * 设置说话内容
	 * @param words
	 */
	public void setWords(String words) {
		this.words = words;
	}
	
	/**
	 * 定义说话的方法
	 */
	public void Say() {
		System.out.println(person + " 曰:\"" + words + "\"");
	}
}
