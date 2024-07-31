package RomanToInteger;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int val = 0;
        String check;
        boolean switchOff = false;

        while (!s.isEmpty()) {
            switchOff = false;
            if (s.length() > 1) {
                switch (s.substring(0, 2)) {
                    case "IV":
                        s = s.substring(2);
                        val += 4;
                        switchOff = true;
                        break;
                    case "IX":
                        s = s.substring(2);
                        val += 9;
                        switchOff = true;
                        break;
                    case "XL":
                        s = s.substring(2);
                        val += 40;
                        switchOff = true;
                        break;
                    case "XC":
                        s = s.substring(2);
                        val += 90;
                        switchOff = true;
                        break;
                    case "CD":
                        s = s.substring(2);
                        val += 400;
                        switchOff = true;
                        break;
                    case "CM":
                        s = s.substring(2);
                        val += 900;
                        switchOff = true;
                        break;
                }
            }

            if (switchOff) {
                continue;
            }

            switch (s.charAt(0)) {
                case 'I':
                    val += 1;
                    break;
                case 'V':
                    val += 5;
                    break;
                case 'X':
                    val += 10;
                    break;
                case 'L':
                    val += 50;
                    break;
                case 'C':
                    val += 100;
                    break;
                case 'D':
                    val += 500;
                    break;
                case 'M':
                    val += 1000;
                    break;
           }
           s = s.substring(1);
        }

        return val;
    }
}