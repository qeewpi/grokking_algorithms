class Main {
    public static void main(String[] args) {
        greet("Ashley");
    }
    
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
        greet2(name);    
        System.out.println("Getting ready to say bye...");
        bye();
    }
    
    public static void greet2(String name) {
        System.out.println("How are you today, " + name + "?");
    }
    
    public static void bye() {
        System.out.println("Ok, bye!");
    }
}