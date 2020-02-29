package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopPractices {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(10,20,30,40));

        for(Integer each : nums){
            System.out.println(each);
        }

    }
}
