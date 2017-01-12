/**
* <h1>InvalidOperator</h1>
* This class defines InvalidOperator exception. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */

package com.emiza.exception;

import com.emiza.constants.Constant;

public class InvalidOperator extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7531582363781646093L;

	public InvalidOperator() {
		super(Constant.INVALID_OPERATOR);	
	}
}
