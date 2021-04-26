public class displayResult {
    public static void show(){
        System.out.println("");
        for (int i = 0; i < StorageOfKeywords.listLength; i++) {
            System.out.printf(StorageOfKeywords.polishKeywords[i]);
            System.out.printf(" : %s%n", Main.result[i]);
        }
    }
}
