package observer;

import api.Member;

import java.util.ArrayList;

public class ConcreteMember   implements Member {

    private UndoableStringBuilder situations;
    private ArrayList<Member> Members;
    public ConcreteMember(ArrayList<Member> Members)
    {
        this.situations=new UndoableStringBuilder();
        this.Members=Members;
    }
    public ConcreteMember(ConcreteMember CM)
    {
        this.Members=CM.Members;
        this.situations=CM.situations;
    }
    @Override
    public void update(UndoableStringBuilder usb) {
        this.Members.forEach((M)->
                {
                    if(M instanceof ConcreteMember)
                    {
                        ConcreteMember cm= (ConcreteMember) M;
                        cm.situations.setUndo(usb.toString());
                    }
                }
        );
    }

    @Override
    public String toString() {
        return "ConcreteMember{" +
                "situations=" + situations +"}";

    }
}
