package chapter12;

import java.util.Random;

public enum Answewrs {
    NO, YES, MAYBE, LATER,SOON, NEVER
}
class Question {
    Random rand = new Random();
    Answewrs ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15) {
            return Answewrs.MAYBE;
        }else if (prob < 30) {
            return Answewrs.NO;
        } else if (prob < 60) {
            return Answewrs.YES;
        } else if (prob < 75) {
            return Answewrs.LATER;
        } else if (prob < 98) {
            return Answewrs.SOON;
        }else {
            return Answewrs.NEVER;
        }

    }
}
class  AskMe {
    static void answer(Answewrs result) {
        switch (result) {
            case NO:
                System.out.println("no");
                break;
            case YES:
                System.out.println("yes");
                break;
            case MAYBE:
                System.out.println("maybe");
                break;
            case LATER:
                System.out.println("later");
                break;
            case SOON:
                System.out.println("soon");
                break;
            case NEVER:
                System.out.println("never");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}

