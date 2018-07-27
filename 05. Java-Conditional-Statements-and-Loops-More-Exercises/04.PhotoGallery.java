import java.text.DecimalFormat;
import java.util.Scanner;

public class PhotoGallery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int photoNumber = Integer.parseInt(scan.nextLine());
        int day = Integer.parseInt(scan.nextLine());
        int month = Integer.parseInt(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int sizeInBytes = Integer.parseInt(scan.nextLine());
        int widht = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double size = 0;
        DecimalFormat df = new DecimalFormat("0.#");

        System.out.printf("Name: DSC_%04d.jpg\n", photoNumber);
        System.out.printf("Date Taken: %02d/%02d/%d %02d:%02d\n", day, month, year, hours, minutes);
        if (sizeInBytes < 1000) {
            System.out.printf("Size: %sB\n", df.format(sizeInBytes));
        } else if (sizeInBytes >= 1000 && sizeInBytes < 1000000) {
            size = sizeInBytes / 1000;
            System.out.printf("Size: %sKB\n", df.format(size));
        } else if (sizeInBytes >= 1000000) {
            size = sizeInBytes / 1000000.0;
            System.out.printf("Size: %sMB\n", df.format(size));
        }
        if (widht > height) {
            System.out.printf("Resolution: %dx%d (landscape)%n", widht, height);
        } else if (widht == height) {
            System.out.printf("Resolution: %dx%d (square)%n", widht, height);
        } else if (widht < height) {
            System.out.printf("Resolution: %dx%d (portrait)%n", widht, height);

        }
    }
}
