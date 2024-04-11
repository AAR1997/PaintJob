public class PaintJob {

    public static void main(String[] args) {

        System.out.println(getBucketCount(8.6,5.9,2.6));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        int numberOfBuckets;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {

            return -1;
        } else {

            double a = Math.ceil((width * height) / areaPerBucket);
            numberOfBuckets = (int)a - extraBuckets;
        }

        return numberOfBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        int numberOfBuckets;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {

            return -1;
        } else {

            double a = Math.ceil((width * height) / areaPerBucket);
            numberOfBuckets = (int)a;
        }

        return numberOfBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        int numberOfBuckets;

        if(area <= 0 || areaPerBucket <= 0) {

            return -1;
        } else {

            double a = Math.ceil((area) / areaPerBucket);
            numberOfBuckets = (int)a;
        }

        return numberOfBuckets;
    }
}
