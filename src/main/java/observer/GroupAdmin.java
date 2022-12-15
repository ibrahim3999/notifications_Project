package observer;

import java.util.ArrayList;

public class GroupAdmin implements Sender {
    private  UndoableStringBuilder situations ;
    private ArrayList <ConcreteMember> Members;
    private ConcreteMember CM;
    public GroupAdmin()
    {
        this.situations =new UndoableStringBuilder();
        this.Members=new ArrayList<ConcreteMember>();
        this.CM=new ConcreteMember();
    }
    @Override
    public void register(Member obj) {
        Members.add((ConcreteMember)obj);
    }

    @Override
    public void unregister(Member obj) {
        Members.remove((ConcreteMember)obj);
    }

    @Override
    public void insert(int offset, String obj) {
       CM.update(situations.insert(offset,obj));

    }

    @Override
    public void append(String obj) {
        CM.update(situations.append(obj));
    }

    @Override
    public void delete(int start, int end) {
        CM.update(situations.delete(start,end));
    }

    @Override
    public void undo() {
        situations.undo();
        CM.update(situations.undo.peek());
    }

    public ArrayList<ConcreteMember> getMembers() {
        return Members;
    }

    public UndoableStringBuilder getSituations() {
        return situations;
    }

    @Override
    public String toString() {
        return "GroupAdmin{" +
                "situations=" + situations +
                ", Members=" + Members +
                '}';
    }
}
