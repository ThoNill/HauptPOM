package info;

import java.util.logging.Logger;

public class HauptPOM {
    private static final Logger LOG = Logger.getAnonymousLogger();

    public HauptPOM() {
        super();
    }

    public static void main(String[] args) {
        new HauptPOM().printInfo();
    }

    protected void printInfo() {
        LOG.info("Das ist die HauptPOM");
    }

}
