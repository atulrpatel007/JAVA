public class LEETCODE1832 {
    public static void main(String[] args) {
       String input =  "thequickbrownfoxjumpsoverthelazydog";
       if (input.length() < 26){
           System.out.println("False");
       }
       for(char i = 'a' ; i <= 'z' ; i++){
           if(input.indexOf(i)<0){
               System.out.println("False");
               break;
           }
       }
        System.out.println("True");
    }
}
