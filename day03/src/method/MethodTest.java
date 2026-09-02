package method;

import java.util.Arrays;

public class MethodTest {

	public static void main(String[] args) {
		int[] numArr = {3, 6, 2, 4, 8};

		// 1. 모든 값의 합
		System.out.println("합계: " + getSum(numArr));

		// 2. 기준 숫자(4)보다 큰 숫자의 개수
		System.out.println("4보다 큰 숫자 개수: " + getCount(numArr, 4));

		// 3. 가장 큰 숫자
		System.out.println("최대값: " + getMax(numArr));

		// 4. 역순으로 저장
		swapArray(numArr);
		System.out.println("역순 정렬 결과: " + Arrays.toString(numArr));
	}

	// 정수형 배열에 저장된 모든 값 더하여 반환
	public static int getSum(int[] numArr) {
		int sum = 0;
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		return sum;
	}

	// 배열에 저장된 숫자 중 입력된 숫자보다 큰 수가 몇 개 있는지 구하기
	public static int getCount(int[] numArr, int target) {
		int count = 0;
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > target) {
				count++;
			}
		}
		return count;
	}

	// 정수형 배열에 저장된 숫자 중 가장 큰 숫자 반환 (문제 요구사항에 맞춰 반환값 처리)
	public static int getMax(int[] numArr) {
		int max = numArr[0];
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i] > max) {
				max = numArr[i];
			}
		}
		return max;
	}

	// 배열에 저장된 숫자를 역순으로 저장 (원본 배열 내부 값 위치 변경)
	public static void swapArray(int[] numArr) {
		for (int i = 0; i < numArr.length / 2; i++) {
			int temp = numArr[i];
			numArr[i] = numArr[numArr.length - 1 - i];
			numArr[numArr.length - 1 - i] = temp;
		}
	}
}