package com.example.woongjin;

public class Solution3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        /*
        -- 코드를 입력하세요
        SELECT FA.REVIEW_CNT AS '후기 수',
               COUNT(*) AS '공간 수'
        FROM
        (
            SELECT CASE WHEN B.CNT IS NULL THEN '0'
                        WHEN B.CNT > 0 AND B.CNT < 50 THEN '< 50'
                        WHEN B.CNT > 50 AND B.CNT < 100 THEN '< 100'
                        WHEN B.CNT >= 100 THEN '>= 100'
                    END AS REVIEW_CNT,
                    B.CNT
            FROM PLACES A LEFT JOIN
            (
                SELECT COUNT(PLACE_ID) CNT, PLACE_ID
                FROM PLACE_REVIEWS
                GROUP BY PLACE_ID
            ) B ON A.ID = B.PLACE_ID
        )FA
        GROUP BY FA.REVIEW_CNT
        ORDER BY FA.CNT
        ;
        * */
    }
}
