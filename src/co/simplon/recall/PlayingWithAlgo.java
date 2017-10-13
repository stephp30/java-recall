package co.simplon.recall;

import java.util.*;

public class PlayingWithAlgo 
{
	
	public static String helloWorld(String name) 
	{
		// TODO Auto-generated method stub
		String message;
		//message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[])
	{
		List<String> resultat = new ArrayList<String>();
		
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i].charAt(0) == 'a')
			{
				System.out.println(array);
				resultat.add(array[i]);
			}
		}
		return resultat;
		
	}

	public static List<String> selectElementsStartingWithVowel(String array[]) 
	{
		
		
		return null;
	}

	public static String[] removeNullElements(String array[]) 
	{
		String[] array2 = Arrays.stream(array).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);
		return array2;
	}

	public static String[] reverseWordsInMyStringArray(String array[]) 
	{
		String[] array2 = array;
		
		for (int i = 0; i < array.length; i++)
		{
			array2[i] = new StringBuilder(array[i]).reverse().toString();
		}

		return array2;
		
	}

	public static String[] reverseOrderInArray(String array[])
	{
		String[] array2 = array;
		
		for (int i = 0; i < array.length / 2; i++) {
			String temp = array[i];
			array2[i] = array[array.length - i - 1];
			array2[array.length - i - 1] = temp;
		} 
		return array2;
		
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		return null;
	}

	public static String getFirstHalf(String string) 
	{
		String string2 = "";
		int x = string.length() / 2;
		if (x % 2 != 0) {
			string2 = string.substring(0, x);
		} else
			string2 = string.substring(0, x + 1);
		return string2;
		
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		return null;
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}
	
	public static String shortestWord(String text) {
		return null;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}
	
	public static String removeCapitals(String text) {
		return null;
	}
	
	public static String formatDateNicely(String text) {
		return null;
	}
	
	public static String getDomainName(String email) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}
	
	public static boolean checkForSpecialCharacters(String string) {
		return false;
	}
	
	public static String[] findAnagrams(String name) {
		return null;
	}

	public static int[] letterPosition(String name) {
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2)
	{
		long result = number1 + number2;

		return result;
		
	}

	public static long addingThreeNumbers(long number1, long number2, long number3)
	{
		long result = number1 + number2 + number3;

		return result;
		
	}

	public static long addingSeveralNumbers(final long... numbers) {
		return 0;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		return null;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number)
	{
		if (number > 0) {
			number = number * -1;
		}

		return number;
		
	}

	public static String[] getElementsLowerThanSix(String[] array) {
		return null;
	}
	
	public static int[] sortTabBySelection(int[] array) {
		return null;
	}
	
	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}
	
	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number)
	{
		int resultat = 0;
		
		if (number == 1) {
			return 1;
		}
		else 
			resultat = number * factorial(number - 1);
		return resultat;
		
	}

	public static int convertToCelsius(int temperature) 
	{
		double celsius = Math.ceil((temperature - 32) / 1.8);
		temperature = (int) celsius;
		return (int) celsius;
		
	}
	
	public static boolean checkIfPair(int number) 
	{
		if (number % 2 == 0) {
			return true;
		} else
		return false;
		
	}
	
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		return false;
	}
	
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		return false;
	}
	
	public static boolean checkIfAllElementsPair(int[] array) {
		return false;
	}
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		return null;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		return false;
	}
	
	public static boolean checkSiTuPeuxAcheter(int prix) 
	{
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		if ((prix < 22) && (prix % 2 == 0))
		{
			return true;
		}

		return false;
	}
	
	public static boolean checkCase1(double prix, int pourcentDeRemise) 
	{
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		double article = prix - prix * pourcentDeRemise / 100;
		if (article > 100)
		{
			return false;
		} else
		return true;
		
	}
	
	public static boolean checkCase2(int number1, int number2)
	{
		// check si une de 2 chiffres, ou leur somme se divise par 7
		int somme = number1 + number2;
		if ((number1 % 7 == 0) || (number2 % 7 == 0) || (somme % 7 == 0))
		{
			return true;
		} else
		return false;
		
	}
	
	public static boolean checkCase2a(int number1, int number2) 
	{
		

		return false;
		
	}
	
	public static boolean checkCase3(int number1, int number2, int number3)
	{
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		if ((number1 < number2) && (number2 < number3) || (number1 > number2) && (number2 > number3))
		{
			return true;
		} else
		return false;
		
	}
	
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {

		return null;
	}
	
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		return null;
	}
	
	
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> reverseOrder(int array[]) {
		return null;
	}
	
	public static int[] reverseOrderInt(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		return null;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		
		return null;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		return null;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		return 0;
	}
	
	public static boolean checkIfStringStartsWithA( String word ) {
		return false;
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) {
		return false;
	}
	
	public static boolean checkIfStringEndsWithS( String word ) {
		return false;
	}
	
	public static String findShortestWord(String[] array )
	{
		String shortest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i].length() < array[0].length()) {
				if (shortest == array[0])
					shortest = array[i];
				else
					break;
			}
		}
		return shortest;
		
	}
	
	public static String swapFirstandLastLetter(String array ) {
		
		return null;
	}
	
	public static int[] swapFirstandLastElement(int[] array ) {
		
		return null;
	}

}
