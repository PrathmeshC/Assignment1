package com.emiza.main;

import java.text.DecimalFormat;

import com.emiza.exception.DivideByZero;
import com.emiza.exception.IntegerOutOfLimit;
import com.emiza.exception.InvalidOperator;
import com.emiza.mathOperation.Divide;
import com.emiza.mathOperation.MathsOp;
import com.emiza.mathOperation.Modulus;
import com.emiza.mathOperation.Multiply;
import com.emiza.mathOperation.Subtract;
import com.emiza.service.OperationFactory;

public class Main {

	public static void main(String[] args) {
		// inputs

		int a = 56000;
		int b = 7800;
		char op = 'p';

		try {
			OperationFactory of=new OperationFactory();
			System.out.println(of.calculate(a, b, op));
		} catch (IntegerOutOfLimit e) {
			e.printStackTrace();
		} catch (InvalidOperator e) {
			e.printStackTrace();
		} catch (DivideByZero e) {
			e.printStackTrace();
		}
		DecimalFormat form = new DecimalFormat("0.0000");
		System.out.println(a + mop.getmSign() + b + " = " + form.format(mop.operate()));
	}
}