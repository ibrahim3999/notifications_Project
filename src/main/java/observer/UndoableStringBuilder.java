package observer;

import java.util.*;

/**
 * This is a program (class) to undo the last word you type in your string,
 * even the first word you entered in your string with your own memory and many functions
 * like delete, add...
 * @author  ibrahim mjadly
 * @version 11.2022
 */
public class UndoableStringBuilder {

    /**
     *  Generic Stack String type also @see <a href="https://www.geeksforgeeks.org/stack-class-in-java"></a>
     * <br>
     * */
    protected Stack<String> undo=new Stack<>();

    /**@type StringBuilder */
    private    StringBuilder stringBuilder;

    public UndoableStringBuilder()
    {
        this.stringBuilder=new StringBuilder();
    }
    /**
     * @param str ---> ٍString Push it  to the last string in memory
     * @return StringBuilder
     * @throw   str is null  if append(null)
     * @throws NullPointerException
     * */
    public UndoableStringBuilder append(String str)  throws NullPointerException {

        try {
            if(str==null)
                throw  new NullPointerException();
            this.stringBuilder.append(str);
            this.undo.push(this.stringBuilder.toString());
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        return this;
    }
    /**
     * @param start  starting index from delete
     * @param  end   End of deletion index
     * @return StringBuilder
     * @throws ArithmeticException
     */
    public UndoableStringBuilder delete(int start, int end) throws NullPointerException,ArithmeticException
    {

        try {
            if(this.undo.isEmpty())
                throw new  NullPointerException("undo Stack is null");
            if(end <start)
                throw new ArithmeticException("Your end index is bigger than your starting index");
            this.stringBuilder.delete(start,end);
            this.undo.push(this.stringBuilder.toString());
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch (StringIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }

        return this;
    }
    /**
     * @param offset number of index set My new str
     * @param  str   String to insert into my Last String memory
     * @throws  StringIndexOutOfBoundsException,NullPointerException
     * */
    public UndoableStringBuilder insert(int offset, String str)throws StringIndexOutOfBoundsException ,NullPointerException
    {
        try{
            if(str==null || this.undo==null)
                throw new NullPointerException("Your str is Empty");

            this.stringBuilder.insert(offset,str);
            this.undo.push(this.stringBuilder.toString());
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.err.println("Range [0,"+this.undo.peek().length()+") Your index Out Bounds");
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        return this;
    }
    /**
     * @param start  string index
     * @param end   end index
     * @param  str  string [start,end]
     * @return StringBuilder
     * @throws StringIndexOutOfBoundsException,NullPointerException
     * */
    public UndoableStringBuilder replace(int start,int end, String str)throws ArithmeticException,NullPointerException
    {
        try {

            if(str==null || this.undo.isEmpty())
                throw  new NullPointerException("str is null");
            if(end <start )
                throw new ArithmeticException("Your end index is bigger than your starting index");

            this.stringBuilder.replace(start,end,str);
            this.undo.push(this.stringBuilder.toString());
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.err.println("Range [0,"+this.undo.peek().length()+") Your index Out Bounds");
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

        return this;
    }
    /** @return  StringBuilder
     * */
    public UndoableStringBuilder reverse()
    {
        this.stringBuilder.reverse();
        this.undo.push(this.stringBuilder.toString());
        return this;
    }
    /**
     *  EmptyStackException when My undo Stack isEmpty*/
    @Override
    public String toString() {

        try {
            return ""+undo.peek();
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }


        return null;
    }

    public String getUndo() throws EmptyStackException{
        return undo.peek();
    }

    public void setUndo(String pushStr) {
        this.undo.push(pushStr);
    }

    /**
     * FILO (first in last out ) also @see <a  href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)"></a>
     * <br>
     * method to pop for your Stack (memory String) Like Ctrl+Z
     * @throws  EmptyStackException
     * */
    public void undo()
    {
        try {
            this.undo.pop();
        }
        catch (EmptyStackException e)
        {
            e.printStackTrace();
        }
    }
    /**
     * Getter and Setter
     * */
    public UndoableStringBuilder getStringBuilder() {
        return this;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

}

