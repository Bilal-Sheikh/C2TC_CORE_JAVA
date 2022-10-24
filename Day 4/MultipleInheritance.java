// Multiple inheritance is not allowed in Java, but we can use it with the help of interfaces

interface Bank {
    float rateOfInterest();
}

interface RBIBank {
    float RBIroi();
}

interface WorldBank {
    float Worldroi();
}

class SBI implements Bank, RBIBank, WorldBank {
    
    @Override
    public float rateOfInterest() {
        return 9.15f;
    }

    @Override
    public float RBIroi() {
        return 8.7f;
    }

    @Override
    public float Worldroi() {
        return 6.7f;
    }
}
class ICICI implements Bank {
    
    @Override
    public float rateOfInterest() {
        return 9.7f;
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        
        Bank b = new SBI();
        
        System.out.println("ROI: " + b.rateOfInterest());
        System.out.println("ROI: " + ((WorldBank) b).Worldroi());
        System.out.println("ROI: " + ((RBIBank) b).RBIroi());
    }
}