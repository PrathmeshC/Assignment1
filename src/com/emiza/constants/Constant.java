/**
* <h1>Constant</h1>
* This class defines constants that are used in this application. 
* <p>
*
* @version 1.0
* @since   10-01-2017 */ 

package com.emiza.constants;

public class Constant {
	/*
	 * Arithmetic Signs
	 * */
	public static String PLUS_SIGN=" + ";
	public static String SUBTRACT_SIGN=" - ";
	public static String MULTIPLY_SIGN=" * ";
	public static String DIVIDE_SIGN=" / ";
	public static String MODULUS_SIGN=" % ";
	
	/*
	 * Arithmetic Words
	 * */
	public static String PLUS_WORD=" Plus ";
	public static String SUBTRACT_WORD=" Minus ";
	public static String MULTIPLY_WORD=" Multipled by ";
	public static String DIVIDE_WORD=" Divided by ";
	public static String MODULUS_WORD=" Mod ";
	
	/*
	 * Arithmetic characters
	 * */
	public static final char MOD='N';
	public static final char PLUS='P';
	public static final char SUB='S';
	public static final char MUL='M';
	public static final char DIV='D';
	
	/*
	 * Number Constants
	 * */
	public static int FIFTY=50000;
	public static int ZERO=0;
	public static int ONE=1;
	public static int TWO=2;
	public static int THREE=3;
	
	/*
	 * Errors
	 * */
	public static String DIVIDE_BY_ZERO="Operand2 must not be zero.";
	public static String INTEGER_OUT_OF_LIMIT=" is out of range of 0 to 50000.";
	public static String VALUE_PAIR_OUT_OF_LIMIT=" is out of range of 1 to 10.";
	public static String INVALID_OPERATOR="Please enter valid operator: P(Plus),S(Subtract),M(Multiply),D(Division),N(Modulus)";
	public static String INVALID_JSON="Given JSON string in not valid.";
	public static String OPERAND_EXCEPTION="Operands missing";
	public static String STRING_FORMAT_EXCEPTION="Given string in not valid.";
}