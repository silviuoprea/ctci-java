class StringRotation {
    public static String rotateString(String input, int shiftPositions) {
        StringBuilder result = new StringBuilder(input);
        int size = result.length();
        for (int i = 0; i < shiftPositions; i++) {
            char current = result.charAt(size - 1);
            result.deleteCharAt(size - 1);
            result.insert(0, current);
        }
        return result.toString();
    }

    public static boolean isSubstring(String input, String subString) {
        return true;
    }

    public static boolean isRotatedString(String input, String toCompare) {
        int size = input.length();
        if (isSubstring(input, toCompare) == false)
            return false;
        for (int i = 0; i < size; i++) {
            String current = rotateString(input, i);
            if (toCompare.compareTo(current) == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "waterbottle", toCompare = "erbottlewat";
        System.out.println(isRotatedString(input, toCompare));
    }
}
