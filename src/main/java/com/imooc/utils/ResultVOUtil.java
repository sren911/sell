package com.imooc.utils;

import com.imooc.vo.ResultVO;

/**
 * 描述:
 *
 * @outhor sren
 * @create 2017-12-09 23:53
 */
public class ResultVOUtil {

    public static ResultVO success(Object data) {
       ResultVO resultVO = new ResultVO();
       resultVO.setCode(0);
       resultVO.setData(data);
       resultVO.setMsg("成功");
       return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);

        resultVO.setMsg("msg");
        return resultVO;
    }

}