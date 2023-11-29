import java.util.ArrayList;

public class main
{
    public static void main(String args[]){
        ArrayList<Integer> k = new ArrayList();
        ArrayList<Integer> n = new ArrayList();
        k.add(2);
        k.add(1);
        n.add(9);
        n.add(1);
        //Eratosthenes(5);
        //Goldbach(Eratosthenes(40), 40);
        System.out.println(bigInt(n, k));
    }
    
    //Sieve of Eratosthenes
    public static ArrayList<Integer> Eratosthenes(int n){
        int p = 3;
        ArrayList<Integer> k = new ArrayList();
        k.add(2);
        for (int i = p; i <= n; i++){
            int count = 0;
            for (int j = 2; j < i; j++){
                /*
                k.add(i);
                k.add(j);
                k.add(i%j);
                k.add(10001);
                */
               
                if (i%j == 0) count++;
            }
            if (count == 0){
                k.add(i);
                count = 0;
            }
        }
        return k;
    }
    
    public static void Goldbach (ArrayList<Integer> prime, int n){
        for (int i = 0; i < prime.size(); i++) {
            for (int j = i; j < prime.size(); j++) {
                if ((prime.get(i) + prime.get(j)) == n){
                    System.out.println("Set: " + prime.get(i) + " " + prime.get(j));
                }
            }
        }
    }
    
    public static ArrayList<Integer> bigInt (ArrayList<Integer> n, ArrayList<Integer> k){
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < n.size(); i++){
            if (n.get(i) + k.get(i) < 10){
                    list.add(n.get(i) + k.get(i));
            } else {
                String x = Integer.toString(n.get(i) + k.get(i));
                int first = Integer.parseInt(x.substring(x.length()-1));
                list.add(1);
                list.add(first);
            }
        }
        
        return list;
    }
}
