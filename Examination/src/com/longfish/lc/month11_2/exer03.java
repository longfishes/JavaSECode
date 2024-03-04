package com.longfish.lc.month11_2;

public class exer03 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] people = new int[num_people];
        int count = 0;
        while (candies > 0) {
            if (candies >= count + 1){
                people[count%num_people] += count + 1;
                candies -= count + 1;
                count++;
            }else {
                people[count%num_people] += candies;
                return people;
            }
        }

        return people;
    }
}
