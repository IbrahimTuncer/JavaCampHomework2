
package classes;


public class Main {
    
    
    public static void main(String[] args) {
        // Classes are reference types
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();
        
        // value
        int number1 = 10;
        int number2 = 20;
        number2=number1;
        number1=30;
        System.out.println(number2);
        
        // Arrays are reference types
        int[] numbers = new int[]{1,2,3,4};
        int[] numbers2 = new int[]{5,6,7,8};
        numbers2 = numbers;
        numbers[0]=10;
        System.out.println(numbers2[0]);
    }
}
