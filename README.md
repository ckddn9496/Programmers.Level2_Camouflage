# Programmers.Level2_Camouflage
Programmers 해시 Level2_Camouflage
의상에 대한 경우를 dfs를 이용하여 만들어 낸 후 count를 하였지만 다른사람들의 풀이를 보니 달랐다.
해당 종류의 의상을 입지 않았을 경우도 하나의 case로 count하여 아래 코드 방식으로 진행할 경우 훨씬 빠르고 코드가 간결해 진다.
```java
Iterator<Integer> it = map.values().iterator();
while(it.hasNext()) {
    answer *= it.next().intValue()+1;
}
return answer-1;
```

수학에 대한 배경지식이 부족해서 많이 돌아가서 푼 문제...
