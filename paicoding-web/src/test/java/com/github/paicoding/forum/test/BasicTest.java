package com.github.paicoding.forum.test;

import com.github.paicoding.forum.web.QuickForumApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author YiHui
 * @date 2022/7/20
 */
@Slf4j
@SpringBootTest(classes = QuickForumApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BasicTest {




    @Test
    public void moveZeroes() {
        int nums[] = new int[]{0,1,0,3,2};
        int left  = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                left = i;
            }else {
                int k = nums[left];
                nums[left] = nums[i];
                nums[i]=k;
                left++;
            }

        }
        System.out.println(Arrays.toString(nums));
    }

}
