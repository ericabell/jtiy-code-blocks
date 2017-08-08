public class NewEpicClass {

//    You can also write instance initialization blocks (leave out the static keyword). Again there is no reason to do this because all instance initialization should be done in the constructors. You may see this in an Oracle Java certification test.
//
//    Write up multiple instance initialization blocks and write to the console when the block of code is entered. Also write to the console when the constructor is entered.
//
//    New up the class and see the order of initialization.
//
//    To nail down the point that it is not the norm to write instance initialization block(s) comment them out.


    // multiple instance initialization blocks

    {
        System.out.println("NewEpicClass instance init #1");
    }

    {
        System.out.println("NewEpicClass instance init #2");
    }

    {
        System.out.println("NewEpicClass instance init #3");
    }

    public NewEpicClass() {
        System.out.println("Constructor for NewEpicClass.");
    }
}
