import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int[] subArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            
            for (int j = 1; j < subArray.length; j++) {
                int key = subArray[j];
                int k = j - 1;

                while (k >= 0 && subArray[k] > key) {
                    subArray[k + 1] = subArray[k];
                    k--;
                }

                subArray[k + 1] = key;
            }
            
            list.add(subArray[command[2] - 1]);
        }
        
        answer = new int[list.size()];
        for (int a = 0; a < list.size(); a++) {
            answer[a] = list.get(a);
        }
        
        return answer;
    }
}