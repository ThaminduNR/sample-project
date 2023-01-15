package main;

public class Boy {
    SuperGirl girl;

    public void setGirl(Girl girl){
        this.girl=girl;
    }

    public void chatWithGirl(){
        girl.chat();
    }
}
