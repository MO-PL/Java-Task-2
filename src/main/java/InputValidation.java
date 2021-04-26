public class InputValidation {
    public static void check(String[] input){
        // must be 2 args
        if(input.length != 2){
            throw new IllegalArgumentException("Exactly 2 parameters required!");
        }
        // first nas or aaa
        if(!(input[0].equals("nas")||input[0].equals("aaa"))){
            throw new IllegalArgumentException("First parameter must be: nas or aaa");
        }
        // second "name.xml"
        if(!input[1].endsWith(".xml")){
            throw new IllegalArgumentException("Second parameter must ends with .xml");
        }
    }
}
