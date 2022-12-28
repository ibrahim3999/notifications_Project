package observer;
import api.Member;
import api.Sender;
/**
 * @author  ibrahim ,Tair
        * @version 12.2022
 * A class that implements the Sender interface
 * is an allowance for managing undoStringBuilder
 * that operates on design patterns observer and manages updates
 *
 * */
import java.util.ArrayList;
import java.util.EmptyStackException;

public class GroupAdmin  implements Sender {

    private    UndoableStringBuilder situations ;
    private ArrayList <Member> Members;

    public GroupAdmin()
    {
        this.situations =new UndoableStringBuilder();
        this.Members=new ArrayList<Member>();
    }

    /**
     * register member
     * */
    @Override
    public void register(Member obj) {
        Members.add(obj);
    }
    /**
     * unregister member
     * */
    @Override
    public void unregister(Member obj) {
        Members.remove(obj);
    }

    @Override
    /**
     * @param offset number index
     * @param obj
     * insert obj into String
     * */
    public void insert(int offset, String obj) {
       this.situations.insert(offset,obj);
       update();
    }

    /**
     * @param obj
     * append obj String
     * */
    @Override
    public void append(String obj) {
        this.situations.append(obj);
        update();
    }

    /**
     * @param start
     * @param end
     * delete [start,end]
     * */
    @Override
    public void delete(int start, int end) {
        this.situations.delete(start,end);
        update();
    }

    /**
     * undo Last update
     * */
    @Override
    public void undo()throws EmptyStackException {
        this.situations.undo();
        update();
    }
    /**
     * update every change on undoableStringBuilder
     * */
    public void update()throws EmptyStackException
    {
        this.Members.forEach((M)->
                {
                    M.update(this.situations);
                }
        );

    }
    public ArrayList<Member> getMembers() {
        return Members;
    }

    public UndoableStringBuilder getSituations() {
        return situations;
    }

    @Override
    public String toString() {
        return "GroupAdmin{" +
                "situations=" + situations +
                '}';
    }

    public static void main(String[] args) {
        /**
      GroupAdmin GA=new GroupAdmin();
      ConcreteMember CM1=new ConcreteMember(GA);
      ConcreteMember CM2=new ConcreteMember(GA);
      GA.register(CM1);
      GA.register(CM2);
      GA.append("aaa");
      GA.append("bb");
      System.out.println(CM2.getSituations());
         **/
    }

}
