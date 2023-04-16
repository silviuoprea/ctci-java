class PalindromePermutation {
    public static boolean isPalindromePermutation(String string)
    {
        int size = string.length(), odds = 0;
        string = string.toLowerCase();
        int[] frequencyArray = new int[26];
        for(int i = 0; i < size; i++)
        {
            char current = string.charAt(i);
            if(current > 96 && current < 123)
                frequencyArray[current - 97]++;
        }
        for(int i = 0; i < 26; i++)
        {
            if(frequencyArray[i] % 2 == 1)
                odds++;
            if(odds > 1)
                return false;
        }
        return true;
    }
  public static void main(String[] args)
  {
    String input = "Tact Coa", input2 = "Change";
    System.out.println(input);
    System.out.println(isPalindromePermutation(input));
    System.out.println(input2);
    System.out.println(isPalindromePermutation(input2));
  }
}
