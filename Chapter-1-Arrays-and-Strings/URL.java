class URL {
  public static String URLify(String string)
  {
    char[] array = string.toCharArray();
    int secondPointer = array.length - 1, word = 0;
    for(int i = array.length - 1; i > -1; i--)
    {
        if(array[i] != ' ')
        {
            array[secondPointer] = array[i];
            secondPointer--;
            word = 1;
        }
        else
        {
            switch (word)
            {
                case 1:
                {
                    array[secondPointer] = '0';
                    secondPointer--;
                    word++;
                }
                case 2:
                {
                    array[secondPointer] = '2';
                    secondPointer--;
                    word++;
                }
                case 3:
                {
                    array[secondPointer] = '%';
                    secondPointer--;
                    word = 0;
                }
            }
        }
    }
    string = new String(array);
    return string;
  }
  public static void main(String[] args)
  {
    String input = "Mr John Smith    ", input2 = "John";
    System.out.println(input);
    System.out.println(URLify(input));
    System.out.println(input2);
    System.out.println(URLify(input2));
  }
}
