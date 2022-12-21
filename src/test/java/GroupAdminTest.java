/*import observer.ConcreteMember;
import observer.GroupAdmin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupAdminTest {
    @Test
    public void unregister_registerTest()
    {
        GroupAdmin GA=new GroupAdmin();
        ConcreteMember CM1=new ConcreteMember(GA.getMembers());
        ConcreteMember CM2=new ConcreteMember(GA.getMembers());
        GA.register(CM1);
        Assertions.assertEquals(1,GA.getMembers().size());
        GA.register(CM2);
        Assertions.assertEquals(2,GA.getMembers().size());
        GA.unregister(CM1);
        GA.unregister(CM2);
        Assertions.assertEquals(0,GA.getMembers().size());
    }
    @Test
    public void insertTest(){
        GroupAdmin GA=new GroupAdmin();
        ConcreteMember CM1=new ConcreteMember(GA.getMembers());
        ConcreteMember CM2=new ConcreteMember(GA.getMembers());
        GA.register(CM1);
        GA.register(CM2);
        GA.append("aa bb cc");
        GA.insert(3,"Hi");
        GA.getMembers().forEach((M)->{
            if(M instanceof ConcreteMember)
            {
                ConcreteMember C=(ConcreteMember)M;
                Assertions.assertEquals("ConcreteMember{situations=aa Hibb cc}",C.toString());
            }
        });
    }
    @Test
    public void appendTest()
    {
        GroupAdmin GA=new GroupAdmin();
        ConcreteMember CM1=new ConcreteMember(GA.getMembers());
        ConcreteMember CM2=new ConcreteMember(GA.getMembers());
        GA.register(CM1);
        GA.register(CM2);
        GA.append("aa bb cc");
        GA.append("dd");
        GA.getMembers().forEach((M)->{
            if(M instanceof ConcreteMember)
            {
                ConcreteMember C=(ConcreteMember)M;
                Assertions.assertEquals("ConcreteMember{situations=aa bb ccdd}",C.toString());
            }
        });
    }

    @Test
    public void deleteTest()
    {
        GroupAdmin GA=new GroupAdmin();
        ConcreteMember CM1=new ConcreteMember(GA.getMembers());
        ConcreteMember CM2=new ConcreteMember(GA.getMembers());
        GA.register(CM1);
        GA.register(CM2);
        GA.append("aa bb cc");
        GA.delete(1,2);
        GA.getMembers().forEach((M)->{
            if(M instanceof ConcreteMember)
            {
                ConcreteMember C=(ConcreteMember)M;
                Assertions.assertEquals("ConcreteMember{situations=a bb cc}",C.toString());
            }
        });
    }

    @Test
    public void undoTest()
    {

        GroupAdmin GA=new GroupAdmin();
        ConcreteMember CM1=new ConcreteMember(GA.getMembers());
        ConcreteMember CM2=new ConcreteMember(GA.getMembers());
        GA.register(CM1);
        GA.register(CM2);
        GA.append("aa bb cc");
        GA.append("XXX");
        GA.undo();
        GA.getMembers().forEach((M)->{
            if(M instanceof ConcreteMember)
            {ConcreteMember C=(ConcreteMember)M;
               Assertions.assertEquals("ConcreteMember{situations=aa bb cc}",C.toString());
            }
        });
        GA.undo();
        // throw Exeption type-> EmptyStackExeption
        GA.getMembers().forEach((M)->{
            if(M instanceof ConcreteMember)
            {ConcreteMember C=(ConcreteMember)M;
                Assertions.assertEquals("ConcreteMember{situations=null}",C.toString());
            }
        });

    }

}
*/