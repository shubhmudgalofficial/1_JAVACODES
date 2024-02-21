public class switchcase {
    public static void main(String[] args) {
        int number = 100;
        switch (number) {
            // matching case executes
            case 200:
                System.out.println("case 1");
            case 300:
                System.out.println("case 2");
            case 400:
                System.out.println("case 3");
            case 100:
                System.out.println("case 4");

        }
        int num1 = 200;
        switch (num1) {
            // no break then all case execute
            case 200:
                System.out.println("case 1");
            case 300:
                System.out.println("case 2");
            case 400:
                System.out.println("case 3");
            case 100:
                System.out.println("case 4");

        }
        int num2 = 200;
        switch (num2) {
            // break single case execute
            case 200:
                System.out.println("case 1");
                break;
            case 300:
                System.out.println("case 2");
                break;
            case 400:
                System.out.println("case 3");
                break;
            case 100:
                System.out.println("case 4");
                break;
        }
        int num3 = 600;
        switch (num3) {
            // break single case execute
            // no match default case
            case 200:
                System.out.println("case 1");
                break;
            case 300:
                System.out.println("case 2");
                break;
            case 400:
                System.out.println("case 3");

                break;
            case 100:
                System.out.println("case 4");
                break;
            default:
                System.out.println("default case");
        }

    }
}