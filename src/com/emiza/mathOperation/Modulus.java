package com.emiza.mathOperation;

import com.emiza.constants.Constant;
import com.emiza.exception.IntegerOutOfLimit;

public class Modulus extends MathsOp {

	public Modulus(int pOperand1, int pOperand2, char pOp) throws IntegerOutOfLimit {
		super(pOperand1, pOperand2, pOp);
		setSignAndWord(Constant.MODULUS_SIGN, Constant.MODULUS_WORD);
	}

	public Modulus(int pOperand1, int pOperand2) throws IntegerOutOfLimit {
		super(pOperand1, pOperand2, Constant.MOD);
		setSignAndWord(Constant.MODULUS_SIGN, Constant.MODULUS_WORD);
	}

	public float operate(){
		return this.getmOperand1()%this.getmOperand2();
	}
}
