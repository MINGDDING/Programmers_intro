// 배열의 평균값
// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
        }
        return answer/numbers.length;
    }
}https://github.com/MINGDDING/Programmers_intro/blob/main/JAVA_PROJECT/ArrayAverage
