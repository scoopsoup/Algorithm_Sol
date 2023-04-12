public class Num87377 {// 87377_교점에 별 만들기

    // 좌표만들기
    private static class Point {
        public final long x, y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    // 두 직선의 교점 만들기
    // a1x + b1y + c1 = 0
    // a2x + b2y + c2 = 0
    // 두 직선의 교점 : x = ()/() , y = ()/()
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if (x % 1 != 0 || y % 1 != 0) {
            return null;
        }

        return new Point((long) x, (long) y);
    }

    public static void main(String args[]) {

    }

}


