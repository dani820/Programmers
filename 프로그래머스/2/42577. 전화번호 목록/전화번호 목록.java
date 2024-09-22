import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String> numberSet = new HashSet<>();
        int len = phone_book.length;
        for (int i = 0; i < len; i++) {
            numberSet.add(phone_book[i]);
        }
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (numberSet.contains(phone_book[i].substring(0,j))) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}