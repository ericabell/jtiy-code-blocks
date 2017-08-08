public class Main {

    public static void main(String[] args) {
	// write your code here

        { // put 1 & 2 in a code block to get rid of compile error
            int count = 0;
            System.out.println(count);
        }

        // attempt to declare the same variable
        // gives a compile error
        // after wrapping above in code block, compile error
        // vanishes
        int count;

        NewClass newClass = new NewClass();

        NewEpicClass newEpicClass = new NewEpicClass();

    }
}
