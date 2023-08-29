
/**
 * Write a description of class NumberDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    private int limit;
    private int value;

    public NumberDisplay(int limit){
        this.limit=limit;
        this.value=0;
    }

    public void increment(){
        value=(value+1)%limit; 
        
    }

    public int getValue(){
        return value;
    }

    public void setValue(int rval){
    if ((rval>0) && (rval<limit))
        value=rval;
    if ((rval>0) && (rval>limit)){
        value=rval-12;}
    if(rval==0)
    value=12;
}

    public String getDisplayValue(){
        if(value<10)
            return "0"+value;    
        else
            return ""+value;
    }

   
    }

   
    