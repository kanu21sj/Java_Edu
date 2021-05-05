package 스터디02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 두개뽑아서더하기 {

    public int[] solution(int[] numbers) {
    	
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0 ; i<numbers.length ; i++){
            for(int j = i+1 ; j<numbers.length ; j++){
            	
            	//중복제거 
                if(!list.contains(numbers[i]+numbers[j])) list.add(numbers[i]+numbers[j]); 
            }
        }
        
        //오름차순으로 정렬
        Collections.sort(list); //.reverse: 내림차순
        
        int count = 0;
        answer = new int[list.size()];
        
        for (int arr : list) {
			answer[count++] = arr;
		}
        return answer;
    }
}
