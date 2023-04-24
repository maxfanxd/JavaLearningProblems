/**
 * 主要探究finally和try-catch块的执行顺序，111KL
 */

public class Finally {
    public static void main(String args[]){
        int test = tryTest();
        System.out.println(test);
    }

    public static int tryTest(){
        try{
            System.out.println("正在执行try语句里的第一行");
            throw new Exception("haha");
        }
        catch(Exception e){
            e.printStackTrace();
            return 100;
        }
        finally {
            System.out.println("正在执行finally语句的第一行");
            return 300;
        }
    }
}
