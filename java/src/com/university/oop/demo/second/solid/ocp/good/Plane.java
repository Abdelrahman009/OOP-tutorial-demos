package com.university.oop.demo.second.solid.ocp.good;

public class Plane {
    private int year;
    private Engine engine;

    public Plane(int year, Engine engine) {
        this.year = year;
        this.engine = engine;
    }

    /**
     * Creates a copy of the plane passed to the
     * constructor.
     */
    public Plane(Plane other) {
        this.year = other.year;
        this.engine = other.engine.copy();
    }

    public String toString() {
        return getClass().getSimpleName() + " made in the year "
            + year + " with engine " + engine;
    }

    public static class Engine {
        public Engine() {
            // initialize parts.
        }

        public String toString() {
            return getClass().getSimpleName();
        }

        /**
         * Creates a copy of current engine.
         */
        public Engine copy() {
            return new Engine();
        }
    }

    public static class TurboJet extends Engine {
        public TurboJet() {
            super();
            // initialize turbo engine
        }

        @Override
        public Engine copy() {
            // copies the needed parts and returns
            // a new object.
            return new TurboJet();
        }
    }


//    public static class TurboShaft extends Engine {
//        public TurboShaft() {
//            super();
//            // initialize turbo engine
//        }
//
//        @Override
//        public Engine copy() {
//            // copies the needed parts and returns
//            // a new object.
//            return new TurboShaft();
//        }
//    }

    public static class RamJet extends Engine {
        public RamJet() {
            super();
            // initialize turbo engine
        }

        @Override
        public Engine copy() {
            // copies the needed parts and returns
            // a new object.
            return new RamJet();
        }
    }
}
