import java.io.File;
import lombok.*;

import java.io.File;

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    @EqualsAndHashCode
    @Builder
    @RequiredArgsConstructor
    public class Student {
        private String name;
        private int rollNumber;
    }

    class DemoLombok {
        @SneakyThrows
        public static void main(String[] args) {
            System.out.println("Testing Testing Testing");
            System.out.println(new Student("Anu", 1));
            File f = new File("abc.txt");
            // FileInputStream fis=new FileInputStream(f);
            Student s1 = Student.builder().name("Adnan").build();
            System.out.println(s1);
        }
    }


