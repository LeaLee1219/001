package com.cqkj.entity;

import org.junit.Test;

/**
 * hello类测试
 * @author Lea
 * @creatDate 2019-4-8
 * @version 1.0
 */
public class HelloTest {
	/**
	 * 测试say方法
	 */
	
	Hello hello=new Hello();
	@Test
	public void say(){
		//调用say方法
		hello.say("Lea");
	}
	
	/**
	 * 测试out方法
	 * @return 一个字符串"Hello Maven"
	 */
	@Test
	public String out(){
		String msg="输出："+hello.out();
		return msg;
	}
}
