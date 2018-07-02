package com.lsl.ssm.springdemo;

public class HelloSpring {
	
	private String who = null;
	
	public void print() {
		System.out.println("Hello," + this.getWho() + "!");
	}

	/**
	 * 获取who
	 * @return
	 */
	public String getWho() {
		return who;
	}

	/**
	 * 设置who
	 * @param who
	 */
	public void setWho(String who) {
		this.who = who;
	}
}
