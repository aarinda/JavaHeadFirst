class TapeDeck {
    boolean canRecord = false;

    void playTape() {
        System.out.println("tape playing");
    }

    void recordTape() {
        System.out.println("tape recording");
    }
}

class TapeDeckTestDrive {
    static TapeDeck t = new TapeDeck();
    public static void main (String[] args) {
        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
