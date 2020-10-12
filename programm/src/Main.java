public class Main {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void process1() {
        try {
            process2();
        }catch(Exception e){
            System.out.println("异常在中间被拦截");
        }
    }

    static void process2() {
        Integer.parseInt(null); // 会抛出NumberFormatException
    }
}
