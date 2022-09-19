public class E1 {
    private int count;
    private int limmit;
    public  E1(int limmit){
        count=0;
        this.limmit=limmit;
    }

    public void click(){
        if (count<2)
        count++;
    }

    public void reset(){
        count=0;
    }

    public void undo(){
        if (count>0)
            count--;
    }

    public void setLimmit(int limmit){
       this.limmit=limmit;
    }
    public int getCount(){
        return count;
    }
}
