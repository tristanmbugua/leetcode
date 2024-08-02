package numberOfSeniorCitizens;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        String[] nums = {"1313579440F2036","2921522980M5644"};
        System.out.println(countSeniors(nums));
    }
    public static int countSeniors(String[] details) {
        int count = 0;

        for (int i = 0; i < details.length; i++) {
            if (Integer.parseInt(details[i].substring(11, 13)) > 60) {
                count++;
            }
        }

        return count;
    }

}