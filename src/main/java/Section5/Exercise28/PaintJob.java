package Section5.Exercise28;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(-1.4, 0.5));

        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(-1.4, 6.1, 3.5));

        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));

    }
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBucket){
        int numberOfBuckets = 0;
        double area = 0;
        if ((width<=0) || (height<=0) || (areaPerBucket<=0) || (extraBucket<0)){
            return -1;
        } else {
            area = width * height;
            numberOfBuckets = (int) Math.ceil((area/areaPerBucket) - extraBucket);
            return numberOfBuckets;
        }
    }

    public static int getBucketCount (double width, double height, double areaPerBucket){
        int numberOfBuckets = 0;
        double area = 0.0;
        if ((width<=0) || (height<=0) || (areaPerBucket<=0)){
            return -1;
        } else {
            area = width * height;
            numberOfBuckets = (int) Math.ceil(area/areaPerBucket);
            return numberOfBuckets;
        }
    }

    public static int getBucketCount (double area, double areaPerBucket){
        int numberOfBuckets = 0;
        if ((area<=0) || (areaPerBucket<=0)){
            return -1;
        } else {
            numberOfBuckets = (int) Math.ceil(area/areaPerBucket);
            return numberOfBuckets;
        }
    }
}
