import observer.ConcreteMember;
import observer.GroupAdmin;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class Tests {
    public static final Logger logger = LoggerFactory.getLogger(Tests.class);
    // stub method to check external dependencies compatibility
    @Test
    public void test(){
        GroupAdmin GA=new GroupAdmin();
        ConcreteMember CM=new ConcreteMember();
        GA.register(CM);
        logger.info(()->JvmUtilities.objectTotalSize(GA));
        logger.info(()->JvmUtilities.objectTotalSize(GA,CM));
        logger.info(()->JvmUtilities.objectTotalSize(CM));

        //logger.info(() -> JvmUtilities.jvmInfo());
    }
}

