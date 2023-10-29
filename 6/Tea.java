public class Tea {
    private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

    public Tea() {
        isPrepared = false;
        hasMilk    = false;
        hasSugar   = false;
    }

    public void prepareTea() {
        isPrepared = true;
        System.out.println("Tea is prepared with hot water and tea leaves.");
    }

    public void addMilk() {
        if (isPrepared) {
            hasMilk = true;
            System.out.println("Milk is added to the tea.");
        } else {
            System.out.println("Prepare tea first before adding milk.");
        }
    }

    public void addSugar() {
        if (isPrepared) {
            hasSugar = true;
            System.out.println("Sugar is added to the tea.");
        } else {
            System.out.println("Prepare tea first before adding sugar.");
        }
    }
} 