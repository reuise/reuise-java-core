package dev.reuise.core;

public enum Position {
    TOP_LEFT {
        @Override
        public String getShortName() {
            return "tl";
        }

        @Override
        public String getVerticalPosition() {
            return "top";
        }

        @Override
        public String getHorizontalPosition() {
            return "left";
        }

        @Override
        public boolean isCenterX() {
            return false;
        }

        @Override
        public boolean isCenterY() {
            return false;
        }

        @Override
        public boolean isTop() {
            return true;
        }

        @Override
        public boolean isRight() {
            return false;
        }

        @Override
        public boolean isBottom() {
            return false;
        }

        @Override
        public boolean isLeft() {
            return true;
        }
    }, 
    TOP_CENTER {
        @Override
        public String getShortName() {
            return "tc";
        }

        @Override
        public String getVerticalPosition() {
            return "top";
        }

        @Override
        public String getHorizontalPosition() {
            return "center";
        }

        @Override
        public boolean isCenterX() {
            return false;
        }

        @Override
        public boolean isCenterY() {
            return false;
        }

        @Override
        public boolean isTop() {
            return true;
        }

        @Override
        public boolean isRight() {
            return false;
        }

        @Override
        public boolean isBottom() {
            return false;
        }

        @Override
        public boolean isLeft() {
            return false;
        }
    }, 
    TOP_RIGHT {
        @Override
        public String getShortName() {
            return "tr";
        }

        @Override
        public String getVerticalPosition() {
            return "top";
        }

        @Override
        public String getHorizontalPosition() {
            return "right";
        }

        @Override
        public boolean isCenterX() {
            return false;
        }

        @Override
        public boolean isCenterY() {
            return false;
        }

        @Override
        public boolean isTop() {
            return true;
        }

        @Override
        public boolean isRight() {
            return true;
        }

        @Override
        public boolean isBottom() {
            return false;
        }

        @Override
        public boolean isLeft() {
            return false;
        }
    },
    CENTER_LEFT {
        @Override
        public String getShortName() {
            return "cl";
        }

        @Override
        public String getVerticalPosition() {
            return "center";
        }

        @Override
        public String getHorizontalPosition() {
            return "left";
        }

        @Override
        public boolean isCenterX() {
            return false;
        }

        @Override
        public boolean isCenterY() {
            return true;
        }

        @Override
        public boolean isTop() {
            return false;
        }

        @Override
        public boolean isRight() {
            return false;
        }

        @Override
        public boolean isBottom() {
            return false;
        }

        @Override
        public boolean isLeft() {
            return true;
        }
    }, 
    CENTER_CENTER {
        @Override
        public String getShortName() {
            return "cc";
        }

        @Override
        public String getVerticalPosition() {
            return "center";
        }

        @Override
        public String getHorizontalPosition() {
            return "center";
        }

        @Override
        public boolean isCenterX() {
            return true;
        }

        @Override
        public boolean isCenterY() {
            return true;
        }

        @Override
        public boolean isTop() {
            return false;
        }

        @Override
        public boolean isRight() {
            return false;
        }

        @Override
        public boolean isBottom() {
            return false;
        }

        @Override
        public boolean isLeft() {
            return false;
        }
    }, 
    CENTER_RIGHT {
        @Override
        public String getShortName() {
            return "cr";
        }

        @Override
        public String getVerticalPosition() {
            return "center";
        }

        @Override
        public String getHorizontalPosition() {
            return "right";
        }

        @Override
        public boolean isCenterX() {
            return false;
        }

        @Override
        public boolean isCenterY() {
            return true;
        }

        @Override
        public boolean isTop() {
            return false;
        }

        @Override
        public boolean isRight() {
            return true;
        }

        @Override
        public boolean isBottom() {
            return false;
        }

        @Override
        public boolean isLeft() {
            return false;
        }
    },
    BOTTOM_LEFT {
        @Override
        public String getShortName() {
            return "bl";
        }

        @Override
        public String getVerticalPosition() {
            return "bottom";
        }

        @Override
        public String getHorizontalPosition() {
            return "left";
        }

        @Override
        public boolean isCenterX() {
            return false;
        }

        @Override
        public boolean isCenterY() {
            return false;
        }

        @Override
        public boolean isTop() {
            return false;
        }

        @Override
        public boolean isRight() {
            return false;
        }

        @Override
        public boolean isBottom() {
            return true;
        }

        @Override
        public boolean isLeft() {
            return true;
        }
    }, 
    BOTTOM_CENTER {
        @Override
        public String getShortName() {
            return "bc";
        }

        @Override
        public String getVerticalPosition() {
            return "bottom";
        }

        @Override
        public String getHorizontalPosition() {
            return "center";
        }

        @Override
        public boolean isCenterX() {
            return true;
        }

        @Override
        public boolean isCenterY() {
            return false;
        }

        @Override
        public boolean isTop() {
            return false;
        }

        @Override
        public boolean isRight() {
            return false;
        }

        @Override
        public boolean isBottom() {
            return true;
        }

        @Override
        public boolean isLeft() {
            return false;
        }
    }, 
    BOTTOM_RIGHT {
        @Override
        public String getShortName() {
            return "br";
        }

        @Override
        public String getVerticalPosition() {
            return "bottom";
        }

        @Override
        public String getHorizontalPosition() {
            return "right";
        }

        @Override
        public boolean isCenterX() {
            return false;
        }

        @Override
        public boolean isCenterY() {
            return false;
        }

        @Override
        public boolean isTop() {
            return false;
        }

        @Override
        public boolean isRight() {
            return true;
        }

        @Override
        public boolean isBottom() {
            return true;
        }

        @Override
        public boolean isLeft() {
            return false;
        }
    };

    public abstract String getShortName();

    public abstract String getVerticalPosition();

    public abstract String getHorizontalPosition();

    public abstract boolean isCenterX();
    public abstract boolean isCenterY();
    public abstract boolean isTop();
    public abstract boolean isRight();
    public abstract boolean isBottom();
    public abstract boolean isLeft();
}
