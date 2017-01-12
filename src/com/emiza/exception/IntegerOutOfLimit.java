/**
* <h1>IntegerOutOfLimit</h1>
* This class defines IntegerOutOfLimit exception. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */
 
package com.emiza.exception;

import com.emiza.constants.Constant;

/**
 * @author chalk
 *
 */
public class IntegerOutOfLimit extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5933066586509955249L;

	public IntegerOutOfLimit(int num){
		super(num+Constant.INTEGER_OUT_OF_LIMIT);	
	}

}
