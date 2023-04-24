public class Father {
    public int publicVar;
    private int privateVar;
    protected int protectedVar;
    Father(){
        this.publicVar = 100;
        this.protectedVar = 200;
        this.privateVar = 300;
    }

    public int getPrivateVar(){
        return privateVar;
    }
}
