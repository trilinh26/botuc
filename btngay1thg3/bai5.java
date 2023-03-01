package btngay1thg3;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        class Person{
            String sex ;
            int age ;
            String name ;
            String lop ;
            public Person (String sex , int age , String name , String lop){
                this.sex = sex;
                this.age=age;
                this.name = name ;
                this.lop = lop;
            }
            public String getSex (){
                return this.sex;
            }
            public int getAge (){
                return this.age;
            }
            public String getName (){
                return this.name;
            }
            public String getLop(){
                return this.lop;
            }
            public void setName (String name){
                this.name = name;
            }
            public void setLop(String lop){
                this.lop = lop;
            }
            public void setAge(int age){
                this.age = age ;
            }
            public void setSex (String sex){
                this.sex = sex ;
            }
            public void Display(String sex , int age , String name , String lop){
                System.out.println("Tên :" + name);
                System.out.println("Tuổi :" + age);
                System.out.println("Giới tính :" + sex);
                System.out.println("Tên lớp :" + lop);
            }

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Nhập giới tính :");
                String sex = input.nextLine();
                System.out.print("Nhập tên :");
                String name = input.nextLine();
                System.out.println("Nhập lớp :");
                String lop = input.nextLine();
                System.out.println("Nhập tuổi :");
                int age = input.nextInt();
                Person kq = new Person(sex,age,name,lop);
                kq.Display(sex,age,name,lop);
                kq.setAge(age);
                kq.setLop(lop);
                kq.setName(name);
                kq.setSex(sex);

            }
        }
    }
    }

