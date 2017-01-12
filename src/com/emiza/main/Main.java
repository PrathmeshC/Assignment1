package com.emiza.main;

import java.text.DecimalFormat;

import org.apache.log4j.Logger;

import com.emiza.exception.DivideByZero;
import com.emiza.exception.IntegerOutOfLimit;
import com.emiza.exception.InvalidOperator;
import com.emiza.service.IterationFactory;
import com.emiza.service.OperationFactory;
import com.emiza.service.OperationStFactory;
import com.emiza.service.ProcessOutput;

public class Main {

	public static void main(String[] args) {

		OperationFactory opsFact;
		Logger log = Logger.getLogger(Main.class);
		ProcessOutput po;
		StringBuilder strBuild = new StringBuilder();
		DecimalFormat form = new DecimalFormat("0.0000");

		int a = 5, b = 10;
		char op = 'n';
		String input = "1,2,p;4,3,;5,6,m;60,25,d;7,8,n";

		String input1 = "1,2;4,3;560,6;60,25;7,8;1,2;4,3;560,6;6000,25;-1,8";
		String operator = "pkmdn";

		try {
			/*To test OperationFactory*/
			opsFact = new OperationFactory(a, b, op);
			strBuild.append(opsFact.getmOp().getmOperand1() + opsFact.getmOp().getmWord()
					+ opsFact.getmOp().getmOperand2() + " = " + form.format(opsFact.operate()) + "\n");
			po = new ProcessOutput(strBuild.toString());

			/*To test IterationFactory*/
			IterationFactory it = new IterationFactory(input);
			po = new ProcessOutput(it.operate());

			/*To test OperationStFactory*/
			OperationStFactory operateSt = new OperationStFactory(input1, operator);
			po = new ProcessOutput(operateSt.operate());
			
		} catch (DivideByZero e) {
			log.error(e);
		} catch (IntegerOutOfLimit e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidOperator e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}