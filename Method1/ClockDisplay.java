 
/**
 * Write a description of class ClockDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

  public class ClockDisplay{


    private NumberDisplay hour;
    private NumberDisplay minute;
    private NumberDisplay second;
    private String display;

    public ClockDisplay(){
        hour=new NumberDisplay(12);
        minute=new NumberDisplay(60);
        second=new NumberDisplay(60);
    }

    public void clockTick(){
        second.increment();
        if(second.getValue()==0){
            minute.increment();
            if(minute.getValue()==0)
                hour.increment();    
        }
        
        updateDisplay();    

    }

    private void updateDisplay(){
        int hours=hour.getValue();
        
        if(hours==0){
            hours=12;
            
        }
        display=hours+" : "+minute.getDisplayValue()+" : "+second.getDisplayValue();

    }
    public void setTime(int h,int m,int s){
        hour.setValue(h);
        minute.setValue(m);
        second.setValue(s);
        updateDisplay();
    }
    public String getDisplay(){
        return display;
    }    



}
