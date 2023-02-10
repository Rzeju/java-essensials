package pl.statics;

public class Main {

    public static void main(String[] args) {

        StaticsExample staticsExample = new StaticsExample();
        System.out.println(staticsExample.myPublicField);
        System.out.println(StaticsExample.MY_FINAL_STRING);

        StaticsExample staticsExample1 = new StaticsExample();
        System.out.println(staticsExample1.MY_FINAL_STRING);
        System.out.println(staticsExample1.myPublicField);
        staticsExample1.setMyPublicField("NewPublicValue");
        staticsExample1.myPublicField = "NewPublicValue-2";

        StaticsExample.myStaticMethod();
    }
}
