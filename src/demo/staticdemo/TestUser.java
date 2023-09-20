package demo.staticdemo;

public class TestUser {
  public static void main(String[] args) {
    new TestUser().run();
  }

  private void run() {
    User user1 = new User("Donald Duck");
    User user2 = new User("Donald Trump");
    User user3 = new User("Donald Tusk");
    User user4 = new User();
    User user5 = new User();

    System.out.println(user1 + "\n" + user2 + "\n" + user3 + "\n"  + user4 + "\n"  + user5 + "\n");
  }
}
