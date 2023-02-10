class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
                
        for (int i = 0; i < quiz.length; i++) {
            String expression = quiz[i];
            String[] items = expression.split(" ");
            
            int firstNum = Integer.parseInt(items[0]);
            String firstSign = items[1];
            int secondNum = Integer.parseInt(items[2]);
            int resultNum = Integer.parseInt(items[4]);
            
            if ("+".equals(firstSign) ) {
                if (resultNum == (firstNum + secondNum)) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (resultNum == (firstNum - secondNum)) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}