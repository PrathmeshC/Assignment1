/**
* <h1>IterationFactory</h1>
* This class implements an application  that simply take inputs of multiple pair of values and operator.
* It returns the result as a string. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */ 
package com.emiza.service;

import java.text.DecimalFormat;

import org.apache.log4j.Logger;

import com.emiza.constants.Constant;
import com.emiza.exception.DivideByZero;
import com.emiza.exception.IntegerOutOfLimit;
import com.emiza.exception.InvalidOperator;
import com.emiza.exception.OperandException;
import com.emiza.exception.StringFormatException;

public class IterationFactory {

	private OperationFactory[] of;

	/**
	 * This method is used to instantiate member variable.
	 * @param input String containing input parameter pair with operand. 
	 * This multiple pairs will be separated by semicolon(;) and value in value pair will be separated by comma(,).
	 * e.g. "1,2,p;56000,8,s;5,0,d"
	 * 
	 * @exception DivideByZero  on input parameters
	 * @exception InvalidOperator on input parameters.
	 * @exception IntegerOutOfLimit on input parameters.
	 * */

	public IterationFactory(String input) throws OperandException, IntegerOutOfLimit, InvalidOperator {
		Utility u = new Utility();
		String[] inputArray, valueArray;

		inputArray = u.toInputArray(input);
		of = new OperationFactory[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			valueArray = u.toValueArray(inputArray[i]);
			if (valueArray.length < Constant.THREE)
				try {
					Integer.valueOf(valueArray[0]);
					Integer.valueOf(valueArray[1]);
				} catch (NumberFormatException e) {
					throw e;
				}
			else if (valueArray.length == 0)
				throw new OperandException();
			if (valueArray.length > Constant.THREE)
				throw new StringFormatException();
			if (valueArray.length == Constant.THREE)
				of[i] = new OperationFactory(Integer.parseInt(valueArray[0]), Integer.parseInt(valueArray[1]),
						valueArray[2].charAt(0));
			else
				of[i] = new OperationFactory(Integer.parseInt(valueArray[0]), Integer.parseInt(valueArray[1]),
						Constant.PLUS);
		}
	}

	/**
	 * This method is used to calculate the result based on operand.
	 * @return String This returns result.
	 * @exception InvalidOperator on input parameters.
	 * @exception IntegerOutOfLimit on input parameters. 
	 * */
	public String operate() throws IntegerOutOfLimit, InvalidOperator {
		Logger log = Logger.getLogger(IterationFactory.class);
		DecimalFormat form = new DecimalFormat("0.0000");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < of.length; i++) {
			sb.append(of[i].getmOp().getmOperand1() + of[i].getmOp().getmWord() + of[i].getmOp().getmOperand2() + " = "
					+ form.format(of[i].operate()) + "\n");
		}
		log.info(sb);
		return sb.toString();
	}
}
