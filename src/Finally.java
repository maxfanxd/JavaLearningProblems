/**
 * 主要探究finally和try-catch块的执行顺序
 */

public class Finally {
    public static void main(String args[]){
        int test = tryTest();
        System.out.println(test);
    }

    public static int tryTest(){
        try{
            System.out.println("正在执行try语句里的第一行");
            return 100;
        }
        catch(Exception e){
            e.printStackTrace();
            return 200;
        }
        finally {
            System.out.println("正在执行finally语句的第一行");
            return 300;
        }
    }
}
