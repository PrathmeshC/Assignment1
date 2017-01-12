/**
* <h1>MathsOP</h1>
* This class implements a base class. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */

package com.emiza.mathOperation;

import com.emiza.constants.Constant;
import com.emiza.exception.IntegerOutOfLimit;

public class MathsOp {

	private char mOp;
	private int mOperand1, mOperand2;
	private String mSign, mWord;

	/**
	 * This method is used to instantiate member variable.
	 * 
	 * @param pOperand1 Operand one to perform calculation.
	 * @param pOperand2 Other operand to perform calculation.
	 * @param pOp The operation to perform on two given operands.
	 * @exception IntegerOutOfLimit on input domain.
	 */

	public MathsOp(int pOperand1, int pOperand2, char pOp) throws IntegerOutOfLimit {
		validate(pOperand1, pOperand2);
		this.mOp = pOp;
	}

	/**
	 * This method is used to instantiate member variable. If operator in not
	 * mentioned, operator will default to PLUS.
	 * 
	 * @param pOperand1 Operand one to perform calculation.
	 * @param pOperand2 Other operand to perform calculation.
	 * @exception IntegerOutOfLimit on input domain.
	 */
	public MathsOp(int pOperand1, int pOperand2) throws IntegerOutOfLimit {
		validate(pOperand1, pOperand2);
		this.mOp = Constant.PLUS;
	}

	/**
	 * This method is used to validate member variable for domain.
	 * 
	 * @param pOperand1 Operand one to perform calculation.
	 * @param pOperand2 Other operand to perform calculation.
	 * @exception IntegerOutOfLimit on input domain.
	 */
	private void validate(int oper1, int oper2) throws IntegerOutOfLimit {
		if (oper1 >= Constant.ZERO && oper1 <= Constant.FIFTY)
			this.mOperand1 = oper1;
		else
			throw new IntegerOutOfLimit(oper1);

		if (oper2 >= Constant.ZERO && oper2 <= Constant.FIFTY)
			this.mOperand2 = oper2;
		else
			throw new IntegerOutOfLimit(oper2);
		setSignAndWord(Constant.PLUS_SIGN, Constant.PLUS_WORD);
	}

	/**
	 * This method is used to set sign and word of member variable for output.
	 * 
	 * @param pSign To set sign of an operator according to an operator.
	 * @param pWord To set word of an operator according to an operator.
	 * @exception IntegerOutOfLimit on input domain.
	 */
	public void setSignAndWord(String pSign, String pWord) {
		this.mSign = pSign;
		this.mWord = pWord;
	}

	/**
	 * This method is used to calculate result. Default is addition.
	 * @return float addition of given operands.
	 */
	public float operate() {
		setSignAndWord(Constant.PLUS_SIGN, Constant.PLUS_WORD);
		return this.getmOperand1() + this.getmOperand2();
	}
	
	/**
	 * This method is used to get value member variable mSign.
	 * @return String value of mSign.
	 */
	public String getmSign() {
		return mSign;
	}

	/**
	 * This method is used to get value member variable mWord.
	 * @return String value of mWord.
	 */
	public String getmWord() {
		return mWord;
	}

	/**
	 * This method is used to get value member variable mOp.
	 * @return String value of mOp.
	 */
	public char getmOp() {
		return mOp;
	}

	/**
	 * This method is used to get value member variable mOperand1.
	 * @return int value of mOperand1.
	 */
	public int getmOperand1() {
		return mOperand1;
	}

	/**
	 * This method is used to get value member variable mOperand2.
	 * @return String value of mOperand2.
	 */
	public int getmOperand2() {
		return mOperand2;
	}
}