public class stringx {
    public static void split() {
        String str = "Rajesh Reddy,Rajasri,Bhavani,Venkat";
        String[] arr = str.split(", ");
        for (String s : arr) { // for-each loop
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        String str = "   rajESH ReddY  "; // uppercase
        String str2 = "RajeSH Reddy"; // lowercase

        System.out.println(str.trim());
        System.out.println(str2.charAt(str2.length() - 1));

        char[] ch = str2.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }

        
    }
}