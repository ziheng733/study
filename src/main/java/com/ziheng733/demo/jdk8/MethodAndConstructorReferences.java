package com.ziheng733.demo.jdk8;

/**
 * 方法和构造函数引用
 */
public class MethodAndConstructorReferences {

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

    /**
     * 类静态方法引用
     */
    private static void demo1(){
        FunctionalInterfaces.Converter<String, Integer> converter = Integer::parseInt;
        System.out.println(converter.convert("333"));
    }

    /**
     * 实例对象方法引用
     */
    private static void demo2(){
        Something something = new Something();
        FunctionalInterfaces.Converter<String, String> converter = something::startsWith;
        System.out.println(converter.convert("hello"));
    }

    static class Something{
        String startsWith(String s){
            return String.valueOf(s.charAt(0));
        }
    }

    /**
     * 构造函数引用
     * 我们只需要使用 Person::new 来获取Person类构造函数的引用，
     * Java编译器会自动根据PersonFactory.create方法的参数类型来选择合适的构造函数。
     */
    private static void demo3(){
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("WEN", "ZIHENG");
        System.out.println(person.getFirstName() + " " + person.getLastName());
    }

    static class Person{
        String firstName;
        String lastName;

        Person(){}

        Person(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    interface PersonFactory<P extends Person>{
        P create(String firstName, String lastName);
    }

}
