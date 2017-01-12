/**
* <h1>StringFormatException</h1>
* This class defines StringFormatException exception. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */

package com.emiza.exception;

import com.emiza.constants.Constant;

public class StringFormatException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8674526552568884728L;
	
	public StringFormatException() {
		super(Constant.STRING_FORMAT_EXCEPTION);	
	}
}
