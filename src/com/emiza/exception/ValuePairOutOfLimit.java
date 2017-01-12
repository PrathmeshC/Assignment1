/**
* <h1>ValuePairOutOfLimit</h1>
* This class defines ValuePairOutOfLimit exception. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */

package com.emiza.exception;

import com.emiza.constants.Constant;


public class ValuePairOutOfLimit extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5933066586509955249L;

	public ValuePairOutOfLimit(int num){
		super(num+Constant.VALUE_PAIR_OUT_OF_LIMIT);	
	}

}
