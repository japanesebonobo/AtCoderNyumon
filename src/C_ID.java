import java.util.*;

public class C_ID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Map<Integer, ArrayList<Obj>> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int pref = scanner.nextInt();
            int year = scanner.nextInt();

            map.get(pref-1).add(new Obj(year, pref, i));
        }
        scanner.close();
        
        ArrayList<Obj> ansList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<Obj> list = map.get(i);
            if(list.size() == 0) {
                continue;
            }
            list.sort(Comparator.comparing(x->x.year));
            int id = 1; 
            for(Obj o : list) {
                o.id = id;
                ansList.add(o);
                id++;
            }
        }

        ansList.sort(Comparator.comparing(x->x.no));
        
        for (Obj o : ansList) {
            String prefString = "000000" + o.pref;
            prefString = prefString.substring(prefString.length()-6);
            String idString = "000000" + o.id;
            idString = idString.substring(idString.length()-6);
            System.out.println(prefString+idString);
        }
    }

    public static class Obj {
        public int no, year, pref, id;

        public Obj(int year, int pref, int no) {
            this.year =  year;
            this.pref = pref;
            this.id = id;
            this.no = no;
        }
    }
}
