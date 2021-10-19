package MarksheiderReport.Vurabotky;

import java.lang.Math;

public class DrillingOrt extends Vurabotka {

    public void getValueOrt (float leigth, float crossSection) {
        double valueOfOrt = Math.round((leigth * crossSection)*10);
        double result = valueOfOrt/10;
        System.out.println(result);
    }
}
