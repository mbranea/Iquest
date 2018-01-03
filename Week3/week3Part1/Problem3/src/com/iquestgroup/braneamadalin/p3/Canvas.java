package com.iquestgroup.braneamadalin.p3;

/**
 * The class for the definition of the Canvas.
 */
public class Canvas extends Element implements Container {
    List<Element> contentList = new ArrayList<Element>();

    @Override
     void removeElement(Element elementToRemove) {
        this.contentList.remove(elementToRemove);
    }

    @Override
     void addElement(Element elementToAdd) {

        this.contentList.add(elementToAdd);

    }
}
