import java.util.Scanner;

public class TestClass {

    public static void main(String[] args){

        int position;
        Scanner input = new Scanner(System.in);
        System.out.print("Give pattern: ");
        String pattern = input.nextLine();

        System.out.print("Give text: ");
        String text = input.nextLine();

        input.close();

        Horspool h = new Horspool();

        h.ShiftTable(pattern);
        position = h.HorspoolMatching(text,pattern);

        if(position == -1)
            System.out.println("Pattern not found");
        else
            System.out.println("Pattern found from position: \t"+position);
    }
}
