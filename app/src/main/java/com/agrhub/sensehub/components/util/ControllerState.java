package com.agrhub.sensehub.components.util;

/**
 * Created by tanca on 10/18/2017.
 */

public enum ControllerState {
    CONTROLLER_STATE_UNKNOWN(0),
    CONTROLLER_STATE_ON(1),
    CONTROLLER_STATE_OFF(2);

    private final int value;
    private ControllerState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getValueString(){
        String sValue = "";
        switch (value){
            case 0:
                sValue = "false";
                break;
            case 1:
                sValue = "true";
                break;
            case 2:
                sValue = "false";
                break;
        }
        return sValue;
    }
}
