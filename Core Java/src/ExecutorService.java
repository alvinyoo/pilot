import java.util.concurrent.Executors;

/* Define a inner class A has method “getMethod()” which return string “A.getMethod” and
another inner class B has method “getMethod()” which return string “B.getMethod”.
write another method “runSameTime()” which should let A and B getMethod to run at the same time,
but the “runSameTime()” method should return a string “B.getMethod A.getMethod” */
public class ExecutorService {
    static class A {
        String getMethod() {
            return "A.getMethod";
        }
    }

    static class B {
        String getMethod() {
            return "B.getMethod";
        }
    }

    public String runSameTime() {
        ExecutorService service = null;
        String s1, s2;
        try {
            service = Executors.newSingleThreadExecutor();
            service.execute(() -> {
                        s1 = new B().getMethod();
                    }
            );
            service.execute(() -> {
                        s2 = new A().getMethod();
                    }
            );
        } finally {
            service.shutdown();
        }
        return s1 + s2;
    }
}
