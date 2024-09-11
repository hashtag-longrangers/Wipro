public class FindStringCode {
    public static int findCode(String input1) {
        String[] str = input1.split(" ");
        

        ArrayList<String> arr = new ArrayList<>();

        for ( int i = 0; i < str.length; i++ ) {
            int sum = sum(str[i]);
            arr.add(String.valueOf(sum));
        }

        String ans = new String();
        for ( int i = 0; i < arr.size(); i++ ) {
            ans += arr.get(i);
        }
        return Integer.valueOf(ans);
    }
    private static int sum(String str) {
        String upper = str.toUpperCase();
        int start = 0;
        int end = upper.length() - 1;
        int sum = 0;

        while ( start <= end ) {
            if ( start == end ) {
                sum += upper.charAt(start) - 'A' + 1;
                break;
            }
            char startStr = upper.charAt(start);
            char endStr = upper.charAt(end);
            int digitSum = Math.abs((startStr - 'A' + 1) - (endStr - 'A' + 1));
            sum += digitSum;
            start++;
            end--;
        }
        return sum;
    }
    public static void main(String[] a) {
        String input1 = "WORLD WIDE WEB";
        System.out.println(findCode(input1));
    }
}
