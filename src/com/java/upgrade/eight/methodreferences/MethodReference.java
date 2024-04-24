package com.java.upgrade.eight.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class MethodReference {

    public static void main(String[] args) {

        List<String> messages = Arrays.asList("Hello", "world", "readers!");
        // Reference to a Static Method
        messages.forEach(StringUtils::capitalize);

        MethodReference ref = new MethodReference();

        BicycleComparator bikeFrameSizeComparator = ref.new BicycleComparator();
        // Reference to an Instance Method of a Particular Object:
        createBicyclesList().stream().sorted(bikeFrameSizeComparator::compare);

    }

    private static Collection<Bicycle> createBicyclesList() {
        ArrayList<Bicycle> bicycles = new ArrayList<>();
        MethodReference ref = new MethodReference();
        bicycles.add(ref.new Bicycle(54));
        bicycles.add(ref.new Bicycle(58));
        bicycles.add(ref.new Bicycle(52));
        bicycles.add(ref.new Bicycle(56));

        return bicycles;

    }

    class Bicycle {
        private int frameSize;

        public Bicycle(int frameSize) {
            this.frameSize = frameSize;
        }

        public int getFrameSize() {
            return frameSize;
        }
    }

    class BicycleComparator implements Comparator<Bicycle> {
        @Override
        public int compare(Bicycle bike1, Bicycle bike2) {
            // Compare bicycles based on frame size
            return Integer.compare(bike1.getFrameSize(), bike2.getFrameSize());
        }

    }

}
