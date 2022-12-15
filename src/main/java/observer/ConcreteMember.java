package observer;

import java.util.ArrayList;

public class ConcreteMember implements Member{

    private UndoableStringBuilder situations;
    private ArrayList<ConcreteMember> Members;
    public ConcreteMember(GroupAdmin groupAdmin)
    {
        this.situations=groupAdmin.getSituations();
        this.Members=groupAdmin.getMembers();
    }
    @Override
    public void update(UndoableStringBuilder usb) {

        this.Members.forEach((M)->
                {
                    M.situations.setUndo(usb.getUndo().toString());
                }
        );
    }
}
