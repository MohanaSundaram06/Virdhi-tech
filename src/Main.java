import java.util.*;

public class Main {

    public static void countFrequency(String[] array){

        HashMap<String,Integer> freqMap = new HashMap<>();

        for(String str : array){
            freqMap.put(str, freqMap.getOrDefault(str,0) + 1);
        }

        for(String str : freqMap.keySet()){
            if(freqMap.get(str) % 2 != 0){
                System.out.println(str +" -> " + freqMap.get(str));
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] array = new String[n];

        for(int i = 0; i < n; i++){
           array[i] = sc.next();
        }
       countFrequency(array);
    }
}





