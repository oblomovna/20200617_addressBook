import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(5);
        list2.add(2);
        list2.add(3);
        list2.add(8);


        List<String> names = Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia");
        System.out.println("getListWithoutNames");
        System.out.println(getListWithoutNames(names));
        System.out.println("comparesElements3");
        System.out.println(comparesElements3(list1, list2));
        List<Integer> listNum1 = new ArrayList();
        listNum1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("reverseList5");
        System.out.println(reverseList5(listNum1));
        List<Integer> listNum2 = new ArrayList();
        listNum2.addAll(Arrays.asList(6, 7, 8));
        System.out.println("twoListsInAOne6");
        System.out.println(twoListsInAOne6(listNum1, listNum2));
        System.out.println("getListWithNumbersLowerThenNum7");
        System.out.println(getListWithNumbersLowerThenNum7(listNum1, 3));
    }

   public static List<String> getListWithoutNames(List<String>list) {
       List<String> names = new ArrayList();
       for (int i = 0; i < list.size(); i++) {
           if (list.get(i).length() != 4) {
              names.add(list.get(i));
           }
       }
       return names;
   }

    public static List<String> comparesElements3(List<Integer> list1, List<Integer> list2) {
        List<String> comparisonResult = new ArrayList();
        Iterator<Integer> iterator1 = list1.iterator();
        Iterator iterator2 = list2.iterator();

        while(iterator1.hasNext()) {
            if (((Integer)iterator1.next()).equals(iterator2.next())) {
                comparisonResult.add("yes");
            } else {
                comparisonResult.add("no");
            }
        }

        return comparisonResult;
    }
   /* public static boolean isListCyclicFormOfAnotherList(List<Integer> list1, List<Integer> list2){

    }*/

    public static List<Integer> reverseList5(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    public static List<Integer> twoListsInAOne6(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public static List<Integer> getListWithNumbersLowerThenNum7(List<Integer> list, int num) {
        List<Integer> numbersLowerThenNum = new ArrayList();
        for(int i = 0; i < list.size(); ++i) {
            if ((Integer)list.get(i) < num) {
                numbersLowerThenNum.add(list.get(i));
                Collections.reverse(numbersLowerThenNum);
            }
        }
        return numbersLowerThenNum;
    }
}

