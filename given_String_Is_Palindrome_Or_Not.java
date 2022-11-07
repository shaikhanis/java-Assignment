package String;

public class given_String_Is_Palindrome_Or_Not{
    public static void main(String[] args) {
        /*
        how to check given String Are palindrome Or not.
         */
        String s = "madam";
        String palindrome = "";
   //     StringBuilder palindrome = new StringBuilder();
        int  a = s.length()-1;
        for(int i = a; i>=0; i--){

            palindrome = palindrome + s.charAt(i);

 //           palindrome.append(s.charAt(i));
        }
        if(s.equals(palindrome)){
            System.out.println(" The Given String Is Palindrome :"+"\n"+palindrome);
        }else {
            System.out.println(" The Given String Is NOT A Palindrome ");
        }
    }
}
