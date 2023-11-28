package 비선형구조;

import java.util.*;

public class HashMap테스트2 {

	public static void main(String[] args) {
		String answer = "";
		String participant[] = {"mislav", "stanko", "mislav", "ana"};
		String completion[] = {"stanko", "ana", "mislav"};
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i < participant.length;i++){
            map.put(participant[i],map.getOrDefault(participant[i],0) + 1);
        }
        for(int i = 0;i < completion.length;i++){
            map.put(completion[i],map.get(completion[i]) - 1);
        }
        for(int i = 0;i < participant.length;i++){
            if(map.get(participant[i]) == 1){
                answer = participant[i];
                break;
            }
        }
        System.out.println(answer);
	}

}