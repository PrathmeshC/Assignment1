package com.emiza.service;

import com.emiza.exception.DivideByZero;
import com.emiza.exception.IntegerOutOfLimit;
import com.emiza.exception.InvalidOperator;
import com.emiza.mathOperation.Divide;
import com.emiza.mathOperation.MathsOp;
import com.emiza.mathOperation.Modulus;
import com.emiza.mathOperation.Multiply;
import com.emiza.mathOperation.Subtract;

public class OperationFactory {

	public float calculate(int pOperand1, int pOperand2, char pOperator) throws InvalidOperator, IntegerOutOfLimit {

		pOperator = Character.toUpperCase(pOperator);
		MathsOp mOp = null;
		switch (pOperator) {
		case 'P':
			mOp = new MathsOp(pOperand1, pOperand2);
			break;

		case 'S':
			mOp = new Subtract(pOperand1, pOperand2);
			break;

		case 'M':
			mOp = new Multiply(pOperand1, pOperand2);
			break;

		case 'D':
			if (pOperand2 == 0) {
				throw new DivideByZero();
			}
			mOp = new Divide(pOperand1, pOperand2);
			break;

		case 'N':
			if (pOperand2 == 0) {
				throw new DivideByZero();
			}
			mOp = new Modulus(pOperand1, pOperand2);
			break;

		default:
			throw new InvalidOperator();

		}
		return mOp.operate();
	}
}
