package observer;

import api.Member;
import api.Sender;

import java.util.ArrayList;

public class GroupAdmin  implements Sender {

    private    UndoableStringBuilder situations ;
    private ArrayList <Member> Members;

    public GroupAdmin()
    {
        this.situations =new UndoableStringBuilder();
        this.Members=new ArrayList<Member>();
       // this.CM=new ConcreteMember(Members);
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
       this.situations.insert(offset,obj);
       update();
    }

    @Override
    public void append(String obj) {
        this.situations.append(obj);
        update();
    }

    @Override
    public void delete(int start, int end) {
        this.situations.delete(start,end);
        update();
    }

    @Override
    public void undo() {
        this.situations.undo();
        update();
    }
    public void update()
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
      GroupAdmin GA=new GroupAdmin();
      ConcreteMember CM1=new ConcreteMember();
      ConcreteMember CM2=new ConcreteMember();
      GA.register(CM1);
      GA.register(CM2);
      GA.append("aaa");
      System.out.println(CM2.getSituations());
    }

}
