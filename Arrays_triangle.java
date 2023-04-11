//삼각형의 완성조건1
/*선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 
세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.*/

import java.util.Arrays; //arrays 함수 불러오기

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides); //순서대로 배열
        int max = sides[sides.length-1];
        int sum = 0;
        int answer = 0;
        
        for(int i=0;i<sides.length-1;i++){
            sum+= sides[i]; //작은 변 길이의 합 구하기
        }
        
        if(max<sum){
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}
