public class HW1 {
    public static void main(String[] args) {
        char[] word1 = {'A', 'n', 'T', 's'};
        char[] word2 = {'C', 'a', 's', 'u', 'A', 'l'};

        int[] arr1 = {1, 2, 3, 0};
        int[] arr2 = {5, 4, 9, 8, 7, 6};

        char[] wordList = new char[10];

        for (int i = 0; i < word1.length; i++)
            wordList[arr1[i]] = word1[i];
        for (int i = 0; i < word2.length; i++)
            wordList[arr2[i]] = word2[i];

        for (char c : wordList)
            System.out.print(c);
    }
}