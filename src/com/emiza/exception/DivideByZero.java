package com.emiza.exception;

import com.emiza.constants.Constant;

public class DivideByZero extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8674526552568884728L;
	
	public DivideByZero() {
		super(Constant.DIVIDE_BY_ZERO);	
	}
}
