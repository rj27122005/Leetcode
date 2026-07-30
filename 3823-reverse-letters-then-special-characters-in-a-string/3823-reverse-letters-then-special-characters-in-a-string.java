class Solution {
    public String reverseByType(String s) {

        char[] arr = s.toCharArray();
        int low = 0, high = arr.length - 1;
        while (low < high) {

            if ((((arr[low] >= 'a' && arr[low] <= 'z') || (arr[low] >= 'A' && arr[low] <= 'Z'))) &&
                (((arr[high] >= 'a' && arr[high] <= 'z') || (arr[high] >= 'A' && arr[high] <= 'Z')))) {

                char t = arr[low];
                arr[low] = arr[high];
                arr[high] = t;

                low++;
                high--;

            } else if (!((arr[low] >= 'a' && arr[low] <= 'z') || (arr[low] >= 'A' && arr[low] <= 'Z'))) {
                low++;
            } else {
                high--;
            }
        }
        low = 0;
        high = arr.length - 1;
        while (low < high) {

            if (!((arr[low] >= 'a' && arr[low] <= 'z') || (arr[low] >= 'A' && arr[low] <= 'Z')) &&
                !((arr[high] >= 'a' && arr[high] <= 'z') || (arr[high] >= 'A' && arr[high] <= 'Z'))) {

                char t = arr[low];
                arr[low] = arr[high];
                arr[high] = t;
                low++;
                high--;
            } else if (((arr[low] >= 'a' && arr[low] <= 'z') || (arr[low] >= 'A' && arr[low] <= 'Z'))) {
                low++;
            } else {
                high--;
            }
        }

        return new String(arr);
    }
}