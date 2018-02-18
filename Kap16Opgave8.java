public class Kap16Opgave8 {
    public static void main(String[] args) {
        LinkedIntList A = new LinkedIntList();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);

        switchPairs(A);
    }


    // Denne metode gør brug af Set metoden jeg har lavet tidligere
    public static LinkedIntList switchPairs(LinkedIntList list)
    {


        for (int i = 0; i < list.size(); i++) {
            int This = list.get(i);
            int That = list.get(i+1);

            list.set(i+1,This);

            list.set(i,That);

            i++;
        }
        System.out.println(list);
        return list;
    }
}
