/**
* <h1>OperationFactory</h1>
* This class implements an application  that simply take inputs as a single pair and returns the result. 
* <p>
*
* @author  Prathmesh Chalke
* @version 1.0
* @since   10-01-2017 */ 

package com.emiza.service;

import com.emiza.constants.Constant;
import com.emiza.exception.DivideByZero;
import com.emiza.exception.IntegerOutOfLimit;
import com.emiza.exception.InvalidOperator;
import com.emiza.mathOperation.Divide;
import com.emiza.mathOperation.MathsOp;
import com.emiza.mathOperation.Modulus;
import com.emiza.mathOperation.Multiply;
import com.emiza.mathOperation.Subtract;


public class OperationFactory {

	private MathsOp mOp;
	
	/**
	 * This method is used as getter to access member variable.
	 * */
	public MathsOp getmOp() {
		return mOp;
	}
	
	/**
	 * This method is used to instantiate member variable.
	 * @param pOperand1 One operand to perform calculation.
	 * @param pOperand2 Other operand to perform calculation.
	 * @param pOperator The operation to perform on two given operands.
	 * @exception DivideByZero  on input parameters
	 * @exception InvalidOperator on input parameters.
	 * @exception IntegerOutOfLimit on input parameters.
	 * */

	public OperationFactory(int pOperand1, int pOperand2, char pOperator) throws IntegerOutOfLimit, InvalidOperator {
		pOperator = Character.toUpperCase(pOperator);
		switch (pOperator) {
		case Constant.PLUS:
			this.mOp = new MathsOp(pOperand1, pOperand2);
			break;

		case Constant.SUB:
			this.mOp = new Subtract(pOperand1, pOperand2);
			break;

		case Constant.MUL:
			this.mOp = new Multiply(pOperand1, pOperand2);
			break;

		case Constant.DIV:
			if (pOperand2 == 0) {
				throw new DivideByZero();
			}
			this.mOp = new Divide(pOperand1, pOperand2);
			break;

		case Constant.MOD:
			if (pOperand2 == 0) {
				throw new DivideByZero();
			}
			this.mOp = new Modulus(pOperand1, pOperand2);
			break;

		default:
			throw new InvalidOperator();

		}
	}
	
	/**
	 * This method is used to calculate the result based on operand.
	 * @return float Float result will be returned.
	 * @exception InvalidOperator on input parameters.
	 * @exception IntegerOutOfLimit on input parameters. 
	 * */
	public float operate() throws InvalidOperator, IntegerOutOfLimit {
		return mOp.operate();
	}
}
