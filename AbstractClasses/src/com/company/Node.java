package com.company;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem setNext(ListItem rightLink) {
        this.rightLink = rightLink;
        return this.rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem leftLink) {
        this.leftLink = leftLink;
        return this.leftLink;
    }

    @Override
    public int compareTo(ListItem listItem) {
        return (listItem != null) ? ((String) super.getValue()).compareTo( ((String) listItem.getValue())) : -1;
    }
}
