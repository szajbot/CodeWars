public class Adding_Big_Numbers {
    public static String add(String a, String b) {
        String reversedA = new StringBuffer(a.replaceFirst("^0+","")).reverse().toString();
        String reversedB = new StringBuffer(b.replaceFirst("^0+","")).reverse().toString();
        boolean addToNext = false;
        StringBuffer result = new StringBuffer();
        int i = 0;
        while (i < reversedA.length() || i < reversedB.length() || addToNext) {
            var aNumber = i < reversedA.length() ? reversedA.charAt(i) - 48 : 0;
            var bNumber = i < reversedB.length() ? reversedB.charAt(i) - 48 : 0;
            var partialValue = addToNext ? aNumber + bNumber + 1 : aNumber + bNumber;
            if (partialValue > 9) {
                addToNext = true;
                partialValue -= 10;
            } else {
                addToNext = false;
            }
            result.append(String.valueOf(partialValue), 0, 1);
            i++;
        }
        return result.reverse().toString();
    }
}