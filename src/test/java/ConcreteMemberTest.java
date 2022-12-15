import observer.ConcreteMember;
import observer.GroupAdmin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConcreteMemberTest {

    @Test
    public void updateTest()
    {
        /**
         *expected answer *
         */
        String expect1="ConcreteMember{situations=aa bb cc}";
        GroupAdmin GA=new GroupAdmin();
        ConcreteMember CM1=new ConcreteMember(GA.getSituations(),GA.getMembers());
        ConcreteMember CM2=new ConcreteMember(GA.getSituations(),GA.getMembers());
        GA.register(CM1);
        GA.register(CM2);
        GA.append("aa bb cc");
        GA.getMembers().forEach((M)->{
            if(M instanceof ConcreteMember)
            {
                ConcreteMember C=(ConcreteMember)M;
                Assertions.assertEquals(expect1,C.toString());
            }
        });

        String expect2="ConcreteMember{situations=aa HIbb cc}";
        GA.insert(3,"HI");
        GA.unregister(GA.getMembers().get(1));
        GA.getMembers().forEach((M)->{
            if(M instanceof ConcreteMember)
            {
                ConcreteMember C=(ConcreteMember)M;
                Assertions.assertEquals(expect2,C.toString());

            }
        });


    }
}
