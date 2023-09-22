package Basics;
class Tea1 {
    public void brew() {
        System.out.println("Brewing a generic tea.");
    }
}

class GreenTea1 extends Tea1 {
    @Override
    public void brew() {
        System.out.println("Brewing Green Tea.");
    }
}

class BlackTea1 extends Tea1 {
    @Override
    public void brew() {
        System.out.println("Brewing Black Tea.");
    }
}

class HerbalTea1 extends Tea1 {
    @Override
    public void brew() {
        System.out.println("Brewing Herbal Tea.");
    }
}

public class Q7TeaPolymorphism {
    public static void main(String[] args) {
        Tea1[] teaArray = new Tea1[3];
        teaArray[0] = new GreenTea1();
        teaArray[1] = new BlackTea1();
        teaArray[2] = new HerbalTea1();

        for (Tea1 tea : teaArray) {
            tea.brew(); // This will invoke the appropriate brew method based on the actual object type.
        }
    }
}
