/*
 * Copyright (c) 2016, 2025, HHLY and/or its affiliates. All rights reserved.
 * HHLY PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.yc.pattern.strategy;

/**
* @ClassName: FlyRocketPowered
* @Description: 使用火箭动力飞行
* @author Yue Chang 
* @date 2017年5月8日 下午4:21:12 
* @since 1.0
*/
public class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
