import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        
        
        //まずは全通りの組み合わせ実装
        checkPatter(strs);
        
        
        //並び替えて判定
    }
    
    static int checkPatter(String[] strs){
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if(strs[i] != strs[j]){
                    String temp = StringSortAsc(strs[i].concat(strs[j]));
                    for(int k = 0; k < strs.length; k++){
                        if(i != k || j != k || temp.equals(StringSortAsc(strs[k]))){
                            count++;
                            System.out.println(count);
                        }
                    }
                }
            }
        }
    }
    
    private static String StringSortAsc (String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}