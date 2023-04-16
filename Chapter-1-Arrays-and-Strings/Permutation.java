class Permutation {
    public static boolean isPermutation(String left, String right)
    {
        int[] frequencyLeft = new int[26], frequencyRight = new int[26];
        int sizeLeft = left.length(), sizeRight = right.length();
        if(sizeLeft != sizeRight)
            return false;
        for(int i = 0; i < sizeLeft; i++)
        {
            frequencyLeft[left.charAt(i) - 97]++;
            frequencyRight[right.charAt(i) - 97]++;
        }
        for(int i = 0; i < frequencyLeft.length; i++)
        {
            if(frequencyLeft[i] != frequencyRight[i])
                return false;
        }
        return true;
    }
  public static void main(String[] args)
  {
    System.out.println(isPermutation("tell", "letl"));
    System.out.println(isPermutation("nicehat", "bobtehacen"));
  }
}
