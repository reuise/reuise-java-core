package dev.reuise.core.avatar;
public enum AvatarShape {

    CIRCLE() {
        @Override
        public String getShortName() {
            return "circle";
        }
    },
    RECTANGLE() {
        @Override
        public String getShortName() {
            return "rectangle";
        }
    },
    ROUNDED() {
        @Override
        public String getShortName() {
            return "rounded";
        }
    };
    public abstract String getShortName();
}