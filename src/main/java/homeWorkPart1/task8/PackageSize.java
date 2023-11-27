package homeWorkPart1.task8;

public enum PackageSize {
    SMALL(1, 20),
    MEDIUM(20, 40),
    LARGE(40, 60),
    UNACCEPTABLE(0, 0);

    private int minSize;
    private int maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int size) {

        //values() method is generated for every enum, providing an array of all the enum constants
        for (PackageSize sizeOfPackage : values()) {
            if (size >= sizeOfPackage.minSize && size <= sizeOfPackage.maxSize) {
                return sizeOfPackage;
            }
        }

//        throw new IllegalArgumentException("Wrong package size.");
        return UNACCEPTABLE;
    }
}
