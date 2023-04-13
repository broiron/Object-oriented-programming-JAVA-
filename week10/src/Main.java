class Main {
    public static void main (String[] args) {
        StudentDB db = new StudentDB();
        Student s = new Student("김지우", 201911111, 4.01);
        db.add(s);
        db.add("이민준", 201922222, 3.85);
        db.add("박서윤", 201933333, 3.90);

        System.out.println("Finding 김지우...");
        System.out.println(db.findBy("김지우"));

        System.out.println("Finding Number 201922222...");
        System.out.println(db.findBy(201922222));

        System.out.println("Finding GPA 3.90...");
        System.out.println(db.findBy(3.90));

        System.out.println("Finding Lower than 3.95...");
        System.out.println(db.findBy(StudentDB.FindGPAParam.LOWER_THAN, 3.95));

        System.out.println("Finding Higher than 3.95...");
        System.out.println(db.findBy(StudentDB.FindGPAParam.HIGHER_THAN, 3.95));
    }
}