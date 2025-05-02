public class Adding_Big_Numbers {
    public static String add(String a, String b) {
        String result = "";
        boolean extendedSize = false;
        for (int i = 1; (a.length() + 15) >= (i * 15) || (b.length() + 15) >= (i * 15); i++) {
            var bigNumber = getValue(a, i) + getValue(b, i);
            if (extendedSize) {
                bigNumber += 1;
            }
            extendedSize = String.valueOf(bigNumber).length() > 15;
            if (extendedSize) {
                result = String.valueOf(bigNumber).substring(1, 16) + result;
            } else {
                result = bigNumber + result;
            }
        }
        return result;
    }

    private static Long getValue(String s, int i) {
        return Long.valueOf(
                Math.max(s.length() - ((i - 1) * 15), 0) != 0 ?
                s.substring(
                Math.max(s.length() - (i * 15), 0),
                Math.max(s.length() - ((i - 1) * 15), 0)) : "0"

        );
    }
}

//49066015790497398557349227495330 + 397366
//49 066015790497398 557349227892696
//49  66015790497398 557349227892696

//wynik 9100232822049 1911630239667963
// moje 910023282204901911630239667963


//expected: <91002328220491911630239667963> but was: <910023282204901911630239667963>
//my2 9100232822049 1911630239667963
//exp 9100232822049 1911630239667963
//was 910023282204901911630239667963

//        63829983432 984289347293874
//     90938498237058 927340892374089