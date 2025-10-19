package com.example.mentorship.catalin.assesment;

public class InitialAssessment {

    public static void main(String[] args) {
        firstQuestion();
        secondQuestion();
    }

    private static void firstQuestion() {
        final int score1 = 8, score2 = 3;
        Integer myScore = 7;
        var goal = switch (myScore) {
            case score1, score2, 7 -> "good";
            case Integer i when i < 10 -> "better";
            case Integer i when i >= 10 -> "best";
            default -> {
                yield "unknown";
            }
//            case null -> "nope";
        };
        System.out.print(goal);
    }

    private static void secondQuestion() {
        int moon = 9, star = 2 + 2 * 3;
        float sun = star > 10 ? 1 : 3;
        double jupiter = (sun + moon) - 1.0f;
        int mars = --moon <= 8 ? 2 : 3;
        System.out.println(sun + ", " + jupiter + ", " + mars);
    }
}
