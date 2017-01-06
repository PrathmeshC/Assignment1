package com.emiza.mathOperation;

import com.emiza.constants.Constant;
import com.emiza.exception.IntegerOutOfLimit;

public class Multiply extends MathsOp {

	public Multiply(int pOperand1, int pOperand2, char pOp) throws IntegerOutOfLimit {
		super(pOperand1, pOperand2, pOp);
		setSignAndWord(Constant.MULTIPLY_SIGN, Constant.MULTIPLY_WORD);
	}
	
	public Multiply(int pOperand1, int pOperand2) throws IntegerOutOfLimit {
		super(pOperand1, pOperand2, Constant.MUL);
		setSignAndWord(Constant.MULTIPLY_SIGN, Constant.MULTIPLY_WORD);
	}
	
	public float operate(){
		return this.getmOperand1()*this.getmOperand2();
	}
}
