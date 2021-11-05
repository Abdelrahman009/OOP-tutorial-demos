package com.university.oop.demo.second.solid.ocp;

import com.university.oop.demo.second.solid.ocp.bad.Car;
import com.university.oop.demo.second.solid.ocp.good.Plane;

/**
 * A demo to illustrate the importance of the OCP.
 *
 * "A module should be open for extension but closed for modification."
 */
public class OpenClosedPrincipleDemo {

    public static void main(String[] args) {
        /**
         * Let's create a model of the car we want to manufacture
         * and then lets assume we tested it and wanted to create
         * a copy for production.
         */
        Car modelOneCar = new Car(2018, new Car.Engine());

        // test the model ....

        Car firstProductionCar = new Car(modelOneCar);

        /**
         * Let's see the desc of the two cars.
         *
         * The same?
         * Well that is expected isn't it?
         */
        System.out.println(modelOneCar);
        System.out.println(firstProductionCar);
        System.out.println();

        /**
         * Let's create a new model of the car with a different
         * enhanced engine and do the same process.
         */
        Car modelTwoCar = new Car(2019, new Car.TurboEngine());

        Car secondProductionCar = new Car(modelTwoCar);

        /**
         * Let's see the desc of the two cars.
         */
        System.out.println(modelTwoCar);
        System.out.println(secondProductionCar);
        System.out.println();

        /**
         * Let's create a new model of the car with a different
         * enhanced engine and do the same process.
         */
        Car modelThreeCar = new Car(2019, new Car.ElectricEngine());
        Car thirdProductionCar = new Car(modelThreeCar);

        /**
         * Let's see the desc of the two cars.
         */
        System.out.println(modelThreeCar);
        System.out.println(thirdProductionCar);
        System.out.println();

        /**
         * What went wrong?
         */

        /**
         * Let's do the same with planes.
         */
        Plane modelOnePlane = new Plane(2018, new Plane.Engine());
        Plane firstProductionPlane = new Plane(modelOnePlane);

        /**
         * Let's see the desc of the two planes.
         *
         * The same? GOOD
         */
        System.out.println(modelOnePlane);
        System.out.println(firstProductionPlane);
        System.out.println();


        /**
         * Let's create a new model of the plane with a different
         * enhanced engine and do the same process.
         */
        Plane modelTwoPlane = new Plane(2019, new Plane.RamJet());
        Plane secondProductionPlane = new Plane(modelTwoPlane);

        /**
         * Let's see the desc of the two planes.
         *
         * why is this different than the car case?
         */
        System.out.println(modelTwoPlane);
        System.out.println(secondProductionPlane);
        System.out.println();


        /**
         * Try uncommenting the TurboShaft and use it and see
         * If the problem remains.
         */
    }
}
