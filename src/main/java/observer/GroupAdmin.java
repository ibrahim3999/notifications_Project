package observer;

import java.util.ArrayList;

public class GroupAdmin implements Sender {
    private  static UndoableStringBuilder situations =new UndoableStringBuilder();
    private ArrayList <Member>Members=new ArrayList<Member>();
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
        situations.insert(offset,obj);
    }

    @Override
    public void append(String obj) {
        situations.append(obj);
    }

    @Override
    public void delete(int start, int end) {
        situations.delete(start,end);
    }

    @Override
    public void undo() {
        situations.undo();
    }
}
