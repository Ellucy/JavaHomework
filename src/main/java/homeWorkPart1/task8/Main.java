package homeWorkPart1.task8;

public class Main {

    public static void main(String[] args) {

        int packageSize1 = 4;
        int packageSize2 = 28;
        int packageSize3 = 43;

        PackageSize myPackageSize1 = PackageSize.getPackageSize(packageSize1);
        PackageSize myPackageSize2 = PackageSize.getPackageSize(packageSize2);
        PackageSize myPackageSize3 = PackageSize.getPackageSize(packageSize3);

        System.out.println("Size of my first package: " + myPackageSize1);
        System.out.println("Size of my second package: " + myPackageSize2);
        System.out.println("Size of my third package: " + myPackageSize3);
        System.out.println("Size of wrong-sized package: " + PackageSize.getPackageSize(102));

        String immutableString = "Immutable";
        immutableString = immutableString.concat(" Example");  // Attempting to modify the value

        System.out.println(immutableString);
    }

}
