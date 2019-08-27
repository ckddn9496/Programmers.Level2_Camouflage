import java.util.ArrayList;
import java.util.HashMap;

// Camouflage
public class Main {

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		
		System.out.println(new Solution().solution(clothes));
	}

}

class Solution {
	int answer;
    HashMap<String, Integer> map;
    ArrayList<String> list;
    
	public int solution(String[][] clothes) {
		answer = 0;
		map = new HashMap<String, Integer>();
        for (int i = 0; i < clothes.length; i++) {
        	String type = clothes[i][1];
        	if (map.containsKey(type)) {
        		int count = map.get(type);
        		map.put(type, count+1);
        	} else {
        		map.put(type, 1);
        	}
        }
        list = new ArrayList<>(map.keySet());
        // dfs로 모든 옷의 조합 경우를 구한다
        dfs(0,1);
        // 마지막 answer-1 (적어도 하나의 의상은 입기 때문)
        return answer-1;
    }
    public void dfs(int n, int count) {
    	if (n == map.size()) {
    		answer += count;
    		return;
    	}
    	
    	Integer value = map.get(list.get(n));
    	// 포함
    	dfs(n+1, count*value);
    	// 미포함
    	dfs(n+1, count);
    }
}

