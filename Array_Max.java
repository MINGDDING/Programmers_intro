//최댓값 만들기
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int[] numbers) {
        int mx1 = numbers[0];
        int mx2 = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>=mx1){
                mx2=mx1;
                mx1=numbers[i];
            } else if(numbers[i]>mx2){
                mx2=numbers[i];
            }
        }
        if(mx1 == numbers[0]){
            mx2 = numbers[1];
            for(int i=2;i<numbers.length;i++){
            if(numbers[i]>=mx2){
                mx2=numbers[i];
                } 
            }
        }
        return mx1*mx2;
    }
}
