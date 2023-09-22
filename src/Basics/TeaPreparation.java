// Base Tea class
package Basics;
class Tea {
    protected String teaType;
    
    public Tea(String teaType) {
        this.teaType = teaType;
    }
    
    public void prepareTea() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addCondiments();
        System.out.println("Enjoy your " + teaType + " tea!");
    }
    
    private void boilWater() {
        System.out.println("Boiling water...");
    }
    
    private void steepTeaBag() {
        System.out.println("Steeping the tea bag...");
    }
    
    private void pourInCup() {
        System.out.println("Pouring the tea into a cup...");
    }
    
    protected void addCondiments() {
        System.out.println("Adding lemon and sugar...");
    }
}

// Subclass for Black Tea
class BlackTea extends Tea {
    public BlackTea() {
        super("Black Tea");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar to Black Tea...");
    }
}

// Subclass for Green Tea
class GreenTea extends Tea {
    public GreenTea() {
        super("Green Tea");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding honey to Green Tea...");
    }
}

// Subclass for Herbal Tea
class HerbalTea extends Tea {
    public HerbalTea() {
        super("Herbal Tea");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding honey and mint to Herbal Tea...");
    }
}

public class TeaPreparation {
    public static void main(String[] args) {
        Tea blackTea = new BlackTea();
        Tea greenTea = new GreenTea();
        Tea herbalTea = new HerbalTea();
        
        System.out.println("Preparing Black Tea:");
        blackTea.prepareTea();
        
        System.out.println("\nPreparing Green Tea:");
        greenTea.prepareTea();
        
        System.out.println("\nPreparing Herbal Tea:");
        herbalTea.prepareTea();
    }
}
