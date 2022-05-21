package string.problems;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int wrdCount = 0;

        st = st.toLowerCase();
        String words[] = st.split(" ");
        System.out.println("List of duplicate words: " + wrdCount);

        for (int i = 0; i < words.length; i++) {
            wrdCount = 1;

            for (int j = i + 1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    wrdCount++;

                    words[j] = "0";
                }
            }
        }

    }

}
