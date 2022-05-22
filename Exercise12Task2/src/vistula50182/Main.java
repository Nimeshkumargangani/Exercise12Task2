package vistula50182;

import static vistula50182.Main.TrafficlightColor.*;

public class Main {


    enum TrafficlightColor {
        Red, Green, Yellow
    }

    class TrafficLightSimulator {
        TrafficlightColor Choice = Red;

        public void changeColor() {
            switch (Choice) {
                case Red:
                    Choice = Green;
                    break;
                case Yellow:
                    Choice = Red;
                    break;
                case Green:
                    Choice = Yellow;
                    break;
            }
        }

        public String toString() {
            return " " + Choice;
        }

    }

    public class Task_2 {
        public void main(String[] args) {
            TrafficLightSimulator TL = new TrafficLightSimulator();
            for (int i = 0; i < 9; i++) {
                System.out.println(TL);
                TL.changeColor();
            }
        }
    }
}