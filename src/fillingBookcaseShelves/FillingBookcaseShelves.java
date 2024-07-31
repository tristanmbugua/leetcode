package fillingBookcaseShelves;

import java.util.Arrays;
import java.util.Comparator;

public class FillingBookcaseShelves {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1}
                , {2, 3}
                , {2, 3}
                , {1, 1}
                , {1, 1}
                , {1, 1}
                , {1, 2}
        };

        System.out.println(minHeightShelves(arr, 4));
    }

    public static int minHeightShelves(int[][] books, int shelfWidth) {
        int shelves = 0;
        int currWidth = 0;
        int highestHeight = 0;

        //Sort the array by thickness.
        Arrays.sort(books, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < books.length; i++) {
            //Update the width of the books in the current shelf.
            currWidth += books[i][0];

            if (currWidth <= shelfWidth) {
                //Shelf is not full, let's adjust the values to account for the new value.
                if (books[i][1] > highestHeight) {
                    highestHeight = books[i][1];
                }

            } else {
                //Shelf full, move forward to the next shelf.
                currWidth = 0;

                //Adjust the height of the booksheld to match the the tallest book in the current shelf.
                shelves += highestHeight;

                //Reset the highestHeight value. The new shelf will start at the shortest possible value, 1.
                highestHeight = 1;

                //Move the pointer back as to not skip over the unchecked value.
                i--;
            }
        }

        return shelves;
    }
}