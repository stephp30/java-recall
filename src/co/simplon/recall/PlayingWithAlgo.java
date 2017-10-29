package co.simplon.recall;

import java.util.*;
import java.util.regex.Pattern;

public class PlayingWithAlgo {

	public static String helloWorld(String name) {
		String message;
		// message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[]) {
		ArrayList<String> resultat = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {
			if (array[i].charAt(0) == 'a') {
				resultat.add(array[i]);
			}
		}
		return resultat;

	}

	public static List<String> selectElementsStartingWithVowel(String array[]) {
		ArrayList<String> resultat = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null)
				if (array[i].matches("^[aeiouy].+")) {
					resultat.add(array[i]);
				}

		}
		return resultat;

	}

	public static String[] removeNullElements(String array[]) {

		String[] array2 = Arrays.stream(array).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);
		return array2;
	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		String[] array2 = array;

		for (int i = 0; i < array.length; i++) {
			array2[i] = new StringBuilder(array[i]).reverse().toString();
		}

		return array2;

	}

	public static String[] reverseOrderInArray(String array[]) {
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
		ArrayList<String> resultat = new ArrayList<String>();
		String[] temp = new String[array.length];

		for (int i = 0; i < array.length; i++) {
			StringBuilder buffer = new StringBuilder(array[i]);
			String lettreInverse = buffer.reverse().toString();
			temp[i] = lettreInverse;
		}
		Arrays.sort(temp);

		for (int i = 0; i < array.length; i++) {
			StringBuilder buffer = new StringBuilder(temp[i]);
			String lettreInverse = buffer.reverse().toString();
			resultat.add(lettreInverse);
		}

		return resultat;

	}

	public static String getFirstHalf(String string) {
		String string2 = "";
		int x = string.length() / 2;
		if (x % 2 != 0) {
			string2 = string.substring(0, x);
		} else
			string2 = string.substring(0, x + 1);
		return string2;

	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		ArrayList<String> liste = new ArrayList<String>();
		ArrayList<String> liste2 = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null)
				if (array[i].matches("(?i:.*" + letter + ".*)")) {
					liste.add(array[i]);
				}

				else
					liste2.add(array[i]);
		}

		String[] array2 = new String[liste2.size()];
		for (int i = 0; i < liste2.size(); i++) {
			array2[i] = liste2.get(i);
		}

		String test = Arrays.toString(array2);
		test = test.replaceAll("\\[|\\]", "");

		return test;
	}

	public static int numberOfPalindromeWord(String text) {
		String premierTri = text.replaceAll("[ ']", "");
		String deuxiemetri = premierTri.replaceAll("^.+:", "");
		String[] tabDeMot = deuxiemetri.split(",");

		int limiteBoucle = tabDeMot.length;
		String[] tabDeMot2 = new String[limiteBoucle];
		int resultat = 0;

		for (int i = 0; i < limiteBoucle; i++) {
			StringBuilder buffer = new StringBuilder(tabDeMot[i]);
			String lettreInverse = buffer.reverse().toString();
			tabDeMot2[i] = lettreInverse;

			if (tabDeMot[i].equals(tabDeMot2[i]))
				resultat += 1;

		}

		return resultat;
	}

	public static int numberOfPalindromeText(String text) {
		String premierTri = text.replaceAll("[ ']", "");
		premierTri = premierTri.replaceAll("[?]", "");
		premierTri = premierTri.toLowerCase();
		String[] tabDeMot = premierTri.split(",");
		String[] tabDeMot2 = new String[tabDeMot.length];
		int limiteBoucle = tabDeMot.length;
		int resultat = 0;

		for (int i = 0; i < limiteBoucle; i++) {
			StringBuilder buffer = new StringBuilder(tabDeMot[i]);
			String lettreInverse = buffer.reverse().toString();
			tabDeMot2[i] = lettreInverse;
			if (tabDeMot[i].equals(tabDeMot2[i]))
				resultat += 1;

		}
		return resultat;
	}

	public static String shortestWord(String text) {
		String[] test = text.split(" ");
		String motCourt = test[0];
		for (int i = 0; i < test.length; i++) {
			if (test[i].length() < motCourt.length())
				motCourt = test[i];
		}
		return motCourt;
	}

	public static String longestWord(String text) {
		text = text.replaceAll("[^a-zA-Z\\s]", "");
		String[] test = text.split(" ");
		String motLong = test[0];
		for (int i = 0; i < test.length; i++) {
			if (test[i].length() > motLong.length())
				motLong = test[i];
		}
		return motLong;

	}

	public static String getAllLetters(String[] array) {
		ArrayList<Character> liste = new ArrayList<Character>();
		String lettre = Arrays.toString(array); // transforme le tableau d'entrée en String
		lettre = lettre.replaceAll("[^a-zA-Z]", ""); // Regex qui exclu les espaces
		char[] tabChar = lettre.toCharArray(); // fait un tableau de char
		Arrays.sort(tabChar); // tri un tableau de char
		String resultat = new String(tabChar); // String à partir du char[] trié

		// boucle ajouter les lettres à la liste
		for (int i = 0; i < resultat.length(); i++) {
			liste.add(resultat.charAt(i));
		}

		// refait la liste sans doublon
		Set<Character> listeSansDoublon = new TreeSet<Character>();
		listeSansDoublon.addAll(liste);
		List<Character> listeFinale = new ArrayList<Character>(listeSansDoublon);

		// on refait le String final
		String resultatFinal = new String();
		for (char c : listeFinale) {
			resultatFinal = resultatFinal + c;
		}
		return resultatFinal;
	}

	public static String removeCapitals(String text) {
		String resultat = text.replaceAll("[A-Z]", "");
		return resultat;
	}

	public static String formatDateNicely(String text) {
		String[] dateParts = text.split("-");
		String annee = dateParts[0];
		String mois = dateParts[1];
		String jour = dateParts[2];

		String date = jour + "/" + mois + "/" + annee;

		return date;
	}

	public static String getDomainName(String email) {

		String domaine = email.replaceAll("^.+@(.+)[\\.].+$", "$1");

		return domaine;
	}

	public static String titleize(String title) {
		String resultat = null;

		// séparation en sous-chaînes
		String[] tabMot = title.split(" ");
		// parcours du tableau des sous-chaînes
		for (int i = 0; i < tabMot.length; i++) {

			if (tabMot[i].length() > 3 || i == 0) // si mot de moins de 3 lettres ou premier mot de la chaine

			{
				tabMot[i] = Character.toUpperCase(tabMot[i].charAt(0)) + tabMot[i].substring(1); // je passe en
																									// majusqcule

			}

			int indexChar = tabMot[i].length() - 1;
			if (tabMot[i].charAt(indexChar) == '.' && i < tabMot.length) // si le mot est après un point
				tabMot[i + 1] = Character.toUpperCase(tabMot[i + 1].charAt(0)) + tabMot[i + 1].substring(1);// je passe
																											// en
																											// majusqcule

			resultat = Arrays.toString(tabMot); // je repasse le tableau en String
			resultat = resultat.replaceAll("^.(.+).$", "$1"); // Je supprime les [] restant après la transformation
			resultat = resultat.replaceAll(",", ""); // je supprime les virgules

		}

		return resultat;
	}

	public static boolean checkForSpecialCharacters(String string) {
		boolean resultat = false;
		if (string.matches("^.*[\\W].*$"))
			resultat = true;

		return resultat;
	}

	public static String[] findAnagrams(String name) {

		return null;
	}

	public static int[] letterPosition(String name) {
		int longueurBoucle = name.length();
		char[] tab = new char[longueurBoucle];
		int[] resultat = new int[longueurBoucle];

		for (int i = 0; i < longueurBoucle; i++) {
			tab[i] = name.charAt(i);
			resultat[i] = Character.getNumericValue(tab[i]) - 9;

		}

		return resultat;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		long result = number1 + number2;

		return result;

	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		long result = number1 + number2 + number3;

		return result;

	}

	public static long addingSeveralNumbers(final long... numbers) {
		long resultat = 0;
		for (int i = 0; i < numbers.length; i++)
			resultat += numbers[i];

		return resultat;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		int[] resultat = new int[array.length - 3];

		for (int i = 3; i < array.length; i++)
			resultat[i - 3] = array[i];

		return resultat;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		int[] resultat = new int[array.length + 1];

		resultat[0] = element;

		for (int i = 1; i < resultat.length; i++)
			resultat[i] = array[i - 1];

		return resultat;
	}

	public static Float makeNegative(Float number) {
		if (number > 0) {
			number = number * -1;
		}

		return number;

	}

	public static String[] getElementsLowerThanSix(String[] array) {
		Set<Integer> resultat = new TreeSet<Integer>();

		for (int i = 0; i < array.length; i++)
			if (Integer.parseInt(array[i]) < 7)
				resultat.add(Integer.parseInt(array[i]));

		List<Integer> listeFinale = new ArrayList<Integer>(resultat);

		String[] tabFinal = new String[listeFinale.size()];

		// on refait le String final
		for (int i = 0; i < listeFinale.size(); i++)

			tabFinal[i] = listeFinale.get(i).toString();

		return tabFinal;
	}

	public static int[] sortTabBySelection(int[] array) {

		int resultat[] = array;
		int index = 0;
		int plusPetit = 0;

		for (int i = 0; i < resultat.length - 1; i++) {
			index = i;
			for (int j = i + 1; j < resultat.length; j++)
				if (resultat[j] < resultat[index])
					index = j;

			plusPetit = resultat[index];
			resultat[index] = resultat[i];
			resultat[i] = plusPetit;
		}
		return resultat;
	}

	public static int[] sortTabByInsertion(int[] array) {
		int longueur = array.length;
		int[] resultat = array;

		for (int i = 1; i < longueur; i++) {
			int memory = resultat[i];
			int compt = i - 1;
			boolean marqueur;
			do {
				marqueur = false;
				if (resultat[compt] > memory) {
					resultat[compt + 1] = resultat[compt];
					compt--;
					marqueur = true;
				}
				if (compt < 0)
					marqueur = false;
			} while (marqueur);
			resultat[compt + 1] = memory;
		}

		return resultat;
	}

	public static int[] sortTabByBubble(int[] array) {

		int temp;
		int[] resultat = array;

		for (int i = resultat.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++)
				if (resultat[j] > resultat[j + 1]) {
					temp = resultat[j + 1];
					resultat[j + 1] = resultat[j];
					resultat[j] = temp;
					// System.out.println(Arrays.toString(resultat));
				}
		}
		return resultat;
	}

	public static int findIndexByDichotomy(int elemet, int[] array) {

		int indexMax = array.length - 1;
		int premier = 0;
		int dernier = indexMax;
		int milieu;
		int Rang = -1;
		do {
			milieu = (premier + dernier) / 2;
			if (elemet == array[milieu])
				Rang = milieu;
			else if (array[milieu] < elemet)
				premier = milieu + 1;
			else
				dernier = milieu - 1;
		} while ((elemet != array[milieu]) & (premier <= dernier));
		return Rang;
	}

	public static int roundUp(float number) {
		int resultat = Math.round(number);

		return resultat;
	}

	public static int findLastDayOfMonth(int month, int year) {

		// Calendar calendar = new GregorianCalendar(year, month-1, 1);

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);

		int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		return maxDay;
	}

	public static int factorial(int number) {
		int resultat = 0;

		if (number == 1) {
			return 1;
		} else
			resultat = number * factorial(number - 1);
		return resultat;

	}

	public static int convertToCelsius(int temperature) {
		double celsius = Math.ceil((temperature - 32) / 1.8);
		temperature = (int) celsius;
		return (int) celsius;

	}

	public static boolean checkIfPair(int number) {
		if (number % 2 == 0) {
			return true;
		} else
			return false;

	}

	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		boolean resultat = false;

		if (number1 % 2 == 0) {
			if (number2 % 2 == 0) {
				if (number3 % 2 != 0) {
					resultat = true;
				}
			}
		}
		return resultat;
	}

	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		boolean resultat = false;

		if ((number1 + number2 + number3) % 2 == 0)
			resultat = true;

		return resultat;
	}

	public static boolean checkIfAllElementsPair(int[] array) {
		boolean resultat = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				resultat = true;
			} else {
				resultat = false;
				break;
			}

		}

		return resultat;
	}

	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		ArrayList<Integer> listeResultat = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++)
			if (array[i] % 2 == 0)
				listeResultat.add(array[i]);

		return listeResultat;
	}

	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		ArrayList<Integer> liste1 = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				liste1.add(array[i]);
		}
		ArrayList<Integer> liste2 = new ArrayList<Integer>();
		for (int i = 0; i < liste1.size(); i++) {
			if (!liste2.contains(liste1.get(i)))
				liste2.add(liste1.get(i));
		}

		return liste2;
	}

	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		boolean resultat = false;

		if (Math.pow(number1, 2) + Math.pow(number2, 2) == Math.pow(number3, 2)
				|| Math.pow(number1, 2) + Math.pow(number3, 2) == Math.pow(number2, 2)
				|| Math.pow(number2, 2) + Math.pow(number3, 2) == Math.pow(number1, 2))
			resultat = true;

		return resultat;
	}

	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie,
		// check si tu peux payer
		if ((prix < 22) && (prix % 2 == 0)) {
			return true;
		}

		return false;
	}

	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		double article = prix - prix * pourcentDeRemise / 100;
		if (article > 100) {
			return false;
		} else
			return true;

	}

	public static boolean checkCase2(int number1, int number2) {
		// check si une de 2 chiffres, ou leur somme se divise par 7
		int somme = number1 + number2;
		if ((number1 % 7 == 0) || (number2 % 7 == 0) || (somme % 7 == 0)) {
			return true;
		} else
			return false;

	}

	public static boolean checkCase2a(int number1, int number2) {
		boolean resultat = false;

		if ((number1 == number2 + 1) || (number2 == number1 + 1))
			resultat = true;

		return resultat;

	}

	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		if ((number1 < number2) && (number2 < number3) || (number1 > number2) && (number2 > number3)) {
			return true;
		} else
			return false;

	}

	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();

		for (int i = 1; i < array.length - 1; i++)
			resultat.add(array[i]);

		return resultat;
	}

	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		int[] resultat = new int[array.length - 2];
		int limiteBoucle = array.length - 1;

		for (int i = 1; i < limiteBoucle; i++)
			resultat[i - 1] = array[i];

		return resultat;
	}

	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++)
			if (i % 2 == 0)
				resultat.add(array[i]);

		return resultat;
	}

	public static ArrayList<Integer> reverseOrder(int array[]) {

		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		int limiteBoucle = array.length - 1;

		for (int i = limiteBoucle; i >= 0; i--)
			liste1.add(array[i]);

		return liste1;
	}

	public static int[] reverseOrderInt(int array[]) {

		int limiteBoucle = array.length;
		int[] resultat = new int[limiteBoucle];

		for (int i = 0; i <= limiteBoucle - 1; i++)
			resultat[i] = array[limiteBoucle - i - 1];

		return resultat;
	}

	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element) {

		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		int middle = array.length / 2;

		for (int i = 0; i < middle; i++)
			liste1.add(array[i]);

		liste1.add(element);

		for (int j = middle; j < array.length; j++)
			liste1.add(array[j]);

		return liste1;
	}

	public static ArrayList<Integer> exportElementsPair(ArrayList<Integer> list) {

		ArrayList<Integer> resultat = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++)
			if (list.get(i) % 2 == 0)
				resultat.add(list.get(i));

		return resultat;
	}

	public static ArrayList<Integer> exportElementsWithIndexPair(ArrayList<Integer> list) {

		ArrayList<Integer> resultat = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++)
			if (i % 2 == 0)
				resultat.add(list.get(i));

		return resultat;
	}

	public static int Addition(HashMap<String, Integer> addition) {
		int somme = 0;
		for (int f : addition.values())
			somme += f;

		return somme;
	}

	public static boolean checkIfStringStartsWithA(String word) {
		boolean resultat = false;

		if (word.matches("^[aA].+"))
			resultat = true;

		return resultat;
	}

	public static boolean checkIfStringStartsWithVowel(String word) {
		boolean resultat = false;

		if (word.matches("^[aeiouyAEIOUY].+"))
			resultat = true;

		return resultat;
	}

	public static boolean checkIfStringEndsWithS(String word) {
		boolean resultat = false;

		if (word.matches(".+[sS]$"))
			resultat = true;

		return resultat;
	}

	public static String findShortestWord(String[] array) {
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

	public static String swapFirstandLastLetter(String array) {
		String resultat = array;

		int taille = resultat.length() - 1;
		char premier = resultat.charAt(0);
		char dernier = resultat.charAt(taille);

		resultat = resultat.replaceAll("(^.)", Character.toString(dernier));
		resultat = resultat.replaceAll("(.$)", Character.toString(premier));

		return resultat;
	}

	public static int[] swapFirstandLastElement(int[] array) {
		int[] resultat = new int[array.length];
		resultat[0] = array[array.length - 1];
		resultat[array.length - 1] = array[0];

		if (array.length == 1)
			resultat[0] = array[0];

		else

		{
			for (int i = 1; i < array.length - 1; i++)
				resultat[i] = array[i];
		}

		return resultat;
	}

}
