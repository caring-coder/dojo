package pro.verron;

public class Main {

    public static final int VALUE_NOT_FOUND = -1;

    static int linearSearch(int value, int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            if(sortedArray[i] == value)
                return i;
        }
        return VALUE_NOT_FOUND;
    }

    static int binarySearch(int searched, int[] sortedValues) {
        if(sortedValues.length == 0)
            return VALUE_NOT_FOUND;

        int lowestIndex = 0;
        int highestIndex = sortedValues.length;
        int currentIndex = sortedValues.length;

        while(highestIndex > lowestIndex){
            int nextIndex = (lowestIndex + highestIndex) / 2;

            if(nextIndex == currentIndex)
                return VALUE_NOT_FOUND;

            currentIndex = nextIndex;

            int currentValue = sortedValues[currentIndex];

            if(currentValue == searched)
                return currentIndex;

            if (currentIndex == sortedValues.length - 1)
                return VALUE_NOT_FOUND;

            if (currentIndex == 0)
                return VALUE_NOT_FOUND;

            if(currentValue > searched)
                highestIndex = currentIndex;
            else
                lowestIndex = currentIndex;
        }

        return currentIndex;
    }
}