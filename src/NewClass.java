public class NewClass {

    // ADVENTURE:
    // you can have multiple static init blocks...

    static {
        System.out.println("static init #1 running");

        int staticVarOne = 42;
        String staticVarTwo = "Hello World!";
    }

    static {
        System.out.println("static init #2 running");

        int staticVarThree = 44;
        String staticVarFour = "Hello again!";
    }

    public NewClass() {
        System.out.println("NewClass constructor running");
    }
}
