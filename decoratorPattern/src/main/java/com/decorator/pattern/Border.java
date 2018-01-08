
package com.decorator.pattern;

/**
 * @Description:
 * @Author: taojian
 * @time : 16:11 2018/1/8
 */
public abstract class  Border extends Display {

    protected Display display;

    public Border(Display display) {
        this.display = display;
    }


}
