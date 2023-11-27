package homeWorkPart1.task1;

public class Shape {

        private String color;
        private boolean shouldFillShape;

        public Shape() {
            this.color = "unknown";
            this.shouldFillShape = false;
        }

        public Shape(String color, boolean shouldFillShape) {
            this.color = color;
            this.shouldFillShape = shouldFillShape;
        }

        public String getColor() {
            return this.color;
        }

        public boolean isShouldFillShape() {
            return shouldFillShape;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setShouldFillShape(boolean shouldFillShape) {
            this.shouldFillShape = shouldFillShape;
        }


        //Task1.Shape
        //with color of ? and filled/NotFilled , where ? is a placeholder for the
        //color and the  filled / not filled  info should be returned depending on
        //the  isFilled  eld
        @Override
        public String toString() {
            return "Shape with color of " + color + " and is " + (shouldFillShape ? "filled" : "NotFilled") + ".";

        }
}
