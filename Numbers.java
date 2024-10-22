import java.util.LinkedList;

public class Numbers {
//initializing data members and numbers class constructor
    int xs,lt,gt=0;

    Numbers(){}

    //setNumbers method that takes integers to add to a LinkedList for easier test reset
    public LinkedList<Integer> setNumbers(LinkedList<Integer> numbers, int a, int b, int c, int d, int e, int f, int g,int h, int i, int j, int k, int l){
        numbers.clear();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(e);
        numbers.add(f);
        numbers.add(g);
        numbers.add(h);
        numbers.add(i);
        numbers.add(j);
        numbers.add(k);
        numbers.add(l);
        return numbers;
    }

    //partition method that partitions the list by x and returns the edited list
    public LinkedList<Integer> partition(LinkedList<Integer> numbers, int x){
        xs=0;
        for(int i=0;i<numbers.size();i++) {
            if (numbers.get(i) == x) {
                xs = xs + 1;
                numbers.remove(i);
            }
        }
        for (int i=0;i< numbers.size();i++) {
            if (numbers.get(i) < x) {
                lt = numbers.get(i);
                numbers.remove(i);
                numbers.addFirst(lt);
            }
            if (numbers.get(i) > x) {
                gt = numbers.get(i);
                numbers.remove(i);
                numbers.addLast(gt);
            }
        }
        for(int i=0;i<numbers.size() ;i++){
            if(numbers.get(i)>x){
                for (int j=1;j<=xs;j++){
                    numbers.add(i,x);
                }
                break;
            }
        }
        return numbers;
    }
}
