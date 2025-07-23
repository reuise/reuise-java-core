package dev.reuise.core.skeleton;
public enum SkeletonShape {

    CIRCULAR() {
        @Override
        public String getShortName() {
            return "circular";
        }
    },
    RECTANGULAR() {
        @Override
        public String getShortName() {
            return "rectangular";
        }
    };
    public abstract String getShortName();
}