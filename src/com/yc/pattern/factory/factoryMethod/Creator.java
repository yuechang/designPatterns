/*!
 * Copyright(c) 2016 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.factory.factoryMethod;

/**
 * @ClassName: Creator
 * @Description: 抽象工厂角色
 * @author Yue Chang
 * @date 2016年3月16日 下午10:43:11
 * 
 */
public interface Creator {

	public Product factory();
}