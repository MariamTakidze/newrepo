package com.solvd.enums;

public enum speed {
        LOW(40),NORMAL(180), HIGH(280), SUPERHIGH(350);
        private int speed;
        speed(int speed){
            this.speed=speed;
        }

        public int getSpeed() {
            return speed;

    }
}
