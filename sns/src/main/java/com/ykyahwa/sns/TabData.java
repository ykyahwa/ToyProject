package com.ykyahwa.sns;

/**
 * Created by ehlee on 2016-03-31.
 */
public enum TabData {
    FACEBOOK("Facebook"),
    KAKAOTALK("Kakao Talk");

    private String value;
    TabData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
