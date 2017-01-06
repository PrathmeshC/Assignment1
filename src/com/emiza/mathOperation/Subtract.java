package com.emiza.mathOperation;

import com.emiza.constants.Constant;
import com.emiza.exception.IntegerOutOfLimit;

public class Subtract extends MathsOp {

	public Subtract(int pOperand1, int pOperand2, char pOp) throws IntegerOutOfLimit {
		super(pOperand1, pOperand2, pOp);
		setSignAndWord(Constant.SUBTRACT_SIGN, Constant.SUBTRACT_WORD);
	}
	
	public Subtract(int pOperand1, int pOperand2) throws IntegerOutOfLimit {
		super(pOperand1, pOperand2, Constant.SUB);
		setSignAndWord(Constant.SUBTRACT_SIGN, Constant.SUBTRACT_WORD);
	}
	
	public float operate(){
		return this.getmOperand1()-this.getmOperand2();
	}
}
