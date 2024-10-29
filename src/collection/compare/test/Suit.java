package collection.compare.test;

public enum Suit {  //Enum안에 CompareTo에서 ordinal이 있어 작성한 순서대로 비교함. 다음에선 스페이드->하트->다이아몬드->클로버 순으로 큰 값(?) 취급
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLUB("♣");

    private String icon;

    Suit(String icon){
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
