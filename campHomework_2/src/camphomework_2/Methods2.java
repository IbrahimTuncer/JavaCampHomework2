package camphomework_2;

public class Methods2 {

    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        //String newMessage = message.substring(0, 2);
        String newMessage = giveCity();
        System.out.println(newMessage);
        System.out.println(plus(5, 7));
        int total = plus2(2,3,6,11,25,6,2);
        System.out.println(total);
    }

    public static void add() {
        System.out.println("Eklendi");
    }

    public static void remove() {
        System.out.println("Silindi");
    }

    public static void update() {
        System.out.println("Güncellendi");
    }

    
    public static int plus(int a , int b){
        return a+b;
    }
    
    public static int plus2(int... numbers){
        int total = 0;
        for (int number : numbers ) {
            total+=number;
        }
        return total;
    }
    
    public static String giveCity(){
        return "Ankara";
    }
}
