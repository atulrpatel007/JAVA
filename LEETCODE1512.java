public class LEETCODE1512 {
    public static void main(String[] args) {
        int [] demo = {1,2,3,1,1,3};
        int k = 0;
        for(int i = 0 ; i < demo.length ; i++ ){
            for (int j = i+1 ; j < demo.length ; j++){
                if (demo[i] == demo[j]){
                    k++;
                }
            }
        }
        System.out.println(k);
    }

}