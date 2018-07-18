package com.example.fullstack;

import com.example.fullstack.domain.ResultVO;
import org.junit.Test;

public class LombokTest {
    @Test
    public void ResultTest() {
        ResultVO result = new ResultVO();
        result.setResult(2);
        result.setMsg("hong");
        System.out.println(result);
    }
}
