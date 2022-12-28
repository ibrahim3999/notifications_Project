import observer.ConcreteMember;
import observer.GroupAdmin;
import observer.UndoableStringBuilder;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.*;

public class Tests {
    public static final Logger logger = LoggerFactory.getLogger(Tests.class);
    // stub method to check external dependencies compatibility
    @Test
    public void test(){
        GroupAdmin GA=new GroupAdmin();
         ConcreteMember CM1=new ConcreteMember(GA);
        ConcreteMember CM2=new ConcreteMember(GA);
       // ConcreteMember CM3=new ConcreteMember();
        GA.register(CM1);
       // GA.register(CM2);
       // GA.register(CM3);
        /*
        LinkedList l=new LinkedList<>();
        l.add(CM1);
        ArrayList a=new ArrayList<>();
        a.add(CM1);
        Stack s=new Stack<>();
        a.add(CM1);
        a.add(CM2);
        HashMap h=new HashMap<>();
        h.put(0,CM1);
*/
        logger.info(()->JvmUtilities.objectTotalSize(GA));
        logger.info(()->JvmUtilities.objectTotalSize(CM1));
        /*
        logger.info(()->JvmUtilities.objectTotalSize(l));
        logger.info(()->JvmUtilities.objectTotalSize(a));
        logger.info(()->JvmUtilities.objectTotalSize(s));
        logger.info(()->JvmUtilities.objectTotalSize(h));
*/
        logger.info(() -> JvmUtilities.jvmInfo());
    }
}

