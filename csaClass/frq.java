public class frq {
    public static String scrambleWord(String word){
        String finaly = "";

        for (int i = 1; i < word.length(); i++){
            if (word.charAt(i-1) == 'A'){
                if(word.charAt(i) != 'A'){
                    finaly += word.charAt(i);
                    finaly += word.charAt(i-1);
                    i++;
                }
                else{
                	finaly += word.charAt(i-1);
                    }
                
            }
            else{
                    finaly += word.charAt(i-1);
                }
        }
        finaly += word.charAt(word.length()-1);
        return finaly;
    }
    public static void main(String[] args) {
        System.out.println(scrambleWord("AARDVARK"));
    }
}
