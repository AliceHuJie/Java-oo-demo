package model;

import org.junit.Assert;
import org.junit.Test;


public class RectangleTest {

    @Test
    public void get_area_should_correct() {
        // given
        double height = 2.0;
        double width = 3;
        double expectedArea = 6;

        // when
        Rectangle rectangle = new Rectangle(height, width);
        double area = rectangle.getArea();

        // then
        Assert.assertEquals(expectedArea, area, 0);
    }

    @Test
    public void get_perimeter_should_correct() {
        // given
        double height = 2.0;
        double width = 3;
        double expectedPerimeter = 10;

        // when
        Rectangle rectangle = new Rectangle(height, width);
        double perimeter = rectangle.getPerimeter();

        // then
        Assert.assertEquals(expectedPerimeter, perimeter, 0);
    }
}