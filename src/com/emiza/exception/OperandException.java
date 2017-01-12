/**
* <h1>OperandException</h1>
* This class defines OperandException exception. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */

package com.emiza.exception;

import com.emiza.constants.Constant;

public class OperandException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8674526552568884728L;
	
	public OperandException() {
		super(Constant.OPERAND_EXCEPTION);	
	}
}
