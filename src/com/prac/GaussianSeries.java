package com.prac;

public class GaussianSeries {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static int solution(int N) {
        // 1/2*K*(K+1) = N
        // K^2+K-2N = 0
        // K = (-1 + sqrt(1+ (8*N)))/2
        int result = 0;
        int sqroot = (int) Math.sqrt(1 + (8 * N));
        System.out.println("Square root: " + sqroot);
        result += (-1 + sqroot) / 2;

        return result;
    }
}
