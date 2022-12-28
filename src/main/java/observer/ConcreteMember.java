package observer;

import api.Member;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ConcreteMember     implements Member {
    private UndoableStringBuilder situations;
    //shallow copy
    public ConcreteMember(GroupAdmin GA)
    {
            this.situations=GA.getSituations();
    }
   /**
    * @param usb type(UndoableStringBuilder
    *            update for this.ConcreteMember
    * */
    @Override
    public void update(UndoableStringBuilder usb)throws EmptyStackException {
      this.situations.setUndo(usb.getUndo());
    }
//getter
    public UndoableStringBuilder getSituations() {
        return situations;
    }

    @Override
    public String toString() {
        return "ConcreteMember{" +
                "situations=" + situations +"}";

    }
}
