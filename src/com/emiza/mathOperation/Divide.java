package com.emiza.mathOperation;

import com.emiza.constants.Constant;
import com.emiza.exception.IntegerOutOfLimit;

public class Divide extends MathsOp {

	public Divide(int pOperand1, int pOperand2, char pOp) throws IntegerOutOfLimit {
		super(pOperand1, pOperand2, pOp);
		setSignAndWord(Constant.DIVIDE_SIGN, Constant.DIVIDE_WORD);
	}

	public Divide(int pOperand1, int pOperand2) throws IntegerOutOfLimit {
		super(pOperand1, pOperand2, Constant.DIV);
		setSignAndWord(Constant.DIVIDE_SIGN, Constant.DIVIDE_WORD);
	}

	public float operate() {
		return (float) this.getmOperand1() / this.getmOperand2();
	}
}
