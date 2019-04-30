package string.problems;
public class Anagram {
    public static class Anagram {

        public void anagram(String a, String b){
            char [] arrayOfCharFromStringA = a.toCharArray();
            char[] arrayOfCharFromStringB = b.toCharArray();
            Arrays.sort(arrayOfCharFromStringA);
            Arrays.sort(arrayOfCharFromStringB);
            if (Arrays.equals(arrayOfCharFromStringA, arrayOfCharFromStringB)){
                System.out.println("Words are anagram");
            } else
                System.out.println("Words are not anagram");
        }

        public static void main(String[] args){
            Anagram anagram = new Anagram();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter First word: ");
            String firstWord = scanner.nextLine();
            System.out.println("Please enter second word: ");
            String secondWord = scanner.nextLine();
            anangram.anagram(firstWord, secondWord);


        }
    }
}