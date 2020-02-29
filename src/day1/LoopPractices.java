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

        for (int i = 0; i <=10 ; i+=2) {

            System.out.println("Even numbers: "+i);

        }

        System.out.println("##################");



    }
}
