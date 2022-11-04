package immutable;

import java.util.Arrays;

public class Demo2 {
    private final int[] data;

    public Demo2(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
