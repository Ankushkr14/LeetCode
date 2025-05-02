class Pair {
    int index;
    char direction;

    Pair(int index, char direction) {
        this.index = index;
        this.direction = direction;
    }
}

class Solution {
    public String pushDominoes(String dominoes) {
        char[] dom = dominoes.toCharArray();
        Deque<Pair> queue = new ArrayDeque<>();

        for(int i = 0;i<dom.length;i++){
            if(dom[i] != '.'){
                queue.addLast(new Pair(i, dom[i]));
            }
        }

         while (!queue.isEmpty()) {
            Pair current = queue.pollFirst();
            int i = current.index;
            char d = current.direction;

            if (d == 'L') {
                if (i > 0 && dom[i - 1] == '.') {
                    queue.addLast(new Pair(i - 1, 'L'));
                    dom[i - 1] = 'L';
                }
            } else if (d == 'R') {
                if (i + 1 < dom.length && dom[i + 1] == '.') {
                    if (i + 2 < dom.length && dom[i + 2] == 'L') {
                        queue.pollFirst();
                    } else {
                        queue.addLast(new Pair(i + 1, 'R'));
                        dom[i + 1] = 'R';
                    }
                }
            }
        }
        return new String(dom);
    }
}