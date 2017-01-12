/**
* <h1>OperationStFactory</h1>
* This class implements an application  that simply take inputs of multiple pair of values and string of operands. 
* It returns the result as a string. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */ 

package com.emiza.service;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

import com.emiza.constants.Constant;
import com.emiza.exception.IntegerOutOfLimit;
import com.emiza.exception.InvalidOperator;
import com.emiza.exception.OperandException;
import com.emiza.exception.StringFormatException;
import com.emiza.exception.ValuePairOutOfLimit;

public class OperationStFactory {

	private List<String> inputList;
	private List<Character> operator;
	Utility u = new Utility();

	/**
	 * This method is used to instantiate member variable.
	 * @param input String containing pairs of input values.
	 * @param oper String of operations to perform. 	
	 * */
	public OperationStFactory(String input, String oper) {
		this.inputList = u.toInputList(input);
		this.operator = u.toCharList(oper);
	}
	
	/**
	 * This method is used to calculate the result based on operand.
	 * @return String  String result will be returned.
	 * @exception InvalidOperator on input parameters.
	 * @exception IntegerOutOfLimit on input parameters. 
	 * @exception OperandException on missing operand.
	 * @exception StringFormatException on incorrect string format.
	 * @exception ValuePairOutOfLimit on domain on number of value pair allowed.
	 * */
	public String operate() {

		// Logger log = Logger.getLogger(IterationFactory.class);
		DecimalFormat form = new DecimalFormat("0.0000");
		StringBuffer sb = new StringBuffer();
		OperationFactory operateF;
		List<Integer> valueList;

		Iterator<String> inputItr = this.getInputList().iterator();

		Iterator<Character> opItr = this.getOperator().iterator();

		try {
			/* Domain check */
			if (this.getInputList().size() <= 1 && this.getInputList().size() >= 10) {
				throw new ValuePairOutOfLimit(this.getInputList().size());
			}

			while (inputItr.hasNext()) {

				/* To get individual operands from operand sets */
				valueList = u.toValueList(inputItr.next());
				Iterator<Integer> valItr = valueList.iterator();

				/* Check for validity of operands and string format */
				if (valueList.size() < Constant.TWO)
					throw new OperandException();
				if (valueList.size() > Constant.TWO)
					throw new StringFormatException();

				/*
				 * If there is empty operator string default operator sets to
				 * plus
				 */
				if (operator.size() == 0)
					operateF = new OperationFactory(valItr.next(), valItr.next(), Constant.PLUS);
				else
					operateF = new OperationFactory(valItr.next(), valItr.next(), opItr.next());

				/* Output */
				sb.append(operateF.getmOp().getmOperand1() + operateF.getmOp().getmWord()
						+ operateF.getmOp().getmOperand2() + " = " + form.format(operateF.operate()) + "\n");

				/*To reset operator iterator.*/
				if (!opItr.hasNext())
					opItr = this.getOperator().iterator();
			}
		} catch (IntegerOutOfLimit e) {
			sb.append(e);
		} catch (InvalidOperator e) {
			sb.append(e);
		} catch (OperandException e) {
			sb.append(e);
		} catch (StringFormatException e) {
			sb.append(e);
		} catch (ValuePairOutOfLimit e) {
			sb.append(e);
		}
		return sb.toString();
	}

	/**
	 * This method is used to get value member variable inputList.
	 * @return String value of inputList.
	 */
	public List<String> getInputList() {
		return inputList;
	}

	/**
	 * This method is used to get value member variable operator.
	 * @return String value of operator.
	 */
	public List<Character> getOperator() {
		return operator;
	}
}