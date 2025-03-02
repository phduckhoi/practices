/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackages;

/**
 *
 * @author khoi7
 */
import com.mycompany.practices.Student;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentTest {

    private Student student;

    @BeforeMethod
    public void setUp() {
        student = new Student("S123", "John Doe", 20);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(student.getName(), "John Doe");
    }

    @Test
    public void testSetAge() {
        student.setAge(21);
        Assert.assertEquals(student.getAge(), 21);
    }

    @Test
    public void testUpdateName() {
        student.updateName("Jane Doe");
        Assert.assertEquals(student.getName(), "Jane Doe");
    }
}
