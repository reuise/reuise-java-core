package dev.reuise.core;

/** Common capability of web components that opt into entrance animation. */
public interface HasAnimation {
    ComponentAnimation getAnimation();
    HasAnimation setAnimation(ComponentAnimation animation);
    HasAnimation startAnimation();
    HasAnimation cancelAnimation();
}
