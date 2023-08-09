import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 改行を読み飛ばす
        

        List<String> wordList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            wordList.add(sc.next());
        }

        int result = countValidWordPairs(wordList);
        System.out.println(result);
    }

    public static int countValidWordPairs(List<String> wordList) {
        Map<String, Integer> sortedWordCount = new HashMap<>();

        for (String word : wordList) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            sortedWordCount.put(sortedWord, sortedWordCount.getOrDefault(sortedWord, 0) + 1);
        }

        int totalCount = 0;
        for (int count : sortedWordCount.values()) {
            totalCount += combination(count, 2);
        }

        return totalCount;
    }

    public static int combination(int n, int k) {
        if (k > n - k) {
            k = n - k;
        }
        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
