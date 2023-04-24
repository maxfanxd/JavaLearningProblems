public class Son extends Father{
    public int sonVar;
    Son(int x){
        super();
    }
    public static void main(String[] args){
        Son son = new Son(400);
        System.out.println(son.sonVar);
        System.out.println(son.protectedVar);
        System.out.println(son.publicVar);
        System.out.println(son.getPrivateVar());
    }
}
