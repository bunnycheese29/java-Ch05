public class UpcastingEx {

  public static void main(String[] args) {
    Person person;
    Student student = new Student("김남진");
    person = student;
    System.out.println(person.name);
    System.out.println(person.id);

    //Type casitng - 메서드의 매개변수 타입을 좀 더 효율적으로 받기 위해 씀
    Person person02 = new Student("김지은");
    Student student02 = (Student) person02;
  }
}
