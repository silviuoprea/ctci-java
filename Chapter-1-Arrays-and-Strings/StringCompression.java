class StringCompression {
  public static String generateCompressedString(String input)
  {
    StringBuilder sb = new StringBuilder();
    int size = input.length(), current = 1;
    if(size == 1)
        return input + '1';
    for(int i = 0; i < size - 1; i++)
    {
        if(input.charAt(i) != input.charAt(i + 1))
        {
            if(current == 1)
                {
                    sb.append(input.charAt(i));
                    sb.append('1');
                }
                else
                {
                    if(current > 1)
                    {
                        sb.append(input.charAt(i));
                        sb.append(current);
                        current = 1;
                    }
                    else 
                    {
                        sb.append(input.charAt(i));
                    }
                }
        }
        else
        {
            current++;
        }
    }
    if(input.charAt(size - 1) != sb.charAt(sb.length() - 2))
    {
        sb.append(input.charAt(size - 1));
        sb.append(current);
    }
    if(size == sb.length())
        return input;
    return sb.toString();
  }
  public static void main(String[] args)
  {
    String input = "aabcccccaaa";
    System.out.println(input);
    System.out.println(generateCompressedString(input));
  }
}
