/**
* <h1>Multiply</h1>
* This class will perform multiplication operation. It inherits base class MathsOp.java . 
* <p>
*
* @version 1.0
* @since   10-01-2017 */

package com.emiza.mathOperation;

import com.emiza.constants.Constant;
import com.emiza.exception.IntegerOutOfLimit;

public class Multiply extends MathsOp {

	/**
	 * This method is used to instantiate member variable. Base class constructor is called to set the member variable.
	 * Base class method is used to set sign and word for an operation multiplication.
	 * 
	 * @param pOperand1 Operand one to perform calculation.
	 * @param pOperand2 Other operand to perform calculation.
	 * @param pOp The operation to perform on two given operands.
	 * @exception IntegerOutOfLimit on input domain.
	 */
	public Multiply(int pOperand1, int pOperand2, char pOp) throws IntegerOutOfLimit {
		super(pOperand1, pOperand2, pOp);
		setSignAndWord(Constant.MULTIPLY_SIGN, Constant.MULTIPLY_WORD);
	}
	
	/**
	 * This method is used to instantiate member variable. Base class constructor is called to set the member variable.
	 * Base class method is used to set sign and word for an operation multiplication.
	 *  
	 * @param pOperand1 Operand one to perform calculation.
	 * @param pOperand2 Other operand to perform calculation.
	 * @exception IntegerOutOfLimit on input domain.
	 */
	public Multiply(int pOperand1, int pOperand2) throws IntegerOutOfLimit {
		super(pOperand1, pOperand2, Constant.MUL);
		setSignAndWord(Constant.MULTIPLY_SIGN, Constant.MULTIPLY_WORD);
	}
	
	/**
	 * This method is used to calculate result.
	 * @return float multiplication of given operands.
	 */
	public float operate(){
		return this.getmOperand1()*this.getmOperand2();
	}
}
