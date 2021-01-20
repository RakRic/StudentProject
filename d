[1mdiff --git a/src/main/java/com/example/studentproject/Controller/SubjectTakingController.java b/src/main/java/com/example/studentproject/Controller/SubjectTakingController.java[m
[1mindex d914f7f..a413884 100644[m
[1m--- a/src/main/java/com/example/studentproject/Controller/SubjectTakingController.java[m
[1m+++ b/src/main/java/com/example/studentproject/Controller/SubjectTakingController.java[m
[36m@@ -1,4 +1,36 @@[m
 package com.example.studentproject.Controller;[m
 [m
[32m+[m[32mimport com.example.studentproject.Model.SubjectTaking;[m
[32m+[m[32mimport com.example.studentproject.Service.SubjectTakingService;[m
[32m+[m[32mimport org.springframework.web.bind.annotation.*;[m
[32m+[m
[32m+[m[32mimport java.util.List;[m
[32m+[m
[32m+[m[32m@RestController[m
 public class SubjectTakingController {[m
[32m+[m[32m    public final SubjectTakingService subjectTakingService;[m
[32m+[m
[32m+[m[32m    public SubjectTakingController(SubjectTakingService subjectTakingService){[m
[32m+[m[32m        this.subjectTakingService = subjectTakingService;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    @PostMapping(value = "/createSubject")[m
[32m+[m[32m    public SubjectTaking create(@RequestBody SubjectTaking subjectTaking){[m
[32m+[m[32m        return subjectTakingService.create(subjectTaking);[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    @GetMapping(value = "/Subjects")[m
[32m+[m[32m    public List<SubjectTaking> getAll(){[m
[32m+[m[32m        return subjectTakingService.getAll();[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    @PostMapping(value = "/updateSubjectTaking")[m
[32m+[m[32m    private SubjectTaking update(@RequestBody SubjectTaking subjectTaking){[m
[32m+[m[32m        return subjectTakingService.update(subjectTaking);[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    @RequestMapping(method = RequestMethod.DELETE, value = "/subjects/{id}")[m
[32m+[m[32m    public void delete(@PathVariable("id") Long id){[m
[32m+[m[32m        subjectTakingService.delete(id);[m
[32m+[m[32m    }[m
 }[m
[1mdiff --git a/src/main/java/com/example/studentproject/Controller/TeachersController.java b/src/main/java/com/example/studentproject/Controller/TeachersController.java[m
[1mindex 77d6e30..f6666ce 100644[m
[1m--- a/src/main/java/com/example/studentproject/Controller/TeachersController.java[m
[1m+++ b/src/main/java/com/example/studentproject/Controller/TeachersController.java[m
[36m@@ -1,4 +1,37 @@[m
 package com.example.studentproject.Controller;[m
 [m
[32m+[m[32mimport com.example.studentproject.Model.Teacher;[m
[32m+[m[32mimport com.example.studentproject.Service.TeacherService;[m
[32m+[m[32mimport org.springframework.web.bind.annotation.*;[m
[32m+[m
[32m+[m[32mimport java.util.List;[m
[32m+[m
[32m+[m[32m@RestController[m
 public class TeachersController {[m
[32m+[m[32m    public final TeachersService teacherService;[m
[32m+[m
[32m+[m[32m    public TeachersController(TeachersService teacherService){[m
[32m+[m[32m        this.teacherService = teacherService;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    @PostMapping(path = "/createTeachers")[m
[32m+[m[32m    private Teachers create(@RequestBody Teachers teacher){[m
[32m+[m[32m        return teacherService.create(teacher);[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    @GetMapping(path = "/Teachers")[m
[32m+[m[32m    public List<Teachers> getAll(){[m
[32m+[m[32m        return teacherService.getAll();[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    @PostMapping(path = "/updateTeachers")[m
[32m+[m[32m    public Teachers update(@RequestBody Teachers teacher){[m
[32m+[m[32m        return teacherService.update(teacher);[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    @RequestMapping(method = RequestMethod.DELETE, value = "/teacher/{id}")[m
[32m+[m[32m    public void delete(@PathVariable("id")Long id){[m
[32m+[m[32m        teacherService.delete(id);[m
[32m+[m[32m    }[m
[32m+[m
 }[m
[1mdiff --git a/src/main/java/com/example/studentproject/Model/Students.java b/src/main/java/com/example/studentproject/Model/Students.java[m
[1mindex 329e353..605adff 100644[m
[1m--- a/src/main/java/com/example/studentproject/Model/Students.java[m
[1m+++ b/src/main/java/com/example/studentproject/Model/Students.java[m
[36m@@ -16,6 +16,6 @@[m [mpublic class Students {[m
 [m
     private long id;[m
     private String name;[m
[31m-    private long identifier;[m
[32m+[m[32m    private long studentIdentifier;[m
     private String password;[m
 }[m
[1mdiff --git a/src/main/java/com/example/studentproject/Model/SubjectTaking.java b/src/main/java/com/example/studentproject/Model/SubjectTaking.java[m
[1mindex d71f5fb..ac532d9 100644[m
[1m--- a/src/main/java/com/example/studentproject/Model/SubjectTaking.java[m
[1m+++ b/src/main/java/com/example/studentproject/Model/SubjectTaking.java[m
[36m@@ -1,4 +1,19 @@[m
 package com.example.studentproject.Model;[m
 [m
[32m+[m[32mimport lombok.Getter;[m
[32m+[m[32mimport lombok.Setter;[m
[32m+[m
[32m+[m[32mimport javax.persistence.*;[m
[32m+[m
[32m+[m[32m@Entity[m
[32m+[m[32m@Setter[m
[32m+[m[32m@Getter[m
 public class SubjectTaking {[m
[32m+[m
[32m+[m[32m    @Id[m
[32m+[m[32m    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subjectTaking_generator")[m
[32m+[m[32m    @SequenceGenerator(name = "subjectTaking_generator", sequenceName = "subjectTaking_seq")[m
[32m+[m
[32m+[m[32m    private Long id;[m
[32m+[m[32m    private String name;[m
 }[m
[1mdiff --git a/src/main/java/com/example/studentproject/Model/Teachers.java b/src/main/java/com/example/studentproject/Model/Teachers.java[m
[1mindex 917460d..dd902f7 100644[m
[1m--- a/src/main/java/com/example/studentproject/Model/Teachers.java[m
[1m+++ b/src/main/java/com/example/studentproject/Model/Teachers.java[m
[36m@@ -1,4 +1,21 @@[m
 package com.example.studentproject.Model;[m
 [m
[32m+[m[32mimport lombok.Getter;[m
[32m+[m[32mimport lombok.Setter;[m
[32m+[m
[32m+[m[32mimport javax.persistence.*;[m
[32m+[m
[32m+[m[32m@Entity[m
[32m+[m[32m@Getter[m
[32m+[m[32m@Setter[m
 public class Teachers {[m
[32m+[m
[32m+[m[32m    @Id[m
[32m+[m[32m    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teachers_generator")[m
[32m+[m[32m    @SequenceGenerator(name = "teachers_generator", sequenceName = "teachers_seq")[m
[32m+[m
[32m+[m[32m    private long id;[m
[32m+[m[32m    private String name;[m
[32m+[m[32m    private long teacherIdentifier;[m
[32m+[m[32m    private String password;[m
 }[m
[1mdiff --git a/src/main/java/com/example/studentproject/Repository/CoursesRepository.java b/src/main/java/com/example/studentproject/Repository/CoursesRepository.java[m
[1mindex 9dfc149..9b5681a 100644[m
[1m--- a/src/main/java/com/example/studentproject/Repository/CoursesRepository.java[m
[1m+++ b/src/main/java/com/example/studentproject/Repository/CoursesRepository.java[m
[36m@@ -2,6 +2,8 @@[m [mpackage com.example.studentproject.Repository;[m
 [m
 import com.example.studentproject.Model.Course;[m
 import org.springframework.data.repository.CrudRepository;[m
[32m+[m[32mimport org.springframework.stereotype.Repository;[m
 [m
[32m+[m[32m@Repository[m
 public interface CoursesRepository extends CrudRepository<Courses, Long> {[m
 }[m
[1mdiff --git a/src/main/java/com/example/studentproject/Repository/StudentsRepository.java b/src/main/java/com/example/studentproject/Repository/StudentsRepository.java[m
[1mindex 6bf79c5..4e038ea 100644[m
[1m--- a/src/main/java/com/example/studentproject/Repository/StudentsRepository.java[m
[1m+++ b/src/main/java/com/example/studentproject/Repository/StudentsRepository.java[m
[36m@@ -2,6 +2,8 @@[m [mpackage com.example.studentproject.Repository;[m
 [m
 import com.example.studentproject.Model.Student;[m
 import org.springframework.data.repository.CrudRepository;[m
[32m+[m[32mimport org.spr