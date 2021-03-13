import java.util.EnumMap;

public enum ATMActions {

        DEPOSIT (1),
        WITHDRAW (2),
        CHECK_BAL (3),
        TRANSFER (4),
        VIEW_HIST (5)
    ;

    private final int buttonNumber;

    ATMActions (int buttonNumber) {
        this.buttonNumber = buttonNumber;
    }

    static {
        EnumMap<ATMActions, Integer> enumMap = new EnumMap<ATMActions, Integer>();
            enumMap.put(ATMActions.DEPOSIT, 1);
            enumMap.put(ATMActions.WITHDRAW, 2);
            enumMap.put(ATMActions.CHECK_BAL, 3);
            enumMap.put(ATMActions.TRANSFER, 4);
            enumMap.put(ATMActions.VIEW_HIST, 5);
    }

    public int getButtonNumber() {
        return this.buttonNumber;
    }
}



