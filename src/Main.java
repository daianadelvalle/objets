public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Students daiana = new Students();
        Teacher teacher = new Teacher();

        teacher.setName("María Elisa");
        teacher.setLastName("Ledesma");
        teacher.setArea("Terciario");
        teacher.setMatter("Matemática");

        daiana.setName(" Daiana Ailen");
        daiana.setLastName("Delvalle");

        daiana.setEnrolment(125544);
        daiana.setCarrer("Programación Backend");

        System.out.println("El nombre del estudiante es: " + daiana.getName());
        System.out.println("El apellido del estudiante es: " + daiana.getLastName());
        System.out.println("El número de inscripción es: " + daiana.getEnrolment());
        System.out.println("La carrera es: " + daiana.getCarrer());

        person1.setName("Daiana");
        person1.setLastName("Delvalle");

        System.out.println("El nombre de la persona es: " + person1.getName());
        System.out.println("El apellido de la persona es: " + person1.getLastName());

        System.out.println("El nombre de la docente es: " + teacher.getName());
        System.out.println("El apellido de la docente es: " + teacher.getLastName());
        System.out.println("El nivel asignado es: " + teacher.getArea());
        System.out.println("La materia dictada es: " + teacher.getMatter());


    }

}
