package main;

public class Boy implements DI{
    SuperGirl girl;

    @Override
    public void inject(Girl girl) {
        this.girl=girl;
    }

    public void chatWithGirl(){
        girl.chat();
    }
}
