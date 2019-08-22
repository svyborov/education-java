package com.bercut.generics.pair;


/**
 * Describes a pair of values
 * @param <Template1> left value
 * @param <Template2> right value
 */
public class OrderedPair<Template1, Template2> implements Pair {
    private Template1 firstItem;
    private Template2 secondItem;

    /**
     * Set first value
     * @param newItem
     */
    void putFirstItem(Template1 newItem) {
        firstItem = newItem;
    }

    /**
     * Set second value
     * @param newItem
     */
    void putSecondItem(Template2 newItem) {
        secondItem = newItem;
    }

    @Override
    public Template1 getFirstItem() {
        return null;
    }

    @Override
    public Template2 getSecondItem() {
        return null;
    }
}
