import java.lang.reflect.Field;

public class TopicFinal {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Demo demo = new Demo("test");

        System.out.println("demo before modified: " + demo.getDemo());

        Field demoField = demo.getClass().getDeclaredField("demoString");
        demoField.setAccessible(true);
        demoField.set(demo, "TEST");

        System.out.println("demo after modified: " + demo.getDemo());
    }
}

/*
define a final class and final method and final variable, modify the value of the variable in final method
*/
final class Demo {
    final String demoString;

    public Demo(String demoString) {
        this.demoString = demoString;
    }

    public String getDemo() {
        return this.demoString;
    }
}
