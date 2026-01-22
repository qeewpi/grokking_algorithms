class Main {
    public static void main(String[] args) {
        countdown(5);
    }
    
    public static void countdown(int num) {
        System.out.println(num);
        
        if (num == 1) {
            return;
        } else {
            countdown(num - 1);
        }
    }
}