package exer08equals.test04;

public class UserTest {


}
class User{
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    重写equals():手动实现
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(obj instanceof User){
            User user = (User)obj;
            //方式1：
//            if(this.age == user.age && this.name.equals(user.name)){
//                return true;
//            }else{
//                return false;
//            }
            return this.age == user.age && this.name.equals(user.name);
        }

        return false;
    }

    //IDEA自动实现
/*    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }
*/

}