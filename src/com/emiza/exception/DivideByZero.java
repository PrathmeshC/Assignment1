/**
* <h1>DivideByZero</h1>
* This class defines DivideByZero exception. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */ 


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
