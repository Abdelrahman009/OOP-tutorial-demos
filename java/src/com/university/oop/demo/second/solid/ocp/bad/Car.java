package com.university.oop.demo.second.solid.ocp.bad;

public class Car {
    private int year;
    private Engine engine;

    public Car(int year, Engine engine) {
        this.year = year;
        this.engine = engine;
    }

    /**
     * Creates a copy of the car passed to the
     * constructor.
     */
    public Car(Car other) {
        this.year = other.year;

        /**
         * How to add the Electric engine?
         */
        if (other.engine instanceof TurboEngine)
            this.engine = new TurboEngine((TurboEngine)other.engine);
        else
            this.engine = new Engine(other.engine);
    }

    public String toString() {
        return getClass().getSimpleName() + " made in the year "
            + year + " with engine " + engine;
    }

    public static class Engine {
        public Engine() {
            // initialize parts.
        }

        /**
         * Creates a copy of the engine passed to the
         * constructor.
         */
        public Engine(Engine other) {
            // copies the parts from the sent engine.
        }

        public String toString() {
            return getClass().getSimpleName();
        }
    }

    public static class TurboEngine extends Engine {
        public TurboEngine() {
            super();
            // initialize turbo engine
        }

        public TurboEngine(TurboEngine engine) {
            super(engine);
            // copy turbo engine specific parts.
        }
    }

    public static class ElectricEngine extends Engine {
        public ElectricEngine() {
            super();
            // initialize electric engine
        }

        public ElectricEngine(ElectricEngine engine) {
            super(engine);
            // copy electric engine specific parts.
        }
    }
}
