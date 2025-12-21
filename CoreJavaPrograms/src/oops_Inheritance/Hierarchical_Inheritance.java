package oops_Inheritance;

class Subject {
    void allSubjects() {
        System.out.println("Shows all subjects");
    }
}

class Maths extends Subject {
    void onlyMath() {
        System.out.println("Shows only Math");
    }
}

class Science extends Subject {
    void onlyScience() {
        System.out.println("Shows only Science");
    }
}
