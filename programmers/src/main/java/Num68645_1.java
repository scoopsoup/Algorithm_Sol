public class Num68645_1 { // 68645_삼각달팽이_sol1(이중반복문이용)

    public int[] solution_68645_1(int n) {
        // 삼각형을 이차원배열에 만들어준다.
        // 이차원배열 생성
        int[][] triangle = new int[n][n];
        // 증가시킬 숫자(삼각형에 넣어줄 숫자)
        int temp = 1;
        // 현재 삼각형(배열)의 위치
        // 제일 처음 위치는 (0,0)으로 설정
        int x = 0;
        int y = 0;

        // 삼각형이 다 채워질때까지 반복
        while (true) {
            // 아래로이동
            while (true) {
                // 배열에 값 넣기 -> 값 증가
                triangle[y][x] = temp++;
                // 더이상 이동할 공간이 없다면 break
                // 1. 배열의 끝을 만난경우
                // 2. 다음 공간에 0이 아닌 다른값이 있는경우 -> 이미 채워진 공간
                if (y + 1 == n || triangle[y + 1][x] != 0) {
                    break;
                }
                y += 1;
            }
            // 오른쪽으로 이동할 공간이 없는경우 -> 다 채워졌다! -> 더이상 반복문을 진행시킬 필요 없음
            if (x + 1 == n || triangle[y][x + 1] != 0) {
                break;
            }
            // 오른쪽으로 이동할 공간이 있는경우 -> 오른쪽으로 한번 이동
            x += 1;

            // 오른쪽이동
            while (true) {
                // 배열에 값 넣기 -> 값 증가
                triangle[y][x] = temp++;
                // 더이상 이동할 공간이 없다면 break
                // 1. 배열의 끝을 만난경우
                // 2. 다음 공간에 0이 아닌 다른 값이 있는 경우
                if (x + 1 == n || triangle[y][x + 1] != 0) {
                    break;
                }
                x += 1;
            }
            // 왼쪽위로 이동할 공간이 없는경우
            if (triangle[y - 1][x - 1] != 0) {
                break;
            }
            // 왼쪽위로 이동하려면 x값, y값이 1씩 감소
            x -= 1;
            y -= 1;

            // 왼쪽위로이동
            while (true) {
                // 배열에 값넣기 -> 값 증가
                triangle[y][x] = temp++;
                // 더이상 이동할 공간이 없다면 break
                // 1. 다음 공간ㅇ ㅔ0이 아닌 다른 값이 있는 경우
                if (triangle[y - 1][x - 1] != 0) {
                    break;
                }
                x -= 1;
                y -= 1;
            }
            // 아래로 이동할 공간이 없는경우
            if (y + 1 == n || triangle[y + 1][x] != 0) {
                break;
            }
            // 아래로 이동하려면 y값 증가
            y += 1;
        }

        int[] result = new int[temp - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                result[index++] = triangle[i][j];
            }
        }
        return result;
    }

    public static void main(String args[]) {

    }
}