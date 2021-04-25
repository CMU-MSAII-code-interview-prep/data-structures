import java.util.Random;

public class HashMapSeperateChaining<Key, Val> {
    private int N;
    private int M;
    private SequentalSearchST<Key, Val>[] arr;

    public HashMapSeperateChaining(int M) {
        this.M = M;
        SequentalSearchST<Key, Val> []tmp = new SequentalSearchST[M];
        arr = tmp;
        for (int i = 0; i < M; i++)
            arr[i] = new SequentalSearchST<Key,Val>();
    }

    public boolean empty(){
        return N == 0;
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public Val get(Key key) {
        return arr[hash(key)].get(key);
    }
    
    public void put(Key key, Val val) {
        arr[hash(key)].put(key, val);
        N++;
    }
    
    public static void main(String[] args) {

        int N = 1000000;

        int[] nums = new int[N];

        // to create random numbers;
        Random rand = new Random();

        // create map
        HashMapSeperateChaining<Integer, Integer> map = new HashMapSeperateChaining<Integer, Integer>(N / 3);

        for (int i = 0; i < N; i++) {
            nums[i] = rand.nextInt(N - 1);
        }

        // arr nums contains how many duplicates??
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != i)
                count++;
        }

        System.out.println("Number of duplicates is: " +( count / 2));

    }
    

}
