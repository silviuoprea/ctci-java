class Uniqueness {
    public static boolean isUnique(String string)
    {
        int[] frequencyArray = new int[26];
        int size = string.length();
        for(int i = 0; i < size; i++)
        {
            frequencyArray[string.charAt(i) - 97]++;
        }
        for(int i = 0; i < frequencyArray.length; i++)
            if(frequencyArray[i] > 1)
                return false;
        return true;
    }
  public static void main(String[] args)
  {
    System.out.println(isUnique("todaywasagoodday"));
    System.out.println(isUnique("abcdefghijklmno"));

    /*
     * TO-DO: Come back when you're doing bit manipulation and 
     * use a frequency binary variable each letter represents a bit
     */
  }
}
