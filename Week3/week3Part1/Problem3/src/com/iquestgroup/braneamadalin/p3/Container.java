package com.iquestgroup.braneamadalin.p3;

/**
 * Interface for defining Elements that can contain other elements
 */
public interface Container {

    public void removeElement(Element elementToRemove);

    public void addElement(Element elementToAdd);
}
