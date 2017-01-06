package com.emiza.mathOperation;

import com.emiza.constants.Constant;
import com.emiza.exception.IntegerOutOfLimit;

public class MathsOp {

	private char mOp;
	private int mOperand1, mOperand2;
	private String mSign, mWord;

	public MathsOp(int pOperand1, int pOperand2, char pOp) throws IntegerOutOfLimit {
		validate(pOperand1, pOperand2);
		this.mOp = pOp;
	}

	public MathsOp(int pOperand1, int pOperand2) throws IntegerOutOfLimit {
		validate(pOperand1, pOperand2);
		this.mOp = 'p';
	}

	private void validate(int oper1, int oper2) throws IntegerOutOfLimit {
		if ( oper1 >= Constant.ZERO && oper1 <= Constant.FIFTY)
			this.mOperand1 = oper1;
		else
			throw new IntegerOutOfLimit(oper1);

		if (oper2 >= Constant.ZERO && oper2 <= Constant.FIFTY)
			this.mOperand2 = oper2;
		else
			throw new IntegerOutOfLimit(oper2);
	}

	public void setSignAndWord(String pSign, String pWord) {
		this.mSign = pSign;
		this.mWord = pWord;
	}

	public String getmSign() {
		return mSign;
	}

	public String getmWord() {
		return mWord;
	}

	public float operate() {
		setSignAndWord(Constant.PLUS_SIGN, Constant.PLUS_WORD);
		return this.getmOperand1() + this.getmOperand2();
	}

	public char getmOp() {
		return mOp;
	}

	public int getmOperand1() {
		return mOperand1;
	}

	public int getmOperand2() {
		return mOperand2;
	}
}