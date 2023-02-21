package com.iddwitku.witku.slider;

public class SliderItem {

    // image url is used to
    // store the url of image
    private int imgUrl;

    // Constructor method.
    public SliderItem(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    // Getter method
    public int getImgUrl() {
        return imgUrl;
    }

    // Setter method
    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }
}
