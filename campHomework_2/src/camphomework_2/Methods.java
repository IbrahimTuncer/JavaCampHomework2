
package camphomework_2;


public class Methods {

    
    public static void main(String[] args) {
        findNumber();
    }
    
    public static void findNumber(){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if(varMi){
            giveMessage("Sayı mevcuttur : "+aranacak);
        }
        else{
            giveMessage("Sayı mevcut değildir : "+aranacak);
        }
    }
    
    public static void giveMessage(String mesaj){
        System.out.println(mesaj);
    }
}