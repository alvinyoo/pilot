/*Create a singleton class called “AppleDesignerFactory” */

import java.io.Serial;
import java.io.Serializable;

public class AppleDesignerFactory implements Serializable, Cloneable {
    private static AppleDesignerFactory instance = new AppleDesignerFactory();
    private AppleDesignerFactory(){};

    public static synchronized AppleDesignerFactory getInstance() {
        if (instance == null) {
            instance = new AppleDesignerFactory();
        }
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Serial
    protected Object readResolve() {
        return instance;
    }
}


/* Create a factory pattern called “CurrencyExchange” which takes in the country name and return the currency object
for that country. */
public interface currency {
    String money();
}

public class Dallor implements currency {
    @Override
    public String money() {
        return "Dollar";
    }
}

public class Euro implements currency {
    @Override
    public String money() {
        return "Euro";
    }
}

public class Yuan implements currency {
    @Override
    public String money() {
        return "Yuan";
    }
}

public class CurrencyExchange {
    public currency  exchange (currency currency1) {
        if (currency1.equals("Dollar")) {
            return new Dallor();
        }
        else if (currency1.equals("Euro")) {
            return new Euro();
        }
        else if (currency1.equals("Yuan")) {
            return new Yuan();
        }
        return null;
    }
}


/* Implement the (in-class) PARKING LOT OOP design system -> your implementation should include main method and
is runnable. */

