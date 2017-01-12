/**
* <h1>Utility</h1>
* This class is a uility class. It is used to convert input string into sets or array.
* <p>
*
* @version 1.0
* @since   10-01-2017 */

package com.emiza.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility {

	/**
	 * This method is used to convert input string which has (;) into list of strings.
	 * @return List<String>  List<String> will be returned.
	 * */
	public List<String> toInputList(String input) {
		return Arrays.asList(input.split("\\s*;\\s*"));
	}
	
	/**
	 * This method is used to convert input string which has (,) into list of integers.
	 * @return List<Integer>  List<Integer> will be returned.
	 * */
	public List<Integer> toValueList(String input) {
		List<Integer> listI=new ArrayList<Integer>();
		List<String> listS=Arrays.asList(input.split("\\s*,\\s*"));
		for(String value:listS){
			listI.add(Integer.parseInt(value));
		}
		return listI;
	}
	
	/**
	 * This method is used to convert input string into list of Character.
	 * @return List<Character>  List<Character> will be returned.
	 * */
	public List<Character> toCharList(String input) {
		List<Character> list=new ArrayList<Character>();
		for(char c: input.toCharArray()){
			list.add(c);
		}
		return list;
	}

	/**
	 * This method is used to convert input string which has (,) into array of strings.
	 * @return String[]  String[] will be returned.
	 * */
	public String[] toValueArray(String input) {
		return input.split(",");
	}
	
	/**
	 * This method is used to convert input string which has (;) into array of strings.
	 * @return String[]  String[] will be returned.
	 * */
	public String[] toInputArray(String input) {
		return input.split(";");
	}
}
