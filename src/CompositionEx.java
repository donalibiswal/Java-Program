package src;
// Composition Example
class Heart {
    void beat() { System.out.println("Heart is beating"); }
}
class Human {
    Heart heart = new Heart();
    void live() { heart.beat();
        System.out.println("Human is alive"); 
    }
}
public class CompositionEx {
    public static void main(String[] args) {
        Human h = new Human();
        h.live();
    }
}
