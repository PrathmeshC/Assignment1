/**
* <h1>InvalidJSON</h1>
* This class defines InvalidJSON exception. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */

package com.emiza.exception;

import com.emiza.constants.Constant;

public class InvalidJSON extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1399373336060940295L;
	public InvalidJSON() {
		super(Constant.INVALID_JSON);	
	}
}
