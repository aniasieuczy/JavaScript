public class PaintJob {

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {

        double numberOfBuckets = ((width * height) / areaPerBucket) - extraBuckets;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            return (int)Math.ceil(numberOfBuckets);
        }
    }


        public static int getBucketCount (double width, double height, double areaPerBucket) {

        double numberOfBuckets = ((width * height) / areaPerBucket);

            if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
                return -1;
            } else {
                return (int)Math.ceil(numberOfBuckets);
            }
        }


    public static int getBucketCount (double area, double areaPerBucket) {

        double numberOfBuckets = area / areaPerBucket;

        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int)Math.ceil(numberOfBuckets);
        }

    }

    }


