package observer;

import api.Member;
import api.Sender;

import java.util.ArrayList;

public class GroupAdmin  implements Sender {

    private  UndoableStringBuilder situations ;
    private ArrayList <Member> Members;
    private ConcreteMember CM;

    public GroupAdmin()
    {
        this.situations =new UndoableStringBuilder();
        this.Members=new ArrayList<Member>();
        this.CM=new ConcreteMember(Members);
    }

    @Override
    public void register(Member obj) {
        Members.add(obj);
    }

    @Override
    public void unregister(Member obj) {
        Members.remove(obj);
    }

    @Override
    public void insert(int offset, String obj) {
        this.CM.update(situations.insert(offset,obj));
    }

    @Override
    public void append(String obj) {
        this.CM.update(situations.append(obj));
    }

    @Override
    public void delete(int start, int end) {
        this.CM.update(situations.delete(start,end));
    }

    @Override
    public void undo() {
        this.situations.undo();
        CM.update(this.situations);
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
    /**
    public static void main(String[] args) {
        UndoableStringBuilder situations=new UndoableStringBuilder();
        situations.append("aa bb cc");
        System.out.println(situations);
        situations.append("dd");
        System.out.println(situations);
        situations.undo();
        System.out.println(situations);
    }
     */


}
