class OneAway {
  public static boolean isOneAway(String base, String toCheck)
  {
    StringBuilder sb = new StringBuilder(toCheck);
    int baseSize = base.length(), toCheckSize = toCheck.length();
    if(Math.abs(baseSize - toCheckSize) > 1)
        return false;
    if(baseSize > toCheckSize)
    {
        for(int i = 0; i < baseSize; i++)
        {
            if(i == baseSize - 1)
            {
                sb.insert(i, base.charAt(i));
                if(base.compareTo(sb.toString()) == 0)
                    return true;
                    else return false;
            }
            if(base.charAt(i) != sb.charAt(i))
            {
                sb.insert(i, base.charAt(i));
                if(base.compareTo(sb.toString()) == 0)
                    return true;
                    else return false;
            }
        }
    }
    else if(baseSize < toCheckSize)
    {
        for(int i = 0; i < toCheckSize; i++)
        {
            if(i == toCheckSize - 1)
            {
                sb.deleteCharAt(i);
                if(base.compareTo(sb.toString()) == 0)
                    return true;
                    else return false;
            }
            if(base.charAt(i) != sb.charAt(i))
            {
                sb.deleteCharAt(i);
                if(base.compareTo(sb.toString()) == 0)
                    return true;
                    else return false;
            }
        }
    }
    else
    {
        for(int i = 0; i < baseSize; i++)
        {
            if(base.charAt(i) != sb.charAt(i))
            {
                sb.setCharAt(i, base.charAt(i));
                if(base.compareTo(sb.toString()) == 0)
                    return true;
                    else return false;
            }
        }
    }
    return true;
  }
  public static void main (String[] args)
  {
    String base = "pale", toCheck = "ple";
    String base2 = "pales", toCheck2 = "pale";
    String base3 = "pale", toCheck3 = "bale";
    String base4 = "pale", toCheck4 = "bake";
    System.out.println(isOneAway(base, toCheck));
    System.out.println(isOneAway(base2, toCheck2));
    System.out.println(isOneAway(base3, toCheck3));
    System.out.println(isOneAway(base4, toCheck4));
  }
}
