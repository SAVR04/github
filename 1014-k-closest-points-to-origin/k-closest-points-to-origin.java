class Solution {
    public int[][] kClosest(int[][] points, int k) {
        List<int[]> list = new ArrayList<>();
        for (int[] p : points) {
            int dist = p[0] * p[0] + p[1] * p[1];
            if (list.size() < k) {
                list.add(p);
            } else {
                int maxIdx = 0, maxDist = getDist(list.get(0));
                for (int j = 1; j < list.size(); j++) {
                    int d = getDist(list.get(j));
                    if (d > maxDist) {
                        maxDist = d;
                        maxIdx = j;
                    }
                }
                if (dist < maxDist) {
                    list.remove(maxIdx);
                    list.add(p);
                }
            }
        }
        return list.toArray(new int[k][]);
    }

    private int getDist(int[] p) {
        return p[0] * p[0] + p[1] * p[1];
    }
}
