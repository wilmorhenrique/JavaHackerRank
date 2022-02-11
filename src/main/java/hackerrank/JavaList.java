package hackerrank;

import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> s = new ArrayList<>();

        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
        }
        int q=sc.nextInt();

        List<String> command = new ArrayList<>();
        List<List<Integer>> coordinates = new ArrayList<>();

        for(int i=0;i<q;i++){
            List<Integer> item = new ArrayList<>();
            command.add(sc.next());
            item.add(Integer.valueOf(sc.nextInt()));
            if (command.get(i).equals("Insert")){
                item.add(Integer.valueOf(sc.nextInt()));
            }
            coordinates.add(item);
        }

        sc.close();


        for (int i = 0; i < command.size(); i++) {
            if (command.get(i).equals("Insert")) {
                Integer indexToAdd = coordinates.get(i).get(0);
                Integer valueToAdd = coordinates.get(i).get(1);

                if (indexToAdd >= s.size() ) {
                    s.add(valueToAdd);
                } else {
                    List<Integer> newList = new ArrayList<>();
                    for (int j = 0; j < s.size(); j++) {
                        if (j == indexToAdd) {
                            newList.add(valueToAdd);
                        }
                        newList.add(s.get(j));
                    }
                    s = newList;
                }
            } else {
                Integer valueToRemove = coordinates.get(i).get(0);
                s.remove(valueToRemove.intValue());
            }
        }
        s.stream().forEach(it -> System.out.print(it+" "));
    }
}
