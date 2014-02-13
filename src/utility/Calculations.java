package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculations {

	private static String pattern = "[0-9]|[0]\\.|[0]\\.\\d+|[1-9]\\.|[1-9]\\d+|[1-9]\\.\\d+|[1-9]\\d+\\.|[1-9]\\d+\\.\\d+";

	public static boolean isMatchDigit(String input) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		return m.matches();
	}

	public static boolean isMatchOperator(String symbol) {
		if (symbol.equals(DigitsPointOperators.Minus.symbol())
				|| symbol.equals(DigitsPointOperators.Plus.symbol())
				|| symbol.equals(DigitsPointOperators.Mul.symbol())
				|| symbol.equals(DigitsPointOperators.Equal.symbol())
				|| symbol.equals(DigitsPointOperators.Divide.symbol())
				|| symbol.equals(DigitsPointOperators.Clear.symbol()))
			return true;
		return false;
	}

	public static boolean isMatchNumber(String input) {
		Pattern p = Pattern
				.compile("[0-9]|[0]\\.\\d+|[1-9]\\d+|[1-9]\\.\\d+|[1-9]\\d+\\.|[1-9]\\d+\\.\\d+");
		Matcher m = p.matcher(input);
		return m.matches();
	}

	public static String calculateResult(StringBuilder firstNum,
			StringBuilder secondNum, String oper) {

		Double first = Double.valueOf(firstNum.toString());
		Double second = Double.valueOf(secondNum.toString());
		Double result = 0.0;
		if ((DigitsPointOperators.Minus.symbol()).equals(oper))
			result = first - second;

		if ((DigitsPointOperators.Plus.symbol()).equals(oper))
			result = first + second;

		if ((DigitsPointOperators.Divide.symbol()).equals(oper)) {

			if (isZero(secondNum.toString())) {
				return DigitsPointOperators.Zerodiv.symbol();
			}

			result = first / second;
		}
		
		if ((DigitsPointOperators.Mul.symbol()).equals(oper))
			result = first * second;

		return result.toString();

	}

	static boolean isZero(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '.') {
				num = num.substring(0, i) + num.substring(i + 1);
			}
			if (num.charAt(i) != '0')
				return false;
		}
		return true;
	}
}
