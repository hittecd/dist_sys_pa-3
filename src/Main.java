/**
 * Created by hitte on 4/16/17.
 */
public class Main {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("ERROR - invalid command");
            System.exit(1);
        }

        try {
            int i = Integer.valueOf(args[0]);

            if(i < 0)
                throw new NumberFormatException();

            while(i > 0) {
                System.out.println("Hello World!");
                i -= 1;
            }


        } catch (NumberFormatException e) {
            System.out.println("ERROR - invalid command");
        }
    }
}
