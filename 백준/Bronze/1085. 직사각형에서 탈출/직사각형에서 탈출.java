  import java.util.*;


public class Main {

    public static void main(String[] args)  {


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int w = sc.nextInt();
        int h = sc.nextInt();

        int [] list = new int[]{Math.abs(w - x) , x , Math.abs(h - y), y};
        Arrays.sort(list);
        System.out.println(list[0]);
    }
}
        