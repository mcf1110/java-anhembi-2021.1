public class IntSet {
    boolean[] isInSet = new boolean[101];

    IntSet() {
        for (int i = 0; i < isInSet.length; i++) {
            isInSet[i] = false;
        }
    }

    private IntSet(boolean[] isInSet) {
        this.isInSet = isInSet;
    }

    public void insert(int i) {
        isInSet[i] = true;
    }

    public void delete(int i) {
        isInSet[i] = false;
    }

    public IntSet union(IntSet other) {
        boolean[] u = new boolean[101];
        for (int i = 0; i < u.length; i++) {
            u[i] = this.isInSet[i] || other.isInSet[i];
        }
        return new IntSet(u);
    }

    public IntSet intersect(IntSet other) {
        boolean[] u = new boolean[101];
        for (int i = 0; i < u.length; i++) {
            u[i] = this.isInSet[i] && other.isInSet[i];
        }
        return new IntSet(u);
    }

    public boolean equals(IntSet other) {
        for (int i = 0; i < isInSet.length; i++) {
            if (this.isInSet[i] != other.isInSet[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "{";
        boolean hasAny = false;
        for (int i = 0; i < isInSet.length; i++) {
            if (isInSet[i]) {
                if (hasAny) {
                    s += ", ";
                }
                s += i;
                hasAny = true;
            }
        }
        s += "}";
        return s;
    }
}
