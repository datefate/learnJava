package algs.priorityQueue;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * TODO 未完成和algs4 一致，不理解index 的作用
 * 索引优先队列
 * 树节点元素的上浮、下沉：swim、sink
 *
 * swim:每一次插入元素就开始进行元素上浮操作，保证创建一颗有序的树
 *
 * @author datefate
 * @site create 2020-11-17-下午12:08
 */
public class IndexMinPQ<T extends Comparable<T>> implements
Iterable<Integer>
{

    private  int maxN;
    private int num;//元素总数
    private int[] binaryHeaps;
    private int[] index;
    private  T[] keys;//T[i] = priority -1;

    //初始化创建数组
    IndexMinPQ(int maxN){
        if(maxN < 0 ) throw new IllegalArgumentException();
        this.maxN = maxN;
        num = 0;
        keys = (T[]) new Comparable[maxN + 1];
        binaryHeaps = new int[maxN+1];
        index = new int[maxN+ 1];
        for (int i = 0;i<=maxN ;i++ ) {
            index[i] = -1;
        }
    }

    public boolean isEmpty(){
        return num == 0;
    }

    public boolean contains(int i) {
        validateIndex(i);
        return index[i] != -1;
    }
    //查找索引是否合法
    public void validateIndex(int i){
        if (i<0 ) {
            throw new IllegalArgumentException("index is negative:" + i);

        }
        if(i>= maxN)throw  new  IllegalArgumentException("index >= capacity:"+i);

    }

    // 插入元素，和i 相关联
    public  void  insert(int i ,T key){
        validateIndex(i);
        num++;
        binaryHeaps[num] = i;
        index[i] = num ;
        keys[i] = key;
        swim(num);

    }

    private void swim(int num) {
        // 父节点大于子节点，交换
        while (num>1 && greater(num/2,num)){
            exch(num/2,num);
            num = num /2 ;

        }
    }

    private boolean greater(int i, int j) {
        return keys[binaryHeaps[i]].compareTo(keys[binaryHeaps[j]])> 0;

    }


    private void exch(int i ,int j){
        int swap = binaryHeaps[i];
        binaryHeaps[i] = binaryHeaps[j];
        binaryHeaps[j] = swap;
        index[binaryHeaps[i]] = i;
        index[binaryHeaps[j]]  = j;


    }

    public int delMin() throws NoSuchFieldException {
        if(num == 0 ) throw new NoSuchFieldException("Priority queeue is underflow");
        int min = binaryHeaps[1];
        exch(1,num--);
        sink(1);
        index[min] = -1;
        keys[min] = null;
        binaryHeaps[num+1] = -1;
        return min;

    }

    private void sink(int k) {
        while (2*k <= num){
            int j  = 2*k;
            if(j < num && greater(j,j+1)) j++;
            if (!greater(k,j)) {
                break;
            }
            exch(k,j);
            k = j ;
        }
    }


    public Iterator<Integer> iterator() {
        return null;
    }

    public void forEach(Consumer<? super Integer> action) {

    }

    public Spliterator<Integer> spliterator() {
        return null;
    }

    public static void main(String[] args) throws NoSuchFieldException {
        String[] strings = { "it", "was", "the", "best", "of", "times", "it", "was", "the", "worst" };
        IndexMinPQ<String> pq = new IndexMinPQ<>(strings.length);
        for(int i = 0; i<strings.length;i++){
            pq.insert(i,strings[i]);

        }

        while (!pq.isEmpty()){
            int i = pq.delMin();
            System.out.println(i + ":"+ strings[i]);
        }


    }
}
