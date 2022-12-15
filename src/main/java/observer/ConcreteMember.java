package observer;

import java.util.ArrayList;

public class ConcreteMember implements Member{

    private UndoableStringBuilder situations;
    private ArrayList<Member> Members;
    public ConcreteMember(UndoableStringBuilder  situations,ArrayList<Member> Members)
    {
        this.situations=situations;
        this.Members=Members;
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
