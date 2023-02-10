package pl.statics;

public class StaticsExample {

    public static final String MY_FINAL_STRING = "SOME_FINAL_STATIC_VALUE";
    public String myPublicField = "myPublicFiled";
    private String myPrivateFiled = "myPrivateFiled";

    public StaticsExample() {

    }

    public void setMyPublicField(String myPublicField) {
        this.myPublicField = myPublicField;
    }

    public void setMyPrivateFiled(String myPrivateFiled) {
        this.myPrivateFiled = myPrivateFiled;
    }

//    public void setMyFinalString(String myFinalString) {
//        this.MY_FINAL_STRING = myFinalString;
//    }

    public static void myStaticMethod() {
        System.out.println(MY_FINAL_STRING);
    }
}
