package com.university.oop.demo.third.creational.singleton;

import com.university.oop.demo.third.creational.singleton.problem.NonSingletonSpeakerDriver;
import com.university.oop.demo.third.creational.singleton.solution.SingletonSpeakerDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * A demo to illustrate the creational pattern "Singleton"
 *
 * "The Singleton design pattern ensures a class has only
 *  one instance and provide a global point of access to it."
 *
 *
 *  Let's imagine having a mobile phone with a speaker driver
 *  that controls the sounds that are produced from the phone.
 *
 *  Let's assume we try to play a song then play a lecture
 *  record at the same time.
 *
 *  What you should expect it that no interference occur between
 *  the two tracks right?
 */
public class SingletonPatternDemo {

    private static List<String> lectureSoundSegments;
    private static List<String> songSoundSegments;

    public static void main(String[] args) throws InterruptedException {

        /**
         * Initialize our sounds.
         */
        loadSoundSegments();

        /**
         * Create two threads simulating trying to play a sound while the
         * other is playing.
         */
        System.out.println("======= Without using Singleton ==========");
        Thread songThread = runSoundOnDriver
            (new NonSingletonSpeakerDriver(), songSoundSegments);

        Thread lectureThread = runSoundOnDriver
            (new NonSingletonSpeakerDriver(), lectureSoundSegments);

        /**
         * Wait for the threads to finish.
         */
        songThread.join();
        lectureThread.join();

        /**
         * Given that we had two different objects from the
         * {@link SpeakerDriver} they couldn't restrict that only
         * one sound should be played at a time, but the
         * sounds interfered with each other.
         */

        System.out.println("=================");
        System.out.println();

        System.out.println("======= Using Singleton ==========");

        /**
         * Let's do it using singleton.
         *
         * Only one instance exist at a time and you are not
         * allowed to create another object.
         */
        songThread = runSoundOnDriver
            (SingletonSpeakerDriver.getOrCreateSpeakerDriver(),
             songSoundSegments);

        lectureThread = runSoundOnDriver
            (SingletonSpeakerDriver.getOrCreateSpeakerDriver(),
             lectureSoundSegments);

        songThread.join();
        lectureThread.join();
        songThread.join();
        lectureThread.join();
    }

    //
    // Private methods
    //

    private static void loadSoundSegments() {
        lectureSoundSegments = new ArrayList<>();
        lectureSoundSegments.add("Lecture greetings");
        lectureSoundSegments.add("Lecture objectives");
        lectureSoundSegments.add("Lecture agenda");
        lectureSoundSegments.add("Lecture first topic");
        lectureSoundSegments.add("Lecture second topic");
        lectureSoundSegments.add("Lecture conclusion");

        songSoundSegments = new ArrayList<>();
        songSoundSegments.add("Song intro");
        songSoundSegments.add("Song first verse");
        songSoundSegments.add("Song second verse");
        songSoundSegments.add("Song solo music");
        songSoundSegments.add("Song ending");
    }

    private static Thread runSoundOnDriver
         (SpeakerDriver speakerDriver, List<String> soundSegments) {

        Runnable soundRunnable
            = new PlayerRunnable(speakerDriver, soundSegments);
        Thread thread = runInOwnThread(soundRunnable);
        return thread;
    }

    private static Thread runInOwnThread(Runnable runnable) {
        Thread t = new Thread(runnable);
        t.start();
        return t;
    }

    //
    // Inner Types
    //

    public static class PlayerRunnable implements Runnable {
        private SpeakerDriver speakerDriver;
        private List<String> soundSegments;

        public PlayerRunnable(SpeakerDriver speakerDriver,
                              List<String> soundSegments) {

            this.speakerDriver = speakerDriver;
            this.soundSegments = soundSegments;
        }

        public void run() {
            speakerDriver.playSound(soundSegments);
        }
    }
}
